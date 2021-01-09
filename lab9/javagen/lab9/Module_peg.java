// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_peg {
	final lab9 runtime;
	Module_peg(lab9 runtime) {
		this.runtime = runtime;
	}
	public Reference<Integer> g_lastParsing;
	public Reference<Struct> g_parseCacheHits;
	public Reference<Struct> g_parseCacheMisses;
	public void init_lastParsing() {
		g_lastParsing=((Reference<Integer>)(new Reference((-1))));
	}
	public void init_parseCacheHits() {
		g_parseCacheHits=runtime.m_inttree.f_makeIntTree();
	}
	public void init_parseCacheMisses() {
		g_parseCacheMisses=runtime.m_inttree.f_makeIntTree();
	}
	String f_action2string(Struct aa) {
		Struct l0__tmp = aa;
		switch (l0__tmp.getTypeId()) {
		case 7/*ActionVar*/: {
			final Struct_ActionVar l1__tmp = (Struct_ActionVar)l0__tmp;
			final String l2_i = l1__tmp.f_id;
			final String l3_i = l1__tmp.f_id;
			return (":"+l3_i);
		}
		case 2/*ActionCall*/: {
			final Struct_ActionCall l1__tmp = (Struct_ActionCall)l0__tmp;
			final String l4_id = l1__tmp.f_id;
			final Object[] l5_args = l1__tmp.f_args;
			final String l6_id = l1__tmp.f_id;
			final Object[] l7_args = l1__tmp.f_args;
			return (((l6_id+"(")+runtime.m_string.f_strGlue(runtime.h_Native.map(l7_args, ((Func1<Object,Object>)(Func1)runtime.gfw_action2string)), ", "))+")");
		}
		case 3/*ActionCallDebug*/: {
			final Struct_ActionCallDebug l1__tmp = (Struct_ActionCallDebug)l0__tmp;
			final String l8_id = l1__tmp.f_id;
			final Object[] l9_args = l1__tmp.f_args;
			final String l10_id = l1__tmp.f_id;
			final Object[] l11_args = l1__tmp.f_args;
			return (((l10_id+"(")+runtime.m_string.f_strGlue(runtime.h_Native.map(l11_args, ((Func1<Object,Object>)(Func1)runtime.gfw_action2string)), ", "))+")");
		}
		case 6/*ActionIndex*/: {
			return "#";
		}
		case 5/*ActionConstantString*/: {
			final Struct_ActionConstantString l1__tmp = (Struct_ActionConstantString)l0__tmp;
			final String l12_s = l1__tmp.f_s;
			final String l13_s = l1__tmp.f_s;
			return runtime.m_dynamic.f_toString(l13_s);
		}
		case 4/*ActionConstantInt*/: {
			final Struct_ActionConstantInt l1__tmp = (Struct_ActionConstantInt)l0__tmp;
			final int l14_i = l1__tmp.f_i;
			final int l15_i = l1__tmp.f_i;
			return runtime.m_string.f_i2s(l15_i);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	boolean f_canInlineProduction(Struct_Production ap) {
		boolean l3_$2;
		if ((!ap.f_caching&&(runtime.h_Native.length(ap.f_choices)==1))) {
			final Object[] l6_$5 = ((Struct_Seq)(ap.f_choices[0])).f_seq;
			final Func1<Boolean,Struct> l7_$4 = new Func1<Boolean,Struct>() {
				final public Boolean invoke(final Struct apa) {
					Struct l0__tmp = apa;
					switch (l0__tmp.getTypeId()) {
					case 0/*Action*/: {
						final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
						final Func1<Object,Struct_PegEnv> l2_fn = l1__tmp.f_fn;
						final Func1<Object,Struct_PegEnv> l3_fn = l1__tmp.f_fn;
						return ((Boolean)true);
					}
					case 1/*Action2*/: {
						final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
						final Struct l4_e = l1__tmp.f_e;
						final Struct l5_e = l1__tmp.f_e;
						return ((Boolean)true);
					}
					case 6/*ActionIndex*/: {
						return ((Boolean)true);
					}
					default: {
						return ((Boolean)false);
					}
					}
				}
			};
			l3_$2=!((boolean)((Func2<Boolean,Object[], Func1<Boolean,Struct>>)(Func2)runtime.n_exists).invoke(l6_$5, l7_$4));
		} else {
			l3_$2=false;
		}
		return l3_$2;
	}
	Struct f_convertNestedSequence(Struct_Production aprod, Struct apar, Reference<Integer> anextFree, Reference<Object[]> aextraProductions) {
		Struct l0__tmp = apar;
		switch (l0__tmp.getTypeId()) {
		case 97/*Rule*/: {
			final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
			final String l2_name = l1__tmp.f_name;
			final String l3_name = l1__tmp.f_name;
			return l1__tmp;
		}
		case 104/*Star*/: {
			final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
			final Struct l4_p = l1__tmp.f_p;
			final Struct l5_p = l1__tmp.f_p;
			return (new Struct_Star(f_convertNestedSequence(aprod, l5_p, anextFree, aextraProductions)));
		}
		case 91/*Plus*/: {
			final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
			final Struct l6_p = l1__tmp.f_p;
			final Struct l7_p = l1__tmp.f_p;
			return (new Struct_Plus(f_convertNestedSequence(aprod, l7_p, anextFree, aextraProductions)));
		}
		case 44/*Opt*/: {
			final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
			final Struct l8_p = l1__tmp.f_p;
			final Struct l9_p = l1__tmp.f_p;
			return (new Struct_Opt(f_convertNestedSequence(aprod, l9_p, anextFree, aextraProductions)));
		}
		case 41/*Negation*/: {
			final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
			final Struct l10_p = l1__tmp.f_p;
			final Struct l11_p = l1__tmp.f_p;
			return (new Struct_Negation(f_convertNestedSequence(aprod, l11_p, anextFree, aextraProductions)));
		}
		case 9/*BindResult*/: {
			final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
			final String l12_name = l1__tmp.f_name;
			final Struct l13_p = l1__tmp.f_v;
			final String l14_name = l1__tmp.f_name;
			final Struct l15_p = l1__tmp.f_v;
			return (new Struct_BindResult(l14_name, f_convertNestedSequence(aprod, l15_p, anextFree, aextraProductions)));
		}
		case 8/*BindMatched*/: {
			final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
			final String l16_name = l1__tmp.f_name;
			final Struct l17_p = l1__tmp.f_v;
			final String l18_name = l1__tmp.f_name;
			final Struct l19_p = l1__tmp.f_v;
			return (new Struct_BindMatched(l18_name, f_convertNestedSequence(aprod, l19_p, anextFree, aextraProductions)));
		}
		case 110/*iRule*/: {
			final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
			final int l20_i = l1__tmp.f_i;
			final int l21_i = l1__tmp.f_i;
			return l1__tmp;
		}
		case 105/*Term*/: {
			final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
			final String l22_name = l1__tmp.f_name;
			final String l23_name = l1__tmp.f_name;
			return l1__tmp;
		}
		case 10/*CharRange*/: {
			final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
			final String l24_first = l1__tmp.f_first;
			final String l25_last = l1__tmp.f_last;
			final String l26_first = l1__tmp.f_first;
			final String l27_last = l1__tmp.f_last;
			return l1__tmp;
		}
		case 39/*LingoValue*/: {
			final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
			final Object l28_v = l1__tmp.f_value;
			final Object l29_v = l1__tmp.f_value;
			return l1__tmp;
		}
		case 22/*Epsilon*/: {
			return apar;
		}
		case 0/*Action*/: {
			final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
			final Func1<Object,Struct_PegEnv> l30_fn = l1__tmp.f_fn;
			final Func1<Object,Struct_PegEnv> l31_fn = l1__tmp.f_fn;
			return l1__tmp;
		}
		case 1/*Action2*/: {
			final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
			final Struct l32_e = l1__tmp.f_e;
			final Struct l33_e = l1__tmp.f_e;
			return l1__tmp;
		}
		case 6/*ActionIndex*/: {
			return apar;
		}
		case 11/*Choices*/: {
			final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
			final Object[] l34_s = l1__tmp.f_p;
			final Object[] l35_s = l1__tmp.f_p;
			final Struct_Production l38_prod = aprod;
			final Reference<Integer> l39_nextFree = anextFree;
			final Reference<Object[]> l40_extraProductions = aextraProductions;
			final Func1<Struct,Struct> l37_$36 = new Func1<Struct,Struct>() {
				final public Struct invoke(final Struct ap) {
					return f_convertNestedSequence(l38_prod, ap, l39_nextFree, l40_extraProductions);
				}
			};
			return (new Struct_Choices(runtime.h_Native.map(l35_s, ((Func1<Object,Object>)(Func1)l37_$36))));
		}
		case 100/*Seq*/: {
			final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
			final Object[] l41_s = l1__tmp.f_seq;
			final Object[] l42_s = l1__tmp.f_seq;
			final Struct_Production l45_prod = aprod;
			final Reference<Integer> l46_nextFree = anextFree;
			final Reference<Object[]> l47_extraProductions = aextraProductions;
			final Func1<Struct,Struct> l44_$43 = new Func1<Struct,Struct>() {
				final public Struct invoke(final Struct apars) {
					return f_convertNestedSequence(l45_prod, apars, l46_nextFree, l47_extraProductions);
				}
			};
			final Object[] l48_sequence = runtime.h_Native.map(l42_s, ((Func1<Object,Object>)(Func1)l44_$43));
			if ((runtime.h_Native.length(l48_sequence)==1)) {
				return ((Struct)(l48_sequence[0]));
			} else {
				final int l49_n = ((int)anextFree.value);
				final Struct_Production l50_production = (new Struct_Production(((aprod.f_name+"$auto")+runtime.m_string.f_i2s(l49_n)), false, ((Struct)SingletonStructs.str_PegUnknown), (new Object[] { (new Struct_Seq(l48_sequence)) })));
				aextraProductions.value = runtime.m_array.f_arrayPush(aextraProductions.value, l50_production);
				anextFree.value = ((Integer)(l49_n+1));
				return (new Struct_iRule(l49_n));
			}
		}
		case 14/*CutUp*/: {
			final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
			final Struct l51_p = l1__tmp.f_p;
			final Struct l52_p = l1__tmp.f_p;
			return (new Struct_CutUp(f_convertNestedSequence(aprod, l52_p, anextFree, aextraProductions)));
		}
		case 13/*CutDown*/: {
			final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
			final Struct l53_p = l1__tmp.f_p;
			final Struct l54_p = l1__tmp.f_p;
			return (new Struct_CutDown(f_convertNestedSequence(aprod, l54_p, anextFree, aextraProductions)));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object[] f_inlineParsingProductions(Struct_Grammar ag, Struct ap) {
		Struct l0__tmp = ap;
		switch (l0__tmp.getTypeId()) {
		case 110/*iRule*/: {
			final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
			final int l2_i = l1__tmp.f_i;
			final int l3_i = l1__tmp.f_i;
			final Struct_Production l4_pr = ((Struct_Production)(ag.f_productions[l3_i]));
			if (f_canInlineProduction(l4_pr)) {
				return f_inlineParsingSequence(ag, ((Struct_Seq)(l4_pr.f_choices[0])).f_seq);
			} else {
				return (new Object[] { l1__tmp });
			}
		}
		default: {
			return (new Object[] { ap });
		}
		}
	}
	Object[] f_inlineParsingSequence(Struct_Grammar ag, Object[] as) {
		final Object[] l2_$1 = SingletonStructs.arr_empty;
		final Struct_Grammar l4_g = ag;
		final Func2<Object[],Object[], Struct> l3_$0 = new Func2<Object[],Object[],Struct>() {
			final public Object[] invoke(final Object[] aacc, final Struct apar) {
				return runtime.h_Native.concat(aacc, f_inlineParsingProductions(l4_g, apar));
			}
		};
		return ((Object[])runtime.h_Native.fold(as, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
	}
	Struct_Grammar f_inlineProductions(Struct_Grammar ag) {
		if (false) {
			return ag;
		} else {
			final Object[] l2_$1 = ag.f_productions;
			final Struct_Grammar l4_g = ag;
			final Func1<Struct_Production,Struct_Production> l3_$0 = new Func1<Struct_Production,Struct_Production>() {
				final public Struct_Production invoke(final Struct_Production ap) {
					final String l5_$2 = ap.f_name;
					final boolean l6_$3 = ap.f_caching;
					final Struct l7_$4 = ap.f_type;
					final Object[] l8_$1 = ap.f_choices;
					final Func1<Struct_Seq,Struct_Seq> l9_$0 = new Func1<Struct_Seq,Struct_Seq>() {
						final public Struct_Seq invoke(final Struct_Seq ac) {
							return (new Struct_Seq(f_inlineParsingSequence(l4_g, ac.f_seq)));
						}
					};
					return (new Struct_Production(l5_$2, l6_$3, l7_$4, runtime.h_Native.map(l8_$1, ((Func1<Object,Object>)(Func1)l9_$0))));
				}
			};
			return (new Struct_Grammar(runtime.h_Native.map(l2_$1, ((Func1<Object,Object>)(Func1)l3_$0))));
		}
	}
	Struct_Grammar f_processNestedSequences(Struct_Grammar ag) {
		final Reference<Integer> l0_nextFree = ((Reference<Integer>)(new Reference(runtime.h_Native.length(ag.f_productions))));
		final Reference<Object[]> l1_extraProductions = ((Reference<Object[]>)(new Reference(SingletonStructs.arr_empty)));
		final Object[] l4_$3 = ag.f_productions;
		final Func1<Struct_Production,Struct_Production> l5_$2 = new Func1<Struct_Production,Struct_Production>() {
			final public Struct_Production invoke(final Struct_Production ap) {
				final String l5_$2 = ap.f_name;
				final boolean l6_$3 = ap.f_caching;
				final Struct l7_$4 = ap.f_type;
				final Object[] l8_$1 = ap.f_choices;
				final Func1<Struct_Seq,Struct_Seq> l9_$0 = new Func1<Struct_Seq,Struct_Seq>() {
					final public Struct_Seq invoke(final Struct_Seq ac) {
						final Object[] l2_$1 = ac.f_seq;
						final Func1<Struct,Struct> l3_$0 = new Func1<Struct,Struct>() {
							final public Struct invoke(final Struct apar) {
								return f_convertNestedSequence(ap, apar, l0_nextFree, l1_extraProductions);
							}
						};
						return (new Struct_Seq(runtime.h_Native.map(l2_$1, ((Func1<Object,Object>)(Func1)l3_$0))));
					}
				};
				return (new Struct_Production(l5_$2, l6_$3, l7_$4, runtime.h_Native.map(l8_$1, ((Func1<Object,Object>)(Func1)l9_$0))));
			}
		};
		final Object[] l6_productions = runtime.h_Native.map(l4_$3, ((Func1<Object,Object>)(Func1)l5_$2));
		return (new Struct_Grammar(runtime.h_Native.concat(l6_productions, l1_extraProductions.value)));
	}
}
