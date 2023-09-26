package D0922;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02_1 {

	public static void main(String[] args){
		//파일 객체 생성
		try {
			File file = new File("c.txt");
			
			//FileReader 객체 생성
			FileInputStream fr = new FileInputStream(file);
			
			int i;
			while((i = fr.read()) != -1) { //데이터를 모두 읽으면 -1을 반환시켜 종료.
				System.out.println(i);
			}
			fr.close();
			
			System.out.println("파일로부터 바이트를 읽어 화면에 출력.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
