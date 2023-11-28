import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Select {

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
		//SQL문 실행 결과를 얻어오기 위한 클래스  : ResultSet
		ResultSet result = null;

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
			result = stmt.executeQuery("select * from student");
			//result = stmt.executeQuery("select * from student where name ='손흥민'");
			
			//5단계. 결과 받기(메소드 만들기)
			printData(result, "NAME", "Dept", "ID");
			
			//6단계. 연결 해제
			result.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}
	
	//출력 결과 메소드
	private static void printData(ResultSet srs, String col1, String col2, String clo3) throws SQLException{
		while (srs.next()) {
			if(!col1.equals("")) 
				System.out.print(srs.getString("NAME"));

			if(!col1.equals("")) 
				System.out.print("\t|\t" + srs.getString("ID"));
			
			if(!col1.equals("")) 
				System.out.println("\t|\t" + srs.getString("Dept"));
			else 
				System.out.println();
			
			
		}
	}

}
