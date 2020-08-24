package mypkg.bean;

public class Board {
	private String writer;
	private String	subject;
	private String password;
	private String content;
	private int readhit;
	
	/**
	 * String for use date.
	 * java.sql.Date coding is complicated!
	 */
	private String regdate;
	/*
	 * This is instance variable for primary key at SQL boarder table
	 */
	private int no;;
	
	public Board() {}
	public Board(String writer, String subject, String password, String content, int readhit, int no, String regdate) {
		this.writer = writer;
		this.subject = subject;
		this.password = password;
		this.content = content;
		this.readhit = readhit;
		this.no = no;
		this.regdate = regdate;
	}
	@Override
	public String toString() 
	{
		return "BoadDao [writer=" + writer + ", subject=" + subject + ", password=" + password + ", content=" + content
				+ ", readhit=" + readhit + ", no=" + no + ", regdate ="+regdate +"]";
	}
	/**
	 * Getter and setter
	 */
	public String getWriter() {return writer;}
	public void setWriter(String writer) {this.writer = writer;}
	public String getSubject() {return subject;}
	public void setSubject(String subject) {this.subject = subject;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	public String getContent() {return content;}
	public void setContent(String content) {this.content = content;}
	public int getReadhit() {return readhit;}
	public void setReadhit(int readhit) {this.readhit = readhit;}
	public int getNo() {return no;}
	public void setNo(int no) {this.no = no;}
	public String getRegdate() {return regdate;}
	public void setRegdate(String regdate) {this.regdate = regdate;}
}
