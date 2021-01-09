// HASH COLLISIONS: YES
// timestamp: 1.610214215053E12

package lab9;

import com.area9innovation.flow.*;

public class Struct_ESub extends Struct {
	public Struct f_left;
	public Struct f_right;

	public Struct_ESub() {}
	public Struct_ESub(Struct a_left, Struct a_right) {
		f_left = a_left;
		f_right = a_right;
	}

	public int getTypeId() { return 19; }
	public String getTypeName() { return "ESub"; }

	private static final String[] field_names = new String[] {
		"left", "right"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.STRUCT, RuntimeType.STRUCT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_left, f_right
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in ESub");
		f_left = (Struct)values[0];
		f_right = (Struct)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 19) return 19-tmp;
		Struct_ESub other = (Struct_ESub)other_gen;
		tmp = f_left.compareTo(other.f_left);
		if (tmp != 0) return tmp;
		tmp = f_right.compareTo(other.f_right);
		return tmp;
	}
}
