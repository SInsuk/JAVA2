import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//GUI 클래스
class JTFJA01 extends JFrame implements ActionListener{
	//텍스트 필드 객체 선언
	private JTextField input;
	
	//텍스트 ㄹ에어리어 객체 선언.
	private JTextArea output;
	
	//라벨 객체 선언
	private JLabel jl = new JLabel("텍스트를 입력하세요.");
	
	//생성자
	public JTFJA01() {
		//20자 입력가능한 텍스트 필드 객체 생성.
		input = new JTextField(20);
		//10줄 20칸 텍스트 에어리어 객체 생성
		output = new JTextArea(10, 20);
		//텍스트 에어리어는 수정 불가 설정
		output.setEditable(false);
		
		//컨테이너 생성.
		Container ct = getContentPane();
		
		//FlowLayout 생성
		ct.setLayout(new FlowLayout());
		
		//패널 생성.
		JPanel jp = new JPanel();
		
		//패널에 input/output추가
		jp.add(input);
		jp.add(output);
		
		//패널과 레이블을 컨테이너에 추가
		ct.add(jp);
		ct.add(jl);
		
		//컴포넌트에 리스너 등록
		input.addActionListener(this);
		
		//화면에 보이도록	사이즈(500,300)
		setTitle("JTextField와 JTextAreaTest");
		setSize(500, 300);
		
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}
	//이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		if(output.getLineCount() <= output.getRows()) { //텍스트에어리어 크기보다 작을 때 글 내용 추가
			output.append(e.getActionCommand() + "\n");	//output에 글 내용 추가
			input.setText("");	//글 내용 삭제(빈 칸으로)
		}
		else {	//10줄을 넘으면
			jl.setText("입력이 종료되었습니다.");
			input.setEditable(false);	//입력불가
		}
	}
	
}

public class JTFJATest01 {

	public static void main(String[] args) {
		new JTFJA01();
	}

}
