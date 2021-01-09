// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_optimize_grammar {
	final lab9 runtime;
	Module_optimize_grammar(lab9 runtime) {
		this.runtime = runtime;
	}
	Struct_Grammar f_optimizeGrammar(Struct_Grammar ag) {
		return (new Struct_Grammar(runtime.h_Native.map(ag.f_productions, ((Func1<Object,Object>)(Func1)runtime.gfw_optimizeProduction))));
	}
	Struct_Production f_optimizeProduction(Struct_Production ap) {
		final Object[] l3_$1 = ap.f_choices;
		final Object[] l4_$2 = SingletonStructs.arr_empty;
		final Func2<Object[],Object[], Struct_Seq> l5_$0 = new Func2<Object[],Object[],Struct_Seq>() {
			final public Object[] invoke(final Object[] aacc, final Struct_Seq ac) {
				final int l0_n = runtime.h_Native.length(aacc);
				if ((l0_n==0)) {
					return (new Object[] { ac });
				} else {
					final Object[] l1_last = ((Struct_Seq)(aacc[(l0_n-1)])).f_seq;
					final int l2_nl = runtime.h_Native.length(l1_last);
					final Object[] l5_$4 = ac.f_seq;
					final Func2<Boolean,Integer, Struct> l6_$3 = new Func2<Boolean,Integer,Struct>() {
						final public Boolean invoke(final Integer ai, final Struct ae) {
							return ((Boolean)!((((int)ai)<l2_nl)&&FlowRuntime.compareEqual(((Struct)(l1_last[((int)ai)])),ae)));
						}
					};
					final int l7_firstDiff = runtime.h_Native.iteriUntil(l5_$4, ((Func2<Boolean,Integer, Object>)(Func2)l6_$3));
					if ((l7_firstDiff>0)) {
						final Object[] l8_shared = runtime.h_Native.subrange(ac.f_seq, 0, l7_firstDiff);
						final Object[] l9_tail1 = runtime.h_Native.subrange(l1_last, l7_firstDiff, (l2_nl-l7_firstDiff));
						final int l10_nc = runtime.h_Native.length(ac.f_seq);
						final Object[] l11_tail2 = runtime.h_Native.subrange(ac.f_seq, l7_firstDiff, (l10_nc-l7_firstDiff));
						final Struct_Seq l12_joined = (new Struct_Seq(runtime.m_array.f_arrayPush(l8_shared, (new Struct_Choices((new Object[] { (new Struct_Seq(l9_tail1)), (new Struct_Seq(l11_tail2)) }))))));
						return runtime.m_array.f_arrayPush(runtime.h_Native.subrange(aacc, 0, (l0_n-1)), l12_joined);
					} else {
						return runtime.m_array.f_arrayPush(aacc, ac);
					}
				}
			}
		};
		final Object[] l6_choices = ((Object[])runtime.h_Native.fold(l3_$1, l4_$2, ((Func2<Object,Object, Object>)(Func2)l5_$0)));
		return (new Struct_Production(ap.f_name, ap.f_caching, ap.f_type, l6_choices));
	}
}
