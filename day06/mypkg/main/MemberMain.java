package mypkg.main;

import java.util.List;
import java.util.Scanner;

import mypkg.bean.Member;
import mypkg.dao.MemberDao;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;		
		
		while(true) {
			System.out.println("### �޴� ###");
			System.out.println("1. ��ü ��ȸ, 2. ȸ�� �߰�, 3. ȸ�� Ż��");
			System.out.println("4. ȸ�� ���� ����, 5. 1�Ǹ� ��ȸ�ϱ�");
			System.out.println("0. ���α׷� ����");
			
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
				System.out.println("���α׷� ����");
				break ;
			}			
		}		
		System.out.println("��");
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
			System.out.println("ã���ô� ȸ���� �������� �ʽ��ϴ�.");
		}
	}

	private static void updateData() {
		MemberDao dao = new MemberDao();
		Member bean = new Member() ;
		int cnt = -1 ; //������ ����
		
		bean.setAddress("����");
		bean.setHobby("�߱�");
		bean.setId("sim");
		bean.setManager("kim");
		bean.setName("������");
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
		int cnt = -1 ; //������ ����
		
		bean.setAddress("����");
		bean.setHobby("�౸");
		bean.setId("sim");
		bean.setManager("hong");
		bean.setName("�ɼ���");
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
			System.out.println("���̵�/�̸�/�ּ�/���/�޿�/�Ŵ���");
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
			System.out.println("�������� ����");
		}
	}
}











