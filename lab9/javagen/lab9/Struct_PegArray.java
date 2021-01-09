// HASH COLLISIONS: YES
// timestamp: 1.610214215066E12

package lab9;

import com.area9innovation.flow.*;

public class Struct_PegArray extends Struct {
	public Struct f_c;

	public Struct_PegArray() {}
	public Struct_PegArray(Struct a_c) {
		f_c = a_c;
	}

	public int getTypeId() { return 51; }
	public String getTypeName() { return "PegArray"; }

	private static final String[] field_names = new String[] {
		"c"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_c
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 1)
			throw new IndexOutOfBoundsException("Invalid field count in PegArray");
		f_c = (Struct)values[0];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 51) return 51-tmp;
		Struct_PegArray other = (Struct_PegArray)other_gen;
		tmp = f_c.compareTo(other.f_c);
		return tmp;
	}
}
