/*
 *  작성일 : 2023.09.22
 *  작성자 : 컴소부 202095049 송인석
 *   설명 : 바이트 단위로 파일에 저장.(저장)
 */
package D0922;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest02 {

	public static void main(String[] args)throws IOException {
		//파일명으로 객체 생성
		FileOutputStream fos = new FileOutputStream("c.txt");
		//OutputStream : 바이트 스트림의 입출력을 위한 추상 클래스
		//InputStream : 파일에 바이트 스트림의 입출력 기능 제공
		
		String str = "자바 프로그래밍 \n문자 스트림과 바이트 스트림 \n";
		
		byte[]bt = str.getBytes(); //문자열을 바이트로 변환
		
		fos.write(bt); //파일에 저장
		
		fos.close(); //출력 스트림 닫기.
		System.out.println("파일을 생성하였습니다.");

		
	}

}
