import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//문자열 배열 생성
		String[] name = {"Kim", "Lee", "Park", "Jung", "Oh"};
		
		//문자열의 배열을 이용하여 리스트 객체(제네릭) 생성.
		ArrayList<String> lname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("초기값: " + lname);
		
		//리스트 끝에 "Ha"추가
		lname.add("Ha");
		System.out.println("Ha 추가 후 총 리스트 값: " + lname);
		
		//0번지에 "김" 변경ㄴ
		lname.set(0, "김");
		
		//3번지에 "최" 추가
		lname.add(3, "최");	//인덱스는 자동으로 조정됨.
		System.out.println("김 변경, 최 추가 후 총 리스트 값: " + lname);
		
		//무작위 재배치 -> Collections 클래스의 메소드 이용
		Collections.shuffle(lname);
		System.out.println("shuffle() 메소드 적용 후 리스트 값: " + lname);
		
		//정렬 -> sort()
		Collections.sort(lname);
		System.out.println("sort() 메소드 적용 후 리스트 값: " + lname);
		
		//5번째 값 출력
		System.out.println("5번째 값: " + lname.get(4));
		
		//리스트의 모든 요소를 "김"으로 채우기 -> fill()
		Collections.fill(lname, "김");
		System.out.println("fill() 메소드 적용 후 리스트 값: " + lname);
	}

}