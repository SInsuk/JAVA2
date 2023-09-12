package b_package;
import a_package.Test01;
//import a_package.*; //a_package내의 모든 것 import


public class Test02 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		System.out.println(t1.sum(10, 20));
		
	}

}
