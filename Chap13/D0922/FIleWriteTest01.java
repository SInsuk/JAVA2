/*
 *  작성일 : 2023.09.22
 *  작성자 : 컴소부 202095049 송인석
 *   설명 : 문자를 파일에 쓰기.(저장)
 */
package D0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FIleWriteTest01 {

	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("저장 파일을 입력하세요: ");
		String sfile = stdin.next();
		
		//파일에 저장할 문자열 생성.
		String source = "동해물과 백두산이 마르고 닳도록 \n" + "하느님이 보우하사 우리나라 만세 \n" + "무궁화 삼천리 화려강산";
	
		//파일명으로 객체 생성.
		FileWriter fw = new FileWriter(sfile);
		
		//문자열을 파일에 출력.
		fw.write(source); //객체를 통한 a.txt파일에 source에 있는 내용을 출력(저장)
		
		//출력 스트림 닫기.
		fw.close();
		System.out.println("파일이 저장되었습니다.");
		
		
	}
}
