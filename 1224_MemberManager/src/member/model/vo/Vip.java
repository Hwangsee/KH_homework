package member.model.vo;

public class Vip extends MemberInherit {

	public Vip() {
		super();
	}

	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	
	@Override
	public double getEjaPoint() {
		return getPoint()*0.1;
	}
}
