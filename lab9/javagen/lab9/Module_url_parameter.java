// HASH COLLISIONS: YES
// timestamp: 1.603100796E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_url_parameter {
	final lab9 runtime;
	Module_url_parameter(lab9 runtime) {
		this.runtime = runtime;
	}
	public Struct g_allUrlParameters;
	public void init_allUrlParameters() {
		g_allUrlParameters=f_getAllUrlParameters();
	}
	Struct f_getAllUrlParameters() {
		final Struct l0_debugStorage = runtime.n_parseJson.invoke(runtime.m_runtime.f_getKeyValue("local-url-parameters", "{}"));
		final Object[] l4_$2 = (new Object[] { "dev", "devtrace", "new", "allow_share_progress" });
		final Struct l5_$3 = runtime.m_tree.f_makeTree();
		final Func2<Struct,Struct, String> l6_$1 = new Func2<Struct,Struct,String>() {
			final public Struct invoke(final Struct aacc, final String akey) {
				final String l0_value = runtime.m_json.f_getJsonStringField(l0_debugStorage, akey, "");
				if ((l0_value).equals("")) {
					return aacc;
				} else {
					return ((Func3<Struct,Struct, String, String>)(Func3)runtime.n_setTree).invoke(aacc, akey, l0_value);
				}
			}
		};
		final Struct l7_localTree = ((Struct)runtime.h_Native.fold(l4_$2, l5_$3, ((Func2<Object,Object, Object>)(Func2)l6_$1)));
		final Object[] l10_$9 = runtime.h_Native.getAllUrlParameters();
		final Func2<Struct,Struct, Object[]> l11_$8 = new Func2<Struct,Struct,Object[]>() {
			final public Struct invoke(final Struct aacc, final Object[] apar) {
				return ((Func3<Struct,Struct, String, String>)(Func3)runtime.n_setTree).invoke(aacc, ((String)(apar[0])), ((String)(apar[1])));
			}
		};
		final Struct l12_tree0 = ((Struct)runtime.h_Native.fold(l10_$9, l7_localTree, ((Func2<Object,Object, Object>)(Func2)l11_$8)));
		final Struct l15_$14 = ((Func2<Struct,Struct, String>)(Func2)runtime.n_lookupTree).invoke(l12_tree0, "i");
		final Func1<Struct,String> l16_$13 = new Func1<Struct,String>() {
			final public Struct invoke(final String av) {
				return ((Func3<Struct,Struct, String, String>)(Func3)runtime.n_setTree).invoke(l12_tree0, "impersonate", av);
			}
		};
		return ((Struct)runtime.m_maybe.f_eitherMap(l15_$14, ((Func1<Object,Object>)(Func1)l16_$13), l12_tree0));
	}
	boolean f_isParameterFalse(String aparam) {
		return (((aparam).equals("false")||(aparam).equals("0"))||(aparam).equals("FALSE"));
	}
	boolean f_isUrlParameterTrue(String aname) {
		final Struct l3_$2 = ((Func2<Struct,Struct, String>)(Func2)runtime.n_lookupTree).invoke(g_allUrlParameters, aname);
		final Func1<Boolean,String> l4_$0 = new Func1<Boolean,String>() {
			final public Boolean invoke(final String aparam) {
				return ((Boolean)!f_isParameterFalse(aparam));
			}
		};
		final Func0<Boolean> l5_$1 = new Func0<Boolean>() {
			final public Boolean invoke() {
				return ((Boolean)false);
			}
		};
		return ((boolean)runtime.m_maybe.f_eitherFn(l3_$2, ((Func1<Object,Object>)(Func1)l4_$0), ((Func0<Object>)(Func0)l5_$1)));
	}
}
