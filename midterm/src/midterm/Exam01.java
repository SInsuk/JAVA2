package midterm;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class Exam1 extends JFrame{
	private JTextArea TA;
	
	public Exam1() {
		//프레임으로부터 컨테이너 생성
		Container ct = getContentPane();
		//컨테이너 배치 관리자 생성
		ct.setLayout(new GridLayout(2, 1));
		
		//판넬1 객체 생성
		JPanel jp1 = new JPanel();
		//판넬1 그리드 레이아웃 배치관리자 작성
		jp1.setLayout(new GridLayout(2, 1));
		
		//텍스트필드 생성
		TA = new JTextArea("mbit를 선택하면 유형별 별명과 특징을 알려드립니다.");
		//텍스트 필드는 수정 불가 설정
		TA.setEditable(false);
		
		//판넬1에 label, 텍스트필드 추가
		jp1.add(new JLabel("당신의 mbti는 무엇인가요?"));
		jp1.add(TA);
		
		//판넬2 객체 생성
		JPanel jp2 = new JPanel();
		//판넬2에 그리드 레이아웃 배치관리자 작성
		jp2.setLayout(new GridLayout(4, 4));
		
		//16개 버튼 컴포넌트를 생성하여 컨테이너에 추가
		for(int i = 1; i <= 16; i++) 
			jp2.add(new JButton("MBTI" + i));
		
		//컨테이너에 판넬 추가
		ct.add(jp1);
		ct.add(jp2);
		
		//화면에 보이기
		setTitle("MBTI - 송인석");
		setSize(500, 500);
		
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}
}

public class Exam01 {

	public static void main(String[] args) {
		new Exam1();
	}

}