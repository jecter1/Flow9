// HASH COLLISIONS: YES
// timestamp: 1.610214215094E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
public final class lab9 extends FlowRuntime {

	// Modules
	final Module_tuples m_tuples = new Module_tuples(this);
	final Module_dynamic m_dynamic = new Module_dynamic(this);
	final Module_maybe m_maybe = new Module_maybe(this);
	final Module_url m_url = new Module_url(this);
	final Module_list m_list = new Module_list(this);
	final Module_array m_array = new Module_array(this);
	final Module_flowstructs m_flowstructs = new Module_flowstructs(this);
	final Module_securitymode m_securitymode = new Module_securitymode(this);
	final Module_runtime m_runtime = new Module_runtime(this);
	final Module_tree m_tree = new Module_tree(this);
	final Module_timer m_timer = new Module_timer(this);
	final Module_string m_string = new Module_string(this);
	final Module_set m_set = new Module_set(this);
	final Module_linecolumn m_linecolumn = new Module_linecolumn(this);
	final Module_pegtype m_pegtype = new Module_pegtype(this);
	final Module_math m_math = new Module_math(this);
	final Module_deserialize_string m_deserialize_string = new Module_deserialize_string(this);
	final Module_algorithms m_algorithms = new Module_algorithms(this);
	final Module_const m_const = new Module_const(this);
	final Module_bits m_bits = new Module_bits(this);
	final Module_stringmath m_stringmath = new Module_stringmath(this);
	final Module_inttree m_inttree = new Module_inttree(this);
	final Module_json m_json = new Module_json(this);
	final Module_peg m_peg = new Module_peg(this);
	final Module_url_parameter m_url_parameter = new Module_url_parameter(this);
	final Module_devmode m_devmode = new Module_devmode(this);
	final Module_pegaction m_pegaction = new Module_pegaction(this);
	final Module_optimize_grammar m_optimize_grammar = new Module_optimize_grammar(this);
	final Module_pegcode_lib m_pegcode_lib = new Module_pegcode_lib(this);
	final Module_rename_bindings m_rename_bindings = new Module_rename_bindings(this);
	final Module_pegcode m_pegcode = new Module_pegcode(this);
	final Module_grammar2code m_grammar2code = new Module_grammar2code(this);
	final Module_lingocode m_lingocode = new Module_lingocode(this);
	final Module_driver m_driver = new Module_driver(this);
	final Module_lab9 m_lab9 = new Module_lab9(this);
	public lab9(String[] args) {
		super(Structs.structList(), args);
	}

