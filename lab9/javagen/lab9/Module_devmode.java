// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_devmode {
	final lab9 runtime;
	Module_devmode(lab9 runtime) {
		this.runtime = runtime;
	}
	public Reference<Func0<Boolean>> g_devModeCheckFn;
	public void init_devModeCheckFn() {
		final Func0<Boolean> l1_$0 = new Func0<Boolean>() {
			final public Boolean invoke() {
				return ((Boolean)runtime.m_url_parameter.f_isUrlParameterTrue("dev"));
			}
		};
		g_devModeCheckFn=((Reference<Func0<Boolean>>)(new Reference(l1_$0)));
	}
}
