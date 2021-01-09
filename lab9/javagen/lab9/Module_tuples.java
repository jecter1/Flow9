// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_tuples {
	final lab9 runtime;
	Module_tuples(lab9 runtime) {
		this.runtime = runtime;
	}
	Object f_unpair(Struct_Pair apair, Func2<Object,Object, Object> afn) {
		return afn.invoke(apair.f_first, apair.f_second);
	}
}
