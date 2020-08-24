package mypkg.main;

import java.util.List;
import java.util.Scanner;

import mypkg.bean.Member;
import mypkg.dao.MemberDao;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;		
		
		while(true) {
			System.out.println("### 메뉴 ###");
			System.out.println("1. 전체 조회, 2. 회원 추가, 3. 회원 탈퇴");
			System.out.println("4. 회원 정보 수정, 5. 1건만 조회하기");
			System.out.println("0. 프로그램 종료");
			
			int menu = scan.nextInt() ;
			if (menu == 1) {
				selectAll() ;
			}else if (menu == 2) {
				insertData(); 
			}else if (menu == 3) {
				deleteData(); 
			}else if (menu == 4) {
				updateData(); 
			}else if (menu == 5) {
				selectOne(); 
			} else if(menu == 0) {
				System.out.println("프로그램 종료");
				break ;
			}			
		}		
		System.out.println("끝");
	}

	private static void selectOne() {
		MemberDao dao = new MemberDao();
		String id = "hong" ;
		Member bean = dao.selectOne(id) ;
		
		if(bean != null) {
			String name = bean.getName() ;
			String address = bean.getAddress() ;
			String hobby = bean.getHobby() ;
			int salary = bean.getSalary();
			String manager = bean.getManager() ;
			
			System.out.println(id + "/" + name + "/" + address + "/" + hobby + "/" + salary + "/" + manager);
		}else {
			System.out.println("찾으시는 회원이 존재하지 않습니다.");
		}
	}

	private static void updateData() {
		MemberDao dao = new MemberDao();
		Member bean = new Member() ;
		int cnt = -1 ; //부정의 개념
		
		bean.setAddress("공덕");
		bean.setHobby("야구");
		bean.setId("sim");
		bean.setManager("kim");
		bean.setName("심형래");
		bean.setSalary(1000);		
		
		cnt = dao.updateData(bean) ;
		if(cnt == -1) {
			System.out.println("fail");
		}else {
			System.out.println("success");
		}		
	}

	private static void deleteData() {
		MemberDao dao = new MemberDao();
		String id = "sim" ;
		int cnt = -1 ; 
		cnt = dao.deleteData(id) ;
		if(cnt == -1) {
			System.out.println("delete fail");
		}else {
			System.out.println("delete success");
		}
		
	}

	private static void insertData() {
		MemberDao dao = new MemberDao();
		Member bean = new Member() ;
		int cnt = -1 ; //부정의 개념
		
		bean.setAddress("역삼");
		bean.setHobby("축구");
		bean.setId("sim");
		bean.setManager("hong");
		bean.setName("심수봉");
		bean.setSalary(1000);		
		
		cnt = dao.insertData(bean) ;
		if(cnt == -1) {
			System.out.println("fail");
		}else {
			System.out.println("success");
		}
		
	}

	private static void selectAll() {
		MemberDao dao = new MemberDao() ;
		
		List<Member> lists =  dao.selectAll() ;
		if(lists.size() >= 0) {
			System.out.println("아이디/이름/주소/취미/급여/매니저");
			for(Member mem : lists) {
				//System.out.println(mem);
				String id = mem.getId() ;
				String name = mem.getName() ;
				String address = mem.getAddress() ;
				String hobby = mem.getHobby() ;
				int salary = mem.getSalary();
				String manager = mem.getManager() ;
				
				System.out.println(id + "/" + name + "/" + address + "/" + hobby + "/" + salary + "/" + manager);
				
			}
		}else {
			System.out.println("존재하지 않음");
		}
	}
}











