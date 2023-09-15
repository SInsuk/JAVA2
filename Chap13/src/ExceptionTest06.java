import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ExceptionTest06 {

	public static void main(String[] args) throws FileNotFoundException,IOException /*Exception*/{
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -2) {
			System.out.println((char)i);
		}
		file.close();
	}

}
