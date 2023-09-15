public class D_0915_qu {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("JAVA");
		StringBuffer sb2 = new StringBuffer("easy");
		System.out.println(sb1.append("korea")); //korea를 문자열 끝에 첨부
		System.out.println(sb2.append(sb1));	//sb1을 문자열 끝에 첨부
		System.out.println(sb1);	//위에서 korea가 첨부된 sb1을 출력
		System.out.println(sb2);	//위에서 sb1이 첨부된 sb2를 출력
		System.out.println(sb2.substring(5,9));	//5번부터 9번사이의 문자열을 반환(start num, end num)
		System.out.println(sb2.delete(5, 10)); 	//5번부터 6의 문자열 삭제(start num, end num)
		System.out.println(sb2);
		System.out.println(sb1.reverse());	//문자열 역순 출력

	}

}
