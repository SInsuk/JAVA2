import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest01 {

	public static void main(String[] args) {
		//해쉬 맵 객체 생성
		HashMap<String, String> dict = new HashMap<String, String>();
		
		//3개의 (k, v)로 이루어진 값을 dict에 저장
		dict.put("사과", "apple");
		dict.put("포도", "grape");
		dict.put("배", "pear");
		
		//사용자로부터 한글 단어를 입력받아 영어 단어 검색
		Scanner stdin = new Scanner(System.in);
		while(true) {
			System.out.println("알고싶은 과일 이름을 입력하세요.(0은 종료)");
			String kor = stdin.next();
			if(kor.equals("0")) {
				System.out.println("프로그램이 종료 됩니다.");
				break;
				
			}
			
			//해시맵에서 키 kor에 해당하는 값 eng검색
			String eng = dict.get(kor);
			if(eng==null) {
				System.out.println(kor + "는 없는 단어 입니다.");
			}else {
				System.out.println(eng);
			}
		}
	}

}
