import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

//GUI생성
class JButton01 extends JFrame{
	public JButton01() {
		//이미지 아이콘 객체 생성
		ImageIcon korea = new ImageIcon("image/korea1.gif");
		ImageIcon usa = new ImageIcon("image/usa.gif");
		ImageIcon germany = new ImageIcon("image/germany.gif");
		
		//버튼 객체 생성
		JButton nat = new JButton(korea);	//기본 버튼 이미지는 태극기
		nat.setPressedIcon(usa);	//버튼이 눌렀을 때 이미지
		nat.setRolloverIcon(germany);	//버튼 위로 마우스가 지나갈 때 나타날 이미지
		
		//컨테이너 생성
		Container ct = getContentPane();
		
		//FlowLayout 배치 관리자 생성
		ct.setLayout(new FlowLayout());
		
		//컨테이너에 버튼 추가
		ct.add(nat);
		
		//화면에 보이기 size(500,400)
		setTitle("JButton Test");
		setSize(500, 400);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);	
	}
}

public class JButtonTest01 {

	public static void main(String[] args) {
		new JButton01();
	}

}
