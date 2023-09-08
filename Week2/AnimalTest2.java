package packagew;

abstract class myAnimal2{
	//추상 메소드 : 동물의 소리를 반환하는 메소드
	abstract String sound2();

	//일반 메소드 : 동물의 기본 정보 출력하는 메소드
	static void displayInfo2() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

class myCat2 extends myAnimal2{

	@Override
	String sound2() {
		//재정의
		return "야옹~!";
	}

	//static 메소드는 오버라이딩 불가능하다
	static void displayInfo2() {
		//재정의
		System.out.println("고양이 울음소리 입니다.");
	}
	
}
public class AnimalTest2 {

	public static void main(String[] args) {
		myAnimal2 cat = new myCat2();
		
		cat.displayInfo2();
		System.out.println("고양이 울음소리는: "+cat.sound2());
	}

}
