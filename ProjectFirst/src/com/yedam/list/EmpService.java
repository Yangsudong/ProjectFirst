package com.yedam.list;
//인터페이스
public interface EmpService {
	// 기능정의. 구현X
	
	// 한건생성.
	public void createEmp(Employee emp);	// public abstract void creatEmp();
	
	// 전체조회.
	public void getEmplist();
	
	// 한건수정.
	public void changeEmp(Employee emp);
	
	// 한건삭제.
	public void removeEmp(int empId);
}
