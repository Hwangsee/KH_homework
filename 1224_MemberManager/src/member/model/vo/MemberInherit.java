package member.model.vo;

public class MemberInherit {
	private String name;
	private String grade;
	private int Point;
	
	public MemberInherit() {
		super();
	}

	public MemberInherit(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		Point = point;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getPoint() {
		return Point;
	}

	public void setPoint(int point) {
		Point = point;
	}
	
	public double getEjaPoint() {
		return Point;
	}
	
}
