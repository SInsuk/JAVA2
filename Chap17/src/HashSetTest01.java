import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {

	public static void main(String[] args) {
		HashSet<Integer> odd = new HashSet<Integer>();
		HashSet<Integer> even = new HashSet<Integer>();
		
		for(int i=1; i<=10; i=i+2) {
			odd.add(i);
			even.add(i+1);
		}
		
		//셋에 저장된 내용 출력
		System.out.println("odd집합의 내용: " + odd);
		System.out.println("even집합의 내용: " + even);
		
		boolean setChanged = odd.add(5);
		System.out.println("odd에 5추가 성공? " + setChanged);
		//flase -> 중복을 허용하지 않음
	
		setChanged = even.add(5);
		System.out.println("even에 5추가 성공? " + setChanged);
		//true -> even에 5가 없음
		
		System.out.println("odd집합의 내용: " + odd);
		System.out.println("even집합의 내용: " + even);
		
		//최대 최소값 찾기
		System.out.println("odd에서 가장 작은 값: " + Collections.min(odd));
		System.out.println("even에서 가장 큰 값: " + Collections.max(even));
		
		//HashSet에 있는 각 요소를 순차 검색하여 합계 계산
		//순차적으로 만들기 위해 Iterator 사용
		//odd
		Iterator<Integer> odd_it = odd.iterator();
		int sum=0;
		
		//odd에 있는 요소를 순차적으로 검색
		while(odd_it.hasNext()) {
			sum = sum + odd_it.next();
		}
		System.out.println("odd 집합의 합계: " + sum);
		
		//even
		Iterator<Integer> even_it = even.iterator();
		sum=0;
		
		//even에 있는 요소를 순차적으로 검색
		while(even_it.hasNext()) {
			sum = sum + even_it.next();
		}
		System.out.println("odd 집합의 합계: " + sum);
	}

}
