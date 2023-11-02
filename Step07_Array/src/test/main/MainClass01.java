package test.main;

public class MainClass01 {

	public static void main(String[] args) {
		//int type 5개를 저장하고 있는 배열 객체 생성해서 참조값을 nums ㄹ는 지역 변수에 담기
		int[] nums= {10,20,30,40,50};
		//double type 5개를 저장하고 잇는 배열 객체 생성해서 참조값으 nums2 라는 지역 변수에 담아 보세요.
		double [] nums2= {0.5,1.0,1.2,1.5,2.0};
		//boolean type 배열
		boolean [] truth= {true,false,false,true,true};
		//string type 배열
		String [] strs= {"안촐랑","뀰링","애디","빼빼","길동이"};
	
		//배열 객체의 복제본 얻어내기
		int [] result=nums.clone();
		int [] result2=nums;
		
		//배열의 크기 얻어내기
		int size=nums.length;
		//배열은 순서가 없는 데이터 이다. 특정 index 의 item 참조하는 방법
		int first=nums[0];
		int second=nums[1];
		int third=nums[2];
		
	}

}
