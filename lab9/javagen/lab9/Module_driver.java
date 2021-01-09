// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_driver {
	final lab9 runtime;
	Module_driver(lab9 runtime) {
		this.runtime = runtime;
	}
	Object[] f_compilePegGrammar(String agr) {
		return ((Object[])f_compilePegGrammar2(agr).f_first);
	}
	Struct_Pair f_compilePegGrammar2(String agr) {
		final Object l0_r = f_parsic(runtime.m_lingocode.g_pegOps4Lingo, agr, runtime.m_pegaction.g_defaultPegActions);
		final Struct_Grammar l1_g = ((Struct_Grammar)l0_r);
		final Struct_Grammar l2_renamed = runtime.m_optimize_grammar.f_optimizeGrammar(runtime.m_rename_bindings.f_renameBindings(runtime.m_peg.f_inlineProductions(runtime.m_peg.f_processNestedSequences(l1_g))));
		final Struct_Pair l3_code = runtime.m_grammar2code.f_grammar2code(l2_renamed);
		return l3_code;
	}
	Object f_parsic(Object[] aop, String atext, Struct_SemanticActions aactions) {
		final Struct_ParseResult l0_result = runtime.m_pegcode.f_runPeg(atext, aop, runtime.m_tree.f_makeTree(), aactions);
		if ((l0_result.f_pos<0)) {
			runtime.m_runtime.f_println((("SYNTAX ERROR <0: \""+runtime.m_string.f_strLeft(atext, 130))+"...\""));
		} else {
			if ((l0_result.f_pos<runtime.h_Native.strlen(atext))) {
				runtime.m_runtime.f_println((("SYNTAX ERROR AT : \""+runtime.h_Native.substring(atext, l0_result.f_pos, 130))+"...\""));
			} else {
			}
		}
		return runtime.m_dynamic.f_flow(runtime.m_maybe.f_either(l0_result.f_result, runtime.m_dynamic.f_flow("PARSING FAILED")));
	}
}
