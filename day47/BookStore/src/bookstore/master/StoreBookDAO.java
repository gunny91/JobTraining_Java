package bookstore.master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

//-----------------------------------------------------------------------------
// class StoreBookDAO
//-----------------------------------------------------------------------------
public class StoreBookDAO 
{
	//-----------------------------------------------------------------------------
	// StoreBookDAO 인스턴스를 생성한다.
	//-----------------------------------------------------------------------------
	private static StoreBookDAO instance = new StoreBookDAO();

	//-----------------------------------------------------------------------------
	// 생성한 인스턴스의 정보를 알려준다.
	//-----------------------------------------------------------------------------
	public static StoreBookDAO getInstance() {
		return instance;
	} // End - public static StoreBookDAO getInstance()

	//-----------------------------------------------------------------------------
	// 기본 생성자
	//-----------------------------------------------------------------------------
	private StoreBookDAO() {}
	
	//-----------------------------------------------------------------------------
	// 커넥션 풀로 부터 커넥션 객체를 얻어내는 메서드
	//-----------------------------------------------------------------------------
	private Connection getConnection() throws Exception {
		Context	initCtx = new InitialContext();
		Context envCtx  = (Context)	 initCtx.lookup("java:comp/env");
		DataSource ds	= (DataSource)envCtx.lookup("jdbc/bookstoredb");
		return ds.getConnection();
	} // End - private Connection getConnection()
	
	//-----------------------------------------------------------------------------
	// 관리자 인증 메서드
	//-----------------------------------------------------------------------------
	public int managerCheck(String id, String passwd) throws Exception {
		Connection			conn		= null;
		PreparedStatement	pstmt		= null;
		ResultSet			rs			= null;
		String				sql			= "";
		String				dbpasswd	= "";
		int					rtnVal		= -1;
		
		try {
			conn  = getConnection();
			
			sql   = "SELECT managerPw FROM manager WHERE managerId =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs    = pstmt.executeQuery();
			
			if(rs.next()) { //id에 해당하는 자료가 있다면
				//찾은 비밀번호를 가지고 전페이지에서 넘겨준 비밀번호와 비교한다.
				dbpasswd = rs.getString("managerPw");
				
				if(dbpasswd.equals(passwd)) { //비밀번호가 일치하면
					rtnVal = 1;	//인증에 성공
				} else {
					rtnVal = 0; //비밀번호가 일치하지 않는다.
				}
			} else { //id에 해당하는 자료가 없다면 => 해당 아이디 자체가 존재하지 않는다.
				rtnVal = -1;
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if(rs    != null) try {rs.close(); 	  } catch(SQLException ex) {}
			if(pstmt != null) try {pstmt.close(); } catch(SQLException ex) {}
			if(conn  != null) try {conn.close();  } catch(SQLException ex) {}
		}
		return rtnVal;
	} // End - public int managerCheck(String id, String passwd)
	
	





} // End - class StoreBookDAO















