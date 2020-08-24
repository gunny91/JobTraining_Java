package mypkg.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mypkg.bean.Board;
import mypkg.bean.Member;
import mypkg.dao.BoardDao;
import mypkg.dao.MemberDao;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("#### Menu ####");
			System.out.println("1. Board List, 2. Board Paging, 3. Search 1 ");
			System.out.println("4. Board Insert, 5. Update list, 6. Delete");
			System.out.println("0. End program");
			int menu = in.nextInt();
			if(menu ==1) {selectAll();}
			else if(menu ==2) {selectAllPage();}
			else if(menu ==3) {selectOne();}
			else if(menu ==4) {insertData();}
			else if(menu ==5) {updateData();}
			else if(menu ==6) {deleteData();}
			else if(menu ==0) {System.out.println("End Program" );}
			
		}

	}

	private static void deleteData() {
		int count =-1;
		BoardDao dao = new BoardDao();
		String sub = "Yo man"; 
		dao.deleteData(sub);
		count = dao.deleteData(sub);
		if(count ==-1) {System.out.println("Delete Fail");}
		else {System.out.println("Delete processed!");}
		
		
	}

	private static void updateData() {
		BoardDao dao =new BoardDao();
		Board bean = new Board();
		int count =-1;
		
		bean.setContent("Hello");
		bean.setPassword("Password");
		bean.setReadhit(100);
		bean.setRegdate("20/09/04");
		bean.setSubject("Malcom X");
		bean.setWriter("hong");
		bean.setNo(2);
		
		count = dao.updateData(bean);
		if(count ==-1)
		{System.out.println("fail");}
		else {System.out.println("success");}
		
	}
	
	private static void selectOne() {
		
		BoardDao dao = new BoardDao();
		int tempNum = 3;
		Board bean = dao.selectOne(tempNum);
		
		if(bean != null)
		{
			int no = bean.getNo();
			String writer = bean.getWriter();
			String subject = bean.getSubject();
			String password = bean.getPassword();
			String content = bean.getContent();
			String regdate = bean.getRegdate();
			int readhit = bean.getReadhit();
			
			String temp = no + "/" + writer + "/" + subject + "/" + password + "/" + content + "/" + regdate + "/" +readhit;
			System.out.println(temp);		
	
		}else {
			System.out.println("찾으시는 회원이 존재하지 않습니다.");
		}
	}



	private static void insertData() {
		BoardDao dao = new BoardDao();
		
		int count = -1;
		Board bean = new Board();
		
		
		bean.setContent("Mother Father");
		bean.setPassword("1111");
		bean.setSubject("Yo man");
		// user id must be into this section
//		bean.setWriter("User");
		bean.setReadhit(0); //조회수 is 0 from start
//		bean.setNo(no); we used seq seq automatically add the number

//		bean.setRegdate(String.valueOf("regdate")); date should put the current time
		bean.setRegdate(String.valueOf("20/08/15"));	
		count = dao.insert(bean);
		if(count ==-1) {System.out.println("Board insertion error");}
		else {System.out.println("Board insertion processed");}
	}

	private static void selectAll() {
		//List<Board> lists = new ArrayList<Board>();
		BoardDao dao = new BoardDao();
		List<Board> lists = dao.selectAll();
		for(Board board : lists)
		{
			int no = board.getNo();
			String writer = board.getWriter();
			String subject = board.getSubject();
			String password = board.getPassword();
			String content = board.getContent();
			String regdate = board.getRegdate();
			int readhit = board.getReadhit();
			
			String temp = no + "/" + writer + "/" + subject + "/" + password + "/" + content + "/" + regdate + "/" +readhit;
			System.out.println(temp);
			
		}
		
	}

	private static void selectAllPage() {
		BoardDao dao = new BoardDao();
		
		int starRow =1;
		int endRow =10;
		List<Board> lists = dao.selectAll(starRow,endRow); //10 data from board
		
		for(Board board : lists)
		{
			int no = board.getNo();
			String writer = board.getWriter();
			String subject = board.getSubject();
			String password = board.getPassword();
			String content = board.getContent();
			String regdate = board.getRegdate();
			int readhit = board.getReadhit();
			
			String temp = no + "/" + writer + "/" + subject + "/" + password + "/" + content + "/" + regdate + "/" +readhit;
			System.out.println(temp);
		}
		
		
		
		
		
		
		
	}

}
