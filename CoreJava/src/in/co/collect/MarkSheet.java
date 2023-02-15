package in.co.collect;

public class MarkSheet {
	String Roll;
	String Name;
	int Physic;
	int Chemistry;
	int maths;

	public MarkSheet(String roll, String name, int physic, int chemistry, int maths) {

		this.Roll = roll;
		this.Name = name;
		this.Physic = physic;
		this.Chemistry = chemistry;
		this.maths = maths;
	}

//	public void setRoll(String roll) {
//		Roll = roll;
//	}

//	public void setName(String name) {
//		Name = name;
//	}

//	public void setPhysic(int physic) {
//		Physic = physic;
//	}

//	public void setChemistry(int chemistry) {
//		Chemistry = chemistry;
//	}

//	public void setMaths(int maths) {
//		this.maths = maths;
//	}

	public String getRoll() {
		return Roll;
	}

	public String getName() {
		return Name;
	}

	public int getPhysic() {
		return Physic;
	}

	public int getChemistry() {
		return Chemistry;
	}

	public int getMaths() {
		return maths;
	}

}
