package com.User;

public class StudentDetail {
	private int Id;
	private String Name;
	private String Email;
	private String Gender;
	private String Course;
	private String Specialization;
	private int Mobile;
	
	public StudentDetail() {
		super();
	}

	public StudentDetail(int Id, String Name, String Email,  String Gender, String Course,
			String Specialization, int Mobile) {
		super();
		this.Id=Id;
		this.Name = Name;
		this.Email = Email;
		this.Gender= Gender;
		this.Course = Course;
		this.Specialization = Specialization;
		this.Mobile = Mobile;
	}
	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	

	public String getGender() {
		return Gender;
	}

	public void setGender(String Gender) {
		this.Gender = Gender;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String Course) {
		this.Course = Course;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String Specialization) {
		this.Specialization = Specialization;
	}

	public int getMobile() {
		return Mobile;
	}

	public void setMobile(int Mobile) {
		this.Mobile = Mobile;
	}
	@Override
	public String toString() {
		return "student [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + ", Course="
				+ Course + ", Specialization=" + Specialization + ", Mobile=" + Mobile + "]";
	}
}