	// Wrappers
	final Func2<Struct,Struct_Rat, Struct_Rat> gfw_rAdd = new Func2<Struct,Struct_Rat, Struct_Rat>() {
		final public Struct invoke(Struct_Rat a0, Struct_Rat a1) {
			return m_const.f_rAdd(a0, a1);
		}
	};
	final Func2<Struct,Struct_Rat, Struct_Rat> gfw_rDiv = new Func2<Struct,Struct_Rat, Struct_Rat>() {
		final public Struct invoke(Struct_Rat a0, Struct_Rat a1) {
			return m_const.f_rDiv(a0, a1);
		}
	};
	final Func2<Struct,Struct_Rat, Struct_Rat> gfw_rMul = new Func2<Struct,Struct_Rat, Struct_Rat>() {
		final public Struct invoke(Struct_Rat a0, Struct_Rat a1) {
			return m_const.f_rMul(a0, a1);
		}
	};
	final Func2<Struct,Struct_Rat, Struct_Rat> gfw_rPow = new Func2<Struct,Struct_Rat, Struct_Rat>() {
		final public Struct invoke(Struct_Rat a0, Struct_Rat a1) {
			return m_const.f_rPow(a0, a1);
		}
	};
	final Func2<Struct,Struct_Rat, Struct_Rat> gfw_rSub = new Func2<Struct,Struct_Rat, Struct_Rat>() {
		final public Struct invoke(Struct_Rat a0, Struct_Rat a1) {
			return m_const.f_rSub(a0, a1);
		}
	};
	final Func1<String,Struct> gfw_action2string = new Func1<String,Struct>() {
		final public String invoke(Struct a0) {
			return m_peg.f_action2string(a0);
		}
	};
	final Func1<Struct_Production,Struct_Production> gfw_optimizeProduction = new Func1<Struct_Production,Struct_Production>() {
		final public Struct_Production invoke(Struct_Production a0) {
			return m_optimize_grammar.f_optimizeProduction(a0);
		}
	};
	final Func1<String,Object> gfw_toString = new Func1<String,Object>() {
		final public String invoke(Object a0) {
			return m_dynamic.f_toString(a0);
		}
	};
	final Func1<Struct_Production,Struct_Production> gfw_renameBindingsInProduction = new Func1<Struct_Production,Struct_Production>() {
		final public Struct_Production invoke(Struct_Production a0) {
			return m_rename_bindings.f_renameBindingsInProduction(a0);
		}
	};
	final Func1<Struct_Seq,Struct_Seq> gfw_renameBindingsInChoice = new Func1<Struct_Seq,Struct_Seq>() {
		final public Struct_Seq invoke(Struct_Seq a0) {
			return m_rename_bindings.f_renameBindingsInChoice(a0);
		}
	};
	final Func2<Struct,Struct, Struct> gfw_cMul = new Func2<Struct,Struct, Struct>() {
		final public Struct invoke(Struct a0, Struct a1) {
			return m_const.f_cMul(a0, a1);
		}
	};
	final Func2<Struct,Struct, Struct> gfw_cAdd = new Func2<Struct,Struct, Struct>() {
		final public Struct invoke(Struct a0, Struct a1) {
			return m_const.f_cAdd(a0, a1);
		}
	};
	final Func2<Struct,Struct, Struct> gfw_cSub = new Func2<Struct,Struct, Struct>() {
		final public Struct invoke(Struct a0, Struct a1) {
			return m_const.f_cSub(a0, a1);
		}
	};
	final Func2<Struct,Struct, Struct> gfw_cDiv = new Func2<Struct,Struct, Struct>() {
		final public Struct invoke(Struct a0, Struct a1) {
			return m_const.f_cDiv(a0, a1);
		}
	};
	final Func2<Struct,Struct, Struct> gfw_cPow = new Func2<Struct,Struct, Struct>() {
		final public Struct invoke(Struct a0, Struct a1) {
			return m_const.f_cPow(a0, a1);
		}
	};

