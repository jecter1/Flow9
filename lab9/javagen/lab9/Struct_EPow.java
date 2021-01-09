// HASH COLLISIONS: YES
// timestamp: 1.610214215052E12

package lab9;

import com.area9innovation.flow.*;

public class Struct_EPow extends Struct {
	public Struct f_base;
	public Struct f_expnt;

	public Struct_EPow() {}
	public Struct_EPow(Struct a_base, Struct a_expnt) {
		f_base = a_base;
		f_expnt = a_expnt;
	}

	public int getTypeId() { return 18; }
	public String getTypeName() { return "EPow"; }

	private static final String[] field_names = new String[] {
		"base", "expnt"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_base, f_expnt
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in EPow");
		f_base = (Struct)values[0];
		f_expnt = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 18) return 18-tmp;
		Struct_EPow other = (Struct_EPow)other_gen;
		tmp = f_base.compareTo(other.f_base);
		if (tmp != 0) return tmp;
		tmp = f_expnt.compareTo(other.f_expnt);
		return tmp;
	}
}
