// HASH COLLISIONS: YES
// timestamp: 1.610214206E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_lab9 {
	final lab9 runtime;
	Module_lab9(lab9 runtime) {
		this.runtime = runtime;
	}
	public Object[] g_parser;
	public void init_parser() {
		g_parser=runtime.m_driver.f_compilePegGrammar("exp = const | mul | add | sub | div | pow | var;\nws = (' ' | '\\t' | '\\n')*;\n\nletter = ('a' - 'z') | ('A' - 'Z');\npermch = letter | '_' | ('0' - '9');\nvar = (letter permch*)$str {Variable($str)};\n\nconst = ('0' - '9')+$str {Rat(s2i($str), 1)};\n\nmul = ws '(' ws exp:left ws '*' ws exp:right ws ')' ws {EMul(:left, :right)};\nadd = ws '(' ws exp:left ws '+' ws exp:right ws ')' ws {EAdd(:left, :right)};\nsub = ws '(' ws exp:left ws '-' ws exp:right ws ')' ws {ESub(:left, :right)};\ndiv = ws '(' ws exp:left ws '/' ws exp:right ws ')' ws {EDiv(:left, :right)};\npow = ws '(' ws exp:base ws '^' ws exp:expnt ws ')' ws {EPow(:base, :expnt)};");
	}
	Struct f_calc(Struct aexpr, Struct avariables) {
		Struct l0__tmp = aexpr;
		switch (l0__tmp.getTypeId()) {
		case 96/*Rat*/: {
			final Struct_Rat l1__tmp = (Struct_Rat)l0__tmp;
			return l1__tmp;
		}
		case 40/*NaN*/: {
			return aexpr;
		}
		case 109/*Variable*/: {
			final Struct_Variable l1__tmp = (Struct_Variable)l0__tmp;
			final String l2_name = l1__tmp.f_name;
			final String l3_name = l1__tmp.f_name;
			return ((Struct)runtime.m_tree.f_lookupTreeDef(avariables, l3_name, SingletonStructs.str_NaN));
		}
		case 17/*EMul*/: {
			final Struct_EMul l1__tmp = (Struct_EMul)l0__tmp;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final Struct l6_left = l1__tmp.f_left;
			final Struct l7_right = l1__tmp.f_right;
			return f_calcFunc2args(l6_left, l7_right, runtime.gfw_cMul, avariables);
		}
		case 15/*EAdd*/: {
			final Struct_EAdd l1__tmp = (Struct_EAdd)l0__tmp;
			final Struct l8_left = l1__tmp.f_left;
			final Struct l9_right = l1__tmp.f_right;
			final Struct l10_left = l1__tmp.f_left;
			final Struct l11_right = l1__tmp.f_right;
			return f_calcFunc2args(l10_left, l11_right, runtime.gfw_cAdd, avariables);
		}
		case 19/*ESub*/: {
			final Struct_ESub l1__tmp = (Struct_ESub)l0__tmp;
			final Struct l12_left = l1__tmp.f_left;
			final Struct l13_right = l1__tmp.f_right;
			final Struct l14_left = l1__tmp.f_left;
			final Struct l15_right = l1__tmp.f_right;
			return f_calcFunc2args(l14_left, l15_right, runtime.gfw_cSub, avariables);
		}
		case 16/*EDiv*/: {
			final Struct_EDiv l1__tmp = (Struct_EDiv)l0__tmp;
			final Struct l16_left = l1__tmp.f_left;
			final Struct l17_right = l1__tmp.f_right;
			final Struct l18_left = l1__tmp.f_left;
			final Struct l19_right = l1__tmp.f_right;
			return f_calcFunc2args(l18_left, l19_right, runtime.gfw_cDiv, avariables);
		}
		case 18/*EPow*/: {
			final Struct_EPow l1__tmp = (Struct_EPow)l0__tmp;
			final Struct l20_left = l1__tmp.f_base;
			final Struct l21_right = l1__tmp.f_expnt;
			final Struct l22_left = l1__tmp.f_base;
			final Struct l23_right = l1__tmp.f_expnt;
			return f_calcFunc2args(l22_left, l23_right, runtime.gfw_cPow, avariables);
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Struct f_calcFunc2args(Struct aleft, Struct aright, Func2<Struct,Struct, Struct> afunc, Struct avariables) {
		final Struct l0_leftCalculated = f_calc(aleft, avariables);
		final Struct l1_rightCalculated = f_calc(aright, avariables);
		return afunc.invoke(l0_leftCalculated, l1_rightCalculated);
	}
	String f_expr2s(Struct aexpr) {
		Struct l0__tmp = aexpr;
		switch (l0__tmp.getTypeId()) {
		case 96/*Rat*/: {
			final Struct_Rat l1__tmp = (Struct_Rat)l0__tmp;
			return runtime.m_const.f_c2s(l1__tmp);
		}
		case 40/*NaN*/: {
			return runtime.m_const.f_c2s(aexpr);
		}
		case 109/*Variable*/: {
			final Struct_Variable l1__tmp = (Struct_Variable)l0__tmp;
			final String l2_name = l1__tmp.f_name;
			final String l3_name = l1__tmp.f_name;
			return l3_name;
		}
		case 17/*EMul*/: {
			final Struct_EMul l1__tmp = (Struct_EMul)l0__tmp;
			final Struct l4_left = l1__tmp.f_left;
			final Struct l5_right = l1__tmp.f_right;
			final Struct l6_left = l1__tmp.f_left;
			final Struct l7_right = l1__tmp.f_right;
			return runtime.m_string.f_concatStrings((new Object[] { "(", f_expr2s(l6_left), "*", f_expr2s(l7_right), ")" }));
		}
		case 15/*EAdd*/: {
			final Struct_EAdd l1__tmp = (Struct_EAdd)l0__tmp;
			final Struct l8_left = l1__tmp.f_left;
			final Struct l9_right = l1__tmp.f_right;
			final Struct l10_left = l1__tmp.f_left;
			final Struct l11_right = l1__tmp.f_right;
			return runtime.m_string.f_concatStrings((new Object[] { "(", f_expr2s(l10_left), "+", f_expr2s(l11_right), ")" }));
		}
		case 19/*ESub*/: {
			final Struct_ESub l1__tmp = (Struct_ESub)l0__tmp;
			final Struct l12_left = l1__tmp.f_left;
			final Struct l13_right = l1__tmp.f_right;
			final Struct l14_left = l1__tmp.f_left;
			final Struct l15_right = l1__tmp.f_right;
			return runtime.m_string.f_concatStrings((new Object[] { "(", f_expr2s(l14_left), "-", f_expr2s(l15_right), ")" }));
		}
		case 16/*EDiv*/: {
			final Struct_EDiv l1__tmp = (Struct_EDiv)l0__tmp;
			final Struct l16_left = l1__tmp.f_left;
			final Struct l17_right = l1__tmp.f_right;
			final Struct l18_left = l1__tmp.f_left;
			final Struct l19_right = l1__tmp.f_right;
			return runtime.m_string.f_concatStrings((new Object[] { "(", f_expr2s(l18_left), "/", f_expr2s(l19_right), ")" }));
		}
		case 18/*EPow*/: {
			final Struct_EPow l1__tmp = (Struct_EPow)l0__tmp;
			final Struct l20_base = l1__tmp.f_base;
			final Struct l21_expnt = l1__tmp.f_expnt;
			final Struct l22_base = l1__tmp.f_base;
			final Struct l23_expnt = l1__tmp.f_expnt;
			return runtime.m_string.f_concatStrings((new Object[] { "(", f_expr2s(l22_base), "^", f_expr2s(l23_expnt), ")" }));
		}
		default:
			throw new RuntimeException("Unexpected struct in switch: "+l0__tmp.getTypeName());
		}
	}
	Object f_main() {
		final Object[] l0_variables = (new Object[] { (new Struct_Pair("x", (new Struct_Rat(3, 1)))), (new Struct_Pair("y", (new Struct_Rat(2, 1)))) });
		final Struct l1_varTree = runtime.m_tree.f_setTreeValues(runtime.m_tree.f_makeTree(), l0_variables);
		final Struct l2_expr1 = f_s2expr("(((x / 6) ^ 3) + (7 / 6))");
		final Struct l3_expr2 = f_s2expr("(((x + y) ^ 2) / (5 / 3))");
		final Struct l4_expr3 = f_s2expr("((x ^ 4) + (((10 - 5) * y) / 3))");
		final Struct l5_expr4 = f_s2expr("((x ^ y) ^ (x + y))");
		f_testExpr(l2_expr1, l1_varTree);
		f_testExpr(l3_expr2, l1_varTree);
		f_testExpr(l4_expr3, l1_varTree);
		return f_testExpr(l5_expr4, l1_varTree);
	}
	Struct f_s2expr(String astr) {
		return ((Struct)runtime.m_driver.f_parsic(g_parser, astr, runtime.m_pegaction.g_defaultPegActions));
	}
	Object f_testExpr(Struct aexpr, Struct avariables) {
		runtime.m_runtime.f_println("====================Test====================");
		runtime.m_runtime.f_println(f_expr2s(aexpr));
		return runtime.m_runtime.f_println(runtime.m_const.f_c2s(f_calc(aexpr, avariables)));
	}
}
