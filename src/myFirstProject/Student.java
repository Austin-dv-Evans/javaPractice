package myFirstProject;

public class Student {
	private int studentId = 1;
	private String name = "Austin";
	private double qualifyingExamMarks= 80.0;
	private char residentialStaus = 'H';
	private int yearOfEngg = 3;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQualifyingExamMarks() {
		return qualifyingExamMarks;
	}

	public void setQualifyingExamMarks(double qualifyingExamMarks) {
		this.qualifyingExamMarks = qualifyingExamMarks;
	}

	public char getResidentialStaus() {
		return residentialStaus;
	}

	public void setResidentialStaus(char residentialStaus) {
		this.residentialStaus = residentialStaus;
	}

	public int getYearOfEngg() {
		return yearOfEngg;
	}

	public void setYearOfEngg(int yearOfEngg) {
		this.yearOfEngg = yearOfEngg;
	}
	public static void main (String[] args) {
		Student student1 = new Student();
		int value = student1.getStudentId();
		System.out.println("Studen1's student id is: " + value);
	}
}
