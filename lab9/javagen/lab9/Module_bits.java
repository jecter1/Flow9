// HASH COLLISIONS: YES
// timestamp: 1.603100796E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_bits {
	final lab9 runtime;
	Module_bits(lab9 runtime) {
		this.runtime = runtime;
	}
	public Object[] g_pots2;
	int nf_bitShl(int aa, int ab) {
		if ((ab==0)) {
			return aa;
		} else {
			if ((ab>=32)) {
				return 0;
			} else {
				final int l0_highest = runtime.h_Native.bitAnd(aa, f_pot2((31-ab)));
				final int l1_mask = (f_pot2((31-ab))-1);
				final int l2_shifted = (runtime.h_Native.bitAnd(aa, l1_mask)*f_pot2(ab));
				if ((l0_highest!=0)) {
					return runtime.h_Native.bitOr(l2_shifted, (-2147483648));
				} else {
					return l2_shifted;
				}
			}
		}
	}
	int nf_bitUshr(int aa, int ab) {
		if ((ab==0)) {
			return aa;
		} else {
			final Func2<Integer,Integer, Integer> l0_shr = new Func2<Integer,Integer,Integer>() {
				final public Integer invoke(final Integer aa1, final Integer ab1) {
					return ((Integer)(((int)aa1)/f_pot2(((int)ab1))));
				}
			};
			if ((aa<0)) {
				final int l1_v = runtime.h_Native.bitOr(((int)l0_shr.invoke(((Integer)runtime.h_Native.bitAnd(aa, 2147483647)), ((Integer)ab))), f_pot2((31-ab)));
				final int l2_mask = (f_pot2((32-ab))-1);
				return runtime.h_Native.bitAnd(l2_mask, l1_v);
			} else {
				return ((int)l0_shr.invoke(((Integer)aa), ((Integer)ab)));
			}
		}
	}
	public void init_pots2() {
		final Func1<Integer,Integer> l1_$0 = new Func1<Integer,Integer>() {
			final public Integer invoke(final Integer ai) {
				return ((Integer)runtime.m_math.f_pow(2, ((int)ai)));
			}
		};
		g_pots2=runtime.m_runtime.f_generate(0, 32, ((Func1<Object,Integer>)(Func1)l1_$0));
	}
	int f_bitShl(int aa, int ab) {
		if ((ab==0)) {
			return aa;
		} else {
			if ((ab>=32)) {
				return 0;
			} else {
				final int l0_highest = runtime.h_Native.bitAnd(aa, f_pot2((31-ab)));
				final int l1_mask = (f_pot2((31-ab))-1);
				final int l2_shifted = (runtime.h_Native.bitAnd(aa, l1_mask)*f_pot2(ab));
				if ((l0_highest!=0)) {
					return runtime.h_Native.bitOr(l2_shifted, (-2147483648));
				} else {
					return l2_shifted;
				}
			}
		}
	}
	int f_bitUshr(int aa, int ab) {
		if ((ab==0)) {
			return aa;
		} else {
			final Func2<Integer,Integer, Integer> l0_shr = new Func2<Integer,Integer,Integer>() {
				final public Integer invoke(final Integer aa1, final Integer ab1) {
					return ((Integer)(((int)aa1)/f_pot2(((int)ab1))));
				}
			};
			if ((aa<0)) {
				final int l1_v = runtime.h_Native.bitOr(((int)l0_shr.invoke(((Integer)runtime.h_Native.bitAnd(aa, 2147483647)), ((Integer)ab))), f_pot2((31-ab)));
				final int l2_mask = (f_pot2((32-ab))-1);
				return runtime.h_Native.bitAnd(l2_mask, l1_v);
			} else {
				return ((int)l0_shr.invoke(((Integer)aa), ((Integer)ab)));
			}
		}
	}
	int f_pot2(int an) {
		return ((int)(g_pots2[an]));
	}
}
