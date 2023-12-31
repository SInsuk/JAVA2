/*
 *  작성일 : 2023.09.22
 *  작성자 : 컴소부 202095049 송인석
 *   설명 : 파일에 저장된 내용 가져오기.(출력)
 */
package D0922;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest01 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		try {
			System.out.print("읽을 파일을 입력하세요: ");
			String sfile = stdin.next();	//문자열로 입력한 파일명 저장
			
			//읽어들일 파일명으로 객체 생성
			FileReader fr = new FileReader(sfile);
			//한 문자씩 읽기
			int i;
			while((i = fr.read()) != -1) { //데이터를 모두 읽으면 -1을 반환시켜 종료.
				System.out.print((char)i);
			}
			fr.close(); //스트림 닫기
			
		} catch (FileNotFoundException e) { //예외 처리는 필수
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("읽어들일 파일이 없습니다.");
		}

		
	}

}
