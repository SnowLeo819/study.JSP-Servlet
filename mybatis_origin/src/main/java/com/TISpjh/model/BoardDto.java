package com.TISpjh.model;

public class BoardDto {
	private int no;
	private String subject;
	private String name;
	private String email;
	private String password;
	private String regDate;
	private int reGroup;
	private int reLevel;
	private int reStep;
	private int hit;
	private String contents;
	private int num;
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDto(int no, String subject, String name, String email, String password, String regDate, int reGroup,
			int reLevel, int reStep, int hit, String contents, int num) {
		super();
		this.no = no;
		this.subject = subject;
		this.name = name;
		this.email = email;
		this.password = password;
		this.regDate = regDate;
		this.reGroup = reGroup;
		this.reLevel = reLevel;
		this.reStep = reStep;
		this.hit = hit;
		this.contents = contents;
		this.num = num;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getReGroup() {
		return reGroup;
	}

	public void setReGroup(int reGroup) {
		this.reGroup = reGroup;
	}

	public int getReLevel() {
		return reLevel;
	}

	public void setReLevel(int reLevel) {
		this.reLevel = reLevel;
	}

	public int getReStep() {
		return reStep;
	}

	public void setReStep(int reStep) {
		this.reStep = reStep;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", subject=" + subject + ", name=" + name + ", email=" + email + ", password="
				+ password + ", regDate=" + regDate + ", reGroup=" + reGroup + ", reLevel=" + reLevel + ", reStep="
				+ reStep + ", hit=" + hit + ", contents=" + contents + ", num=" + num + "]";
	}
	

}
