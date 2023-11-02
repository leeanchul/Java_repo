package test.main;

import test.mypac.Gold;
import test.mypac.Lol;
import test.mypac.Challenger;

public class testlol {
	public static void main(String[] args) {
		Lol kor=new Lol("브론즈");
		
		System.out.println("--일반 랭크 달성--");
		kor.box();
		kor.margin();
		kor.Reword();
		System.out.println("--골드 달성--");
		Gold kor2=new Gold("골드");
		
		kor2.box();
		kor2.margin();
		kor2.Reword();
		kor2.skin();
		
		Challenger c1=new Challenger("안촐랑");
		
		System.out.println("--첼린저 달성--");
		c1.box();
		c1.margin();
		c1.Reword();
		c1.skin();
		c1.Propsal();
		System.out.println("-----------");
		
		Lol i=new Challenger("아이언");
		i.box();
		i.margin();
		i.Reword();
		//((Gold)i).skin();
		((Challenger)i).Propsal();
		
	}
}