	// Native Wrappers
	final Func2<Object,Struct, Object> nw_headList = new Func2<Object,Struct, Object>() {
		final public Object invoke(Struct a0, Object a1) {
			return m_list.nf_headList(a0, a1);
		}
	};
	Func2<Object,Struct, Object> n_headList = nw_headList;
	final Func1<Struct,Struct> nw_tailList = new Func1<Struct,Struct>() {
		final public Struct invoke(Struct a0) {
			return m_list.nf_tailList(a0);
		}
	};
	Func1<Struct,Struct> n_tailList = nw_tailList;
	final Func3<Integer,Object[], Object, Integer> nw_elemIndex = new Func3<Integer,Object[], Object, Integer>() {
		final public Integer invoke(Object[] a0, Object a1, Integer a2) {
			return m_array.nf_elemIndex(a0, a1, a2);
		}
	};
	Func3<Integer,Object[], Object, Integer> n_elemIndex = nw_elemIndex;
	final Func2<Boolean,Object[], Func1<Boolean,Object>> nw_exists = new Func2<Boolean,Object[], Func1<Boolean,Object>>() {
		final public Boolean invoke(Object[] a0, Func1<Boolean,Object> a1) {
			return m_array.nf_exists(a0, a1);
		}
	};
	Func2<Boolean,Object[], Func1<Boolean,Object>> n_exists = nw_exists;
	final Func2<Struct,Object[], Func1<Boolean,Object>> nw_find = new Func2<Struct,Object[], Func1<Boolean,Object>>() {
		final public Struct invoke(Object[] a0, Func1<Boolean,Object> a1) {
			return m_array.nf_find(a0, a1);
		}
	};
	Func2<Struct,Object[], Func1<Boolean,Object>> n_find = nw_find;
	final Func2<Object,Object, Object> nw_max = new Func2<Object,Object, Object>() {
		final public Object invoke(Object a0, Object a1) {
			return m_runtime.nf_max(a0, a1);
		}
	};
	Func2<Object,Object, Object> n_max = nw_max;
	final Func2<Struct,Struct, Object> nw_lookupTree = new Func2<Struct,Struct, Object>() {
		final public Struct invoke(Struct a0, Object a1) {
			return m_tree.nf_lookupTree(a0, a1);
		}
	};
	Func2<Struct,Struct, Object> n_lookupTree = nw_lookupTree;
	final Func3<Struct,Struct, Object, Object> nw_setTree = new Func3<Struct,Struct, Object, Object>() {
		final public Struct invoke(Struct a0, Object a1, Object a2) {
			return m_tree.nf_setTree(a0, a1, a2);
		}
	};
	Func3<Struct,Struct, Object, Object> n_setTree = nw_setTree;
	final Func1<String,String> nw_cloneString = new Func1<String,String>() {
		final public String invoke(String a0) {
			return m_string.nf_cloneString(a0);
		}
	};
	Func1<String,String> n_cloneString = nw_cloneString;
	final Func2<String,String, Integer> nw_getCharAt = new Func2<String,String, Integer>() {
		final public String invoke(String a0, Integer a1) {
			return m_string.nf_getCharAt(a0, a1);
		}
	};
	Func2<String,String, Integer> n_getCharAt = nw_getCharAt;
	final Func3<Boolean,String, Integer, String> nw_strContainsAt = new Func3<Boolean,String, Integer, String>() {
		final public Boolean invoke(String a0, Integer a1, String a2) {
			return m_string.nf_strContainsAt(a0, a1, a2);
		}
	};
	Func3<Boolean,String, Integer, String> n_strContainsAt = nw_strContainsAt;
	final Func4<Integer,String, String, Integer, Integer> nw_strRangeIndexOf = new Func4<Integer,String, String, Integer, Integer>() {
		final public Integer invoke(String a0, String a1, Integer a2, Integer a3) {
			return m_string.nf_strRangeIndexOf(a0, a1, a2, a3);
		}
	};
	Func4<Integer,String, String, Integer, Integer> n_strRangeIndexOf = nw_strRangeIndexOf;
	final Func3<String,String, String, String> nw_strReplace = new Func3<String,String, String, String>() {
		final public String invoke(String a0, String a1, String a2) {
			return m_string.nf_strReplace(a0, a1, a2);
		}
	};
	Func3<String,String, String, String> n_strReplace = nw_strReplace;
	final Func2<Integer,Integer, Integer> nw_bitShl = new Func2<Integer,Integer, Integer>() {
		final public Integer invoke(Integer a0, Integer a1) {
			return m_bits.nf_bitShl(a0, a1);
		}
	};
	Func2<Integer,Integer, Integer> n_bitShl = nw_bitShl;
	final Func2<Integer,Integer, Integer> nw_bitUshr = new Func2<Integer,Integer, Integer>() {
		final public Integer invoke(Integer a0, Integer a1) {
			return m_bits.nf_bitUshr(a0, a1);
		}
	};
	Func2<Integer,Integer, Integer> n_bitUshr = nw_bitUshr;
	final Func1<Struct,String> nw_parseJson = new Func1<Struct,String>() {
		final public Struct invoke(String a0) {
			return m_json.nf_parseJson(a0);
		}
	};
	Func1<Struct,String> n_parseJson = nw_parseJson;

	// Init function
	Native h_Native;

	// Init hosts
	final private void init_hosts() {
		h_Native = super.getNativeHost(Native.class);
	}

