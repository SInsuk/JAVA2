import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest01 {

	public static void main(String[] args) {
		//트리맵 객체 생성
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		
		//맵에 요소 추가
		score.put(88, "국어");
		score.put(100, "수학");
		score.put(76, "영어");
		score.put(80, "과학");
		score.put(69, "사회");
		
		//첫 번째 요소를 Map.Entry형으로 생성. <key, value>
		Map.Entry<Integer, String> high_low = score.firstEntry();
		
		//항상 정렬이 되는 첫 번째 값이 가장 낮은 값이다.
		System.out.println("가장 낮은 성적은 " + high_low.getKey() + "점 이며, 과목은 " + high_low.getValue() + "입니다");
		
		//제일 높은 점수를 찾아 출력
		high_low = score.lastEntry();
		System.out.println("가장 높은 성적은 " + high_low.getKey() + "점 이며, 과목은 " + high_low.getValue() + "입니다");

		//학점 출력
		//80점 미만은 C,D에 해당하고 80점 이상은 A,B에 해당한다.
		//맵 객체를 지정하여 제네릭으로 생성
		Map<Integer, String> cd = score.headMap(80);	//80미만의 맵 생성
		Map<Integer, String> ab = score.tailMap(80);
		
		System.out.println("학점 A,B에 해당하는 과목과 점수:" + ab);
		System.out.println("학점 C,D에 해당하는 과목과 점수:" + cd);
		
		System.out.println("잠수 낮은 순으로 출력: " + score);
		System.out.println("점수 높은 순으로 출력: " + score.descendingMap());
	}

}
