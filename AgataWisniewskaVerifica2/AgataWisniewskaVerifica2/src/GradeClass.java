
public class GradeClass {
	
	private int level;
	private char section;
	
	public GradeClass(int level, char section) {
		this.level = level;
		this.section = section;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
	@Override
	public String toString() {
		return "GradeClass [level=" + level + ", section=" + section + "]";
	}
	
}
