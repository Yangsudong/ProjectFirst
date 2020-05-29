package com.yedam.classes.interfaces;
//실행
import java.util.Scanner;



public class EmpMain {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		EmpService service = new EmpServiceImpl();			
		
		// 1.입력	 2.전체리스트 3.수정 4.삭제 5.종료
		while(true) {
			System.out.println("===============================");
			System.out.println("1.입력 2.전체리스트 3.수정 4.삭제 5.종료");
			System.out.println("===============================");
			System.out.print("선택 > ");
			
			int menu = scn.nextInt();
						
			if(menu == 1) {				
				System.out.println("입력 선택");
				System.out.println("사원번호 입력 : ");
				int empId;
				try {
					empId = scn.nextInt(); scn.nextLine();
				}catch(Exception e){
					System.out.println("잘못입력했습니다.");
					scn.nextLine();
					empId = check("사원번호 입력 : ");
				}
				System.out.print("성 입력 : ");
				String lastName;
				try {
				lastName = scn.nextLine();
				}catch(Exception e) {
					System.out.println("잘못입력했습니다.");
					scn.nextLine();
					lastName = checkname("성 입력 : ");
				}
				System.out.print("급여 입력 : ");
				int salary;
				try {
					salary = scn.nextInt(); scn.nextLine();
				}catch(Exception e){
					System.out.println("잘못입력했습니다.");
					scn.nextLine();
					salary = check("급여입력 : ");				
				}
							
				System.out.print("입사일 입력 : ");
				String hireDate = scn.nextLine();
				
				Employee emp = new Employee(empId, lastName, salary, hireDate);		
				service.createEmp(emp);			
				
			}
			
			
			else if(menu == 2) {
				service.getEmplist();
			}
			
			else if(menu == 3) {
				System.out.println("변경 사원번호 입력 : ");
				int empId = scn.nextInt();
				System.out.println("급여 입력 : ");
				int salary = scn.nextInt();
				Employee emp = new Employee(empId,"",salary,"");
				service.changeEmp(emp);							
			}
			
			else if(menu == 4) {
				System.out.println("삭제할 사원번호 입력 : ");
				int empId = scn.nextInt();
				
				service.removeEmp(empId);
			}
			
			else if(menu == 5) {
				break;
			}			
		}	
	}
	static int check(String m) {
		int empId;
		while(true) {			
			try {
				System.out.println(m);
				empId = scn.nextInt();
				scn.nextLine();
				break;
			}catch (Exception e) {
				System.out.println("잘못입력했습니다.");
				scn.nextLine();
			}		
		}return empId;
	}	
	static String checkname(String m) {
		String lastName;
		while(true) {			
			try {
				System.out.println(m);
				lastName = scn.nextLine();
				scn.nextLine();
				break;
			}catch (Exception e) {
				System.out.println("잘못입력했습니다.");
				scn.nextLine();
			}		
		}return lastName;
	}
}
