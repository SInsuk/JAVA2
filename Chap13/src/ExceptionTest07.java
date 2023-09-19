/*
 * 나이를 입력받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest07 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		try {
			int age = stdin.nextInt();
			System.out.println("나이는" + age + "입니다.");
			
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		}
		
	}

}
