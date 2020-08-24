package mypkg.main;

import java.util.List;
import java.util.Scanner;

import mypkg.bean.Board;
import mypkg.bean.Composit;
import mypkg.bean.Member;
import mypkg.dao.CompositDao;
import mypkg.dao.MemberDao;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//C:\\oraclexe\\app\\oracle\\product\\11.2.0\\server\\jdbc\\lib
	// property -> library -> add external jars
		
		Scanner in = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("### Menu ###");
			System.out.println("1. Select all, 2. Add members, 3. Delete Account");
			System.out.println("4. Edit member list, 5. Search one case");
			System.out.println("6. Join, 7. Join all");
			System.out.println("0. End program");
			
			int menu = in.nextInt();
			
			if(menu ==1)
			{
				selectAll();
			}
			else if (menu ==2) {insertData();}
			else if (menu ==3) {deleteData();}
			else if (menu ==4) {updateData();}
			else if (menu ==5) {selectOne();}
			else if (menu ==6) {selectAll2();}
			else if (menu ==7) {joinAll();}
			else if(menu ==0)
			{
				System.out.println("End program!");
				break;
			}
		}
		System.out.println("Done");	
	}
	
	private static void selectAll2() {
		CompositDao dao = new CompositDao();
		List<Composit> lists = dao.selectAll();
		
		
		
		for(Composit bean : lists)
		{
			String id = bean.getId();
			String name = bean.getName();
			String subject = bean.getSubject();
			String content = bean.getContent();
			
			String temp = id +"/"+ name +"/"+ subject +"/"+content;
			System.out.println(temp);
		}
		
		
		
		
	}

	private static void joinAll() {
	
		CompositDao dao = new CompositDao();
		List<Member> lists =dao.joinAll();
		
		for(Member bean : lists)
		{
			String id = bean.getId();
			String name = bean.getName();
			String address = bean.getAddress();
			String hobby = bean.getHobby();
			Board board = bean.getBoard();
			
			String subject = bean.getBoard().getSubject();
			String temp = id +"/"+ name +"/"+ address +"/"+hobby+ "/"+ board+ "/" + subject;
			System.out.println(temp);
		}
		
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
		MemberDao dao =new MemberDao();
		Member bean = new Member();
		int count =-1;
		
		bean.setAddress("Iowa");
		bean.setHobby("swimming");
		bean.setId("NIGA");
		bean.setManager("BICK");
		bean.setName("KAKA");
		bean.setSalary(3212);
		//count =dao.insertData(bean);
		
		count = dao.insertData(bean);
		if(count ==-1)
		{System.out.println("fail");}
		else {System.out.println("success");}
		
	}

	private static void deleteData() {
		MemberDao dao = new MemberDao();
		String id = "Whoe";
		dao.deleteData(id);
		int count = -1;
		count = dao.deleteData(id);
		if(count ==-1) {System.out.println("Delete Fail");}
		else {System.out.println("Delete processed!");}
	
	}

	private static void insertData() {
		
		MemberDao dao =new MemberDao();
		Member bean = new Member();
		int count =-1;
		
		bean.setAddress("AMES23");
		bean.setHobby("Drone");
		bean.setId("Niggc");
		bean.setManager("BICK");
		bean.setName("KAKA");
		bean.setSalary(3212);
		//count =dao.insertData(bean);
		
		count = dao.insertData(bean);
		if(count ==-1)
		{System.out.println("fail");}
		else {System.out.println("success");}
		
		
	}

	private static void selectAll()
	{
		MemberDao dao = new MemberDao();
		
		List<Member> lists= dao.selectAll();
		
		if(lists.size()>0)
		{
			for(Member mem :lists)
			{
//				System.out.println(mem);
				
				String id = mem.getId();
				String name = mem.getName();
				String address = mem.getAddress();
				String hobby = mem.getHobby();
				int salary = mem.getSalary();
				String manager =mem.getManager();
				
				System.out.println("ID :"+id+"/Name : "+name+" /Address: "+address+" /Hobby: "+hobby+
						" /Income: "+salary+" /Manager: "+ manager);		
			}
		}
		else
		{
			System.out.println(" Not Exist error!");
		}
	}

}

/**
 * JDBC Drive
 * 
 * It is a java class which support database 
 * ojdbc6.jar(11g ver)
 * Package path : oracle.jdbc.driver.OracleDriver
 * 
 */
/**
 * 		*DB connection
 * 		For the connection of using data base (object)
 * 
 *		*PreparedStatement
 * 		dealing with sql statment (select, insert, update, delete)
 * 		
 * 		*Resultset object
 * 		searched from select (in ram) 
 * 
 */


/**
*		JDBC programming
*
*		1. Loading JDBC drive
*		2. Get DB connection object 
*		3. Get PreparedStatement object to Quary excution
*		4. Return result using with Quary statement
*		5. close prepareStatement object
*		6. close connection object
*
*
*		* Bean Object
*		
*			mean to one data (like a one row)
*		It is an 1 (row) 
*		Also called; dto(data transfer object), vo(value object)
*
*		* DAO Object
*		DAO(data access object)
*		Connect to data base, and can do search/ modify/ delete etc...
*		Needs one method for each one unit work

*/	

/**
 * 		
 * Name				Return type				parametor	 		explain
 * 		
 * selectAll 		ArrayList<Members>			X				select all members
 *																	
 * selectOne		bean					primary key(pk)		detail of post
 *	
 *insertData		integer					Bean object			data insert
 *	
 *	update			int						Bean				data modify
 *
 *	deleteData		int						primary key			data delete
 *
 *	
 */
			

/**
 * 
 * Project : myJdbc
 * 
 * drive connevtion : ojdbc6.jar
 * 
 * pacakge: bean to bean package, Dao to dao package
 * 
 * 
 * class file:
 * mypkg.bean.Member.java : bean related class
 * mypkg.dao.MemberDao.java: Dao class
 * mypkg.common.SuperDao.java : dao class's super class
 * mypkg.main.MemberMain.java : member related main class
 * 
 * 
 * 
 */