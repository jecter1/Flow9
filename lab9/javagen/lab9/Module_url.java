// HASH COLLISIONS: YES
// timestamp: 1.603100796E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_url {
	final lab9 runtime;
	Module_url(lab9 runtime) {
		this.runtime = runtime;
	}
	public Reference<Func2<Object,String, Func1<Object,String>>> g_redirectAdditionalFn;
	public void init_redirectAdditionalFn() {
		final Func2<Object,String, Func1<Object,String>> l1_$0 = new Func2<Object,String,Func1<Object,String>>() {
			final public Object invoke(final String aurl, final Func1<Object,String> afn) {
				return afn.invoke(aurl);
			}
		};
		g_redirectAdditionalFn=((Reference<Func2<Object,String, Func1<Object,String>>>)(new Reference(l1_$0)));
	}
}
