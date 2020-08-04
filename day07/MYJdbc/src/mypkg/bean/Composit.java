package mypkg.bean;

public class Composit {

	
	private String id;
	private String name;
	private String subject;
	private String content;
	
	public Composit() {}
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param subject
	 * @param content
	 */
	public Composit(String id, String name, String subject, String content) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Composit [id=" + id + ", name=" + name + ", subject=" + subject + ", content=" + content + "]";
	}

	
	/**
	 * Getter & Setter
	 * @return
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
}
