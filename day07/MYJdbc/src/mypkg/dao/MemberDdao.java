package mypkg.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mypkg.bean.Member;

public class MemberDdao{ // extends SuperDao{
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	//String url = "jdbc:oracle:thin:@아이피주소:포트번호:SID" ;
	String url = "jdbc:oracle:thin:@localhost:1521:xe" ; //데이터 베이스 출처
	String id = "oraman" ; 
	String password = "oracle" ; 
	
	Connection conn = null ; //접속 객체
	
	public MemberDdao() {
		try {
			//문자열을 드라이버 객체로 만들어 주는 메소드
			Class.forName(driver) ;
			this.conn = getConnection();
			if ( conn != null ) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() {		
		try { //드라이브 관리자의 getConnection 메소드 사용하여 커넥션 객체 구하기
			return DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {			
			e.printStackTrace();
			return null ;
		}
	}
	
	public List<Member> selectAll(){
		List<Member> lists = new ArrayList<Member>();
		String sql = "select * from members " ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		
		try {
			pstmt = conn.prepareStatement(sql) ;
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id") ;
				String name = rs.getString("name") ;
				String address = rs.getString("address") ;
				String hobby = rs.getString("hobby") ;
				int salary = rs.getInt("salary") ;
				String manager = rs.getString("manager") ;
				
				Member bean = new Member();
				bean.setAddress(address);
				bean.setHobby(hobby);
				bean.setId(id);
				bean.setManager(manager);
				bean.setName(name);
				bean.setSalary(salary);
				
				lists.add(bean) ;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) {rs.close();}
				if(pstmt!=null) {pstmt.close();}
				if(this.conn!=null) {this.conn.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return lists ;
	}
	
	public Member selectOne(String pid) {
	
		String sql = "select * from members where id = ?" ;
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		Member bean = null  ;
		try {
			pstmt = conn.prepareStatement(sql) ;
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
				if(this.conn!=null) {this.conn.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return bean ;
	}
	public int insertData(Member bean) {
		PreparedStatement pstmt = null ;
		
		String sql = " insert into members(id, name, address, hobby, salary, manager)";
		sql += " values(?, ?, ?, ?, ?, ?)" ;
		
		int cnt = -1 ;
		
		try {
			//한시적으로 커밋 기능을 비활성화시킨다.
			conn.setAutoCommit(false); 
			pstmt = conn.prepareStatement(sql) ;
					
			//여기서 치환하기
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getHobby());
			pstmt.setInt(5, bean.getSalary());
			pstmt.setString(6, bean.getManager());					
			
			cnt = pstmt.executeUpdate() ;
			conn.commit(); 
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(conn != null) {conn.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return cnt ;
	}
	public int updateData(Member bean) {
		PreparedStatement pstmt = null ;
		String sql = " update members set manager=?, name=?, address=?, hobby=?, salary=?";
		sql += " where id = ? " ;
		
		int cnt = -1 ;
		
		try {
			//한시적으로 커밋 기능을 비활성화시킨다.
			conn.setAutoCommit(false); 
			pstmt = conn.prepareStatement(sql) ;
					
			//여기서 치환하기
			pstmt.setString(1, bean.getManager());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getAddress());
			pstmt.setString(4, bean.getHobby());
			pstmt.setInt(5, bean.getSalary());
			pstmt.setString(6, bean.getId());								
			
			cnt = pstmt.executeUpdate() ;
			conn.commit(); 
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {pstmt.close();}
				if(conn != null) {conn.close();}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return cnt ;
	}
	public int deleteData(String id) {
		PreparedStatement pstmt = null ;
		String sql = " delete from members where id = ? " ; 
		int cnt = -1 ;
		
		try {
			conn.setAutoCommit(false);
			pstmt = conn.prepareStatement(sql) ;
			 
			pstmt.setString(1, id);
			
			cnt = pstmt.executeUpdate() ;
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return cnt ;
	}
}