import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Insert {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
		// 데이터베이스 URL           localhost 또는 127.0.0.1 로 설정.
		// connector 5.1.x 이후버전부터 KST타임존을 인식하지 못하는 이슈가 있어 serverTimezone 추가.
		// 만약 한글 깨짐 현상이 있다면 useUnicode=true&characterEncoding=UTF8 추가 설정. 
		
		String id = "root";   // DB에 로그인할 ID
		String pw = "1234";   // MYSQL 설정 시 입력한 PASSWORD
		
		//SQL문 실행을 위해 사용하는 클래스 : Statement
		Statement stmt = null;

		try {
			//1단계. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버 로드.
			
			//2단계. 데이터베이스 연결.
			conn = DriverManager.getConnection(url, id, pw);  // 데이터베이스 연결.
			// DriverManager 자바 어플리케이션을 JDBC드라이버에 연결시켜주는 클래스. 
			// getConnection() 메소로 DB에 연결하여 Connection 객체 반환.
			System.out.println("DB 연결 완료");
			
			//3단계. Statement 생성
			stmt = conn.createStatement();
			
			//4단계. SQL문 전송
			stmt.executeUpdate("insert into student(NAME, Dept, ID) values('박소담', '실내디자인학부', '201745063');");
			
			//5단계. 결과 받기(메소드 호출)
			printTable(stmt);
			
			//6단계. 연결 해제
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류-이미 존재하는 데이터");
		}

	}
	
	//출력 결과 메소드
	private static void printTable(Statement stmt) throws SQLException{
		//5단계 결과 받기
		ResultSet result = stmt.executeQuery("select * from student");
		
		while(result.next()) {
			System.out.print(result.getString("NAME"));
			System.out.print("\t|\t"+result.getString("ID"));
			System.out.println("\t|\t"+result.getString("Dept"));
			
			//getString()메소드는 해당 데이터 타입으로 '열'값을 읽어온다
			//모든 데이터 타입에 대해 읽어오기 가능
			//필요시 데이터 타입 변환해야함

		}
		System.out.println();
		
		//6단계. 연결 해제
		result.close();
	}

}
