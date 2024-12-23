package ch05;

public class Student {
	protected String name;
	int grade;
	
	public Student() {
		System.out.println("부모 생성자 메소드...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	public String getStudentInfo() {
		return "이름:"+name+",학년:"+grade;
	}
}
