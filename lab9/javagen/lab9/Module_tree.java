// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_tree {
	final lab9 runtime;
	Module_tree(lab9 runtime) {
		this.runtime = runtime;
	}
	Struct nf_lookupTree(Struct aset, Object akey) {
	 TAIL_CALL: for(;;) {
		Struct l0__tmp = aset;
		switch (l0__tmp.getTypeId()) {
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_l = l1__tmp.f_left;
			final Struct l5_r = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_l = l1__tmp.f_left;
			final Struct l10_r = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			if ((FlowRuntime.compareByValue(akey,l7_k)<0)) {
				{
					final Struct l12___tmp = l9_l;
					aset = l12___tmp;
					continue TAIL_CALL;
				}
			} else {
				if (FlowRuntime.compareEqual(akey,l7_k)) {
					return (new Struct_Some(l8_v));
				} else {
					{
						final Struct l13___tmp = l10_r;
						aset = l13___tmp;
						continue TAIL_CALL;
					}
				}
			}
		}
		case 106/*TreeEmpty*/: {
			return ((Struct)SingletonStructs.str_None);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	 }
	}
	Struct nf_setTree(Struct aset, Object akey, Object avalue) {
		Struct l0__tmp = aset;
		switch (l0__tmp.getTypeId()) {
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			if ((FlowRuntime.compareByValue(akey,l7_k)<0)) {
				return f_rebalancedTree(l7_k, l8_v, runtime.n_setTree.invoke(l9_left, akey, avalue), l10_right);
			} else {
				if (FlowRuntime.compareEqual(akey,l7_k)) {
					return (new Struct_TreeNode(l7_k, avalue, l9_left, l10_right, l11_depth));
				} else {
					return f_rebalancedTree(l7_k, l8_v, l9_left, runtime.n_setTree.invoke(l10_right, akey, avalue));
				}
			}
		}
		case 106/*TreeEmpty*/: {
			return (new Struct_TreeNode(akey, avalue, ((Struct)SingletonStructs.str_TreeEmpty), ((Struct)SingletonStructs.str_TreeEmpty), 1));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object f_foldTree(Struct atree, Object aacc, Func3<Object,Object, Object, Object> af) {
	 TAIL_CALL: for(;;) {
		Struct l0__tmp = atree;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return aacc;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			final Object l12_acc1 = f_foldTree(l9_left, aacc, af);
			final Object l13_acc2 = af.invoke(l7_k, l8_v, l12_acc1);
			{
				final Struct l14___tmp = l10_right;
				final Object l15___tmp = l13_acc2;
				atree = l14___tmp;
				aacc = l15___tmp;
				continue TAIL_CALL;
			}
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	 }
	}
	Object[] f_getTreeValues(Struct atree) {
		Struct l0__tmp = atree;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return SingletonStructs.arr_empty;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			return runtime.m_array.f_concat3(f_getTreeValues(l9_left), (new Object[] { l8_v }), f_getTreeValues(l10_right));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_lookupTree(Struct aset, Object akey) {
	 TAIL_CALL: for(;;) {
		Struct l0__tmp = aset;
		switch (l0__tmp.getTypeId()) {
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_l = l1__tmp.f_left;
			final Struct l5_r = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_l = l1__tmp.f_left;
			final Struct l10_r = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			if ((FlowRuntime.compareByValue(akey,l7_k)<0)) {
				{
					final Struct l12___tmp = l9_l;
					aset = l12___tmp;
					continue TAIL_CALL;
				}
			} else {
				if (FlowRuntime.compareEqual(akey,l7_k)) {
					return (new Struct_Some(l8_v));
				} else {
					{
						final Struct l13___tmp = l10_r;
						aset = l13___tmp;
						continue TAIL_CALL;
					}
				}
			}
		}
		case 106/*TreeEmpty*/: {
			return ((Struct)SingletonStructs.str_None);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	 }
	}
	Object f_lookupTreeDef(Struct ax, Object akey, Object adefaultValue) {
		return runtime.m_maybe.f_either(runtime.n_lookupTree.invoke(ax, akey), adefaultValue);
	}
	Struct f_makeTree() {
		return ((Struct)SingletonStructs.str_TreeEmpty);
	}
	Struct_TreeNode f_mkTreeNode(Object ak, Object av, Struct aleft, Struct aright) {
		return (new Struct_TreeNode(ak, av, aleft, aright, (((int)((Func2<Integer,Integer, Integer>)(Func2)runtime.n_max).invoke(((Integer)f_treeDepth(aleft)), ((Integer)f_treeDepth(aright))))+1)));
	}
	Struct f_rebalancedTree(Object ak, Object av, Struct aleft, Struct aright) {
		final int l0_leftDepth = f_treeDepth(aleft);
		final int l1_rightDepth = f_treeDepth(aright);
		final int l2_balance = (l0_leftDepth-l1_rightDepth);
		final Struct_TreeNode l3_composed = (new Struct_TreeNode(ak, av, aleft, aright, (((int)((Func2<Integer,Integer, Integer>)(Func2)runtime.n_max).invoke(((Integer)l0_leftDepth), ((Integer)l1_rightDepth)))+1)));
		if ((((l2_balance==(-1))||(l2_balance==0))||(l2_balance==1))) {
			return l3_composed;
		} else {
			if ((l2_balance<0)) {
				Struct l4__tmp = aright;
				switch (l4__tmp.getTypeId()) {
				case 106/*TreeEmpty*/: {
					return l3_composed;
				}
				case 107/*TreeNode*/: {
					final Struct_TreeNode l5__tmp = (Struct_TreeNode)l4__tmp;
					final Object l6_rk = l5__tmp.f_key;
					final Object l7_rv = l5__tmp.f_value;
					final Struct l8_rl = l5__tmp.f_left;
					final Struct l9_rr = l5__tmp.f_right;
					final int l10_rdepth = l5__tmp.f_depth;
					final Object l11_rk = l5__tmp.f_key;
					final Object l12_rv = l5__tmp.f_value;
					final Struct l13_rl = l5__tmp.f_left;
					final Struct l14_rr = l5__tmp.f_right;
					final int l15_rdepth = l5__tmp.f_depth;
					return f_treeLeftRotation(((f_treeDepth(l13_rl)<f_treeDepth(l14_rr))?l3_composed:f_mkTreeNode(ak, av, aleft, f_treeRightRotation(l5__tmp))));
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l4__tmp.getTypeName());
				}
			} else {
				Struct l16__tmp = aleft;
				switch (l16__tmp.getTypeId()) {
				case 106/*TreeEmpty*/: {
					return l3_composed;
				}
				case 107/*TreeNode*/: {
					final Struct_TreeNode l17__tmp = (Struct_TreeNode)l16__tmp;
					final Object l18_lk = l17__tmp.f_key;
					final Object l19_lv = l17__tmp.f_value;
					final Struct l20_ll = l17__tmp.f_left;
					final Struct l21_lr = l17__tmp.f_right;
					final int l22_ldepth = l17__tmp.f_depth;
					final Object l23_lk = l17__tmp.f_key;
					final Object l24_lv = l17__tmp.f_value;
					final Struct l25_ll = l17__tmp.f_left;
					final Struct l26_lr = l17__tmp.f_right;
					final int l27_ldepth = l17__tmp.f_depth;
					return f_treeRightRotation(((f_treeDepth(l25_ll)<f_treeDepth(l26_lr))?f_mkTreeNode(ak, av, f_treeLeftRotation(l17__tmp), aright):l3_composed));
				}
				default:
					throw new RuntimeException("Unexpected struct in switch: "+l16__tmp.getTypeName());
				}
			}
		}
	}
	Struct f_setTree(Struct aset, Object akey, Object avalue) {
		Struct l0__tmp = aset;
		switch (l0__tmp.getTypeId()) {
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			if ((FlowRuntime.compareByValue(akey,l7_k)<0)) {
				return f_rebalancedTree(l7_k, l8_v, runtime.n_setTree.invoke(l9_left, akey, avalue), l10_right);
			} else {
				if (FlowRuntime.compareEqual(akey,l7_k)) {
					return (new Struct_TreeNode(l7_k, avalue, l9_left, l10_right, l11_depth));
				} else {
					return f_rebalancedTree(l7_k, l8_v, l9_left, runtime.n_setTree.invoke(l10_right, akey, avalue));
				}
			}
		}
		case 106/*TreeEmpty*/: {
			return (new Struct_TreeNode(akey, avalue, ((Struct)SingletonStructs.str_TreeEmpty), ((Struct)SingletonStructs.str_TreeEmpty), 1));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_setTreeValues(Struct atree, Object[] akeyValuePairs) {
		final Func2<Struct,Struct, Struct_Pair> l1_$0 = new Func2<Struct,Struct,Struct_Pair>() {
			final public Struct invoke(final Struct aacc, final Struct_Pair akvPair) {
				final Func2<Struct,Object, Object> l1_$0 = new Func2<Struct,Object,Object>() {
					final public Struct invoke(final Object akey, final Object avalue) {
						return runtime.n_setTree.invoke(aacc, akey, avalue);
					}
				};
				return ((Struct)runtime.m_tuples.f_unpair(akvPair, ((Func2<Object,Object, Object>)(Func2)l1_$0)));
			}
		};
		return ((Struct)runtime.h_Native.fold(akeyValuePairs, atree, ((Func2<Object,Object, Object>)(Func2)l1_$0)));
	}
	int f_sizeTree(Struct at) {
		Struct l0__tmp = at;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return 0;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_l = l1__tmp.f_left;
			final Struct l5_r = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_l = l1__tmp.f_left;
			final Struct l10_r = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			return ((1+f_sizeTree(l9_l))+f_sizeTree(l10_r));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object f_traverseInOrder(Struct atree, Func2<Object,Object, Object> afn) {
	 TAIL_CALL: for(;;) {
		Struct l0__tmp = atree;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return null;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			f_traverseInOrder(l9_left, afn);
			afn.invoke(l7_k, l8_v);
			{
				final Struct l12___tmp = l10_right;
				atree = l12___tmp;
				continue TAIL_CALL;
			}
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	 }
	}
	int f_treeDepth(Struct atree) {
		Struct l0__tmp = atree;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return 0;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final int l2_depth = l1__tmp.f_depth;
			final Object l3___ = l1__tmp.f_key;
			final Object l4___ = l1__tmp.f_value;
			final Struct l5___ = l1__tmp.f_left;
			final Struct l6___ = l1__tmp.f_right;
			final int l7_depth = l1__tmp.f_depth;
			return l7_depth;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_treeLeftRotation(Struct atree) {
		Struct l0__tmp = atree;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return atree;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			Struct l12__tmp = l10_right;
			switch (l12__tmp.getTypeId()) {
			case 106/*TreeEmpty*/: {
				return l1__tmp;
			}
			case 107/*TreeNode*/: {
				final Struct_TreeNode l13__tmp = (Struct_TreeNode)l12__tmp;
				final Object l14_ck = l13__tmp.f_key;
				final Object l15_cv = l13__tmp.f_value;
				final Struct l16_cleft = l13__tmp.f_left;
				final Struct l17_cright = l13__tmp.f_right;
				final int l18_cdepth = l13__tmp.f_depth;
				final Object l19_ck = l13__tmp.f_key;
				final Object l20_cv = l13__tmp.f_value;
				final Struct l21_cleft = l13__tmp.f_left;
				final Struct l22_cright = l13__tmp.f_right;
				final int l23_cdepth = l13__tmp.f_depth;
				return f_mkTreeNode(l19_ck, l20_cv, f_mkTreeNode(l7_k, l8_v, l9_left, l21_cleft), l22_cright);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l12__tmp.getTypeName());
			}
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_treeRightRotation(Struct atree) {
		Struct l0__tmp = atree;
		switch (l0__tmp.getTypeId()) {
		case 106/*TreeEmpty*/: {
			return atree;
		}
		case 107/*TreeNode*/: {
			final Struct_TreeNode l1__tmp = (Struct_TreeNode)l0__tmp;
			final Object l2_k = l1__tmp.f_key;
			final Object l3_v = l1__tmp.f_value;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final int l6_depth = l1__tmp.f_depth;
			final Object l7_k = l1__tmp.f_key;
			final Object l8_v = l1__tmp.f_value;
			final Struct l9_left = l1__tmp.f_left;
			final Struct l10_right = l1__tmp.f_right;
			final int l11_depth = l1__tmp.f_depth;
			Struct l12__tmp = l9_left;
			switch (l12__tmp.getTypeId()) {
			case 106/*TreeEmpty*/: {
				return l1__tmp;
			}
			case 107/*TreeNode*/: {
				final Struct_TreeNode l13__tmp = (Struct_TreeNode)l12__tmp;
				final Object l14_ck = l13__tmp.f_key;
				final Object l15_cv = l13__tmp.f_value;
				final Struct l16_cleft = l13__tmp.f_left;
				final Struct l17_cright = l13__tmp.f_right;
				final int l18_cdepth = l13__tmp.f_depth;
				final Object l19_ck = l13__tmp.f_key;
				final Object l20_cv = l13__tmp.f_value;
				final Struct l21_cleft = l13__tmp.f_left;
				final Struct l22_cright = l13__tmp.f_right;
				final int l23_cdepth = l13__tmp.f_depth;
				return f_mkTreeNode(l19_ck, l20_cv, l21_cleft, f_mkTreeNode(l7_k, l8_v, l22_cright, l10_right));
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l12__tmp.getTypeName());
			}
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
}
