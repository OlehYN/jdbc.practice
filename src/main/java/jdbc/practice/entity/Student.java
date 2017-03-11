package jdbc.practice.entity;

public class Student {
	private int studentId;
	private String pib;
	private int course;
	
	public Student(){
		
	}
	
	public Student(String pib, int course) {
		super();
		this.pib = pib;
		this.course = course;
	}

	public int getCourse() {
		return course;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	public String getPib() {
		return pib;
	}
	
	public void setPib(String pib) {
		this.pib = pib;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", pib=" + pib + ", course=" + course + "]";
	}
	
}
