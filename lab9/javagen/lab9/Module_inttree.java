// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_inttree {
	final lab9 runtime;
	Module_inttree(lab9 runtime) {
		this.runtime = runtime;
	}
	Struct f_addOrUpdateIntTree(Reference<Struct> atree, int akey, Object avalue) {
	 TAIL_CALL: for(;;) {
		final Struct l0_t = atree.value;
		Struct l1__tmp = l0_t;
		switch (l1__tmp.getTypeId()) {
		case 25/*IntTreeNode*/: {
			final Struct_IntTreeNode l2__tmp = (Struct_IntTreeNode)l1__tmp;
			final Object[] l3_children = l2__tmp.f_children;
			final Object[] l4_children = l2__tmp.f_children;
			final int l5_nibble = runtime.h_Native.bitAnd(akey, 15);
			int l6_rest;
			if ((akey>=0)) {
				l6_rest=(akey/16);
			} else {
				l6_rest=((int)runtime.n_bitUshr.invoke(((Integer)akey), ((Integer)4)));
			}
			((Reference<Struct>)(l4_children[l5_nibble])).value = f_addOrUpdateIntTree(((Reference<Struct>)(l4_children[l5_nibble])), l6_rest, avalue);
			return l2__tmp;
		}
		case 27/*IntTreeValue*/: {
			final Struct_IntTreeValue l2__tmp = (Struct_IntTreeValue)l1__tmp;
			final int l7_k = l2__tmp.f_key;
			final Object l8_v = l2__tmp.f_value;
			final int l9_k = l2__tmp.f_key;
			final Object l10_v = l2__tmp.f_value;
			if ((l9_k==akey)) {
				return (new Struct_IntTreeValue(akey, avalue));
			} else {
				final int l11_existingNibble = runtime.h_Native.bitAnd(l9_k, 15);
				int l12_existingRest;
				if ((l9_k>=0)) {
					l12_existingRest=(l9_k/16);
				} else {
					l12_existingRest=((int)runtime.n_bitUshr.invoke(((Integer)l9_k), ((Integer)4)));
				}
				final Func0<Reference<Struct>> l13_nt = ((Func0<Reference<Struct>>)(Func0)new Func0<Reference<SingletonStruct>>() {
					final public Reference<SingletonStruct> invoke() {
						return ((Reference<SingletonStruct>)(new Reference(SingletonStructs.str_IntTreeNone)));
					}
				});
				Object[] l14_e;
				l14_e=(new Object[] { l13_nt.invoke(), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)), (new Reference(SingletonStructs.str_IntTreeNone)) });
				((Reference<Struct_IntTreeValue>)(l14_e[l11_existingNibble])).value = (new Struct_IntTreeValue(l12_existingRest, l10_v));
				final Reference<Struct_IntTreeNode> l15_refactored = ((Reference<Struct_IntTreeNode>)(new Reference((new Struct_IntTreeNode(l14_e)))));
				{
					final Reference<Struct> l16___tmp = ((Reference<Struct>)(Reference)l15_refactored);
					atree = l16___tmp;
					continue TAIL_CALL;
				}
			}
		}
		case 26/*IntTreeNone*/: {
			return (new Struct_IntTreeValue(akey, avalue));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
		}
	 }
	}
	Object f_doIterIntTree(Reference<Struct> atree, int alobits, int alevel, Func2<Object,Integer, Object> afn) {
		final Struct l0_t = atree.value;
		Struct l1__tmp = l0_t;
		switch (l1__tmp.getTypeId()) {
		case 25/*IntTreeNode*/: {
			final Struct_IntTreeNode l2__tmp = (Struct_IntTreeNode)l1__tmp;
			final Object[] l3_children = l2__tmp.f_children;
			final Object[] l4_children = l2__tmp.f_children;
			final int l7_lobits = alobits;
			final int l8_level = alevel;
			final Func2<Object,Integer, Object> l9_fn = afn;
			final Func2<Object,Integer, Reference<Struct>> l6_$5 = new Func2<Object,Integer,Reference<Struct>>() {
				final public Object invoke(final Integer ai, final Reference<Struct> ac) {
					return f_doIterIntTree(ac, (l7_lobits+(((int)ai)*l8_level)), ((int)runtime.n_bitShl.invoke(((Integer)l8_level), ((Integer)4))), l9_fn);
				}
			};
			return runtime.h_Native.iteri(l4_children, ((Func2<Object,Integer, Object>)(Func2)l6_$5));
		}
		case 27/*IntTreeValue*/: {
			final Struct_IntTreeValue l2__tmp = (Struct_IntTreeValue)l1__tmp;
			final int l10_k = l2__tmp.f_key;
			final Object l11_v = l2__tmp.f_value;
			final int l12_k = l2__tmp.f_key;
			final Object l13_v = l2__tmp.f_value;
			return afn.invoke(((Integer)((l12_k*alevel)+alobits)), l13_v);
		}
		case 26/*IntTreeNone*/: {
			return null;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
		}
	}
	Object f_iterIntTree(Reference<Struct> atree, Func2<Object,Integer, Object> afn) {
		return f_doIterIntTree(atree, 0, 1, afn);
	}
	Struct f_lookupIntTree(Reference<Struct> atree, int akey) {
	 TAIL_CALL: for(;;) {
		final Struct l0_t = atree.value;
		Struct l1__tmp = l0_t;
		switch (l1__tmp.getTypeId()) {
		case 25/*IntTreeNode*/: {
			final Struct_IntTreeNode l2__tmp = (Struct_IntTreeNode)l1__tmp;
			final Object[] l3_children = l2__tmp.f_children;
			final Object[] l4_children = l2__tmp.f_children;
			final int l5_nibble = runtime.h_Native.bitAnd(akey, 15);
			int l6_rest;
			if ((akey>=0)) {
				l6_rest=(akey/16);
			} else {
				l6_rest=((int)runtime.n_bitUshr.invoke(((Integer)akey), ((Integer)4)));
			}
			{
				final Reference<Struct> l7___tmp = ((Reference<Struct>)(l4_children[l5_nibble]));
				final int l8___tmp = l6_rest;
				atree = l7___tmp;
				akey = l8___tmp;
				continue TAIL_CALL;
			}
		}
		case 27/*IntTreeValue*/: {
			final Struct_IntTreeValue l2__tmp = (Struct_IntTreeValue)l1__tmp;
			final int l9_k = l2__tmp.f_key;
			final Object l10_v = l2__tmp.f_value;
			final int l11_k = l2__tmp.f_key;
			final Object l12_v = l2__tmp.f_value;
			if ((l11_k==akey)) {
				return (new Struct_Some(l12_v));
			} else {
				return ((Struct)SingletonStructs.str_None);
			}
		}
		case 26/*IntTreeNone*/: {
			return ((Struct)SingletonStructs.str_None);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l1__tmp.getTypeName());
		}
	 }
	}
	Reference<Struct> f_makeIntTree() {
		return ((Reference<Struct>)(new Reference(SingletonStructs.str_IntTreeNone)));
	}
}
