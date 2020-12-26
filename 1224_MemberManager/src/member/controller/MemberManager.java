package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.VVip;

public class MemberManager {
	
	public static final int MAX_MEMBER_COUNT = 10;
	private Silver[] silverArr = new Silver[MAX_MEMBER_COUNT];
	private Gold[] goldArr = new Gold[MAX_MEMBER_COUNT];
	private Vip[] vipArr = new Vip[MAX_MEMBER_COUNT];
	private VVip[] vvipArr = new VVip[MAX_MEMBER_COUNT];
	int i = 0;
	int j = 0;
	int k = 0;
	int l = 0;
	
	public void silverInsert (Silver s) {
		s = new Silver(s.getName(), s.getGrade(), s.getPoint());
		silverArr[i++] = s;
	}
	
	public void goldInsert(Gold g) {
		g = new Gold(g.getName(), g.getGrade(), g.getPoint());
		goldArr[j++] = g;
	}
	
	public void vipInsert(Vip v) {
		v = new Vip(v.getName(), v.getGrade(), v.getPoint());
		vipArr[k++] = v;
	}
	
	public void vvipInsert(VVip vv) {
		vv = new VVip(vv.getName(), vv.getGrade(), vv.getPoint());
		vvipArr[l++] = vv;
	}
	
	public void printData() {
		System.out.printf(
		"---------------------------<<회원정보>>---------------------------\n"
		+ "이름\t\t등급\t\t포인트\t\t이자포인트\n"
		+ "--------------------------------------------------------------\n");
		
		for (Silver s : silverArr) {
			if (s != null) {
				System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\n", s.getName(), s.getGrade(), s.getPoint(), s.getEjaPoint());
			}
		}
		
		for (Gold g : goldArr) {
			if (g != null) {
				System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\n", g.getName(), g.getGrade(), g.getPoint(), g.getEjaPoint());
			}
		}
		
		for (Vip v : vipArr) {
			if (v != null) {
				System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\n", v.getName(), v.getGrade(), v.getPoint(), v.getEjaPoint());
			}
		}
		
		for (VVip vv : vvipArr) {
			if (vv != null) {
				System.out.printf("%s\t\t%s\t\t%d\t\t%.2f\n", vv.getName(), vv.getGrade(), vv.getPoint(), vv.getEjaPoint());
			}
		}
	}

}
