package member.model.vo;

public class VVip extends MemberInherit {

	public VVip() {
		super();
	}

	public VVip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return getPoint()*0.15;
	}
}
