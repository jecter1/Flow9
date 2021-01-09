// HASH COLLISIONS: YES
// timestamp: 1.603100796E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_securitymode {
	final lab9 runtime;
	Module_securitymode(lab9 runtime) {
		this.runtime = runtime;
	}
	public Reference<Boolean> g_loggingEnabled;
	public Reference<Object[]> g_securityModes;
	public void init_loggingEnabled() {
		g_loggingEnabled=((Reference<Boolean>)(new Reference(true)));
	}
	public void init_securityModes() {
		g_securityModes=((Reference<Object[]>)(new Reference(SingletonStructs.arr_empty)));
	}
	boolean f_isLoggingEnabled() {
		return (!f_isOWASPLevel1()&&((boolean)g_loggingEnabled.value));
	}
	boolean f_isOWASPLevel1() {
		return (((Struct_OWASP)runtime.m_flowstructs.f_extractStruct(g_securityModes.value, (new Struct_OWASP(0)))).f_level>0);
	}
}
