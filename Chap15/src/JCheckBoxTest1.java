import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBox1 extends JFrame implements ItemListener{
	//텍스트필드 선언
	private JTextField JTF;
	
	public JCheckBox1() {
		//20자 입력가능한 텍스트 필드 객체 생성.
		JTF = new JTextField(20);
		//텍스트 필드는 수정불가 설정
		JTF.setEditable(false);
		//컨테이너 생성
		Container ct = getContentPane();
		
		//배치 관리자 생성
		ct.setLayout(new FlowLayout());
		
		//체크박스 생성
		JCheckBox CB1 = new JCheckBox("JSP");
		JCheckBox CB2 = new JCheckBox("PHP");
		JCheckBox CB3 = new JCheckBox("ASP");
		JCheckBox CB4 = new JCheckBox("Servlet");
		
		//컴포넌트에 리스너 등록
		CB1.addItemListener(this);
		CB2.addItemListener(this);
		CB3.addItemListener(this);
		CB4.addItemListener(this);
		
		//컨테이너에 체크박스와 텍스트필드 추가
		ct.add(CB1);
		ct.add(CB2);
		ct.add(CB3);
		ct.add(CB4);
		ct.add(JTF);
		
		//화면에 보이도록
		setTitle("JCheckBox Test1");
		setSize(250, 100);
		
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		JTF.setText(((JCheckBox)ie.getItem()).getText());
		
	}
	
}

public class JCheckBoxTest1 {

	public static void main(String[] args) {
		new JCheckBox1();
	}

}
