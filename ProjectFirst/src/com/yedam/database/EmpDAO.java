package com.yedam.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	
	//사원등록 Emp 테이블
	public void insertEmp(Emp emp) {	//Emp class의 인스턴스가 와야한다
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//url주소 고정  @localhost:포트번호:이름
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");	// ("주소","계정아이디","비밀번호")
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		//emp테이블에 삽입하는 명령문
		String sql = "insert into emp values(" +emp.getEmployeeId()+ ""
				+ ",'" + emp.getLastName() + "'"
				+ "," + emp.getSalary() 
				+ ",'" + emp.getHireDate() +"'"
				+ ")";					
		
		try {
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();	//실행하는 명령문
			System.out.println(r + "건이 입력되었습니다.");
			
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		
	}
		
	//employees 테이블데이터 조회 결과.
	public Employee[] getEmplist() {
		
		Employee[] emps = new Employee[100];		
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//url주소 고정  @localhost:포트번호:이름
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");	// ("주소","계정아이디","비밀번호")
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			int i = 0;
			while(rs.next()) {	//next는 받아올값이있으면 true 없으면 false
//				System.out.println(rs.getInt("employee_id") + rs.getString("first_name") + rs.getString("last_name") + rs.getString("email") + rs.getString("phone_number"));			
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emps[i++] = emp; //Emplist의 인스턴스 저장.
			}
		} catch (SQLException e) {		
			e.printStackTrace();			
		}	//실행할준비를하겟다
		return emps;
	}	//end of getEmpList()
}
