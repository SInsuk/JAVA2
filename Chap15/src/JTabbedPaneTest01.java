import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

//1.성별, 혈액형 판넬 만들기

//성별 판넬 클래스 만들기
class RadioPanel extends JPanel implements ActionListener{
	//성별을 나타내는 라디오 버튼 그룹 만들기
	ButtonGroup gb = new ButtonGroup();
	
	//레이블 생성
	JLabel jl1 = new JLabel("	당신의 성별은? ");
	JLabel jl2 = new JLabel("");
	
	//라디오 버튼 생성
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"남자", "여자"};
	
	//생성자
	public RadioPanel() {
		//성별 라디오버튼 객체를 배열로 생성
		for(int i=0; i<2; i++) { 
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]);	//성별 판넬에 객체 추가
			gb.add(jr[i]);//버튼 그룹에 추가
			jr[i].addActionListener(this);//리스너 등록
		}
		add(jl1); //성별 판넬에 레이블 추가
		add(jl2); //성별 판넬에 레이블 추가
	}
	//이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jl2.setText(s);
	}
	
}

//혈액형 판넬 클래스 만들기
class ComboBoxPanel extends JPanel implements ItemListener{
	//레이블 생성
	JLabel jl1 = new JLabel("	당신의 혈액형은? ");
	JLabel jl2 = new JLabel("");
	
	//생성자
	public ComboBoxPanel() {
		//콤보박스 생성
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("O형");
		jcb.addItem("AB형");
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		//리스너 등록
		jcb.addItemListener(this);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object s = e.getItem();
		jl2.setText(s.toString());
		
	}	
}

//GUI
class JTabPane extends JFrame{
	//생성자
	public JTabPane() {
		//컨테이너 생성
		Container ct = getContentPane();
		
		//2. JTabbedPane()객체 생성
		JTabbedPane jtp = new JTabbedPane();
		
		//라디오 판넬, 콤보 판넬 객체 생성
		RadioPanel rp = new RadioPanel();
		ComboBoxPanel cp = new ComboBoxPanel();
		
		//3. JTabbedPane()에 판넬 추가
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		
		//4. 컨테이너에 추가
		ct.add(jtp);
		
		//화면에 보이도록
		setTitle("JTabbedPane Test1");
		setSize(400, 150);
		
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
	}
}

public class JTabbedPaneTest01 {

	public static void main(String[] args) {
		new JTabPane();
	}

}
