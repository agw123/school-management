
public class StudentClass {
	
	private Student student;
	private GradeClass gradeClass;
	
	
	public StudentClass(Student student, GradeClass gradeClass) {
		super();
		this.student = student;
		this.gradeClass = gradeClass;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public GradeClass getGradeClass() {
		return gradeClass;
	}


	public void setGradeClass(GradeClass gradeClass) {
		this.gradeClass = gradeClass;
	}


	@Override
	public String toString() {
		return "StudentClass [student=" + student + ", gradeClass=" + gradeClass + "]";
	}
	
}
