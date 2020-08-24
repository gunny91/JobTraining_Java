package mypkg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mypkg.bean.Member;
import mypkg.common.SuperDao;

public class MemberDao extends SuperDao
{
	public MemberDao() {super();}

	//3336
	
//	String driver ="oracle.jdbc.driver.OracleDriver";
//	//String url = "jdbc:oracle:thin:@ip:port:SID"; //data base source
//	String url = "jdbc:oracle:thin:@localhost:1521:xe"; //data base source
//
//	String id = "oraman";
//	String password = "oracle";
//	
//	Connection connect = null; // connection object
	

		
//		try {
//			//String class --> make String to driver object
//			Class.forName(driver);
//			this.connect = DriverManager.getConnection(url,id,password);
//			if(connect !=null)
//			{
//				System.out.println("Connected!");
//			}else
//			{
//				System.out.println("Not connected!");
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
	
	
	/**
	 * Driver administer's getConnection method to get connection object
	 * @return
	 */
//	private Connection getConnection() {
//		try {
//			return DriverManager.getConnection(url,id,password);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//		
//	}

	
//	private Connection getConnection1() throws SQLException {
//				return DriverManager.getConnection(url,id,password);
//				
//	}
//	
//	p = connect.prepareStatement(sql);
//	resultSet = p.executeQuery();
//	
//	while(resultSet.next())
//	{
//		String id =resultSet.getString("id");
//		String name =resultSet.getString("id");
//		String  address=resultSet.getString("id");
//		String hobby =resultSet.getString("id");
//		int salary =resultSet.getInt("id");
//		String manager =resultSet.getString("id");
//		
//		Member bean = new Member();
//		bean.setId(id);
//		bean.setAddress(address);
//		bean.setHobby(hobby);
//		bean.setManager(manager);
//		bean.setName(name);
//		bean.setSalary(salary);;
//		
//		lists.add(bean);
//	}

	
	public List<Member> selectAll()
	{
		List<Member> lists = new ArrayList<Member>();
		
		PreparedStatement p = null;
		String sql ="select * from members";
		ResultSet resultSet = null;

		try {
				p = connect.prepareStatement(sql);
				resultSet = p.executeQuery();
				
				while(resultSet.next())
				{
					String id =resultSet.getString("id");
					String name =resultSet.getString("name");
					String  address=resultSet.getString("address");
					String hobby =resultSet.getString("hobby");
					int salary =resultSet.getInt("salary");
					String manager =resultSet.getString("manager");
					
					Member bean = new Member();
					bean.setId(id);
					bean.setAddress(address);
					bean.setHobby(hobby);
					bean.setManager(manager);
					bean.setName(name);
					bean.setSalary(salary);;

					lists.add(bean);
				}
		
		}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}finally {
				try {
					if(resultSet!=null) {resultSet.close();};
					if(p !=null) {p.close();}
					if(super.connect!=null) {super.connect.close();}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			return lists;
	}
	
	/**
	 * selectOne		bean					primary key(pk)		detail of post
	 * @param id
	 * @return
	 */
	
	public Member selectOne(String pid)
	{
		String sql = "select * from members where id = ?" ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		Member bean = null  ;
		try {
			pstmt = connect.prepareStatement(sql) ;
			pstmt.setNString(1,  pid);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id") ;
				String name = rs.getString("name") ;
				String address = rs.getString("address") ;
				String hobby = rs.getString("hobby") ;
				int salary = rs.getInt("salary") ;
				String manager = rs.getString("manager") ;
				
				bean = new Member();
				bean.setAddress(address);
				bean.setHobby(hobby);
				bean.setId(id);
				bean.setManager(manager);
				bean.setName(name);
				bean.setSalary(salary);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(this.connect!=null) {this.connect.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return bean ;
		
	}
	
	
	// place hoder --> the thing to put that unknow at SQL. We can write on '?'
	//setXXX() method 
	//Do set first before excutateUpdate()
	public int insertData(Member bean)
	{

		PreparedStatement p = null;
		String sql =" insert into members(id,name,address,hobby, salary,manager)";
		sql += " values(?,?,?,?,?,?)";
		int count =-1;
		
		try {
			connect.setAutoCommit(false); // stop commit temparay.
			p = connect.prepareStatement(sql);
			
//			String sql =" insert into member(id,name2,address,hobby, salary,manager)"; //부적합한 열 인덱스
//			sql += " values(?,?,?,?,?)";
			
			//do set here
			//sql is starting number 1
			p.setString(1, bean.getId());
			p.setString(2, bean.getName());
			p.setString(3, bean.getAddress());
			p.setString(4, bean.getHobby());
			p.setInt(5, bean.getSalary());
			p.setString(6, bean.getManager());
			
			//request
			count = p.executeUpdate();
			connect.commit();
			
		} catch (SQLException e) {e.printStackTrace(); 
		try {connect.rollback();} 
		catch (SQLException e1) {e1.printStackTrace();}}
		  catch (Exception e){e.printStackTrace();}
		finally 
		{
			try{ 
				if(p!=null){p.close();}
				if(connect!=null) {connect.close();}
			}
			catch(Exception e){	e.printStackTrace();}
		}
		
		return count;
	}
	/**
	 *  *	update			int						Bean				data modify
	 * @param bean
	 * @return
	 */
	public int updateData(Member bean)
	{
		PreparedStatement pstmt = null ;
		String sql = " update members set manager=?, name=?, address=?, hobby=?, salary=?";
		sql += " where id = ? " ;
		
		int cnt = -1 ;
		
		try {
			//한시적으로 커밋 기능을 비활성화시킨다.
			connect.setAutoCommit(false); 
			pstmt = connect.prepareStatement(sql) ;
					
			//여기서 치환하기
			pstmt.setString(1, bean.getManager());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getHobby());
			pstmt.setInt(5, bean.getSalary());
			pstmt.setString(6, bean.getId());	
			
			
			cnt = pstmt.executeUpdate() ;
			connect.commit(); 
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connect.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(connect != null) {connect.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return cnt ;
	
//		PreparedStatement p = null;
//		String sql = " update members set id=?, name = ?, address =?, hobby =?, salary =?, manager =?";
//		sql+= " where id = ?";
//		int count =-1;
//		
//		try{
//			connect.setAutoCommit(false);
//			p = connect.prepareStatement(sql);
//			
//			p.setString(1, bean.getId());
//			p.setString(2, bean.getName());
//			p.setString(3, bean.getAddress());
//			p.setString(4, bean.getHobby());
//			p.setInt(5, bean.getSalary());
//			p.setString(6, bean.getManager());
//			
//			
//			count = p.executeUpdate();
//			connect.commit();
//		
//		}catch (SQLException e) {
//			e.printStackTrace();
//			try {
//				connect.rollback();
//			} catch (SQLException e1) {
//				e1.printStackTrace();
//			}
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}finally {
//			try {}
//			catch(Exception e) {e.printStackTrace();}
//		}
//		return count;
	}
	
	/**
	 * This is method to get the delete data from table
	 * @param id in members sql table which is primary key (pk)
	 * @return
	 */
	public int deleteData(String id)
	{
		PreparedStatement p = null;
		String sql = "delete from members where id = ?";
		int count =-1;
		
		try{
			connect.setAutoCommit(false);
			p = connect.prepareStatement(sql);
			
			p.setString(1, id);
			
			
			count = p.executeUpdate();
			connect.commit();
		
		}catch (SQLException e) {
			e.printStackTrace();
			try {
				connect.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {}
			catch(Exception e) {e.printStackTrace();}
		}
		return count;
	}
}

