import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JButton02 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton02() {
		//텍스트 객체 생성
		jtf = new JTextField(10);
		
		//이미지 객체 생성
		ImageIcon apple = new ImageIcon("image\\apple.jpg");
		ImageIcon banana = new ImageIcon("image\\banana.jpg");
		ImageIcon persimmom = new ImageIcon("image\\persimmom.jpg");
		ImageIcon pear = new ImageIcon("image\\pear.jpg");
		ImageIcon grape = new ImageIcon("image\\grape.jpg");
		
		//버튼 객체 생성
		JButton bt1 = new JButton("사과", apple);
		JButton bt2 = new JButton("바나나", banana);
		JButton bt3 = new JButton("감", persimmom);
		JButton bt4 = new JButton("배", pear);
		JButton bt5 = new JButton("포도", grape);
		
		//컨테이너 생성
		Container ct = getContentPane();
		
		//배치 관리자 생성 - GridLayout
		ct.setLayout(new GridLayout(3, 2));
		
		//컨테이너에 버튼추가
		ct.add(bt1);
		ct.add(bt2);
		ct.add(bt3);
		ct.add(bt4);
		ct.add(bt5);
		ct.add(jtf);
		
		////버튼에 리스너 등록
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		
		//화면에 보이기
		setTitle("JButton Test2");
		setSize(250, 300);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
		
	}
	
}

public class JButtonTest02 {

	public static void main(String[] args) {
		new JButton02();
	}

}
