
public class School {
	public static void main(String[] args) {
		PenAdapter pa = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		//aw.setP(p);//not possible since we dont have pen obj
		aw.writeAssignment("I'm tired to write this assignment");
	}
}
