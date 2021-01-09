// HASH COLLISIONS: YES
// timestamp: 1.603100795E12

package lab9;

import com.area9innovation.flow.*;

@SuppressWarnings("unchecked")
final class Module_json {
	final lab9 runtime;
	Module_json(lab9 runtime) {
		this.runtime = runtime;
	}
	Struct nf_parseJson(String ajson) {
		final Struct_Pair l0_v = f_doParseJson(ajson, runtime.h_Native.strlen(ajson), 0);
		return ((Struct)l0_v.f_first);
	}
	Struct_Pair f_doParseJson(String ajson, int ajsonLength, int astart) {
	 TAIL_CALL: for(;;) {
		final int l0_charCode = runtime.h_Native.getCharCodeAt(ajson, astart);
		if (((((l0_charCode==32)||(l0_charCode==9))||(l0_charCode==10))||(l0_charCode==13))) {
			{
				final int l1___tmp = (astart+1);
				astart = l1___tmp;
				continue TAIL_CALL;
			}
		} else {
			if ((l0_charCode==91)) {
				final Struct_Pair l2_v = f_parseJsonArray2(ajson, ajsonLength, (astart+1), runtime.m_list.f_makeList());
				return (new Struct_Pair((new Struct_JsonArray(((Object[])l2_v.f_first))), l2_v.f_second));
			} else {
				if ((l0_charCode==123)) {
					final Struct_Pair l3_v = f_parseJsonObject2(ajson, ajsonLength, (astart+1), runtime.m_list.f_makeList());
					return (new Struct_Pair((new Struct_JsonObject(((Object[])l3_v.f_first))), l3_v.f_second));
				} else {
					if ((l0_charCode==34)) {
						final Struct_Pair l4_v = runtime.m_deserialize_string.f_deserializeRestOfString2(ajson, (astart+1));
						return (new Struct_Pair((new Struct_JsonString(((String)l4_v.f_first))), l4_v.f_second));
					} else {
						if (((l0_charCode==110)&&(runtime.h_Native.substring(ajson, astart, 4)).equals("null"))) {
							return (new Struct_Pair(SingletonStructs.str_JsonNull, (astart+4)));
						} else {
							if (((l0_charCode==116)&&(runtime.h_Native.substring(ajson, astart, 4)).equals("true"))) {
								return (new Struct_Pair((new Struct_JsonBool(true)), (astart+4)));
							} else {
								if (((l0_charCode==102)&&(runtime.h_Native.substring(ajson, astart, 5)).equals("false"))) {
									return (new Struct_Pair((new Struct_JsonBool(false)), (astart+5)));
								} else {
									return f_parseJsonDouble2(ajson, ajsonLength, astart);
								}
							}
						}
					}
				}
			}
		}
	 }
	}
	Struct f_findObjectByName(Object[] aobjects, String akey, boolean aignoreCase, Struct adefaultValue) {
		String l0_key2;
		if (aignoreCase) {
			l0_key2=runtime.h_Native.toLowerCase(akey);
		} else {
			l0_key2=akey;
		}
		final boolean l3_ignoreCase = aignoreCase;
		final String l4_key2 = l0_key2;
		final Func1<Boolean,Struct_Pair> l2_$1 = new Func1<Boolean,Struct_Pair>() {
			final public Boolean invoke(final Struct_Pair ao) {
				String l0_k;
				if (l3_ignoreCase) {
					l0_k=runtime.h_Native.toLowerCase(((String)ao.f_first));
				} else {
					l0_k=((String)ao.f_first);
				}
				return (l0_k).equals(l4_key2);
			}
		};
		return ((Struct)((Struct_Pair)runtime.m_array.f_findDef(aobjects, ((Func1<Boolean,Object>)(Func1)l2_$1), (new Struct_Pair(l0_key2, adefaultValue)))).f_second);
	}
	Struct f_getJsonFieldValue(Struct ajson, String afield, Struct adef) {
		final Object[] l0_objects = f_getJsonObjectValue(ajson, (new Object[] { (new Struct_Pair(afield, adef)) }));
		return f_findObjectByName(l0_objects, afield, false, adef);
	}
	Object[] f_getJsonObjectValue(Struct ajson, Object[] adef) {
		Struct l0__tmp = ajson;
		switch (l0__tmp.getTypeId()) {
		case 34/*JsonObject*/: {
			final Struct_JsonObject l1__tmp = (Struct_JsonObject)l0__tmp;
			final Object[] l2_members = l1__tmp.f_members;
			final Object[] l3_members = l1__tmp.f_members;
			return l3_members;
		}
		default: {
			return adef;
		}
		}
	}
	String f_getJsonStringField(Struct ajson, String afield, String adef) {
		return f_getJsonStringValue(f_getJsonFieldValue(ajson, afield, (new Struct_JsonString(adef))), adef);
	}
	String f_getJsonStringValue(Struct ajson, String adef) {
		Struct l0__tmp = ajson;
		switch (l0__tmp.getTypeId()) {
		case 35/*JsonString*/: {
			final Struct_JsonString l1__tmp = (Struct_JsonString)l0__tmp;
			final String l2_s = l1__tmp.f_s;
			final String l3_s = l1__tmp.f_s;
			return l3_s;
		}
		case 30/*JsonDouble*/: {
			final Struct_JsonDouble l1__tmp = (Struct_JsonDouble)l0__tmp;
			final double l4_d = l1__tmp.f_value;
			final double l5_d = l1__tmp.f_value;
			return runtime.m_string.f_d2s(l5_d);
		}
		default: {
			return adef;
		}
		}
	}
	Struct_Pair f_parseId(String as, int al, int astart) {
		final String l2_s = as;
		final Func1<Boolean,Integer> l1_$0 = new Func1<Boolean,Integer>() {
			final public Boolean invoke(final Integer ai) {
				return (runtime.h_Native.getCharCodeAt(l2_s, ((int)ai))==58);
			}
		};
		final int l3_end = runtime.m_runtime.f_countUntil(astart, al, l1_$0);
		return (new Struct_Pair(runtime.n_cloneString.invoke(runtime.m_string.f_trim(runtime.h_Native.substring(as, astart, (l3_end-astart)))), l3_end));
	}
	Struct f_parseJson(String ajson) {
		final Struct_Pair l0_v = f_doParseJson(ajson, runtime.h_Native.strlen(ajson), 0);
		return ((Struct)l0_v.f_first);
	}
	Struct_Pair f_parseJsonArray2(String ajson, int ajsonLength, int astart, Struct aacc) {
	 TAIL_CALL: for(;;) {
		final int l0_head = f_skipJson2(ajson, ajsonLength, astart, ",");
		if (((l0_head>=ajsonLength)||(runtime.h_Native.getCharCodeAt(ajson, l0_head)==93))) {
			return (new Struct_Pair(runtime.h_Native.list2array(aacc), (l0_head+1)));
		} else {
			final Struct_Pair l1_value = f_doParseJson(ajson, ajsonLength, l0_head);
			if ((((int)l1_value.f_second)==astart)) {
				return (new Struct_Pair(runtime.h_Native.list2array(aacc), l1_value.f_second));
			} else {
				{
					final int l2___tmp = ((int)l1_value.f_second);
					final Struct l3___tmp = (new Struct_Cons(l1_value.f_first, aacc));
					astart = l2___tmp;
					aacc = l3___tmp;
					continue TAIL_CALL;
				}
			}
		}
	 }
	}
	Struct_Pair f_parseJsonDouble2(String as, int astringLength, int astart) {
		final String l2_s = as;
		final Func1<Boolean,Integer> l1_$0 = new Func1<Boolean,Integer>() {
			final public Boolean invoke(final Integer ai) {
				final int l0_c = runtime.h_Native.getCharCodeAt(l2_s, ((int)ai));
				return ((Boolean)!(((((((48<=l0_c)&&(l0_c<=57))||(l0_c==46))||(l0_c==45))||(l0_c==101))||(l0_c==69))||(l0_c==43)));
			}
		};
		final int l3_end = runtime.m_runtime.f_countUntil(astart, astringLength, l1_$0);
		return (new Struct_Pair((new Struct_JsonDouble(runtime.m_math.f_s2d(runtime.h_Native.substring(as, astart, (l3_end-astart))))), l3_end));
	}
	Struct_Pair f_parseJsonObject2(String ajson, int ajsonLength, int astart, Struct aacc) {
	 TAIL_CALL: for(;;) {
		final int l0_head = f_skipJson2(ajson, ajsonLength, astart, ",");
		final int l1_charCode = runtime.h_Native.getCharCodeAt(ajson, l0_head);
		if (((l0_head>=ajsonLength)||(l1_charCode==125))) {
			return (new Struct_Pair(runtime.h_Native.list2array(aacc), (l0_head+1)));
		} else {
			Struct_Pair l2_key;
			if ((l1_charCode==34)) {
				l2_key=runtime.m_deserialize_string.f_deserializeRestOfString2(ajson, (l0_head+1));
			} else {
				l2_key=f_parseId(ajson, ajsonLength, l0_head);
			}
			final int l3_afterColon = f_skipJson2(ajson, ajsonLength, ((int)l2_key.f_second), ":");
			final Struct_Pair l4_value = f_doParseJson(ajson, ajsonLength, l3_afterColon);
			{
				final int l5___tmp = ((int)l4_value.f_second);
				final Struct l6___tmp = (new Struct_Cons((new Struct_Pair(l2_key.f_first, l4_value.f_first)), aacc));
				astart = l5___tmp;
				aacc = l6___tmp;
				continue TAIL_CALL;
			}
		}
	 }
	}
	int f_skipJson2(String ajson, int ajsonLength, int astart, String achar) {
	 TAIL_CALL: for(;;) {
		if ((astart>=ajsonLength)) {
			return astart;
		} else {
			final int l0_headCharCode = runtime.h_Native.getCharCodeAt(ajson, astart);
			if ((((((runtime.h_Native.fromCharCode(l0_headCharCode)).equals(achar)||(l0_headCharCode==32))||(l0_headCharCode==9))||(l0_headCharCode==10))||(l0_headCharCode==13))) {
				{
					final int l1___tmp = (astart+1);
					astart = l1___tmp;
					continue TAIL_CALL;
				}
			} else {
				return astart;
			}
		}
	 }
	}
}
