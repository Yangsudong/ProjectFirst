package com.yedam.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//	DB쿼리
public class EmpDAO {
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public Connection getConnect() {		
				
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//url주소 고정  @localhost:포트번호:이름
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");	// ("주소","계정아이디","비밀번호")
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		return conn;
	}
	
	public void insertEmp(Employee emp) {
		conn = getConnect();
		String sql = "insert into emp values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId()); 	
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 입력됨.");		
		}
				
		catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	public List<Employee> getEmplist() {
		conn = getConnect();		
		String sql = "select * from emp";
		
		List<Employee> employees = new ArrayList<>();
		int i = 0;
		try { 
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), 
											rs.getString("last_name"), 
								 			rs.getInt("salary"), 
								 			rs.getString("hire_date"));	  
				employees.add(emp);	// DB건수만큼 배열에 담기위함
			}			
		} 
		
		catch (SQLException e) {	
			e.printStackTrace();
		}
		return employees;
	}
	
	public void updateEmp(Employee emp) {
		// 전제조건 : 급여만 변경.
		conn = getConnect();
		String sql = "update emp set salary = ? where employee_id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());  //첫번째 물음표에 넣을 값지정
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 변경됨.");
		} 
		
		catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}
	
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp where employee_id = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);  //첫번째 물음표에 넣을 값지정			
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 삭제됨.");
		} 		
		
		catch (SQLException e) {			
			e.printStackTrace();
		}		
			
	}
}

