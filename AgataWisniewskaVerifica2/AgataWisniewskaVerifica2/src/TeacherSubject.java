
public class TeacherSubject {
	
	private Teacher teacher;
	private Subject subject;
	
	public TeacherSubject(Teacher teacher, Subject subject) {
		super();
		this.teacher = teacher;
		this.subject = subject;
	}
	
	
	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
}
