import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest01 {

	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		
		//사용자로부터 4개의 과일 이름을 입력받아 queue에 저장->offer()
		Scanner stdin = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.print("과일 이름을 입력하세요: ");
			String fruit = stdin.next();
			queue.offer(fruit);
		}
		
		//queue에 저장된 과일 리스트 출력
		System.out.println("과일 리스트<큐>" + queue);
		
		//queue에서 과일 찾기	->indexOf()
		System.out.print("찾고 싶은 과일 이름을 입력하세요: ");
		String f_name = stdin.next();
		
		int fruit = queue.indexOf(f_name);
		if(fruit != -1) 
			System.out.println("큐에서 " + f_name + " 과일이 " + fruit + "번째에 있습니다.");
		else
			System.out.println("과일이 큐에 없습니다.");
		
		//queue 리스트의 과일 삭제->poll()
		System.out.println("과일리스트 <큐> 삭제");
		while(!queue.isEmpty()) {
			String obj = queue.poll();
			System.out.println("<큐>에서 poll: " + obj);
		}

	}

}
