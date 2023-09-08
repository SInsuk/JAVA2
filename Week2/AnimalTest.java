package packagew;

abstract class myAnimal{
	//추상 메소드 : 동물의 소리를 반환하는 메소드
	abstract String sound();

	//일반 메소드 : 동물의 기본 정보 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

class myCat extends myAnimal{

	@Override
	String sound() {
		//재정의
		return "야옹~!";
	}

	@Override
	void displayInfo() {
		System.out.println("고양이 울음소리 입니다.");
	}
	
}
public class AnimalTest {

	public static void main(String[] args) {
		myAnimal cat = new myCat();
		
		cat.displayInfo();
		System.out.println("고양이 울음소리는: "+cat.sound());
	}

}
