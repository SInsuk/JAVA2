import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel result = new JLabel();
	//체크박스 선언
	JCheckBox[] jc = new JCheckBox[5];
	String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "패러글라이딩"};
	//라디오버튼 선언
	JRadioButton[] jr = new JRadioButton[5];
	String[] age = {"20대", "30대", "40대", "50대", "60대"};
	
	public JRadioButton1() {		
		//컨테이너 생성
		Container ct = getContentPane();
		
		//배치 관리자 생성
		ct.setLayout(new GridLayout(4,1));
		
		//판넬 생성
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		//레이블 생성
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		
		//판넬에 레이블 추가
		jp1.add(jl1);
		jp2.add(jl2);
		jp3.add(result);
		
		//나이를 나타내는 라디오 버튼을 버튼 그룹으로 설정
		ButtonGroup bg = new ButtonGroup();
		
		for(int i=0; i<5; i++) {
			//취미를 나타내는 체크박스 객체를 배열로 생성.
			jc[i] = new JCheckBox(hobby[i]);
			//나이를 나타내는 라디오 버튼 객체를 배열로 생성
			jr[i] = new JRadioButton(age[i]);
			
			jp1.add(jc[i]);	//취미판넬 jp1에 객체추가
			jp2.add(jr[i]);	//나이판넬 jp2에 객체추가
			
			bg.add(jr[i]);	//버튼 그룹에 객체 추가
			
			//3.이벤트를 받아들일 각 컴포넌트에 리스너를 등록
			jr[i].addActionListener(this);	//라디오버튼 배열 객체에 리스너 등록
			
		}
		
		
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		//화면에 보이도록
		setTitle("JRdioButton Test1");
		setSize(500, 300);
		
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);	
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String s = "당신의 취미: ";
		for(int i=0; i<5; i++) {
			if(jc[i].isSelected() == true)
				s=s+hobby[i]+" ";
		}
		s=s+"당신의 나이: ";
		result.setText(s+ae.getActionCommand());
	}
	
}

public class JRadioButtonTest1 {

	public static void main(String[] args) {
		new JRadioButton1();

	}

}
