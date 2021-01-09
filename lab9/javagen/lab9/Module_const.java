// HASH COLLISIONS: YES
// timestamp: 1.610213387E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_const {
	final lab9 runtime;
	Module_const(lab9 runtime) {
		this.runtime = runtime;
	}
	String f_c2s(Struct aconst) {
		Struct l0__tmp = aconst;
		switch (l0__tmp.getTypeId()) {
		case 96/*Rat*/: {
			final Struct_Rat l1__tmp = (Struct_Rat)l0__tmp;
			final int l2_num = l1__tmp.f_numer;
			final int l3_den = l1__tmp.f_denom;
			final int l4_num = l1__tmp.f_numer;
			final int l5_den = l1__tmp.f_denom;
			return f_r2s(l1__tmp);
		}
		case 40/*NaN*/: {
			return "NaN";
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_cAdd(Struct aleft, Struct aright) {
		return f_funcHelper(aleft, aright, runtime.gfw_rAdd);
	}
	Struct f_cDiv(Struct aleft, Struct aright) {
		return f_funcHelper(aleft, aright, runtime.gfw_rDiv);
	}
	Struct f_cMul(Struct aleft, Struct aright) {
		return f_funcHelper(aleft, aright, runtime.gfw_rMul);
	}
	Struct f_cPow(Struct aleft, Struct aright) {
		return f_funcHelper(aleft, aright, runtime.gfw_rPow);
	}
	Struct f_cSub(Struct aleft, Struct aright) {
		return f_funcHelper(aleft, aright, runtime.gfw_rSub);
	}
	Struct f_funcHelper(Struct aleft, Struct aright, Func2<Struct,Struct_Rat, Struct_Rat> aratFunc) {
		Struct l0__tmp = aleft;
		switch (l0__tmp.getTypeId()) {
		case 96/*Rat*/: {
			final Struct_Rat l1__tmp = (Struct_Rat)l0__tmp;
			final int l2_lnum = l1__tmp.f_numer;
			final int l3_lden = l1__tmp.f_denom;
			final int l4_lnum = l1__tmp.f_numer;
			final int l5_lden = l1__tmp.f_denom;
			Struct l6__tmp = aright;
			switch (l6__tmp.getTypeId()) {
			case 96/*Rat*/: {
				final Struct_Rat l7__tmp = (Struct_Rat)l6__tmp;
				final int l8_rnum = l7__tmp.f_numer;
				final int l9_rden = l7__tmp.f_denom;
				final int l10_rnum = l7__tmp.f_numer;
				final int l11_rden = l7__tmp.f_denom;
				return aratFunc.invoke(l1__tmp, l7__tmp);
			}
			case 40/*NaN*/: {
				return ((Struct)SingletonStructs.str_NaN);
			}
			default:
				throw new RuntimeException("Unexpected struct in switch: "+l6__tmp.getTypeName());
			}
		}
		case 40/*NaN*/: {
			return ((Struct)SingletonStructs.str_NaN);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	String f_r2s(Struct_Rat arat) {
		if ((arat.f_denom==1)) {
			if ((arat.f_numer>0)) {
				return runtime.m_string.f_i2s(arat.f_numer);
			} else {
				return runtime.m_string.f_concatStrings((new Object[] { "(", runtime.m_string.f_i2s(arat.f_numer), ")" }));
			}
		} else {
			return runtime.m_string.f_concatStrings((new Object[] { "(", runtime.m_string.f_i2s(arat.f_numer), "/", runtime.m_string.f_i2s(arat.f_denom), ")" }));
		}
	}
	Struct f_rAdd(Struct_Rat aleft, Struct_Rat aright) {
		final int l0_num = ((aleft.f_numer*aright.f_denom)+(aright.f_numer*aleft.f_denom));
		final int l1_den = (aleft.f_denom*aright.f_denom);
		final int l2_gcd_0 = runtime.m_math.f_gcd(l0_num, l1_den);
		return (new Struct_Rat((l0_num/l2_gcd_0), (l1_den/l2_gcd_0)));
	}
	Struct f_rDiv(Struct_Rat aleft, Struct_Rat aright) {
		if ((aright.f_numer==0)) {
			return ((Struct)SingletonStructs.str_NaN);
		} else {
			return runtime.gfw_rMul.invoke(aleft, (new Struct_Rat(aright.f_denom, aright.f_numer)));
		}
	}
	Struct f_rMul(Struct_Rat aleft, Struct_Rat aright) {
		final int l0_num = (aleft.f_numer*aright.f_numer);
		final int l1_den = (aleft.f_denom*aright.f_denom);
		final int l2_gcd_0 = runtime.m_math.f_gcd(l0_num, l1_den);
		return (new Struct_Rat((l0_num/l2_gcd_0), (l1_den/l2_gcd_0)));
	}
	Struct f_rPow(Struct_Rat abase, Struct_Rat aexpnt) {
	 TAIL_CALL: for(;;) {
		if ((aexpnt.f_denom!=1)) {
			return ((Struct)SingletonStructs.str_NaN);
		} else {
			if (((abase.f_numer==0)&&(aexpnt.f_numer==0))) {
				return ((Struct)SingletonStructs.str_NaN);
			} else {
				if ((abase.f_numer==0)) {
					return (new Struct_Rat(0, 1));
				} else {
					if ((aexpnt.f_numer==0)) {
						return (new Struct_Rat(1, 1));
					} else {
						if ((aexpnt.f_numer<0)) {
							{
								final Struct_Rat l0___tmp = (new Struct_Rat(abase.f_denom, abase.f_numer));
								final Struct_Rat l1___tmp = (new Struct_Rat((-aexpnt.f_numer), aexpnt.f_denom));
								abase = l0___tmp;
								aexpnt = l1___tmp;
								continue TAIL_CALL;
							}
						} else {
							return f_cMul(runtime.gfw_rPow.invoke(abase, (new Struct_Rat((aexpnt.f_numer-1), aexpnt.f_denom))), abase);
						}
					}
				}
			}
		}
	 }
	}
	Struct f_rSub(Struct_Rat aleft, Struct_Rat aright) {
		final int l0_num = ((aleft.f_numer*aright.f_denom)-(aright.f_numer*aleft.f_denom));
		final int l1_den = (aleft.f_denom*aright.f_denom);
		final int l2_gcd_0 = runtime.m_math.f_gcd(l0_num, l1_den);
		return (new Struct_Rat((l0_num/l2_gcd_0), (l1_den/l2_gcd_0)));
	}
}
