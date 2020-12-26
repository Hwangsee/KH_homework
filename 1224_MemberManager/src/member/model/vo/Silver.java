package member.model.vo;

public class Silver extends MemberInherit {

	public Silver() {
		super();
	}

	public Silver(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return getPoint()*0.02;
	}

	
}
