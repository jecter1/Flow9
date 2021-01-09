// HASH COLLISIONS: YES
// timestamp: 1.603100796E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_string {
	final lab9 runtime;
	Module_string(lab9 runtime) {
		this.runtime = runtime;
	}
	String nf_cloneString(String as) {
		return as;
	}
	String nf_getCharAt(String as, int an) {
		return runtime.h_Native.substring(as, an, 1);
	}
	boolean nf_strContainsAt(String astr, int aindex, String asubstr) {
		return (((int)runtime.n_strRangeIndexOf.invoke(astr, asubstr, ((Integer)aindex), ((Integer)(aindex+runtime.h_Native.strlen(asubstr)))))==aindex);
	}
	int nf_strRangeIndexOf(String astr, String asubstr, int astart, int aend) {
		final int l0_rv = runtime.h_Native.strIndexOf(runtime.h_Native.substring(astr, astart, (aend-astart)), asubstr);
		if ((l0_rv<0)) {
			return l0_rv;
		} else {
			return (astart+l0_rv);
		}
	}
	String nf_strReplace(String as, String aold, String anew) {
		if ((aold).equals("")) {
			return as;
		} else {
			if ((runtime.h_Native.strlen(as)>500)) {
				return runtime.h_Native.list2string(f_doStrReplace(as, 0, aold, anew, runtime.m_list.f_makeList()));
			} else {
				return f_doStrReplace2("", as, aold, anew);
			}
		}
	}
	String f_cloneString(String as) {
		return as;
	}
	String f_concatStrings(Object[] astrings) {
		if ((runtime.h_Native.length(astrings)<35)) {
			final Func2<String,String, String> l1_$0 = new Func2<String,String,String>() {
				final public String invoke(final String aacc, final String aval) {
					return (aacc+aval);
				}
			};
			return ((String)runtime.h_Native.fold(astrings, "", ((Func2<Object,Object, Object>)(Func2)l1_$0)));
		} else {
			return runtime.h_Native.list2string(runtime.m_array.f_array2list(astrings));
		}
	}
	String f_d2s(double ad) {
		return FlowRuntime.doubleToString(ad);
	}
	Struct f_doStrReplace(String as, int ai, String aold, String anew, Struct aacc) {
	 TAIL_CALL: for(;;) {
		final int l0_n = runtime.h_Native.strlen(as);
		if ((ai<l0_n)) {
			final int l1_hit = ((int)runtime.n_strRangeIndexOf.invoke(as, aold, ((Integer)ai), ((Integer)l0_n)));
			if ((l1_hit>=0)) {
				final String l2_before = runtime.h_Native.substring(as, ai, (l1_hit-ai));
				final Struct_Cons l3_nacc = (new Struct_Cons(anew, (new Struct_Cons(l2_before, aacc))));
				{
					final int l4___tmp = (l1_hit+runtime.h_Native.strlen(aold));
					final Struct l5___tmp = l3_nacc;
					ai = l4___tmp;
					aacc = l5___tmp;
					continue TAIL_CALL;
				}
			} else {
				return (new Struct_Cons(f_strRight(as, ai), aacc));
			}
		} else {
			return aacc;
		}
	 }
	}
	String f_doStrReplace2(String aprefix, String asuffix, String aold, String anew) {
	 TAIL_CALL: for(;;) {
		final int l0_i = runtime.h_Native.strIndexOf(asuffix, aold);
		if ((l0_i>=0)) {
			final int l1_l = runtime.h_Native.strlen(asuffix);
			final int l2_oldLen = runtime.h_Native.strlen(aold);
			{
				final String l3___tmp = ((aprefix+runtime.h_Native.substring(asuffix, 0, l0_i))+anew);
				final String l4___tmp = runtime.h_Native.substring(asuffix, (l0_i+l2_oldLen), ((l1_l-l0_i)-l2_oldLen));
				aprefix = l3___tmp;
				asuffix = l4___tmp;
				continue TAIL_CALL;
			}
		} else {
			return (aprefix+asuffix);
		}
	 }
	}
	String f_getCharAt(String as, int an) {
		return runtime.h_Native.substring(as, an, 1);
	}
	String f_i2s(int ai) {
		return Integer.toString((int)(ai));
	}
	String f_lpad(String as, String ac, int al) {
		if ((runtime.h_Native.strlen(as)<al)) {
			return (ac+f_lpad(as, ac, (al-1)));
		} else {
			return as;
		}
	}
	String f_ltrim(String as) {
	 TAIL_CALL: for(;;) {
		final int l0_l = runtime.h_Native.strlen(as);
		if ((l0_l==0)) {
			return as;
		} else {
			final int l1_first = runtime.h_Native.getCharCodeAt(as, 0);
			if ((l1_first==32)) {
				{
					final String l2___tmp = runtime.h_Native.substring(as, 1, (l0_l-1));
					as = l2___tmp;
					continue TAIL_CALL;
				}
			} else {
				return as;
			}
		}
	 }
	}
	String f_ltrim2(String as, String augly) {
		if ((augly).equals("")) {
			return as;
		} else {
			final int l0_l = runtime.h_Native.strlen(as);
			final String l3_ugly = augly;
			final String l4_s = as;
			final Func1<Boolean,Integer> l2_$1 = new Func1<Boolean,Integer>() {
				final public Boolean invoke(final Integer ai) {
					return (runtime.h_Native.strIndexOf(l3_ugly, runtime.n_getCharAt.invoke(l4_s, ai))==(-1));
				}
			};
			final int l5_e = runtime.m_runtime.f_countUntil(0, l0_l, l2_$1);
			if ((l5_e==0)) {
				return as;
			} else {
				return f_strRight(as, l5_e);
			}
		}
	}
	int f_parseHex(String as) {
		final Func2<Integer,Integer, Integer> l1_$0 = new Func2<Integer,Integer,Integer>() {
			final public Integer invoke(final Integer aacc, final Integer acode) {
				final Func1<Integer,Integer> l0_subtract = new Func1<Integer,Integer>() {
					final public Integer invoke(final Integer aoffset) {
						return ((Integer)((((int)aacc)*16)+(((int)acode)-((int)aoffset))));
					}
				};
				if (((48<=((int)acode))&&(((int)acode)<=57))) {
					return l0_subtract.invoke(((Integer)48));
				} else {
					if (((65<=((int)acode))&&(((int)acode)<=70))) {
						return l0_subtract.invoke(((Integer)55));
					} else {
						if (((97<=((int)acode))&&(((int)acode)<=102))) {
							return l0_subtract.invoke(((Integer)87));
						} else {
							return aacc;
						}
					}
				}
			}
		};
		return ((int)f_stringFold(as, 0, ((Func2<Object,Object, Integer>)(Func2)l1_$0)));
	}
	String f_rtrim(String as) {
	 TAIL_CALL: for(;;) {
		final int l0_l = runtime.h_Native.strlen(as);
		if ((l0_l==0)) {
			return as;
		} else {
			final int l1_last = runtime.h_Native.getCharCodeAt(as, (l0_l-1));
			if ((l1_last==32)) {
				{
					final String l2___tmp = runtime.h_Native.substring(as, 0, (l0_l-1));
					as = l2___tmp;
					continue TAIL_CALL;
				}
			} else {
				return as;
			}
		}
	 }
	}
	String f_rtrim2(String as, String augly) {
		final int l0_l = runtime.h_Native.strlen(as);
		final String l3_s = as;
		final String l4_ugly = augly;
		final Func1<Boolean,Integer> l2_$1 = new Func1<Boolean,Integer>() {
			final public Boolean invoke(final Integer ai) {
				final String l0_c = runtime.n_getCharAt.invoke(l3_s, ((Integer)(l0_l-(((int)ai)+1))));
				return (runtime.h_Native.strIndexOf(l4_ugly, l0_c)==(-1));
			}
		};
		final int l5_e = runtime.m_runtime.f_countUntil(0, l0_l, l2_$1);
		if ((l5_e==0)) {
			return as;
		} else {
			return f_strLeft(as, (l0_l-l5_e));
		}
	}
	boolean f_strContainsAt(String astr, int aindex, String asubstr) {
		return (((int)runtime.n_strRangeIndexOf.invoke(astr, asubstr, ((Integer)aindex), ((Integer)(aindex+runtime.h_Native.strlen(asubstr)))))==aindex);
	}
	String f_strGlue(Object[] aarr, String asep) {
		if (((Object[])aarr).length == 0) {
			return "";
		} else {
			if ((runtime.h_Native.length(aarr)==1)) {
				return ((String)(aarr[0]));
			} else {
				final Struct l2_$1 = runtime.m_list.f_makeList();
				final String l4_sep = asep;
				final Func3<Struct_Cons,Integer, Struct, String> l3_$0 = new Func3<Struct_Cons,Integer,Struct,String>() {
					final public Struct_Cons invoke(final Integer aidx, final Struct aacc, final String ae) {
						if ((((int)aidx)==0)) {
							return (new Struct_Cons(ae, aacc));
						} else {
							return (new Struct_Cons(ae, (new Struct_Cons(l4_sep, aacc))));
						}
					}
				};
				return runtime.h_Native.list2string(((Struct)runtime.h_Native.foldi(aarr, l2_$1, ((Func3<Object,Integer, Object, Object>)(Func3)l3_$0))));
			}
		}
	}
	String f_strLeft(String as, int aindex) {
		return runtime.h_Native.substring(as, 0, aindex);
	}
	int f_strRangeIndexOf(String astr, String asubstr, int astart, int aend) {
		final int l0_rv = runtime.h_Native.strIndexOf(runtime.h_Native.substring(astr, astart, (aend-astart)), asubstr);
		if ((l0_rv<0)) {
			return l0_rv;
		} else {
			return (astart+l0_rv);
		}
	}
	String f_strReplace(String as, String aold, String anew) {
		if ((aold).equals("")) {
			return as;
		} else {
			if ((runtime.h_Native.strlen(as)>500)) {
				return runtime.h_Native.list2string(f_doStrReplace(as, 0, aold, anew, runtime.m_list.f_makeList()));
			} else {
				return f_doStrReplace2("", as, aold, anew);
			}
		}
	}
	String f_strRight(String as, int aindex) {
		final int l0_l = runtime.h_Native.strlen(as);
		if ((aindex>=l0_l)) {
			return "";
		} else {
			return runtime.h_Native.substring(as, aindex, (l0_l-aindex));
		}
	}
	Object f_stringFold(String as, Object aa, Func2<Object,Object, Integer> af) {
		final Object[] l2_$1 = runtime.h_Native.enumFromTo(0, (runtime.h_Native.strlen(as)-1));
		final Func2<Object,Object, Integer> l4_f = af;
		final String l5_s = as;
		final Func2<Object,Object, Integer> l3_$0 = new Func2<Object,Object,Integer>() {
			final public Object invoke(final Object aa2, final Integer ai) {
				return l4_f.invoke(aa2, ((Integer)runtime.h_Native.getCharCodeAt(l5_s, ((int)ai))));
			}
		};
		return runtime.h_Native.fold(l2_$1, aa, ((Func2<Object,Object, Object>)(Func2)l3_$0));
	}
	String f_trim(String as) {
		return f_rtrim(f_ltrim(as));
	}
}
