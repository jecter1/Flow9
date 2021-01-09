// HASH COLLISIONS: YES
// timestamp: 1.603100796E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_maybe {
	final lab9 runtime;
	Module_maybe(lab9 runtime) {
		this.runtime = runtime;
	}
	Object f_either(Struct am, Object aalternative) {
		Struct l0__tmp = am;
		switch (l0__tmp.getTypeId()) {
		case 42/*None*/: {
			return aalternative;
		}
		case 103/*Some*/: {
			final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
			final Object l2_v = l1__tmp.f_value;
			final Object l3_v = l1__tmp.f_value;
			return l3_v;
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object f_eitherFn(Struct am, Func1<Object,Object> afn, Func0<Object> aalternativeFn) {
		Struct l0__tmp = am;
		switch (l0__tmp.getTypeId()) {
		case 42/*None*/: {
			return aalternativeFn.invoke();
		}
		case 103/*Some*/: {
			final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
			final Object l2_v = l1__tmp.f_value;
			final Object l3_v = l1__tmp.f_value;
			return afn.invoke(l3_v);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object f_eitherMap(Struct am, Func1<Object,Object> afn, Object aalternative) {
		Struct l0__tmp = am;
		switch (l0__tmp.getTypeId()) {
		case 42/*None*/: {
			return aalternative;
		}
		case 103/*Some*/: {
			final Struct_Some l1__tmp = (Struct_Some)l0__tmp;
			final Object l2_v = l1__tmp.f_value;
			final Object l3_v = l1__tmp.f_value;
			return afn.invoke(l3_v);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
}
