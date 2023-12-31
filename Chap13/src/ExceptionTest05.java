import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -2) {
				System.out.println((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}

}