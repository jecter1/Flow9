// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_pegcode {
	final lab9 runtime;
	Module_pegcode(lab9 runtime) {
		this.runtime = runtime;
	}
	public Reference<Struct> g_profilePcs;
	public void init_profilePcs() {
		g_profilePcs=((Reference<Struct>)(new Reference(runtime.m_tree.f_makeTree())));
	}
	String f_pegcode2string(int apc, Struct ac, Func1<String,Integer> afn) {
		Struct l0__tmp = ac;
		switch (l0__tmp.getTypeId()) {
		case 83/*PegStringChoice*/: {
			final Struct_PegStringChoice l1__tmp = (Struct_PegStringChoice)l0__tmp;
			final String l2_x = l1__tmp.f_x;
			final int l3_d = l1__tmp.f_commit;
			final String l4_x = l1__tmp.f_x;
			final int l5_d = l1__tmp.f_commit;
			return (((((("PegStringChoice("+((Func1<String,String>)(Func1)runtime.gfw_toString).invoke(l4_x))+", ")+runtime.m_string.f_i2s(l5_d))+" -> ")+runtime.m_string.f_i2s((apc+l5_d)))+")");
		}
		case 74/*PegRangeChoice*/: {
			final Struct_PegRangeChoice l1__tmp = (Struct_PegRangeChoice)l0__tmp;
			final String l6_low = l1__tmp.f_l;
			final String l7_up = l1__tmp.f_u;
			final int l8_d = l1__tmp.f_commit;
			final String l9_low = l1__tmp.f_l;
			final String l10_up = l1__tmp.f_u;
			final int l11_d = l1__tmp.f_commit;
			return (((((((("PegRangeChoice("+((Func1<String,String>)(Func1)runtime.gfw_toString).invoke(l9_low))+", ")+((Func1<String,String>)(Func1)runtime.gfw_toString).invoke(l10_up))+", ")+runtime.m_string.f_i2s(l11_d))+" -> ")+runtime.m_string.f_i2s((apc+l11_d)))+")");
		}
		case 61/*PegChoice*/: {
			final Struct_PegChoice l1__tmp = (Struct_PegChoice)l0__tmp;
			final int l12_d = l1__tmp.f_l;
			final int l13_d = l1__tmp.f_l;
			return (((("PegChoice(+"+runtime.m_string.f_i2s(l13_d))+" -> ")+runtime.m_string.f_i2s((apc+l13_d)))+")");
		}
		case 64/*PegCommit*/: {
			final Struct_PegCommit l1__tmp = (Struct_PegCommit)l0__tmp;
			final int l14_d = l1__tmp.f_l;
			final int l15_d = l1__tmp.f_l;
			return (((("PegCommit(+"+runtime.m_string.f_i2s(l15_d))+" -> ")+runtime.m_string.f_i2s((apc+l15_d)))+")");
		}
		case 57/*PegCall*/: {
			final Struct_PegCall l1__tmp = (Struct_PegCall)l0__tmp;
			final int l16_d = l1__tmp.f_l;
			final int l17_d = l1__tmp.f_l;
			return (((("PegCall("+runtime.m_string.f_i2s(l17_d))+" : ")+afn.invoke(((Integer)l17_d)))+")");
		}
		case 56/*PegCacheCall*/: {
			final Struct_PegCacheCall l1__tmp = (Struct_PegCacheCall)l0__tmp;
			final int l18_d = l1__tmp.f_l;
			final int l19_ce = l1__tmp.f_cacheEntry;
			final int l20_d = l1__tmp.f_l;
			final int l21_ce = l1__tmp.f_cacheEntry;
			return (((((("PegCacheCall("+runtime.m_string.f_i2s(l20_d))+" : ")+afn.invoke(((Integer)l20_d)))+",")+runtime.m_string.f_i2s(l21_ce))+")");
		}
		default: {
			return ((Func1<String,Struct>)(Func1)runtime.gfw_toString).invoke(ac);
		}
		}
	}
	Object f_printPegcode(Object[] aop, Struct adebug) {
		final Struct l1_debug = adebug;
		final Func1<String,Integer> l0_fn = new Func1<String,Integer>() {
			final public String invoke(final Integer apc) {
				final Func3<String,Integer, String, String> l1_$0 = new Func3<String,Integer,String,String>() {
					final public String invoke(final Integer ak, final String av, final String aacc) {
						if ((((int)apc)>=((int)ak))) {
							return av;
						} else {
							return aacc;
						}
					}
				};
				return ((String)runtime.m_tree.f_foldTree(l1_debug, "", ((Func3<Object,Object, Object, Object>)(Func3)l1_$0)));
			}
		};
		final Struct l4_$3 = runtime.m_tree.f_makeTree();
		final Func3<Struct,Integer, Struct, Struct> l5_$2 = new Func3<Struct,Integer,Struct,Struct>() {
			final public Struct invoke(final Integer ai, final Struct aacc, final Struct ac) {
				final String l0_fun = l0_fn.invoke(ai);
				final int l1_prof = ((int)runtime.m_tree.f_lookupTreeDef(g_profilePcs.value, ai, 0));
				return ((Func3<Struct,Struct, String, Integer>)(Func3)runtime.n_setTree).invoke(aacc, l0_fun, ((Integer)(((int)runtime.m_tree.f_lookupTreeDef(aacc, l0_fun, 0))+l1_prof)));
			}
		};
		final Struct l6_perFn = ((Struct)runtime.h_Native.foldi(aop, l4_$3, ((Func3<Object,Integer, Object, Object>)(Func3)l5_$2)));
		final int l7_total = runtime.m_math.f_sum(runtime.m_tree.f_getTreeValues(g_profilePcs.value));
		if ((l7_total!=0)) {
			runtime.m_runtime.f_println("Instructions per rule");
			final Func2<Object,String, Integer> l9_$8 = new Func2<Object,String,Integer>() {
				final public Object invoke(final String ak, final Integer av) {
					if ((((int)av)>0)) {
						return runtime.m_runtime.f_println((((((ak+": ")+runtime.m_string.f_i2s(((int)av)))+" ")+runtime.m_stringmath.f_d2st(((100.0*runtime.m_math.f_i2d(((int)av)))/runtime.m_math.f_i2d(l7_total)), 1))+"%"));
					} else {
						return null;
					}
				}
			};
			runtime.m_tree.f_traverseInOrder(l6_perFn, ((Func2<Object,Object, Object>)(Func2)l9_$8));
			final Struct l12_$11 = runtime.m_tree.f_makeTree();
			final Func3<Struct,Integer, Struct, Struct> l13_$10 = new Func3<Struct,Integer,Struct,Struct>() {
				final public Struct invoke(final Integer ai, final Struct aacc, final Struct ac) {
					final int l0_prof = ((int)runtime.m_tree.f_lookupTreeDef(g_profilePcs.value, ai, 0));
					return ((Func3<Struct,Struct, String, Integer>)(Func3)runtime.n_setTree).invoke(aacc, ((Struct)ac).getTypeName(), ((Integer)(((int)runtime.m_tree.f_lookupTreeDef(aacc, ((Struct)ac).getTypeName(), 0))+l0_prof)));
				}
			};
			final Struct l14_perOpcode = ((Struct)runtime.h_Native.foldi(aop, l12_$11, ((Func3<Object,Integer, Object, Object>)(Func3)l13_$10)));
			runtime.m_runtime.f_println(("\nInstructions per opcode. Total: "+runtime.m_string.f_i2s(l7_total)));
			final Func2<Object,String, Integer> l16_$15 = new Func2<Object,String,Integer>() {
				final public Object invoke(final String ak, final Integer av) {
					if ((((int)av)>0)) {
						return runtime.m_runtime.f_println((((((ak+": ")+runtime.m_string.f_i2s(((int)av)))+" ")+runtime.m_stringmath.f_d2st(((100.0*runtime.m_math.f_i2d(((int)av)))/runtime.m_math.f_i2d(l7_total)), 1))+"%"));
					} else {
						return null;
					}
				}
			};
			runtime.m_tree.f_traverseInOrder(l14_perOpcode, ((Func2<Object,Object, Object>)(Func2)l16_$15));
		} else {
		}
		final Func3<String,Integer, String, Struct> l18_$17 = new Func3<String,Integer,String,Struct>() {
			final public String invoke(final Integer ai, final String aacc, final Struct ac) {
				final int l0_prof = ((int)runtime.m_tree.f_lookupTreeDef(g_profilePcs.value, ai, 0));
				return ((((((aacc+runtime.m_string.f_i2s(((int)ai)))+" ")+l0_fn.invoke(ai))+":")+f_pegcode2string(((int)ai), ac, l0_fn))+((l7_total!=0)?((" "+runtime.m_string.f_i2s(l0_prof))+" visits\n"):"\n"));
			}
		};
		return runtime.m_runtime.f_println(runtime.h_Native.foldi(aop, "", ((Func3<Object,Integer, Object, Object>)(Func3)l18_$17)));
	}
	Struct_ParseResult f_runPeg(String ainput, Object[] aprogram, Struct adebug, Struct_SemanticActions afunctions) {
		final Struct l2_$1 = afunctions.f_t;
		final Struct l4_debug = adebug;
		final Func1<Object,Object[]> l3_$0 = new Func1<Object,Object[]>() {
			final public Object invoke(final Object[] aargs) {
				final int l0_pc = runtime.m_dynamic.f_flow2i(((Object)(aargs[0])));
				final Func3<String,Integer, String, String> l2_$1 = new Func3<String,Integer,String,String>() {
					final public String invoke(final Integer ak, final String av, final String aacc) {
						if ((l0_pc>=((int)ak))) {
							return av;
						} else {
							return aacc;
						}
					}
				};
				return runtime.m_dynamic.f_flow(runtime.m_tree.f_foldTree(l4_debug, "", ((Func3<Object,Object, Object, Object>)(Func3)l2_$1)));
			}
		};
		final Struct l5_t = ((Func3<Struct,Struct, String, Func1<Object,Object[]>>)(Func3)runtime.n_setTree).invoke(l2_$1, "callstack", l3_$0);
		final Func2<Integer,Integer, Struct> l7_$6 = new Func2<Integer,Integer,Struct>() {
			final public Integer invoke(final Integer aacc, final Struct aop) {
				Struct l0__tmp = aop;
				switch (l0__tmp.getTypeId()) {
				case 56/*PegCacheCall*/: {
					final Struct_PegCacheCall l1__tmp = (Struct_PegCacheCall)l0__tmp;
					final int l2_l = l1__tmp.f_l;
					final int l3_c = l1__tmp.f_cacheEntry;
					final int l4_l = l1__tmp.f_l;
					final int l5_c = l1__tmp.f_cacheEntry;
					return ((Func2<Integer,Integer, Integer>)(Func2)runtime.n_max).invoke(aacc, ((Integer)l5_c));
				}
				default: {
					return aacc;
				}
				}
			}
		};
		final int l8_cacheSize = ((int)runtime.h_Native.fold(aprogram, 0, ((Func2<Object,Object, Object>)(Func2)l7_$6)));
		final int l11_$10 = (l8_cacheSize+1);
		final Func1<Reference<Struct>,Integer> l12_$9 = new Func1<Reference<Struct>,Integer>() {
			final public Reference<Struct> invoke(final Integer ai) {
				return runtime.m_inttree.f_makeIntTree();
			}
		};
		final Struct_PegVmCache l13_cache = (new Struct_PegVmCache(runtime.m_runtime.f_generate(0, l11_$10, ((Func1<Object,Integer>)(Func1)l12_$9))));
		runtime.m_peg.g_parseCacheHits.value = runtime.m_inttree.f_makeIntTree().value;
		runtime.m_peg.g_parseCacheMisses.value = runtime.m_inttree.f_makeIntTree().value;
		final Struct_RuleResult l14_drv = (new Struct_RuleResult(runtime.m_dynamic.f_flow(ainput), 0, 0, ((Struct)SingletonStructs.str_None)));
		final Struct_PegCodeConst l15_pca = (new Struct_PegCodeConst(ainput, aprogram, l5_t, l13_cache, l14_drv));
		final Struct_ParseResult l16_r = f_whilePeg(l15_pca, 0, 0, runtime.m_list.f_makeList(), runtime.m_list.f_makeList(), (new Struct_Cons(runtime.m_tree.f_makeTree(), ((Struct)SingletonStructs.str_EmptyList))));
		if ((false&&(!FlowRuntime.compareEqual(adebug,runtime.m_tree.f_makeTree())))) {
			f_printPegcode(aprogram, adebug);
		} else {
		}
		if ((l16_r.f_pos<runtime.h_Native.strlen(ainput))) {
			final Object[] l20_$18 = l15_pca.f_cache.f_caches;
			final int l21_$19 = l16_r.f_pos;
			final Func2<Integer,Integer, Reference<Struct>> l22_$17 = new Func2<Integer,Integer,Reference<Struct>>() {
				final public Integer invoke(final Integer aacc, final Reference<Struct> atheCache) {
					final Reference<Integer> l0_pos = ((Reference<Integer>)(new Reference(aacc)));
					final Func2<Object,Integer, Struct_PegVmCacheItem> l2_$1 = new Func2<Object,Integer,Struct_PegVmCacheItem>() {
						final public Object invoke(final Integer ap, final Struct_PegVmCacheItem as) {
							if ((!FlowRuntime.compareEqual(as,runtime.m_pegcode_lib.g_peg_fail_cache_item))) {
								l0_pos.value = ((Func2<Integer,Integer, Integer>)(Func2)runtime.n_max).invoke(ap, l0_pos.value);
								return null;
							} else {
								return null;
							}
						}
					};
					runtime.m_inttree.f_iterIntTree(atheCache, ((Func2<Object,Integer, Object>)(Func2)l2_$1));
					return l0_pos.value;
				}
			};
			final int l23_lastPos = ((int)runtime.h_Native.fold(l20_$18, l21_$19, ((Func2<Object,Object, Object>)(Func2)l22_$17)));
			return (new Struct_ParseResult(l23_lastPos, l16_r.f_result));
		} else {
			return l16_r;
		}
	}
	Struct_ParseResult f_whilePeg(Struct_PegCodeConst apca, int apc, int ai, Struct astack, Struct acapture, Struct aenv) {
	 TAIL_CALL: for(;;) {
		if ((apc<0)) {
			Struct l0__tmp = astack;
			switch (l0__tmp.getTypeId()) {
			case 20/*EmptyList*/: {
				runtime.m_pegcode_lib.f_pegAddress2rule(apca.f_fns, apc);
				return (new Struct_ParseResult(ai, ((Struct)SingletonStructs.str_None)));
			}
			case 12/*Cons*/: {
				final Struct_Cons l1__tmp = (Struct_Cons)l0__tmp;
				final Object l2_h = l1__tmp.f_head;
				final Struct l3_t = l1__tmp.f_tail;
				final Struct l4_h = ((Struct)l1__tmp.f_head);
				final Struct l5_t = l1__tmp.f_tail;
				Struct l6__tmp = l4_h;
				switch (l6__tmp.getTypeId()) {
				case 78/*PegStackPc*/: {
					final Struct_PegStackPc l7__tmp = (Struct_PegStackPc)l6__tmp;
					final int l8_pc0 = l7__tmp.f_pc;
					final Struct l9_cl = l7__tmp.f_capture;
					final int l10_pc0 = l7__tmp.f_pc;
					final Struct l11_cl = l7__tmp.f_capture;
					{
						final Struct l12___tmp = l5_t;
						final Struct l13___tmp = l11_cl;
						final Struct l14___tmp = runtime.n_tailList.invoke(aenv);
						astack = l12___tmp;
						acapture = l13___tmp;
						aenv = l14___tmp;
						continue TAIL_CALL;
					}
				}
				case 79/*PegStackPcCache*/: {
					final Struct_PegStackPcCache l7__tmp = (Struct_PegStackPcCache)l6__tmp;
					final int l15_pc0 = l7__tmp.f_pc;
					final int l16_ce = l7__tmp.f_ce;
					final int l17_si = l7__tmp.f_start;
					final Struct l18_cl = l7__tmp.f_capture;
					final int l19_pc0 = l7__tmp.f_pc;
					final int l20_ce = l7__tmp.f_ce;
					final int l21_si = l7__tmp.f_start;
					final Struct l22_cl = l7__tmp.f_capture;
					final Reference<Struct> l23_it = ((Reference<Struct>)(apca.f_cache.f_caches[l20_ce]));
					l23_it.value = runtime.m_inttree.f_addOrUpdateIntTree(l23_it, l21_si, runtime.m_pegcode_lib.g_peg_fail_cache_item);
					{
						final Struct l24___tmp = l5_t;
						final Struct l25___tmp = l22_cl;
						final Struct l26___tmp = runtime.n_tailList.invoke(aenv);
						astack = l24___tmp;
						acapture = l25___tmp;
						aenv = l26___tmp;
						continue TAIL_CALL;
					}
				}
				case 77/*PegStackChoice*/: {
					final Struct_PegStackChoice l7__tmp = (Struct_PegStackChoice)l6__tmp;
					final int l27_pc0 = l7__tmp.f_pc;
					final int l28_i0 = l7__tmp.f_i;
					final Struct l29_c0 = l7__tmp.f_capture;
					final int l30_pc0 = l7__tmp.f_pc;
					final int l31_i0 = l7__tmp.f_i;
					final Struct l32_c0 = l7__tmp.f_capture;
					{
						final int l33___tmp = l30_pc0;
						final int l34___tmp = l31_i0;
						final Struct l35___tmp = l5_t;
						final Struct l36___tmp = l32_c0;
						apc = l33___tmp;
						ai = l34___tmp;
						astack = l35___tmp;
						acapture = l36___tmp;
						continue TAIL_CALL;
					}
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l6__tmp.getTypeName());
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
			}
		} else {
			final Struct l37_gsymswitch0 = ((Struct)(apca.f_program[apc]));
			Struct l38__tmp = l37_gsymswitch0;
			switch (l38__tmp.getTypeId()) {
			case 82/*PegString*/: {
				final Struct_PegString l39__tmp = (Struct_PegString)l38__tmp;
				final String l40_x = l39__tmp.f_x;
				final String l41_x = l39__tmp.f_x;
				if (((boolean)runtime.n_strContainsAt.invoke(apca.f_input, ((Integer)ai), l41_x))) {
					{
						final int l42___tmp = (apc+1);
						final int l43___tmp = (ai+runtime.h_Native.strlen(l41_x));
						apc = l42___tmp;
						ai = l43___tmp;
						continue TAIL_CALL;
					}
				} else {
					{
						final int l44___tmp = (-1);
						apc = l44___tmp;
						continue TAIL_CALL;
					}
				}
			}
			case 73/*PegRange*/: {
				final Struct_PegRange l39__tmp = (Struct_PegRange)l38__tmp;
				final String l45_low = l39__tmp.f_l;
				final String l46_up = l39__tmp.f_u;
				final String l47_low = l39__tmp.f_l;
				final String l48_up = l39__tmp.f_u;
				final String l49_s = runtime.h_Native.substring(apca.f_input, ai, 1);
				if ((((l47_low).compareTo(l49_s)<=0)&&((l49_s).compareTo(l48_up)<=0))) {
					{
						final int l50___tmp = (apc+1);
						final int l51___tmp = (ai+1);
						apc = l50___tmp;
						ai = l51___tmp;
						continue TAIL_CALL;
					}
				} else {
					{
						final int l52___tmp = (-1);
						apc = l52___tmp;
						continue TAIL_CALL;
					}
				}
			}
			case 72/*PegJump*/: {
				final Struct_PegJump l39__tmp = (Struct_PegJump)l38__tmp;
				final int l53_l = l39__tmp.f_l;
				final int l54_l = l39__tmp.f_l;
				{
					final int l55___tmp = (apc+l54_l);
					apc = l55___tmp;
					continue TAIL_CALL;
				}
			}
			case 61/*PegChoice*/: {
				final Struct_PegChoice l39__tmp = (Struct_PegChoice)l38__tmp;
				final int l56_l = l39__tmp.f_l;
				final int l57_l = l39__tmp.f_l;
				{
					final int l58___tmp = (apc+1);
					final Struct l59___tmp = (new Struct_Cons((new Struct_PegStackChoice((apc+l57_l), ai, acapture)), astack));
					apc = l58___tmp;
					astack = l59___tmp;
					continue TAIL_CALL;
				}
			}
			case 83/*PegStringChoice*/: {
				final Struct_PegStringChoice l39__tmp = (Struct_PegStringChoice)l38__tmp;
				final String l60_x = l39__tmp.f_x;
				final int l61_l = l39__tmp.f_commit;
				final String l62_x = l39__tmp.f_x;
				final int l63_l = l39__tmp.f_commit;
				if (((boolean)runtime.n_strContainsAt.invoke(apca.f_input, ((Integer)ai), l62_x))) {
					{
						final int l64___tmp = (apc+l63_l);
						final int l65___tmp = (ai+runtime.h_Native.strlen(l62_x));
						apc = l64___tmp;
						ai = l65___tmp;
						continue TAIL_CALL;
					}
				} else {
					{
						final int l66___tmp = (apc+1);
						apc = l66___tmp;
						continue TAIL_CALL;
					}
				}
			}
			case 74/*PegRangeChoice*/: {
				final Struct_PegRangeChoice l39__tmp = (Struct_PegRangeChoice)l38__tmp;
				final String l67_low = l39__tmp.f_l;
				final String l68_up = l39__tmp.f_u;
				final int l69_l = l39__tmp.f_commit;
				final String l70_low = l39__tmp.f_l;
				final String l71_up = l39__tmp.f_u;
				final int l72_l = l39__tmp.f_commit;
				final String l73_s = runtime.h_Native.substring(apca.f_input, ai, 1);
				if ((((l70_low).compareTo(l73_s)<=0)&&((l73_s).compareTo(l71_up)<=0))) {
					{
						final int l74___tmp = (apc+l72_l);
						final int l75___tmp = (ai+1);
						apc = l74___tmp;
						ai = l75___tmp;
						continue TAIL_CALL;
					}
				} else {
					{
						final int l76___tmp = (apc+1);
						apc = l76___tmp;
						continue TAIL_CALL;
					}
				}
			}
			case 57/*PegCall*/: {
				final Struct_PegCall l39__tmp = (Struct_PegCall)l38__tmp;
				final int l77_l = l39__tmp.f_l;
				final int l78_l = l39__tmp.f_l;
				{
					final int l79___tmp = l78_l;
					final Struct l80___tmp = (new Struct_Cons((new Struct_PegStackPc((apc+1), acapture)), astack));
					final Struct l81___tmp = runtime.m_list.f_makeList();
					final Struct l82___tmp = (new Struct_Cons(runtime.m_tree.f_makeTree(), aenv));
					apc = l79___tmp;
					astack = l80___tmp;
					acapture = l81___tmp;
					aenv = l82___tmp;
					continue TAIL_CALL;
				}
			}
			case 56/*PegCacheCall*/: {
				final Struct_PegCacheCall l39__tmp = (Struct_PegCacheCall)l38__tmp;
				final int l83_l = l39__tmp.f_l;
				final int l84_ce = l39__tmp.f_cacheEntry;
				final int l85_l = l39__tmp.f_l;
				final int l86_ce = l39__tmp.f_cacheEntry;
				final Struct l87_c = runtime.m_inttree.f_lookupIntTree(((Reference<Struct>)(apca.f_cache.f_caches[l86_ce])), ai);
				Struct l88__tmp = l87_c;
				switch (l88__tmp.getTypeId()) {
				case 42/*None*/: {
					{
						final int l90___tmp = l85_l;
						final Struct l91___tmp = (new Struct_Cons((new Struct_PegStackPcCache((apc+1), l86_ce, ai, acapture)), astack));
						final Struct l92___tmp = runtime.m_list.f_makeList();
						final Struct l93___tmp = (new Struct_Cons(runtime.m_tree.f_makeTree(), aenv));
						apc = l90___tmp;
						astack = l91___tmp;
						acapture = l92___tmp;
						aenv = l93___tmp;
						continue TAIL_CALL;
					}
				}
				case 103/*Some*/: {
					final Struct_Some l89__tmp = (Struct_Some)l88__tmp;
					final Object l94_r = l89__tmp.f_value;
					final Struct_PegVmCacheItem l95_r = ((Struct_PegVmCacheItem)l89__tmp.f_value);
					if ((l95_r.f_pos==(-1))) {
						{
							final int l96___tmp = (-1);
							apc = l96___tmp;
							continue TAIL_CALL;
						}
					} else {
						{
							final int l97___tmp = (apc+1);
							final int l98___tmp = l95_r.f_pos;
							final Struct l99___tmp = (new Struct_Cons(l95_r.f_capture, acapture));
							apc = l97___tmp;
							ai = l98___tmp;
							acapture = l99___tmp;
							continue TAIL_CALL;
						}
					}
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l88__tmp.getTypeName());
				}
			}
			case 75/*PegReturn*/: {
				Struct l100__tmp = astack;
				switch (l100__tmp.getTypeId()) {
				case 20/*EmptyList*/: {
					return (new Struct_ParseResult((-1), ((Struct)SingletonStructs.str_None)));
				}
				case 12/*Cons*/: {
					final Struct_Cons l101__tmp = (Struct_Cons)l100__tmp;
					final Object l102_h = l101__tmp.f_head;
					final Struct l103_t = l101__tmp.f_tail;
					final Struct l104_h = ((Struct)l101__tmp.f_head);
					final Struct l105_t = l101__tmp.f_tail;
					Struct l106__tmp = l104_h;
					switch (l106__tmp.getTypeId()) {
					case 78/*PegStackPc*/: {
						final Struct_PegStackPc l107__tmp = (Struct_PegStackPc)l106__tmp;
						final int l108_pc0 = l107__tmp.f_pc;
						final Struct l109_tl = l107__tmp.f_capture;
						final int l110_pc0 = l107__tmp.f_pc;
						final Struct l111_tl = l107__tmp.f_capture;
						{
							final int l112___tmp = l110_pc0;
							final Struct l113___tmp = l105_t;
							final Struct l114___tmp = (new Struct_Cons(((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(acapture, apca.f_capture), l111_tl));
							final Struct l115___tmp = runtime.n_tailList.invoke(aenv);
							apc = l112___tmp;
							astack = l113___tmp;
							acapture = l114___tmp;
							aenv = l115___tmp;
							continue TAIL_CALL;
						}
					}
					case 79/*PegStackPcCache*/: {
						final Struct_PegStackPcCache l107__tmp = (Struct_PegStackPcCache)l106__tmp;
						final int l116_pc0 = l107__tmp.f_pc;
						final int l117_ce = l107__tmp.f_ce;
						final int l118_si = l107__tmp.f_start;
						final Struct l119_tl = l107__tmp.f_capture;
						final int l120_pc0 = l107__tmp.f_pc;
						final int l121_ce = l107__tmp.f_ce;
						final int l122_si = l107__tmp.f_start;
						final Struct l123_tl = l107__tmp.f_capture;
						final Struct l124_res = ((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(acapture, apca.f_capture);
						Struct l125__tmp = l124_res;
						switch (l125__tmp.getTypeId()) {
						case 98/*RuleResult*/: {
							final Struct_RuleResult l126__tmp = (Struct_RuleResult)l125__tmp;
							final Struct l127_r = l126__tmp.f_result;
							final Object l128___ = l126__tmp.f_input;
							final int l129___ = l126__tmp.f_pos;
							final int l130___ = l126__tmp.f_len;
							final Struct l131_r = l126__tmp.f_result;
							final Reference<Struct> l132_it = ((Reference<Struct>)(apca.f_cache.f_caches[l121_ce]));
							l132_it.value = runtime.m_inttree.f_addOrUpdateIntTree(l132_it, l122_si, (new Struct_PegVmCacheItem(ai, l126__tmp)));
							break;
						}
						default: {
							break;
						}
						}
						{
							final int l133___tmp = l120_pc0;
							final Struct l134___tmp = l105_t;
							final Struct l135___tmp = (new Struct_Cons(l124_res, l123_tl));
							final Struct l136___tmp = runtime.n_tailList.invoke(aenv);
							apc = l133___tmp;
							astack = l134___tmp;
							acapture = l135___tmp;
							aenv = l136___tmp;
							continue TAIL_CALL;
						}
					}
					case 77/*PegStackChoice*/: {
						final Struct_PegStackChoice l107__tmp = (Struct_PegStackChoice)l106__tmp;
						final int l137_pc0 = l107__tmp.f_pc;
						final int l138_i0 = l107__tmp.f_i;
						final Struct l139_c = l107__tmp.f_capture;
						final int l140_pc0 = l107__tmp.f_pc;
						final int l141_i0 = l107__tmp.f_i;
						final Struct l142_c = l107__tmp.f_capture;
						{
							final Struct l143___tmp = l105_t;
							astack = l143___tmp;
							continue TAIL_CALL;
						}
					}
					default:
						throw new RuntimeException("Unexpected struct in switch: "+l106__tmp.getTypeName());
					}
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l100__tmp.getTypeName());
				}
			}
			case 66/*PegDrop*/: {
				{
					final int l144___tmp = (apc+1);
					final Struct l145___tmp = runtime.n_tailList.invoke(acapture);
					apc = l144___tmp;
					acapture = l145___tmp;
					continue TAIL_CALL;
				}
			}
			case 64/*PegCommit*/: {
				final Struct_PegCommit l39__tmp = (Struct_PegCommit)l38__tmp;
				final int l146_l = l39__tmp.f_l;
				final int l147_l = l39__tmp.f_l;
				{
					final int l148___tmp = (apc+l147_l);
					final Struct l149___tmp = runtime.n_tailList.invoke(astack);
					apc = l148___tmp;
					astack = l149___tmp;
					continue TAIL_CALL;
				}
			}
			case 81/*PegStartString*/: {
				{
					final int l150___tmp = (apc+1);
					final Struct l151___tmp = (new Struct_Cons((new Struct_PegCaptureStringStart(ai)), acapture));
					apc = l150___tmp;
					acapture = l151___tmp;
					continue TAIL_CALL;
				}
			}
			case 53/*PegBindString*/: {
				final Struct_PegBindString l39__tmp = (Struct_PegBindString)l38__tmp;
				final String l152_v = l39__tmp.f_n;
				final String l153_v = l39__tmp.f_n;
				Struct l154__tmp = acapture;
				switch (l154__tmp.getTypeId()) {
				case 20/*EmptyList*/: {
					{
						final int l156___tmp = (apc+1);
						apc = l156___tmp;
						continue TAIL_CALL;
					}
				}
				case 12/*Cons*/: {
					final Struct_Cons l155__tmp = (Struct_Cons)l154__tmp;
					final Object l157_h = l155__tmp.f_head;
					final Struct l158_t = l155__tmp.f_tail;
					final Struct l159_h = ((Struct)l155__tmp.f_head);
					final Struct l160_t = l155__tmp.f_tail;
					Struct l161__tmp = l159_h;
					switch (l161__tmp.getTypeId()) {
					case 60/*PegCaptureStringStart*/: {
						final Struct_PegCaptureStringStart l162__tmp = (Struct_PegCaptureStringStart)l161__tmp;
						final int l163_start = l162__tmp.f_start;
						final int l164_start = l162__tmp.f_start;
						final int l165_s = l162__tmp.f_start;
						final Struct_RuleResult l166_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), l165_s, (ai-l165_s), (new Struct_Some(runtime.m_dynamic.f_flow(runtime.h_Native.substring(apca.f_input, l165_s, (ai-l165_s)))))));
						final Struct l167_tenv = ((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(aenv, runtime.m_tree.f_makeTree());
						final Struct_Cons l168_nenv = (new Struct_Cons(((Func3<Struct,Struct, String, Struct_RuleResult>)(Func3)runtime.n_setTree).invoke(l167_tenv, l153_v, l166_rr), runtime.n_tailList.invoke(aenv)));
						{
							final int l169___tmp = (apc+1);
							final Struct l170___tmp = l160_t;
							final Struct l171___tmp = l168_nenv;
							apc = l169___tmp;
							acapture = l170___tmp;
							aenv = l171___tmp;
							continue TAIL_CALL;
						}
					}
					default: {
						{
							final Struct l172___tmp = l160_t;
							acapture = l172___tmp;
							continue TAIL_CALL;
						}
					}
					}
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l154__tmp.getTypeName());
				}
			}
			case 80/*PegStartCaptureList*/: {
				{
					final int l173___tmp = (apc+1);
					final Struct l174___tmp = (new Struct_Cons(SingletonStructs.str_PegCaptureStartList, acapture));
					apc = l173___tmp;
					acapture = l174___tmp;
					continue TAIL_CALL;
				}
			}
			case 54/*PegBindValue*/: {
				final Struct_PegBindValue l39__tmp = (Struct_PegBindValue)l38__tmp;
				final String l175_v = l39__tmp.f_n;
				final String l176_v = l39__tmp.f_n;
				Struct l177_result;
				Struct l178__tmp = acapture;
				switch (l178__tmp.getTypeId()) {
				case 20/*EmptyList*/: {
					l177_result=((Struct)SingletonStructs.str_None);
					break;
				}
				case 12/*Cons*/: {
					final Struct_Cons l179__tmp = (Struct_Cons)l178__tmp;
					final Object l180_h = l179__tmp.f_head;
					final Struct l181_t = l179__tmp.f_tail;
					final Struct l182_h = ((Struct)l179__tmp.f_head);
					final Struct l183_t = l179__tmp.f_tail;
					Struct l184__tmp = l182_h;
					switch (l184__tmp.getTypeId()) {
					case 98/*RuleResult*/: {
						final Struct_RuleResult l185__tmp = (Struct_RuleResult)l184__tmp;
						final Struct l186_result = l185__tmp.f_result;
						final Object l187___ = l185__tmp.f_input;
						final int l188___ = l185__tmp.f_pos;
						final int l189___ = l185__tmp.f_len;
						final Struct l190_result = l185__tmp.f_result;
						l177_result=l190_result;
						break;
					}
					default: {
						l177_result=((Struct)SingletonStructs.str_None);
						break;
					}
					}
					break;
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l178__tmp.getTypeName());
				}
				final Struct_RuleResult l191_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), ai, runtime.h_Native.strlen(apca.f_input), l177_result));
				final Struct l192_tenv = ((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(aenv, runtime.m_tree.f_makeTree());
				final Struct_Cons l193_nenv = (new Struct_Cons(((Func3<Struct,Struct, String, Struct_RuleResult>)(Func3)runtime.n_setTree).invoke(l192_tenv, l176_v, l191_rr), runtime.n_tailList.invoke(aenv)));
				{
					final int l194___tmp = (apc+1);
					final Struct l195___tmp = l193_nenv;
					apc = l194___tmp;
					aenv = l195___tmp;
					continue TAIL_CALL;
				}
			}
			case 52/*PegBindIndex*/: {
				final Struct_PegBindIndex l39__tmp = (Struct_PegBindIndex)l38__tmp;
				final String l196_v = l39__tmp.f_n;
				final String l197_v = l39__tmp.f_n;
				final Struct_RuleResult l198_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(runtime.m_dynamic.f_flow(ai)))));
				final Struct l199_tenv = ((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(aenv, runtime.m_tree.f_makeTree());
				final Struct_Cons l200_nenv = (new Struct_Cons(((Func3<Struct,Struct, String, Struct_RuleResult>)(Func3)runtime.n_setTree).invoke(l199_tenv, l197_v, l198_rr), runtime.n_tailList.invoke(aenv)));
				{
					final int l201___tmp = (apc+1);
					final Struct l202___tmp = l200_nenv;
					apc = l201___tmp;
					aenv = l202___tmp;
					continue TAIL_CALL;
				}
			}
			case 48/*PegAction*/: {
				final Struct_PegAction l39__tmp = (Struct_PegAction)l38__tmp;
				final Func1<Object,Struct_PegEnv> l203_fn = l39__tmp.f_fn;
				final Func1<Object,Struct_PegEnv> l204_fn = l39__tmp.f_fn;
				final Object l205_v = l204_fn.invoke((new Struct_PegEnv(((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(aenv, runtime.m_tree.f_makeTree()), apca.f_fns)));
				final Struct_RuleResult l206_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(l205_v))));
				{
					final int l207___tmp = (apc+1);
					final Struct l208___tmp = (new Struct_Cons(l206_rr, acapture));
					apc = l207___tmp;
					acapture = l208___tmp;
					continue TAIL_CALL;
				}
			}
			case 49/*PegAction2*/: {
				final Struct_PegAction2 l39__tmp = (Struct_PegAction2)l38__tmp;
				final Struct l209_e = l39__tmp.f_e;
				final Struct l210_e = l39__tmp.f_e;
				final Object l211_v = runtime.m_pegcode_lib.f_evalActionExp(l210_e, ai, ((Func2<Struct,Struct, Struct>)(Func2)runtime.n_headList).invoke(aenv, runtime.m_tree.f_makeTree()), apca.f_fns);
				final Struct_RuleResult l212_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(l211_v))));
				{
					final int l213___tmp = (apc+1);
					final Struct l214___tmp = (new Struct_Cons(l212_rr, acapture));
					apc = l213___tmp;
					acapture = l214___tmp;
					continue TAIL_CALL;
				}
			}
			case 50/*PegActionIndex*/: {
				final Struct_RuleResult l215_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), ai, 0, (new Struct_Some(runtime.m_dynamic.f_flow(ai)))));
				{
					final int l216___tmp = (apc+1);
					final Struct l217___tmp = (new Struct_Cons(l215_rr, acapture));
					apc = l216___tmp;
					acapture = l217___tmp;
					continue TAIL_CALL;
				}
			}
			case 70/*PegFail*/: {
				{
					final int l218___tmp = (-1);
					apc = l218___tmp;
					continue TAIL_CALL;
				}
			}
			case 67/*PegEnd*/: {
				return (new Struct_ParseResult(ai, runtime.m_pegcode_lib.f_pegResultFromCapture(acapture)));
			}
			case 58/*PegCaptureList*/: {
				final Struct_Pair l219_listAndRest = runtime.m_pegcode_lib.f_grabUntilMarker(runtime.m_list.f_makeList(), acapture);
				final Struct l223_$221 = ((Struct)l219_listAndRest.f_first);
				final Struct l224_$222 = runtime.m_list.f_makeList();
				final Func2<Struct,Struct, Struct> l225_$220 = new Func2<Struct,Struct,Struct>() {
					final public Struct invoke(final Struct aacc, final Struct ap) {
						Struct l0__tmp = ap;
						switch (l0__tmp.getTypeId()) {
						case 98/*RuleResult*/: {
							final Struct_RuleResult l1__tmp = (Struct_RuleResult)l0__tmp;
							final Struct l2_result = l1__tmp.f_result;
							final Object l3___ = l1__tmp.f_input;
							final int l4___ = l1__tmp.f_pos;
							final int l5___ = l1__tmp.f_len;
							final Struct l6_result = l1__tmp.f_result;
							Struct l7__tmp = l6_result;
							switch (l7__tmp.getTypeId()) {
							case 42/*None*/: {
								return aacc;
							}
							case 103/*Some*/: {
								final Struct_Some l8__tmp = (Struct_Some)l7__tmp;
								final Object l9_va = l8__tmp.f_value;
								final Object l10_va = l8__tmp.f_value;
								return (new Struct_Cons(l10_va, aacc));
							}
							default:
								throw new RuntimeException("Unexpected struct in switch: "+l7__tmp.getTypeName());
							}
						}
						default: {
							return aacc;
						}
						}
					}
				};
				final Struct l226_results0 = ((Struct)runtime.m_list.f_foldList(l223_$221, l224_$222, ((Func2<Object,Object, Object>)(Func2)l225_$220)));
				final Object[] l227_results = runtime.h_Native.list2array(l226_results0);
				final Struct_RuleResult l228_rr = (new Struct_RuleResult(runtime.m_dynamic.f_flow(apca.f_input), ai, runtime.h_Native.strlen(apca.f_input), (new Struct_Some(l227_results))));
				{
					final int l229___tmp = (apc+1);
					final Struct l230___tmp = (new Struct_Cons(l228_rr, ((Struct)l219_listAndRest.f_second)));
					apc = l229___tmp;
					acapture = l230___tmp;
					continue TAIL_CALL;
				}
			}
			case 62/*PegClearCache*/: {
				final Object[] l233_$232 = apca.f_cache.f_caches;
				final Func1<Object,Reference<Struct>> l234_$231 = new Func1<Object,Reference<Struct>>() {
					final public Object invoke(final Reference<Struct> ac) {
						ac.value = runtime.m_inttree.f_makeIntTree().value;
						return null;
					}
				};
				runtime.h_Native.iter(l233_$232, ((Func1<Object,Object>)(Func1)l234_$231));
				{
					final int l235___tmp = (apc+1);
					apc = l235___tmp;
					continue TAIL_CALL;
				}
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l38__tmp.getTypeName());
			}
		}
	 }
	}
}
