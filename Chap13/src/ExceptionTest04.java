import java.io.FileReader;
public class ExceptionTest04 {

	public static void main(String[] args) {
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -2) {
			System.out.println((char)i);
		}
		file.close();
	}

}