	// Init code
	final private void init_code() {
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("headList", Struct.class, Object.class);
			n_headList = new Func2<Object,Struct, Object>() {
				final public Object invoke(Struct a0, Object a1) {
					try { return (Object)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("tailList", Struct.class);
			n_tailList = new Func1<Struct,Struct>() {
				final public Struct invoke(Struct a0) {
					try { return (Struct)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("elemIndex", Object[].class, Object.class, Integer.class);
			n_elemIndex = new Func3<Integer,Object[], Object, Integer>() {
				final public Integer invoke(Object[] a0, Object a1, Integer a2) {
					try { return (Integer)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("exists", Object[].class, Func1.class);
			n_exists = new Func2<Boolean,Object[], Func1<Boolean,Object>>() {
				final public Boolean invoke(Object[] a0, Func1<Boolean,Object> a1) {
					try { return (Boolean)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("find", Object[].class, Func1.class);
			n_find = new Func2<Struct,Object[], Func1<Boolean,Object>>() {
				final public Struct invoke(Object[] a0, Func1<Boolean,Object> a1) {
					try { return (Struct)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("fast_max", Object.class, Object.class);
			n_max = new Func2<Object,Object, Object>() {
				final public Object invoke(Object a0, Object a1) {
					try { return (Object)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("fast_lookupTree", Struct.class, Object.class);
			n_lookupTree = new Func2<Struct,Struct, Object>() {
				final public Struct invoke(Struct a0, Object a1) {
					try { return (Struct)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("fast_setTree", Struct.class, Object.class, Object.class);
			n_setTree = new Func3<Struct,Struct, Object, Object>() {
				final public Struct invoke(Struct a0, Object a1, Object a2) {
					try { return (Struct)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("cloneString", String.class);
			n_cloneString = new Func1<String,String>() {
				final public String invoke(String a0) {
					try { return (String)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("getCharAt", String.class, Integer.class);
			n_getCharAt = new Func2<String,String, Integer>() {
				final public String invoke(String a0, Integer a1) {
					try { return (String)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("strContainsAt", String.class, Integer.class, String.class);
			n_strContainsAt = new Func3<Boolean,String, Integer, String>() {
				final public Boolean invoke(String a0, Integer a1, String a2) {
					try { return (Boolean)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("strRangeIndexOf", String.class, String.class, Integer.class, Integer.class);
			n_strRangeIndexOf = new Func4<Integer,String, String, Integer, Integer>() {
				final public Integer invoke(String a0, String a1, Integer a2, Integer a3) {
					try { return (Integer)method.invoke(h_Native, a0, a1, a2, a3); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("strReplace", String.class, String.class, String.class);
			n_strReplace = new Func3<String,String, String, String>() {
				final public String invoke(String a0, String a1, String a2) {
					try { return (String)method.invoke(h_Native, a0, a1, a2); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("bitShl", Integer.class, Integer.class);
			n_bitShl = new Func2<Integer,Integer, Integer>() {
				final public Integer invoke(Integer a0, Integer a1) {
					try { return (Integer)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("bitUshr", Integer.class, Integer.class);
			n_bitUshr = new Func2<Integer,Integer, Integer>() {
				final public Integer invoke(Integer a0, Integer a1) {
					try { return (Integer)method.invoke(h_Native, a0, a1); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		try {
			final java.lang.reflect.Method method = Native.class.getMethod("parseJson", String.class);
			n_parseJson = new Func1<Struct,String>() {
				final public Struct invoke(String a0) {
					try { return (Struct)method.invoke(h_Native, a0); } catch (ReflectiveOperationException e) { throw new RuntimeException(e); }
				}
			};
		} catch (ReflectiveOperationException e) {};
		m_url.init_redirectAdditionalFn();
		m_securitymode.init_loggingEnabled();
		m_securitymode.init_securityModes();
		m_runtime.init_localStorageEnabled();
		m_bits.init_pots2();
		m_peg.init_lastParsing();
		m_peg.init_parseCacheHits();
		m_peg.init_parseCacheMisses();
		m_url_parameter.init_allUrlParameters();
		m_devmode.init_devModeCheckFn();
		m_pegaction.init_defaultPegActions();
		m_pegcode_lib.init_peg_fail_cache_item();
		m_pegcode.init_profilePcs();
		m_lingocode.init_pegOps4Lingo();
		m_lab9.init_parser();
	}
	final private void init() {
		init_hosts();
		init_code();
	}
	protected void main() {
		init();
		m_lab9.f_main();
	}
	public static void main(String[] args) {
		lab9 runner = new lab9(args);
		runner.start(null);
	}
}
