// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_pegaction {
	final lab9 runtime;
	Module_pegaction(lab9 runtime) {
		this.runtime = runtime;
	}
	public Struct_SemanticActions g_defaultPegActions;
	public void init_defaultPegActions() {
		final Reference<Struct> l0_t = ((Reference<Struct>)(new Reference(runtime.m_tree.f_makeTree())));
		final Func2<Object,String, Func1<Object,Object[]>> l1_add = new Func2<Object,String,Func1<Object,Object[]>>() {
			final public Object invoke(final String an, final Func1<Object,Object[]> afn) {
				l0_t.value = ((Func3<Struct,Struct, String, Func1<Object,Object[]>>)(Func3)runtime.n_setTree).invoke(l0_t.value, an, afn);
				return null;
			}
		};
		final Func1<Object,Object[]> l2_strUnescape = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				String l0_quote;
				if ((runtime.m_dynamic.f_flow2s(((Object)(axs[1])))).equals("'")) {
					l0_quote="\"";
				} else {
					l0_quote="'";
				}
				return runtime.m_dynamic.f_flow(runtime.m_deserialize_string.f_deserializeString((("\""+runtime.n_strReplace.invoke(runtime.m_dynamic.f_flow2s(((Object)(axs[0]))), l0_quote, ("\\"+l0_quote)))+"\"")).f_first);
			}
		};
		final Func1<Object,Object[]> l4_$3 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(runtime.h_Native.concat((new Object[] { ((Object)(axs[0])) }), ((Object[])((Object)(axs[1])))));
			}
		};
		l1_add.invoke("consArray", l4_$3);
		l1_add.invoke("strUnescape", l2_strUnescape);
		final Func1<Object,Object[]> l6_$5 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return l2_strUnescape.invoke((new Object[] { ((Field_first)((Object)(axs[0]))).get_first(), ((Field_second)((Object)(axs[0]))).get_second() }));
			}
		};
		l1_add.invoke("strUnescapePair", l6_$5);
		final Func1<Object,Object[]> l8_$7 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(runtime.h_Native.concat(((Object[])((Object)(axs[0]))), ((Object[])((Object)(axs[1])))));
			}
		};
		l1_add.invoke("concat", l8_$7);
		final Func1<Object,Object[]> l10_$9 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(runtime.m_math.f_s2i(runtime.m_dynamic.f_flow2s(((Object)(axs[0])))));
			}
		};
		l1_add.invoke("s2i", l10_$9);
		final Func1<Object,Object[]> l12_$11 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(runtime.m_string.f_trim(runtime.m_dynamic.f_flow2s(((Object)(axs[0])))));
			}
		};
		l1_add.invoke("trim", l12_$11);
		final Func1<Object,Object[]> l14_$13 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(runtime.m_math.f_s2d(runtime.m_dynamic.f_flow2s(((Object)(axs[0])))));
			}
		};
		l1_add.invoke("s2d", l14_$13);
		final Func1<Object,Object[]> l16_$15 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(axs);
			}
		};
		l1_add.invoke("array", l16_$15);
		final Func1<Object,Object[]> l18_$17 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				final Object[] l0_x0 = ((Object[])((Object)(axs[0])));
				if ((runtime.h_Native.length(l0_x0)>0)) {
					return ((Object)(l0_x0[0]));
				} else {
					return runtime.m_dynamic.f_flow(SingletonStructs.arr_empty);
				}
			}
		};
		l1_add.invoke("unarray", l18_$17);
		final Func1<Object,Object[]> l20_$19 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				runtime.m_runtime.f_println(("Debug: "+runtime.m_dynamic.f_toString(((runtime.h_Native.length(axs)==1)?((Object)(axs[0])):axs))));
				return ((Object)(axs[0]));
			}
		};
		l1_add.invoke("debug", l20_$19);
		final Func1<Object,Object[]> l22_$21 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(true);
			}
		};
		l1_add.invoke("true", l22_$21);
		final Func1<Object,Object[]> l24_$23 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(false);
			}
		};
		l1_add.invoke("false", l24_$23);
		final Func1<Object,Object[]> l26_$25 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(0);
			}
		};
		l1_add.invoke("zero", l26_$25);
		final Func1<Object,Object[]> l28_$27 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(1);
			}
		};
		l1_add.invoke("one", l28_$27);
		final Func1<Object,Object[]> l30_$29 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(2);
			}
		};
		l1_add.invoke("two", l30_$29);
		final Func1<Object,Object[]> l32_$31 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(3);
			}
		};
		l1_add.invoke("three", l32_$31);
		final Func1<Object,Object[]> l34_$33 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow((-runtime.m_dynamic.f_flow2i(((Object)(axs[0])))));
			}
		};
		l1_add.invoke("minus", l34_$33);
		final Func1<Object,Object[]> l36_$35 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow("");
			}
		};
		l1_add.invoke("storeComment", l36_$35);
		final Func1<Object,Object[]> l38_$37 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				return runtime.m_dynamic.f_flow(SingletonStructs.arr_empty);
			}
		};
		l1_add.invoke("emptyArray", l38_$37);
		final Func1<Object,Object[]> l40_$39 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] axs) {
				final Object[] l0_x0 = ((Object[])((Object)(axs[0])));
				if ((runtime.h_Native.length(l0_x0)>0)) {
					return ((Object)(l0_x0[0]));
				} else {
					return runtime.m_dynamic.f_flow(((Object)(axs[1])));
				}
			}
		};
		l1_add.invoke("unarrayDef", l40_$39);
		g_defaultPegActions=(new Struct_SemanticActions(l0_t.value));
	}
}
