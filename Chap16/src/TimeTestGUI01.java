import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyTime extends JFrame implements ActionListener{
	JTextField jtf = new JTextField(10);
	JTextArea jta1 = new JTextArea(4, 20);
	JTextArea jta2 = new JTextArea(3, 20);
	
	public MyTime() {
	jta1.setEditable(false);
	jta2.setEditable(false);
	JButton bt1 = new JButton("현재");
	JButton bt2 = new JButton("100살");
	//컨테이너 생성
	Container ct = getContentPane();
	//레이아웃
	ct.setLayout(new FlowLayout());
	
	JPanel jp1 = new JPanel();
	
	jp1.add(new JLabel("당신의 생일을 공백으로 구분하여 입력(예:2020 01 01)"));
	jp1.add(jtf);
	
	JPanel jp2 = new JPanel();
	
	jp2.add(bt1);
	jp2.add(jta1);
	
	JPanel jp3 = new JPanel();
	
	jp3.add(bt2);
	jp3.add(jta2);
	
	bt1.addActionListener(this);
	bt2.addActionListener(this);
	
	ct.add(jp1);
	ct.add(jp2);
	ct.add(jp3);
	
	//화면에 보이도록
	setTitle("TimeTestGUITest1");
	setSize(500, 300);
	//윈도우 창 종료시 프로세스 닫기
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//화면에 출력
	setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		//입력된 생일을 가져와서 년, 월, 일로 분리
		String birth = jtf.getText();
		StringTokenizer st1 = new StringTokenizer(birth);
		
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		//출생일, 현재, 100살의 년 월 일을 출력하는 객체 생성
		LocalDate my_birth = LocalDate.of(year, month, day);
		LocalDate current = LocalDate.now();
		LocalDate hundred = my_birth.plusYears(100);
		
		if(ae.getActionCommand() == "현재") {
			jta1.setText("");
			jta1.append("당신의 생일 : " + my_birth);
			jta1.append("\n오늘 날짜는 : " + current);
			jta1.append("\n생일부터 오늘까지의 일 : " + my_birth.until(current, ChronoUnit.DAYS));
			jta1.append("\n생일부터 오늘까지의 년 : " + my_birth.until(current, ChronoUnit.YEARS));
		}
		else {
			jta2.setText("");
			jta2.append("당신이 100살이 되는 날은 : " + hundred);
			jta2.append("\n100살까지 남은 주(week) 수 : " + current.until(hundred, ChronoUnit.WEEKS));
			jta2.append("\n100살까지 남은 일 수 : " + current.until(hundred, ChronoUnit.DAYS));
		}
		
	}
	
}

public class TimeTestGUI01 {

	public static void main(String[] args) {
		new MyTime();
	}

}
