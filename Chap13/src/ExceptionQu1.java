
public class ExceptionQu1 {

	public static void main(String[] args) {
		int a = 0;
		int b = 2;
		try {
			System.out.print("2/0은: ");
			int div = b/a;
			System.out.println(div);
		}
		catch(RuntimeException e) {
			System.out.println("RuntimeException 예외 발생");
		}
		catch(Exception e) {
			System.out.println("Exception 예외 발생");
		}

	}

}
