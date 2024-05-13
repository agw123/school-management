
public class TeacherClass {
	private Teacher teacher;
	private GradeClass gradeClass;
	
	public TeacherClass(Teacher teacher, GradeClass gradeClass) {
		this.teacher = teacher;
		this.gradeClass = gradeClass;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public GradeClass getGradeClass() {
		return gradeClass;
	}
	public void setGradeClass(GradeClass gradeClass) {
		this.gradeClass = gradeClass;
	}
	
	@Override
	public String toString() {
		return "TeacherClass [teacher=" + teacher + ", gradeClass=" + gradeClass + "]";
	}
	
}
