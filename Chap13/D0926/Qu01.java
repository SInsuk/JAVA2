package D0926;

import java.io.FileWriter;
import java.io.IOException;

public class Qu01 {

	public static void main(String[] args) throws IOException {
		String source = "Have a good day. Have a nice day! Hve good? Have fun?";
		
		//문자열 크기의 문자배열 생성
		char intxt[] = new char[source.length()];

		//입력배열을 intxt 문자배열에 저장
		source.getChars(0, source.length(), intxt, 0);
		
		FileWriter fw = new FileWriter("temp.txt");
		fw.write(intxt); //문자 배열의 내용을 파일에 출력
		
		fw.close();
	}

}
