// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_array {
	final lab9 runtime;
	Module_array(lab9 runtime) {
		this.runtime = runtime;
	}
	int nf_elemIndex(Object[] aa, Object aelem, int aillegal) {
		final Object l2_elem = aelem;
		final Func2<Boolean,Integer, Object> l1_$0 = new Func2<Boolean,Integer,Object>() {
			final public Boolean invoke(final Integer ai, final Object aai) {
				return FlowRuntime.compareEqual(aai,l2_elem);
			}
		};
		final int l3_foundIndex = runtime.h_Native.iteriUntil(aa, l1_$0);
		if ((l3_foundIndex==runtime.h_Native.length(aa))) {
			return aillegal;
		} else {
			return l3_foundIndex;
		}
	}
	boolean nf_exists(Object[] aa, Func1<Boolean,Object> afn) {
		final Func1<Boolean,Object> l2_fn = afn;
		final Func2<Boolean,Integer, Object> l1_$0 = new Func2<Boolean,Integer,Object>() {
			final public Boolean invoke(final Integer ai, final Object ae) {
				return l2_fn.invoke(ae);
			}
		};
		final int l3_foundIndex = runtime.h_Native.iteriUntil(aa, l1_$0);
		return (l3_foundIndex!=runtime.h_Native.length(aa));
	}
	Struct nf_find(Object[] aa, Func1<Boolean,Object> afn) {
		final Func1<Boolean,Object> l2_fn = afn;
		final Func2<Boolean,Integer, Object> l1_$0 = new Func2<Boolean,Integer,Object>() {
			final public Boolean invoke(final Integer ai, final Object ae) {
				return l2_fn.invoke(ae);
			}
		};
		final int l3_foundIndex = runtime.h_Native.iteriUntil(aa, l1_$0);
		if ((l3_foundIndex==runtime.h_Native.length(aa))) {
			return ((Struct)SingletonStructs.str_None);
		} else {
			return (new Struct_Some(((Object)(aa[l3_foundIndex]))));
		}
	}
	Struct f_array2list(Object[] aa) {
		final SingletonStruct l2_$1 = SingletonStructs.str_EmptyList;
		final Func2<Struct_Cons,Struct, Object> l3_$0 = new Func2<Struct_Cons,Struct,Object>() {
			final public Struct_Cons invoke(final Struct aac, final Object ae) {
				return (new Struct_Cons(ae, aac));
			}
		};
		return ((Struct)runtime.h_Native.fold(aa, l2_$1, ((Func2<Object,Object, Object>)(Func2)l3_$0)));
	}
	Object[] f_arrayPush(Object[] aarray, Object avalue) {
		return runtime.h_Native.replace(aarray, runtime.h_Native.length(aarray), avalue);
	}
	Object[] f_concat3(Object[] aa1, Object[] aa2, Object[] aa3) {
		if ((runtime.h_Native.length(aa1)<runtime.h_Native.length(aa3))) {
			return runtime.h_Native.concat(runtime.h_Native.concat(aa1, aa2), aa3);
		} else {
			return runtime.h_Native.concat(aa1, runtime.h_Native.concat(aa2, aa3));
		}
	}
	Object[] f_concatA(Object[] aa) {
		return f_doConcatA(aa, 0, runtime.h_Native.length(aa));
	}
	boolean f_contains(Object[] aa, Object av) {
		return (((int)runtime.n_elemIndex.invoke(aa, av, ((Integer)(-1))))!=(-1));
	}
	Object[] f_doConcatA(Object[] aa, int ai, int al) {
		if ((al<=3)) {
			if ((al==1)) {
				return ((Object[])(aa[ai]));
			} else {
				if ((al==2)) {
					return runtime.h_Native.concat(((Object[])(aa[ai])), ((Object[])(aa[(ai+1)])));
				} else {
					if ((al==3)) {
						return f_concat3(((Object[])(aa[ai])), ((Object[])(aa[(ai+1)])), ((Object[])(aa[(ai+2)])));
					} else {
						return SingletonStructs.arr_empty;
					}
				}
			}
		} else {
			final int l0_m = (al/2);
			return runtime.h_Native.concat(f_doConcatA(aa, ai, l0_m), f_doConcatA(aa, (ai+l0_m), (al-l0_m)));
		}
	}
	int f_elemIndex(Object[] aa, Object aelem, int aillegal) {
		final Object l2_elem = aelem;
		final Func2<Boolean,Integer, Object> l1_$0 = new Func2<Boolean,Integer,Object>() {
			final public Boolean invoke(final Integer ai, final Object aai) {
				return FlowRuntime.compareEqual(aai,l2_elem);
			}
		};
		final int l3_foundIndex = runtime.h_Native.iteriUntil(aa, l1_$0);
		if ((l3_foundIndex==runtime.h_Native.length(aa))) {
			return aillegal;
		} else {
			return l3_foundIndex;
		}
	}
	boolean f_exists(Object[] aa, Func1<Boolean,Object> afn) {
		final Func1<Boolean,Object> l2_fn = afn;
		final Func2<Boolean,Integer, Object> l1_$0 = new Func2<Boolean,Integer,Object>() {
			final public Boolean invoke(final Integer ai, final Object ae) {
				return l2_fn.invoke(ae);
			}
		};
		final int l3_foundIndex = runtime.h_Native.iteriUntil(aa, l1_$0);
		return (l3_foundIndex!=runtime.h_Native.length(aa));
	}
	Struct f_find(Object[] aa, Func1<Boolean,Object> afn) {
		final Func1<Boolean,Object> l2_fn = afn;
		final Func2<Boolean,Integer, Object> l1_$0 = new Func2<Boolean,Integer,Object>() {
			final public Boolean invoke(final Integer ai, final Object ae) {
				return l2_fn.invoke(ae);
			}
		};
		final int l3_foundIndex = runtime.h_Native.iteriUntil(aa, l1_$0);
		if ((l3_foundIndex==runtime.h_Native.length(aa))) {
			return ((Struct)SingletonStructs.str_None);
		} else {
			return (new Struct_Some(((Object)(aa[l3_foundIndex]))));
		}
	}
	Object f_findDef(Object[] aa, Func1<Boolean,Object> afn, Object adef) {
		return runtime.m_maybe.f_either(runtime.n_find.invoke(aa, afn), adef);
	}
	Struct f_findi(Object[] aa, Func1<Boolean,Object> afn) {
		return f_findiex(aa, afn, 0);
	}
	Struct f_findiex(Object[] aa, Func1<Boolean,Object> afn, int ai) {
	 TAIL_CALL: for(;;) {
		if ((ai>=runtime.h_Native.length(aa))) {
			return ((Struct)SingletonStructs.str_None);
		} else {
			if (((boolean)afn.invoke(((Object)(aa[ai]))))) {
				return (new Struct_Some(ai));
			} else {
				{
					final int l0___tmp = (ai+1);
					ai = l0___tmp;
					continue TAIL_CALL;
				}
			}
		}
	 }
	}
	Object[] f_reverseA(Object[] aa) {
		final int l0_l = runtime.h_Native.length(aa);
		if ((l0_l>1)) {
			final Object[] l3_$2 = runtime.h_Native.enumFromTo(1, l0_l);
			final Object[] l5_a = aa;
			final Func1<Object,Integer> l4_$1 = new Func1<Object,Integer>() {
				final public Object invoke(final Integer ai) {
					return ((Object)(l5_a[(l0_l-((int)ai))]));
				}
			};
			return runtime.h_Native.map(l3_$2, ((Func1<Object,Object>)(Func1)l4_$1));
		} else {
			return aa;
		}
	}
}
