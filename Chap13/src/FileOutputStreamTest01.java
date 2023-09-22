/*
 *  작성일 : 2023.09.22
 *  작성자 : 컴소부 202095049 송인석
 *   설명 : 바이트 단위로 파일에 저장.(저장)
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest01 {

	public static void main(String[] args)throws IOException {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("저장 파일을 입력하세요: ");
		String sfile = stdin.next();
		
		//파일명으로 객체 생성
		FileOutputStream fos = new FileOutputStream(sfile);
		
		int i;
		for(i=1; i<=260; i++) {
			fos.write(i); //파일에 내용 쓰기.(저장)
		}
		
		fos.close(); //출력 스트림 닫기.
		System.out.println(sfile + "파일명으로 바이트 파일을 생성하였습니다.");

		
	}

}
