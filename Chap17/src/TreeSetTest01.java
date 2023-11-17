import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetTest01 {

	public static void main(String[] args) {
		//TreeSet 객체 생성
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		TreeSet<Integer> num2 = new TreeSet<Integer>();
		
		for(int i=4; i>=0; i--) {
			num1.add(i);
			num2.add(i*2);
		}
		
		//순서에 상관없이 항상 정렬되어 출력
		System.out.println("num1의 값: " + num1);
		System.out.println("num2의 값: " + num2);
		
		TreeSet<Integer> union = new TreeSet<Integer>(num1);
		TreeSet<Integer> intersection = new TreeSet<Integer>(num1);
		TreeSet<Integer> difference = new TreeSet<Integer>(num1);
		
		union.addAll(num2);	//합집함
		intersection.retainAll(num2);	//교집합
		difference.removeAll(num2);	//차집합
		
		//중복된 값을 출력하지 않는다.
		System.out.println("합집합: " + union);	
		System.out.println("교집합: " + intersection);
		System.out.println("차집합: " + difference);
		
		//LinkedList 객체 생성
		LinkedList<Integer> num3 = new LinkedList<Integer>();
		LinkedList<Integer> num4 = new LinkedList<Integer>();
		
		for(int i=4; i>=0; i--) {
			num3.add(i);
			num4.add(i*2);
		}
		
		//생성된 그대로 출력
		System.out.println("num3의 값: " + num3);
		System.out.println("num4의 값: " + num4);
		
		LinkedList<Integer> union1 = new LinkedList<Integer>(num3);
		LinkedList<Integer> intersection1 = new LinkedList<Integer>(num3);
		LinkedList<Integer> difference1 = new LinkedList<Integer>(num3);
		
		union1.addAll(num4);	//합집함
		intersection1.retainAll(num4);	//교집합
		difference1.removeAll(num4);	//차집합
		
		//중복값을 허용
		System.out.println("합집합: " + union1);	
		System.out.println("교집합: " + intersection1);
		System.out.println("차집합: " + difference1);
		
	}

}
