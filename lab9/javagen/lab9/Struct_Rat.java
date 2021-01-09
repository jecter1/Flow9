// HASH COLLISIONS: YES
// timestamp: 1.610214215085E12

package lab9;

import com.area9innovation.flow.*;

public class Struct_Rat extends Struct {
	public int f_numer;
	public int f_denom;

	public Struct_Rat() {}
	public Struct_Rat(int a_numer, int a_denom) {
		f_numer = a_numer;
		f_denom = a_denom;
	}

	public int getTypeId() { return 96; }
	public String getTypeName() { return "Rat"; }

	private static final String[] field_names = new String[] {
		"numer", "denom"
	};
	private static final RuntimeType[] field_types = new RuntimeType[] {
		RuntimeType.INT, RuntimeType.INT
	};
	public String[] getFieldNames() { return field_names; }
	public RuntimeType[] getFieldTypes() { return field_types; }

	public Object[] getFields() {
		return new Object[] {
			f_numer, f_denom
		};
	}
	@SuppressWarnings("unchecked")
	public void setFields(Object[] values) {
		if (values.length != 2)
			throw new IndexOutOfBoundsException("Invalid field count in Rat");
		f_numer = (Integer)values[0];
		f_denom = (Integer)values[1];
	}

	public int compareTo(Struct other_gen) {
		if (other_gen == this) return 0;
		int tmp = other_gen.getTypeId();
		if (tmp != 96) return 96-tmp;
		Struct_Rat other = (Struct_Rat)other_gen;
		if (f_numer != other.f_numer)
			return (f_numer > other.f_numer) ? 1 : -1;
		if (f_denom != other.f_denom)
			return (f_denom > other.f_denom) ? 1 : -1;
		return 0;
	}
}
