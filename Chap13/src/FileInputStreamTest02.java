import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) throws IOException {
		//파일 객체 생성
		File file = new File("c.txt");
		
		//FileReader 객체 생성
		FileReader fr = new FileReader(file);
		
		int i;
		while((i = fr.read()) != -1) { //데이터를 모두 읽으면 -1을 반환시켜 종료.
			System.out.print((char)i);
		}
		fr.close();
	}

}
