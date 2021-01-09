// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_grammar2code {
	final lab9 runtime;
	Module_grammar2code(lab9 runtime) {
		this.runtime = runtime;
	}
	Object[] f_choices2code(Struct_Grammar ag, Object[] achs) {
		final Struct_Grammar l2_g = ag;
		final Func1<Object[],Struct> l1_$0 = new Func1<Object[],Struct>() {
			final public Object[] invoke(final Struct ac) {
				return f_parsing2code(l2_g, ac);
			}
		};
		final Object[] l3_choices = runtime.h_Native.map(achs, ((Func1<Object,Object>)(Func1)l1_$0));
		if ((runtime.h_Native.length(l3_choices)==1)) {
			return ((Object[])(l3_choices[0]));
		} else {
			final Object[] l7_$5 = runtime.m_array.f_reverseA(l3_choices);
			final Object[] l8_$6 = (new Object[] { SingletonStructs.str_PegEnd });
			final Func2<Object[],Object[], Object[]> l9_$4 = new Func2<Object[],Object[],Object[]>() {
				final public Object[] invoke(final Object[] aacc, final Object[] ac) {
					if (FlowRuntime.compareEqual(aacc,(new Object[] { SingletonStructs.str_PegEnd }))) {
						return ac;
					} else {
						return runtime.m_array.f_concat3((new Object[] { (new Struct_PegChoice((runtime.h_Native.length(ac)+2))) }), ac, runtime.h_Native.concat((new Object[] { (new Struct_PegCommit((runtime.h_Native.length(aacc)+1))) }), aacc));
					}
				}
			};
			return ((Object[])runtime.h_Native.fold(l7_$5, l8_$6, ((Func2<Object,Object, Object>)(Func2)l9_$4)));
		}
	}
	Struct_ShareAcc f_doSharePrefix(Object[] ap1, Object[] ap2, Struct_ShareAcc aacc, int ai1, int ai2, int al) {
	 TAIL_CALL: for(;;) {
		if (((ai1<al)&&(ai2<al))) {
			final Struct l0_np1 = ((Struct)(ap1[ai1]));
			final Struct l1_np2 = ((Struct)(ap2[ai2]));
			if ((!f_semanticParsing(l0_np1)&&!f_semanticParsing(l1_np2))) {
				{
					final Struct_ShareAcc l2___tmp = (new Struct_ShareAcc(runtime.m_array.f_arrayPush(aacc.f_prefix, l0_np1), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
					final int l3___tmp = (ai1+1);
					final int l4___tmp = (ai2+1);
					aacc = l2___tmp;
					ai1 = l3___tmp;
					ai2 = l4___tmp;
					continue TAIL_CALL;
				}
			} else {
				if (!f_semanticParsing(l0_np1)) {
					final String l5_name = f_extractBindingName(l0_np1);
					final Object[] l6_rp1 = f_renameBindings2(ap1, l5_name, ("s"+runtime.m_string.f_strRight(l5_name, 1)));
					final Struct l7_rnp1 = ((Struct)(l6_rp1[ai1]));
					{
						final Object[] l8___tmp = l6_rp1;
						final Struct_ShareAcc l9___tmp = (new Struct_ShareAcc(runtime.m_array.f_arrayPush(aacc.f_prefix, l7_rnp1), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
						final int l10___tmp = (ai1+1);
						ap1 = l8___tmp;
						aacc = l9___tmp;
						ai1 = l10___tmp;
						continue TAIL_CALL;
					}
				} else {
					if (!f_semanticParsing(l1_np2)) {
						final String l11_name = f_extractBindingName(l1_np2);
						final Object[] l12_rp2 = f_renameBindings2(ap2, l11_name, ("s"+runtime.m_string.f_strRight(l11_name, 1)));
						final Struct l13_rnp2 = ((Struct)(l12_rp2[ai2]));
						{
							final Object[] l14___tmp = l12_rp2;
							final Struct_ShareAcc l15___tmp = (new Struct_ShareAcc(runtime.m_array.f_arrayPush(aacc.f_prefix, l13_rnp2), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
							final int l16___tmp = (ai2+1);
							ap2 = l14___tmp;
							aacc = l15___tmp;
							ai2 = l16___tmp;
							continue TAIL_CALL;
						}
					} else {
						if (f_sameParsing(l0_np1, l1_np2)) {
							final String l17_name1 = f_extractBindingName(l0_np1);
							final String l18_name2 = f_extractBindingName(l1_np2);
							final String l19_newname = ("s"+runtime.m_string.f_strRight(l17_name1, 1));
							final Object[] l20_rp1 = f_renameBindings2(ap1, l17_name1, l19_newname);
							final Object[] l21_rp2 = f_renameBindings2(ap2, l18_name2, l19_newname);
							final Struct l22_rnp1 = ((Struct)(l20_rp1[ai1]));
							{
								final Object[] l23___tmp = l20_rp1;
								final Object[] l24___tmp = l21_rp2;
								final Struct_ShareAcc l25___tmp = (new Struct_ShareAcc(runtime.m_array.f_arrayPush(aacc.f_prefix, l22_rnp1), SingletonStructs.arr_empty, SingletonStructs.arr_empty));
								final int l26___tmp = (ai1+1);
								final int l27___tmp = (ai2+1);
								ap1 = l23___tmp;
								ap2 = l24___tmp;
								aacc = l25___tmp;
								ai1 = l26___tmp;
								ai2 = l27___tmp;
								continue TAIL_CALL;
							}
						} else {
							return (new Struct_ShareAcc(aacc.f_prefix, runtime.h_Native.subrange(ap1, ai1, runtime.h_Native.length(ap1)), runtime.h_Native.subrange(ap2, ai2, runtime.h_Native.length(ap2))));
						}
					}
				}
			}
		} else {
			return (new Struct_ShareAcc(aacc.f_prefix, runtime.h_Native.subrange(ap1, ai1, runtime.h_Native.length(ap1)), runtime.h_Native.subrange(ap2, ai2, runtime.h_Native.length(ap2))));
		}
	 }
	}
	String f_extractBindingName(Struct ap) {
		Struct l0__tmp = ap;
		switch (l0__tmp.getTypeId()) {
		case 9/*BindResult*/: {
			final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
			final String l2_n = l1__tmp.f_name;
			final Struct l3_r = l1__tmp.f_v;
			final String l4_n = l1__tmp.f_name;
			final Struct l5_r = l1__tmp.f_v;
			return l4_n;
		}
		default: {
			return "";
		}
		}
	}
	Struct_Pair f_grammar2code(Struct_Grammar ag) {
		final Object[] l3_$1 = ag.f_productions;
		final Struct_Pair l4_$2 = (new Struct_Pair((new Object[] { (new Struct_PegCall(2)), SingletonStructs.str_PegEnd }), runtime.m_tree.f_makeTree()));
		final Struct_Grammar l6_g = ag;
		final Func3<Struct_Pair,Integer, Struct_Pair, Struct_Production> l5_$0 = new Func3<Struct_Pair,Integer,Struct_Pair,Struct_Production>() {
			final public Struct_Pair invoke(final Integer ai, final Struct_Pair aacc, final Struct_Production ap) {
				final Object[] l0_c = f_production2code(l6_g, ap);
				return (new Struct_Pair(runtime.h_Native.concat(((Object[])aacc.f_first), l0_c), ((Func3<Struct,Struct, Integer, Integer>)(Func3)runtime.n_setTree).invoke(((Struct)aacc.f_second), ai, ((Integer)runtime.h_Native.length(((Object[])aacc.f_first))))));
			}
		};
		final Struct_Pair l7_t = ((Struct_Pair)runtime.h_Native.foldi(l3_$1, l4_$2, ((Func3<Object,Integer, Object, Object>)(Func3)l5_$0)));
		final Object[] l8_code = f_renumberPegcode(((Object[])l7_t.f_first), ((Struct)l7_t.f_second));
		final Struct l12_$10 = ((Struct)l7_t.f_second);
		final Struct l13_$11 = runtime.m_tree.f_makeTree();
		final Struct_Grammar l15_g = ag;
		final Func3<Struct,Integer, Integer, Struct> l14_$9 = new Func3<Struct,Integer,Integer,Struct>() {
			final public Struct invoke(final Integer ak, final Integer av, final Struct aacc) {
				return ((Func3<Struct,Struct, Integer, String>)(Func3)runtime.n_setTree).invoke(aacc, av, ((Struct_Production)(l15_g.f_productions[((int)ak)])).f_name);
			}
		};
		return (new Struct_Pair(l8_code, runtime.m_tree.f_foldTree(l12_$10, l13_$11, ((Func3<Object,Object, Object, Object>)(Func3)l14_$9))));
	}
	int f_mark2production(int ai) {
		return (ai-1000000);
	}
	Object[] f_parsing2code(Struct_Grammar ag, Struct aparsing) {
		Struct l0__tmp = aparsing;
		switch (l0__tmp.getTypeId()) {
		case 11/*Choices*/: {
			final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
			final Object[] l2_s = l1__tmp.f_p;
			final Object[] l3_s = l1__tmp.f_p;
			return f_choices2code(ag, l3_s);
		}
		case 8/*BindMatched*/: {
			final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
			final String l4_n = l1__tmp.f_name;
			final Struct l5_p = l1__tmp.f_v;
			final String l6_n = l1__tmp.f_name;
			final Struct l7_p = l1__tmp.f_v;
			final Object[] l8_c = f_parsing2code(ag, l7_p);
			return runtime.m_array.f_concat3((new Object[] { SingletonStructs.str_PegStartString }), l8_c, (new Object[] { (new Struct_PegBindString(l6_n)) }));
		}
		case 9/*BindResult*/: {
			final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
			final String l9_n = l1__tmp.f_name;
			final Struct l10_p = l1__tmp.f_v;
			final String l11_n = l1__tmp.f_name;
			final Struct l12_p = l1__tmp.f_v;
			if (FlowRuntime.compareEqual(l12_p,(new Struct_Action2(((Struct)SingletonStructs.str_ActionIndex))))) {
				return (new Object[] { (new Struct_PegBindIndex(l11_n)) });
			} else {
				final Object[] l13_c = f_parsing2code(ag, l12_p);
				return runtime.h_Native.concat(l13_c, (new Object[] { (new Struct_PegBindValue(l11_n)) }));
			}
		}
		case 44/*Opt*/: {
			final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
			final Struct l14_p = l1__tmp.f_p;
			final Struct l15_p = l1__tmp.f_p;
			final Object[] l16_c = f_surroundChoice(ag, l15_p, 1);
			return runtime.m_array.f_concat3((new Object[] { SingletonStructs.str_PegStartCaptureList }), l16_c, (new Object[] { SingletonStructs.str_PegCaptureList }));
		}
		case 91/*Plus*/: {
			final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
			final Struct l17_p = l1__tmp.f_p;
			final Struct l18_p = l1__tmp.f_p;
			final Object[] l19_c = f_parsing2code(ag, l18_p);
			return runtime.m_array.f_concatA((new Object[] { (new Object[] { SingletonStructs.str_PegStartCaptureList }), l19_c, (new Object[] { (new Struct_PegChoice((runtime.h_Native.length(l19_c)+2))) }), l19_c, (new Object[] { (new Struct_PegCommit((-(runtime.h_Native.length(l19_c)+1)))), SingletonStructs.str_PegCaptureList }) }));
		}
		case 104/*Star*/: {
			final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
			final Struct l20_p = l1__tmp.f_p;
			final Struct l21_p = l1__tmp.f_p;
			final Object[] l22_c = f_parsing2code(ag, l21_p);
			return runtime.m_array.f_concat3((new Object[] { SingletonStructs.str_PegStartCaptureList, (new Struct_PegChoice((runtime.h_Native.length(l22_c)+2))) }), l22_c, (new Object[] { (new Struct_PegCommit((-(runtime.h_Native.length(l22_c)+1)))), SingletonStructs.str_PegCaptureList }));
		}
		case 100/*Seq*/: {
			final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
			final Object[] l23_s = l1__tmp.f_seq;
			final Object[] l24_s = l1__tmp.f_seq;
			return f_sequence2code(ag, l24_s);
		}
		case 41/*Negation*/: {
			final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
			final Struct l25_p = l1__tmp.f_p;
			final Struct l26_p = l1__tmp.f_p;
			final Object[] l27_c = f_parsing2code(ag, l26_p);
			return runtime.m_array.f_concat3((new Object[] { (new Struct_PegChoice((runtime.h_Native.length(l27_c)+3))) }), l27_c, (new Object[] { (new Struct_PegCommit(1)), SingletonStructs.str_PegFail }));
		}
		case 14/*CutUp*/: {
			final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
			final Struct l28_p = l1__tmp.f_p;
			final Struct l29_p = l1__tmp.f_p;
			return runtime.h_Native.concat((new Object[] { SingletonStructs.str_PegClearCache }), f_parsing2code(ag, l29_p));
		}
		case 13/*CutDown*/: {
			final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
			final Struct l30_p = l1__tmp.f_p;
			final Struct l31_p = l1__tmp.f_p;
			return runtime.h_Native.concat(f_parsing2code(ag, l31_p), (new Object[] { SingletonStructs.str_PegClearCache }));
		}
		case 110/*iRule*/: {
			final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
			final int l32_i = l1__tmp.f_i;
			final int l33_i = l1__tmp.f_i;
			return (new Object[] { (new Struct_PegCall(f_production2mark(l33_i))) });
		}
		case 97/*Rule*/: {
			final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
			final String l34_name = l1__tmp.f_name;
			final String l35_name = l1__tmp.f_name;
			final Object[] l39_$38 = ag.f_productions;
			final Func1<Boolean,Struct_Production> l40_$37 = new Func1<Boolean,Struct_Production>() {
				final public Boolean invoke(final Struct_Production ap) {
					return (ap.f_name).equals(l35_name);
				}
			};
			final int l41_i = ((int)runtime.m_maybe.f_either(runtime.m_array.f_findi(l39_$38, ((Func1<Boolean,Object>)(Func1)l40_$37)), (-1)));
			if ((l41_i==(-1))) {
				runtime.m_runtime.f_println(("Unknown rule: "+l35_name));
			} else {
			}
			Struct l42_$36;
			if (((Struct_Production)(ag.f_productions[l41_i])).f_caching) {
				l42_$36=(new Struct_PegCacheCall(f_production2mark(l41_i), l41_i));
			} else {
				l42_$36=(new Struct_PegCall(f_production2mark(l41_i)));
			}
			return (new Object[] { l42_$36 });
		}
		case 0/*Action*/: {
			final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
			final Func1<Object,Struct_PegEnv> l43_fn = l1__tmp.f_fn;
			final Func1<Object,Struct_PegEnv> l44_fn = l1__tmp.f_fn;
			return (new Object[] { (new Struct_PegAction(l44_fn)) });
		}
		case 1/*Action2*/: {
			final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
			final Struct l45_e = l1__tmp.f_e;
			final Struct l46_e = l1__tmp.f_e;
			Struct l47_act;
			if (true) {
				Struct l48__tmp = l46_e;
				switch (l48__tmp.getTypeId()) {
				case 6/*ActionIndex*/: {
					l47_act=l46_e;
					break;
				}
				case 7/*ActionVar*/: {
					final Struct_ActionVar l49__tmp = (Struct_ActionVar)l48__tmp;
					final String l50_id = l49__tmp.f_id;
					final String l51_id = l49__tmp.f_id;
					l47_act=l49__tmp;
					break;
				}
				case 2/*ActionCall*/: {
					final Struct_ActionCall l49__tmp = (Struct_ActionCall)l48__tmp;
					final String l52_id = l49__tmp.f_id;
					final Object[] l53_args = l49__tmp.f_args;
					final String l54_id = l49__tmp.f_id;
					final Object[] l55_args = l49__tmp.f_args;
					l47_act=(new Struct_ActionCallDebug(l54_id, l55_args));
					break;
				}
				case 3/*ActionCallDebug*/: {
					final Struct_ActionCallDebug l49__tmp = (Struct_ActionCallDebug)l48__tmp;
					final String l56_id = l49__tmp.f_id;
					final Object[] l57_args = l49__tmp.f_args;
					final String l58_id = l49__tmp.f_id;
					final Object[] l59_args = l49__tmp.f_args;
					l47_act=l49__tmp;
					break;
				}
				case 5/*ActionConstantString*/: {
					final Struct_ActionConstantString l49__tmp = (Struct_ActionConstantString)l48__tmp;
					final String l60_s = l49__tmp.f_s;
					final String l61_s = l49__tmp.f_s;
					l47_act=l49__tmp;
					break;
				}
				case 4/*ActionConstantInt*/: {
					final Struct_ActionConstantInt l49__tmp = (Struct_ActionConstantInt)l48__tmp;
					final int l62_i = l49__tmp.f_i;
					final int l63_i = l49__tmp.f_i;
					l47_act=l49__tmp;
					break;
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l48__tmp.getTypeName());
				}
			} else {
				l47_act=l46_e;
			}
			return (new Object[] { (new Struct_PegAction2(l47_act)) });
		}
		case 6/*ActionIndex*/: {
			return (new Object[] { SingletonStructs.str_PegActionIndex });
		}
		case 22/*Epsilon*/: {
			return SingletonStructs.arr_empty;
		}
		case 105/*Term*/: {
			final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
			final String l64_text = l1__tmp.f_name;
			final String l65_text = l1__tmp.f_name;
			return (new Object[] { (new Struct_PegString(l65_text)) });
		}
		case 10/*CharRange*/: {
			final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
			final String l66_first = l1__tmp.f_first;
			final String l67_last = l1__tmp.f_last;
			final String l68_first = l1__tmp.f_first;
			final String l69_last = l1__tmp.f_last;
			return (new Object[] { (new Struct_PegRange(l68_first, l69_last)) });
		}
		case 39/*LingoValue*/: {
			final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
			final Object l70_v = l1__tmp.f_value;
			final Object l71_v = l1__tmp.f_value;
			return SingletonStructs.arr_empty;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object[] f_production2code(Struct_Grammar ag, Struct_Production ap) {
		final int l0_nc = runtime.h_Native.length(ap.f_choices);
		if ((l0_nc==0)) {
			return (new Object[] { SingletonStructs.str_PegReturn });
		} else {
			if ((l0_nc==1)) {
				final Object[] l3_$2 = ap.f_choices;
				final Struct_Grammar l5_g = ag;
				final Func1<Object[],Struct_Seq> l4_$1 = new Func1<Object[],Struct_Seq>() {
					final public Object[] invoke(final Struct_Seq ac) {
						return f_sequence2code(l5_g, ac.f_seq);
					}
				};
				final Object[] l6_choices = runtime.h_Native.map(l3_$2, ((Func1<Object,Object>)(Func1)l4_$1));
				return runtime.m_array.f_arrayPush(((Object[])(l6_choices[0])), SingletonStructs.str_PegReturn);
			} else {
				final Struct_ShareAcc l7_prefix = f_sharePrefix(((Struct_Seq)(ap.f_choices[0])).f_seq, ((Struct_Seq)(ap.f_choices[1])).f_seq);
				if (((l0_nc==2)&&((Object[])l7_prefix.f_prefix).length != 0)) {
					final Object[] l8_prefixcode = f_sequence2code(ag, l7_prefix.f_prefix);
					final Object[] l9_suffix1 = f_sequence2code(ag, l7_prefix.f_suffix1);
					final int l10_s1 = runtime.h_Native.length(l9_suffix1);
					final Object[] l11_suffix2 = f_sequence2code(ag, l7_prefix.f_suffix2);
					final int l12_s2 = runtime.h_Native.length(l11_suffix2);
					return runtime.m_array.f_concatA((new Object[] { l8_prefixcode, (new Object[] { (new Struct_PegChoice((2+l10_s1))) }), l9_suffix1, (new Object[] { (new Struct_PegCommit((1+l12_s2))) }), l11_suffix2, (new Object[] { SingletonStructs.str_PegReturn }) }));
				} else {
					final Object[] l15_$14 = ap.f_choices;
					final Struct_Grammar l17_g = ag;
					final Func1<Object[],Struct_Seq> l16_$13 = new Func1<Object[],Struct_Seq>() {
						final public Object[] invoke(final Struct_Seq ac) {
							return f_sequence2code(l17_g, ac.f_seq);
						}
					};
					final Object[] l18_choices = runtime.h_Native.map(l15_$14, ((Func1<Object,Object>)(Func1)l16_$13));
					final Object[] l22_$20 = runtime.m_array.f_reverseA(l18_choices);
					final Object[] l23_$21 = SingletonStructs.arr_empty;
					final Func2<Object[],Object[], Object[]> l24_$19 = new Func2<Object[],Object[],Object[]>() {
						final public Object[] invoke(final Object[] aacc, final Object[] ac) {
							if (((Object[])aacc).length == 0) {
								return ac;
							} else {
								if ((runtime.h_Native.length(ac)==1)) {
									final Struct l0_gsymswitch0 = ((Struct)(ac[0]));
									Struct l1__tmp = l0_gsymswitch0;
									switch (l1__tmp.getTypeId()) {
									case 82/*PegString*/: {
										final Struct_PegString l2__tmp = (Struct_PegString)l1__tmp;
										final String l3_s = l2__tmp.f_x;
										final String l4_s = l2__tmp.f_x;
										return runtime.h_Native.concat((new Object[] { (new Struct_PegStringChoice(l4_s, (runtime.h_Native.length(aacc)+1))) }), aacc);
									}
									case 73/*PegRange*/: {
										final Struct_PegRange l2__tmp = (Struct_PegRange)l1__tmp;
										final String l5_low = l2__tmp.f_l;
										final String l6_up = l2__tmp.f_u;
										final String l7_low = l2__tmp.f_l;
										final String l8_up = l2__tmp.f_u;
										return runtime.h_Native.concat((new Object[] { (new Struct_PegRangeChoice(l7_low, l8_up, (runtime.h_Native.length(aacc)+1))) }), aacc);
									}
									default: {
										return runtime.m_array.f_concat3((new Object[] { (new Struct_PegChoice((runtime.h_Native.length(ac)+2))) }), ac, runtime.h_Native.concat((new Object[] { (new Struct_PegCommit((runtime.h_Native.length(aacc)+1))) }), aacc));
									}
									}
								} else {
									return runtime.m_array.f_concat3((new Object[] { (new Struct_PegChoice((runtime.h_Native.length(ac)+2))) }), ac, runtime.h_Native.concat((new Object[] { (new Struct_PegCommit((runtime.h_Native.length(aacc)+1))) }), aacc));
								}
							}
						}
					};
					return runtime.m_array.f_arrayPush(((Object[])runtime.h_Native.fold(l22_$20, l23_$21, ((Func2<Object,Object, Object>)(Func2)l24_$19))), SingletonStructs.str_PegReturn);
				}
			}
		}
	}
	int f_production2mark(int ai) {
		return (ai+1000000);
	}
	Struct f_renameBinding(Struct ap, String aname, String anewname) {
		Struct l0__tmp = ap;
		switch (l0__tmp.getTypeId()) {
		case 9/*BindResult*/: {
			final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
			final String l2_n = l1__tmp.f_name;
			final Struct l3_r = l1__tmp.f_v;
			final String l4_n = l1__tmp.f_name;
			final Struct l5_r = l1__tmp.f_v;
			if ((l4_n).equals(aname)) {
				return (new Struct_BindResult(anewname, f_renameBinding(l5_r, aname, anewname)));
			} else {
				return l1__tmp;
			}
		}
		case 8/*BindMatched*/: {
			final Struct_BindMatched l1__tmp = (Struct_BindMatched)l0__tmp;
			final String l6_n = l1__tmp.f_name;
			final Struct l7_r = l1__tmp.f_v;
			final String l8_n = l1__tmp.f_name;
			final Struct l9_r = l1__tmp.f_v;
			if ((l8_n).equals(aname)) {
				return (new Struct_BindMatched(anewname, f_renameBinding(l9_r, aname, anewname)));
			} else {
				return l1__tmp;
			}
		}
		case 110/*iRule*/: {
			final Struct_iRule l1__tmp = (Struct_iRule)l0__tmp;
			final int l10_i = l1__tmp.f_i;
			final int l11_i = l1__tmp.f_i;
			return l1__tmp;
		}
		case 10/*CharRange*/: {
			final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
			final String l12_f = l1__tmp.f_first;
			final String l13_l = l1__tmp.f_last;
			final String l14_f = l1__tmp.f_first;
			final String l15_l = l1__tmp.f_last;
			return l1__tmp;
		}
		case 105/*Term*/: {
			final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
			final String l16_n = l1__tmp.f_name;
			final String l17_n = l1__tmp.f_name;
			return l1__tmp;
		}
		case 6/*ActionIndex*/: {
			return ap;
		}
		case 22/*Epsilon*/: {
			return ap;
		}
		case 97/*Rule*/: {
			final Struct_Rule l1__tmp = (Struct_Rule)l0__tmp;
			final String l18_m = l1__tmp.f_name;
			final String l19_m = l1__tmp.f_name;
			return l1__tmp;
		}
		case 0/*Action*/: {
			final Struct_Action l1__tmp = (Struct_Action)l0__tmp;
			final Func1<Object,Struct_PegEnv> l20_fn = l1__tmp.f_fn;
			final Func1<Object,Struct_PegEnv> l21_fn = l1__tmp.f_fn;
			return l1__tmp;
		}
		case 100/*Seq*/: {
			final Struct_Seq l1__tmp = (Struct_Seq)l0__tmp;
			final Object[] l22_seq = l1__tmp.f_seq;
			final Object[] l23_seq = l1__tmp.f_seq;
			return (new Struct_Seq(f_renameBindings2(l23_seq, aname, anewname)));
		}
		case 11/*Choices*/: {
			final Struct_Choices l1__tmp = (Struct_Choices)l0__tmp;
			final Object[] l24_seq = l1__tmp.f_p;
			final Object[] l25_seq = l1__tmp.f_p;
			return (new Struct_Choices(f_renameBindings2(l25_seq, aname, anewname)));
		}
		case 44/*Opt*/: {
			final Struct_Opt l1__tmp = (Struct_Opt)l0__tmp;
			final Struct l26_r = l1__tmp.f_p;
			final Struct l27_r = l1__tmp.f_p;
			return (new Struct_Opt(f_renameBinding(l27_r, aname, anewname)));
		}
		case 104/*Star*/: {
			final Struct_Star l1__tmp = (Struct_Star)l0__tmp;
			final Struct l28_r = l1__tmp.f_p;
			final Struct l29_r = l1__tmp.f_p;
			return (new Struct_Star(f_renameBinding(l29_r, aname, anewname)));
		}
		case 91/*Plus*/: {
			final Struct_Plus l1__tmp = (Struct_Plus)l0__tmp;
			final Struct l30_r = l1__tmp.f_p;
			final Struct l31_r = l1__tmp.f_p;
			return (new Struct_Plus(f_renameBinding(l31_r, aname, anewname)));
		}
		case 41/*Negation*/: {
			final Struct_Negation l1__tmp = (Struct_Negation)l0__tmp;
			final Struct l32_r = l1__tmp.f_p;
			final Struct l33_r = l1__tmp.f_p;
			return (new Struct_Negation(f_renameBinding(l33_r, aname, anewname)));
		}
		case 14/*CutUp*/: {
			final Struct_CutUp l1__tmp = (Struct_CutUp)l0__tmp;
			final Struct l34_r = l1__tmp.f_p;
			final Struct l35_r = l1__tmp.f_p;
			return (new Struct_CutUp(f_renameBinding(l35_r, aname, anewname)));
		}
		case 13/*CutDown*/: {
			final Struct_CutDown l1__tmp = (Struct_CutDown)l0__tmp;
			final Struct l36_r = l1__tmp.f_p;
			final Struct l37_r = l1__tmp.f_p;
			return (new Struct_CutDown(f_renameBinding(l37_r, aname, anewname)));
		}
		case 1/*Action2*/: {
			final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
			final Struct l38_e = l1__tmp.f_e;
			final Struct l39_e = l1__tmp.f_e;
			return (new Struct_Action2(f_renameBindingInAction(l39_e, aname, anewname)));
		}
		case 39/*LingoValue*/: {
			final Struct_LingoValue l1__tmp = (Struct_LingoValue)l0__tmp;
			final Object l40_v = l1__tmp.f_value;
			final Object l41_v = l1__tmp.f_value;
			return l1__tmp;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_renameBindingInAction(Struct aa, String aname, String anewname) {
		Struct l0__tmp = aa;
		switch (l0__tmp.getTypeId()) {
		case 6/*ActionIndex*/: {
			return aa;
		}
		case 7/*ActionVar*/: {
			final Struct_ActionVar l1__tmp = (Struct_ActionVar)l0__tmp;
			final String l2_id = l1__tmp.f_id;
			final String l3_id = l1__tmp.f_id;
			if ((l3_id).equals(aname)) {
				return (new Struct_ActionVar(anewname));
			} else {
				return l1__tmp;
			}
		}
		case 2/*ActionCall*/: {
			final Struct_ActionCall l1__tmp = (Struct_ActionCall)l0__tmp;
			final String l4_id = l1__tmp.f_id;
			final Object[] l5_args = l1__tmp.f_args;
			final String l6_id = l1__tmp.f_id;
			final Object[] l7_args = l1__tmp.f_args;
			final String l10_name = aname;
			final String l11_newname = anewname;
			final Func1<Struct,Struct> l9_$8 = new Func1<Struct,Struct>() {
				final public Struct invoke(final Struct aarg) {
					return f_renameBindingInAction(aarg, l10_name, l11_newname);
				}
			};
			return (new Struct_ActionCall(l6_id, runtime.h_Native.map(l7_args, ((Func1<Object,Object>)(Func1)l9_$8))));
		}
		case 3/*ActionCallDebug*/: {
			final Struct_ActionCallDebug l1__tmp = (Struct_ActionCallDebug)l0__tmp;
			final String l12_id = l1__tmp.f_id;
			final Object[] l13_args = l1__tmp.f_args;
			final String l14_id = l1__tmp.f_id;
			final Object[] l15_args = l1__tmp.f_args;
			final String l18_name = aname;
			final String l19_newname = anewname;
			final Func1<Struct,Struct> l17_$16 = new Func1<Struct,Struct>() {
				final public Struct invoke(final Struct aarg) {
					return f_renameBindingInAction(aarg, l18_name, l19_newname);
				}
			};
			return (new Struct_ActionCallDebug(l14_id, runtime.h_Native.map(l15_args, ((Func1<Object,Object>)(Func1)l17_$16))));
		}
		case 5/*ActionConstantString*/: {
			final Struct_ActionConstantString l1__tmp = (Struct_ActionConstantString)l0__tmp;
			final String l20_s = l1__tmp.f_s;
			final String l21_s = l1__tmp.f_s;
			return l1__tmp;
		}
		case 4/*ActionConstantInt*/: {
			final Struct_ActionConstantInt l1__tmp = (Struct_ActionConstantInt)l0__tmp;
			final int l22_s = l1__tmp.f_i;
			final int l23_s = l1__tmp.f_i;
			return l1__tmp;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object[] f_renameBindings2(Object[] as, String aname, String anewname) {
		final Object[] l2_$1 = SingletonStructs.arr_empty;
		final String l4_name = aname;
		final String l5_newname = anewname;
		final Func2<Object[],Object[], Struct> l3_$0 = new Func2<Object[],Object[],Struct>() {
			final public Object[] invoke(final Object[] aacc, final Struct ap) {
				return runtime.m_array.f_arrayPush(aacc, f_renameBinding(ap, l4_name, l5_newname));
			}
		};
		return ((Object[])runtime.h_Native.fold(as, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
	}
	Object[] f_renumberPegcode(Object[] acode, Struct aproductionAddresses) {
		final Struct l1_productionAddresses = aproductionAddresses;
		final Func1<Integer,Integer> l0_fix = new Func1<Integer,Integer>() {
			final public Integer invoke(final Integer al) {
				if ((((int)al)>=1000000)) {
					return ((Integer)runtime.m_tree.f_lookupTreeDef(l1_productionAddresses, f_mark2production(((int)al)), (-1)));
				} else {
					return al;
				}
			}
		};
		final Func1<Struct,Struct> l3_$2 = new Func1<Struct,Struct>() {
			final public Struct invoke(final Struct ap) {
				Struct l0__tmp = ap;
				switch (l0__tmp.getTypeId()) {
				case 82/*PegString*/: {
					final Struct_PegString l1__tmp = (Struct_PegString)l0__tmp;
					final String l2_x = l1__tmp.f_x;
					final String l3_x = l1__tmp.f_x;
					return l1__tmp;
				}
				case 73/*PegRange*/: {
					final Struct_PegRange l1__tmp = (Struct_PegRange)l0__tmp;
					final String l4_l = l1__tmp.f_l;
					final String l5_u = l1__tmp.f_u;
					final String l6_l = l1__tmp.f_l;
					final String l7_u = l1__tmp.f_u;
					return l1__tmp;
				}
				case 72/*PegJump*/: {
					final Struct_PegJump l1__tmp = (Struct_PegJump)l0__tmp;
					final int l8_l = l1__tmp.f_l;
					final int l9_l = l1__tmp.f_l;
					return (new Struct_PegJump(((int)l0_fix.invoke(((Integer)l9_l)))));
				}
				case 61/*PegChoice*/: {
					final Struct_PegChoice l1__tmp = (Struct_PegChoice)l0__tmp;
					final int l10_l = l1__tmp.f_l;
					final int l11_l = l1__tmp.f_l;
					return (new Struct_PegChoice(((int)l0_fix.invoke(((Integer)l11_l)))));
				}
				case 83/*PegStringChoice*/: {
					final Struct_PegStringChoice l1__tmp = (Struct_PegStringChoice)l0__tmp;
					final String l12_x = l1__tmp.f_x;
					final int l13_l = l1__tmp.f_commit;
					final String l14_x = l1__tmp.f_x;
					final int l15_l = l1__tmp.f_commit;
					return (new Struct_PegStringChoice(l14_x, ((int)l0_fix.invoke(((Integer)l15_l)))));
				}
				case 74/*PegRangeChoice*/: {
					final Struct_PegRangeChoice l1__tmp = (Struct_PegRangeChoice)l0__tmp;
					final String l16_low = l1__tmp.f_l;
					final String l17_up = l1__tmp.f_u;
					final int l18_l = l1__tmp.f_commit;
					final String l19_low = l1__tmp.f_l;
					final String l20_up = l1__tmp.f_u;
					final int l21_l = l1__tmp.f_commit;
					return (new Struct_PegRangeChoice(l19_low, l20_up, ((int)l0_fix.invoke(((Integer)l21_l)))));
				}
				case 57/*PegCall*/: {
					final Struct_PegCall l1__tmp = (Struct_PegCall)l0__tmp;
					final int l22_l = l1__tmp.f_l;
					final int l23_l = l1__tmp.f_l;
					return (new Struct_PegCall(((int)l0_fix.invoke(((Integer)l23_l)))));
				}
				case 56/*PegCacheCall*/: {
					final Struct_PegCacheCall l1__tmp = (Struct_PegCacheCall)l0__tmp;
					final int l24_l = l1__tmp.f_l;
					final int l25_c = l1__tmp.f_cacheEntry;
					final int l26_l = l1__tmp.f_l;
					final int l27_c = l1__tmp.f_cacheEntry;
					return (new Struct_PegCacheCall(((int)l0_fix.invoke(((Integer)l26_l))), l27_c));
				}
				case 75/*PegReturn*/: {
					return ap;
				}
				case 66/*PegDrop*/: {
					return ap;
				}
				case 64/*PegCommit*/: {
					final Struct_PegCommit l1__tmp = (Struct_PegCommit)l0__tmp;
					final int l28_l = l1__tmp.f_l;
					final int l29_l = l1__tmp.f_l;
					return (new Struct_PegCommit(((int)l0_fix.invoke(((Integer)l29_l)))));
				}
				case 81/*PegStartString*/: {
					return ap;
				}
				case 53/*PegBindString*/: {
					final Struct_PegBindString l1__tmp = (Struct_PegBindString)l0__tmp;
					final String l30_v = l1__tmp.f_n;
					final String l31_v = l1__tmp.f_n;
					return l1__tmp;
				}
				case 80/*PegStartCaptureList*/: {
					return ap;
				}
				case 54/*PegBindValue*/: {
					final Struct_PegBindValue l1__tmp = (Struct_PegBindValue)l0__tmp;
					final String l32_v = l1__tmp.f_n;
					final String l33_v = l1__tmp.f_n;
					return l1__tmp;
				}
				case 52/*PegBindIndex*/: {
					final Struct_PegBindIndex l1__tmp = (Struct_PegBindIndex)l0__tmp;
					final String l34_v = l1__tmp.f_n;
					final String l35_v = l1__tmp.f_n;
					return l1__tmp;
				}
				case 48/*PegAction*/: {
					final Struct_PegAction l1__tmp = (Struct_PegAction)l0__tmp;
					final Func1<Object,Struct_PegEnv> l36_v = l1__tmp.f_fn;
					final Func1<Object,Struct_PegEnv> l37_v = l1__tmp.f_fn;
					return l1__tmp;
				}
				case 49/*PegAction2*/: {
					final Struct_PegAction2 l1__tmp = (Struct_PegAction2)l0__tmp;
					final Struct l38_e = l1__tmp.f_e;
					final Struct l39_e = l1__tmp.f_e;
					return l1__tmp;
				}
				case 50/*PegActionIndex*/: {
					return ap;
				}
				case 70/*PegFail*/: {
					return ap;
				}
				case 67/*PegEnd*/: {
					return ap;
				}
				case 58/*PegCaptureList*/: {
					return ap;
				}
				case 62/*PegClearCache*/: {
					return ap;
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
				}
			}
		};
		return runtime.h_Native.map(acode, ((Func1<Object,Object>)(Func1)l3_$2));
	}
	boolean f_sameParsing(Struct ap1, Struct ap2) {
		return FlowRuntime.compareEqual(f_stripBind(ap1),f_stripBind(ap2));
	}
	boolean f_semanticParsing(Struct ap) {
	 TAIL_CALL: for(;;) {
		Struct l0__tmp = ap;
		switch (l0__tmp.getTypeId()) {
		case 9/*BindResult*/: {
			final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
			final String l2_n = l1__tmp.f_name;
			final Struct l3_r = l1__tmp.f_v;
			final String l4_n = l1__tmp.f_name;
			final Struct l5_r = l1__tmp.f_v;
			{
				final Struct l6___tmp = l5_r;
				ap = l6___tmp;
				continue TAIL_CALL;
			}
		}
		case 1/*Action2*/: {
			final Struct_Action2 l1__tmp = (Struct_Action2)l0__tmp;
			final Struct l7_a = l1__tmp.f_e;
			final Struct l8_a = l1__tmp.f_e;
			return ((Struct)l8_a).getTypeId() != 6;
		}
		default: {
			return true;
		}
		}
	 }
	}
	Object[] f_sequence2code(Struct_Grammar ag, Object[] as) {
		final Struct_Grammar l2_g = ag;
		final Func1<Object[],Struct> l1_$0 = new Func1<Object[],Struct>() {
			final public Object[] invoke(final Struct ap) {
				return runtime.m_array.f_arrayPush(f_parsing2code(l2_g, ap), SingletonStructs.str_PegDrop);
			}
		};
		final Object[] l3_ns = runtime.m_array.f_concatA(runtime.h_Native.map(as, ((Func1<Object,Object>)(Func1)l1_$0)));
		return runtime.h_Native.subrange(l3_ns, 0, (runtime.h_Native.length(l3_ns)-1));
	}
	Struct_ShareAcc f_sharePrefix(Object[] ap1, Object[] ap2) {
		final int l0_l = ((int)runtime.m_runtime.f_min(runtime.h_Native.length(ap1), runtime.h_Native.length(ap2)));
		return f_doSharePrefix(ap1, ap2, (new Struct_ShareAcc(SingletonStructs.arr_empty, SingletonStructs.arr_empty, SingletonStructs.arr_empty)), 0, 0, l0_l);
	}
	Struct f_stripBind(Struct ap) {
		Struct l0__tmp = ap;
		switch (l0__tmp.getTypeId()) {
		case 9/*BindResult*/: {
			final Struct_BindResult l1__tmp = (Struct_BindResult)l0__tmp;
			final String l2_n = l1__tmp.f_name;
			final Struct l3_r = l1__tmp.f_v;
			final String l4_n = l1__tmp.f_name;
			final Struct l5_r = l1__tmp.f_v;
			return l5_r;
		}
		default: {
			return ap;
		}
		}
	}
	Object[] f_surroundChoice(Struct_Grammar ag, Struct ap, int acommit) {
		Struct l0__tmp = ap;
		switch (l0__tmp.getTypeId()) {
		case 105/*Term*/: {
			final Struct_Term l1__tmp = (Struct_Term)l0__tmp;
			final String l2_text = l1__tmp.f_name;
			final String l3_text = l1__tmp.f_name;
			return (new Object[] { (new Struct_PegStringChoice(l3_text, acommit)) });
		}
		case 10/*CharRange*/: {
			final Struct_CharRange l1__tmp = (Struct_CharRange)l0__tmp;
			final String l4_low = l1__tmp.f_first;
			final String l5_up = l1__tmp.f_last;
			final String l6_low = l1__tmp.f_first;
			final String l7_up = l1__tmp.f_last;
			return (new Object[] { (new Struct_PegRangeChoice(l6_low, l7_up, acommit)) });
		}
		default: {
			final Object[] l8_c = f_parsing2code(ag, ap);
			return runtime.m_array.f_concat3((new Object[] { (new Struct_PegChoice((runtime.h_Native.length(l8_c)+2))) }), l8_c, (new Object[] { (new Struct_PegCommit(acommit)) }));
		}
		}
	}
}
