import java.util.StringTokenizer;

public class StringTokenTest01 {

	public static void main(String[] args) {
		String s1 = "name SongIS gender M age 23";
		String s2 = "name,SongIS,gender,M,age,23";
		String s3 = "name/SongIS/gender/M/age/23";

		System.out.println(":: 빈칸을 가준으로 분리 ::");
		StringTokenizer st1 = new StringTokenizer(s1);	//빈칸이 디폴트 ," "생략
		while(st1.hasMoreTokens()) {	//토큰이 있으면 true 없으면 false
			String first = st1.nextToken();	//다음 토큰을 기준으로 문자열을 반환
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: 쉼표를 가준으로 분리 ::");
		StringTokenizer st2 = new StringTokenizer(s2, ",");
		while(st2.hasMoreTokens()) {	//토큰이 있으면 true 없으면 false
			String first = st2.nextToken();	//다음 토큰을 기준으로 문자열을 반환
			String second = st2.nextToken();
			System.out.println(first + "\t" + second);
		}

		System.out.println(":: 슬래시(/)를 가준으로 분리 ::");
		StringTokenizer st3 = new StringTokenizer(s3, "/");
		while(st3.hasMoreTokens()) {	//토큰이 있으면 true 없으면 false
			String first = st3.nextToken();	//다음 토큰을 기준으로 문자열을 반환
			String second = st3.nextToken();
			System.out.println(first + "\t" + second);
		}
	}

}
