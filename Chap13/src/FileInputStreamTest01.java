/*
 *  작성일 : 2023.09.22
 *  작성자 : 컴소부 202095049 송인석
 *   설명 : 바이트 단위로 저장된 파일 불러오기.(출력)
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest01 {

	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("읽을 파일을 입력하세요: ");
		String sfile = stdin.next();	//문자열로 입력한 파일명 저장
		
		//읽어들일 파일명으로 객체 생성.
		FileInputStream fis = new FileInputStream(sfile);
		
		//한 바이트씩 읽기
		int i;
		while((i = fis.read()) != -1) { //데이터를 모두 읽으면 -1을 반환시켜 종료.
			System.out.print((char)i);
		}
		fis.close(); //스트림 닫기
		
		System.out.println(sfile + "파일로부터 바이트 단위로 파일을 읽어 화면에 출력하였습니다.");
	}

}
