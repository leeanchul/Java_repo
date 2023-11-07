package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.PostDto;

/*
 * 글 목록을 ArrayList 에 담아보세요
 * 
 * 글 하나는
 * 글번호,작성자,제목 으로 이루어져 있다고 가정합니다.
 * 
 * 글 3개의 정보를  ArrayList 에 담고 , 반복문 돌면서 담긴 내용을 출력해 보세요.
 * 
 * 글 하나를 담을 dto 클래스를 알아서 만들어 보세요(클래스명 ,필드명)
 */
public class QuizMain2 {
	public static void main(String[] args) {
		List<PostDto> pdto=new ArrayList<>();
		
		PostDto p1=new PostDto(1,"안촐랑","html");
		PostDto p2=new PostDto(2,"다짱","js");
		PostDto p3=new PostDto(3,"빼빼","java");
		
		pdto.add(p1);
		pdto.add(p2);
		pdto.add(p3);
		
		for(PostDto tmp:pdto) {
			String result=String.format("글번호: %d ,작성자:%s ,제목:%s", tmp.getNum(),tmp.getName(),tmp.getTitle());
			System.out.println(result);
		}
		
		
	}
}
