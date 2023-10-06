import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//JFrame 상속
class FirstFrame2 extends JFrame{
	public FirstFrame2() {		
		//프레임으로부터 컨테이너(쟁반) 생성
		Container ct = getContentPane();
		
		//버튼 컴포넌트 생성
		JButton jb = new JButton("테스트 버튼2");
		
		//컨테이너에 버튼 추가
		ct.add(jb);
		
		setTitle("두 번째 GUI프로그램");
		
		//프레임 크기
		setSize(400, 300);
				
		//프레임을 화면에 출력
		setVisible(true);
	}
}
public class FrameTest02 {

	public static void main(String[] args) {
		new FirstFrame2();
	}

}
