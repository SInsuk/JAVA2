
public class ExceptionQu3 {

	public static void parse(String str) {
		float f = 0;
		try {
			f = Float.parseFloat(str);
			} catch(NumberFormatException nfe){
				f=0;
			} finally {
				System.out.println(f);
			}
		}
		public static void main(String[] args) {
			parse("Korea");
		}

	}

