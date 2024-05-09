
public class Subject {
	private int id;
	private String name;
	private String description;
	private String books;
	
	public Subject(int id, String name, String description, String books) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.books = books;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getBooks() {
		return books;
	}
	
	public void setBooks(String books) {
		this.books = books;
	}
	
	
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", description=" + description + ", books=" + books + "]";
	}
}
