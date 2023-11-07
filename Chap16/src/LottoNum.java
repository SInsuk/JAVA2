import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Lotto extends JFrame implements ActionListener{
	private JLabel lotto_num = new JLabel();
	public Lotto(){
		JButton lotto = new JButton("로또 번호 자동생성");
		Container ct = getContentPane();
		
		ct.setLayout(new FlowLayout());
		ct.add(lotto);
		ct.add(lotto_num);
		
		lotto.addActionListener(this);
		
		//화면에 보이도록
		setTitle("Lotto Number Test");
		setSize(250,200);
		
		//윈도우 창 종료시 프로세스 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//화면에 출력
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Random rnd_num = new Random();	//Random클래스로 객체 생성
		int[] lotto_number = new int[6];		//배열 생성
		
		//같은 번호가 있는지 확인을 위해 변수 생성
		int temp;
		
		int i = 0;
		a : while(i < 6) {
			//랜덤 번호 생성
			temp = rnd_num.nextInt(45) + 1;
			//배열에 저장된 값과 temp에 저장된 값을 비교하여 같으면 다시 랜덤수 발생
			for(int j=0; j<=i; j++) {
				if(temp == lotto_number[j]) {
					continue a;
				}
			}
			lotto_number[i] = temp;
			i++;
		}
		lotto_num.setText("이번주 로또 당첨 번호: " +Arrays.toString(lotto_number));
		
	}
	
}


public class LottoNum {

	public static void main(String[] args) {
		new Lotto();
	}
}
