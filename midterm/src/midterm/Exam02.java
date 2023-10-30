package midterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Exam2 extends JFrame{
	//객체 선언
	private JTextField input;
	private JTextArea output;
	
	public Exam2() {
		//프레임으로부터 컨테이너 생성
		Container ct = getContentPane();
		//컨테이너 배치 관리자 생성
		ct.setLayout(new GridLayout(5, 1));
		
		//판넬1 객체 생성
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2, 1));
		
		//20자 입력가능한 텍스트 필드 객체 생성.
		input = new JTextField(20);
		
		//판넬1에 레이블과 텍스트필드추가
		jp1.add(new JLabel("길이를 입력하고, 도형의 버튼을 클릭하세요"));
		jp1.add(input);
		
		//판넬2 객체 생성
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		
		//버튼생성
		JButton bt1 = new JButton("원");
		JButton bt2 = new JButton("삼각형");
		JButton bt3 = new JButton("사각형");
		JButton bt4 = new JButton("리셋");
		
		//판넬2에 버튼을 추가
		jp2.add(bt1);
		jp2.add(bt2);
		jp2.add(bt3);
		jp2.add(bt4);
		
		//판넬3 객체 생성
		JPanel jp3 = new JPanel();
		jp3.setLayout(new GridLayout(2, 1));
		
		//텍스트 에어리어 생성
		output = new JTextArea();
		output.setEditable(false);
		
		//판넬3에 label과 텍스트 에어리어 추가
		jp3.add(new JLabel("결과"));
		jp3.add(output);
		
		//컨테이너에 판넬 추가
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		//컴포넌트에 리스너 등록
		bt1.addActionListener(new ActionEvent1(input, output, "원"));
        bt2.addActionListener(new ActionEvent1(input, output, "삼각형"));
        bt3.addActionListener(new ActionEvent1(input, output, "사각형"));
        bt4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");  // 리셋 버튼 클릭 시 입력 필드 초기화
                output.setText(""); // 결과 텍스트 에어리어 초기화
            }
        });
		
		//화면에 보이기
		setTitle("도형의 넓이 구하기 - 송인석");
		setSize(500, 400);
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}
}

class ActionEvent1 implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private String shape;

    public ActionEvent1(JTextField inputField, JTextArea outputArea, String shape) {
        this.inputField = inputField;
        this.outputArea = outputArea;
        this.shape = shape;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String inputText = inputField.getText();  
            int length = Integer.parseInt(inputText);
            if (shape.equals("원")) {//원일경우 출력
                double area = length*length*3.14;
                outputArea.setText("원의 넓이: " + length + " x " + length + " x 3.14 " + "= " + area );
            } else if (shape.equals("삼각형")) {//삼각형일경우 출력
                double area = length*length;
                area = area/2;
                outputArea.setText("삼각형의 넓이: " + length + " x " + length + " / 2 " + "= " + area);
            } else if (shape.equals("사각형")) {//사각형일경우 출력
                double area = length*length;
                outputArea.setText("사각형의 넓이: " + length + " x " + length + " = " + area);
            }
        } catch (NumberFormatException ex) {//빈칸, 문자열일경우 출력
            outputArea.setText("길이(숫자)를 입력하셔야 합니다.");
        }
    }
}

public class Exam02 {

	public static void main(String[] args) {
		new Exam2();
	}

}