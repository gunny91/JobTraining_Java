package mypkg.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mypkg.bean.Board;
import mypkg.bean.Member;
import mypkg.common.SuperDao;

/**
 * selectAll  	List<board>       	X 			Search all board list
 * pk =no
 * selectAll   	List<board> 	  int,int		-->> paging process board     
 * 	 @author Geonhee Cho
 * 
 */
public class BoardDao extends SuperDao{

	
	public BoardDao() {}
	
	/**
	 * SelectAll from board
	 * @param starRow
	 * @param endRow
	 * @return
	 */
	
	public List<Board> selectAll(int starRow, int endRow) {
		
		String sql = " select no, writer, subject, password, content, readhit, regdate";
		sql += " from(select no, writer, subject, password, content, readhit, regdate,";
		sql += " rank() over(order by no desc) as ranking";
		sql+=	" from boards )";
		sql+=" where ranking between ? and ? ";
		
		
		PreparedStatement p = null;
		ResultSet rs = null;
		List<Board> lists =new ArrayList<Board>();
		
		try {
			p = super.connect.prepareStatement(sql);
			
			//p.setInt(starRow,endRow);
			p.setInt(1,starRow);
			p.setInt(2, endRow);
			rs = p.executeQuery();
			
			/**
			 * Make bean object and add it at the list
			 */
			while(rs.next())
			{
				
				Board bean = new Board();
				
				bean.setNo(rs.getInt("no"));
				bean.setContent(rs.getNString("content"));
				bean.setPassword(rs.getNString("password"));
				bean.setReadhit(rs.getInt("readhit"));
				bean.setSubject(rs.getNString("subject"));
				bean.setWriter(rs.getNString("writer"));
				bean.setRegdate(String.valueOf(rs.getDate("regdate")));
					
				lists.add(bean);
				
			}
			
			
		}
		catch(Exception e2)
		{
			e2.printStackTrace();
		}
		finally {
			try {if(rs !=null) {rs.close();}
				 if(p != null) {p.close();}
				 if(super.connect !=null) {super.connect.close();}
			}
			catch(Exception e2){e2.printStackTrace();}
		}
		return lists;
	}

/**
 * InserData 
 * @param bean
 * @return
 */

	public int insert(Board bean) {
		int count = -1 ;
		String sql ="insert into boards(no,writer,subject,password,content, readhit,regdate)";
		sql += " values(seqboard.nextval,?,?,?,?,?,?)";
		PreparedStatement p = null;
		
		try {
			super.connect.setAutoCommit(false);
			p =super.connect.prepareStatement(sql);
			p.setNString(1, bean.getWriter());
			p.setNString(2, bean.getSubject());
			p.setNString(3, bean.getPassword());
			p.setNString(4, bean.getContent());
			p.setInt(5, bean.getReadhit());
			p.setNString(6, bean.getRegdate());
			//Ä¡È¯Àº here...
			count = p.executeUpdate();
			super.connect.commit();
				
		} catch (SQLException e) {
			e.printStackTrace();
			try {super.connect.rollback();}
			catch(Exception e2) {e2.printStackTrace();}}
			finally {
				try {
					if(p !=null) {p.close();}
					if(super.connect !=null){super.connect.close();}
			}catch(Exception e2) {e2.printStackTrace();}
			
		}
		return count;
	}

/**
 * Select All list
 * @return
 */

	public List<Board> selectAll() {
		
		String sql = "select * from boards";
		List<Board> lists = new ArrayList<Board>();
		PreparedStatement p = null;
		ResultSet rs= null;
		
		try {
			p = super.connect.prepareStatement(sql);
			rs = p.executeQuery();
			
			while(rs.next())
			{
				Board bean = new Board();
				bean.setNo(rs.getInt("no"));
				bean.setContent(rs.getNString("content"));
				bean.setPassword(rs.getNString("password"));
				bean.setReadhit(rs.getInt("readhit"));
				bean.setSubject(rs.getNString("subject"));
				bean.setWriter(rs.getNString("writer"));
				bean.setRegdate(String.valueOf(rs.getDate("regdate")));
				lists.add(bean);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e2) {e2.printStackTrace();}
		finally {
			try {if(rs != null) {rs.close();}
				 if(p!=null) {p.close();}
				 if(super.connect !=null) {connect.close();}}
			catch(Exception e2) {e2.printStackTrace();}
			
		}
		return lists;
	}
	
	
	

	public Board selectOne(int sub) {
		
		String sql = "select * from boards where no =? ";
		PreparedStatement p = null;
		ResultSet rs = null;
		Board bean =null;
		
		try {
			p = super.connect.prepareStatement(sql);
			p.setInt(1,  sub);
			rs = p.executeQuery();
			
			
			while(rs.next()) {
				bean = new Board();
				bean.setContent(rs.getNString("content"));
				bean.setNo(rs.getInt("no"));
				bean.setPassword(rs.getNString("password"));
				bean.setReadhit(rs.getInt("readhit"));
				bean.setSubject("subject");
				bean.setWriter("writer");
				bean.setRegdate("regdate");
			
				
			}
		
		} catch (SQLException e) {e.printStackTrace();}
		catch(Exception e2) {e2.printStackTrace();}
		finally {
			try {if(rs !=null) {rs.close();}
				 if(p !=null) {p.close();}
				 if(connect != null) {connect.close();}}
			catch(Exception e2) {e2.printStackTrace();}
		}
		
		return bean;
	}

	
	public int deleteData(String sub) {
		int count = -1;
		
		String sql = "delete * from boards where subject = ?";
		PreparedStatement p = null;
		
		
		
		try {
			connect.setAutoCommit(false);;
			p = connect.prepareStatement(sql);
			p.setNString(1, sub);
			count = p.executeUpdate();
			connect.commit();
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				connect.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}catch(Exception e2)
		{
			e2.printStackTrace();
		}finally {
			try {
				if( p !=null) {p.close();}
				if(connect !=null) {connect.close();}
		
			}catch(Exception e2)
			{
				e2.printStackTrace();}
			}
		
		return count;
	}

	
	
	public int updateData(Board bean) {
		PreparedStatement p = null;
		String sql = " update boards set writer =?, subject=?,password=?,content=?, readhit=?,regdate=?";
		sql+= " where no =? ";
		int count =-1;
		
		try {
			connect.setAutoCommit(false); 
			p= connect.prepareStatement(sql);
			
			p.setNString(4, bean.getContent());
			p.setNString(3, bean.getPassword());
			p.setInt(5, bean.getReadhit());
			p.setNString(6, bean.getRegdate());
			p.setNString(2, bean.getSubject());
			p.setNString(1, bean.getWriter());
			p.setInt(7, bean.getNo());
			
			count = p.executeUpdate();
			connect.commit();
		} catch (SQLException e) {
			e.printStackTrace();}
			//connect.rollback();}
		  catch(Exception e2) {e2.printStackTrace();}
		finally {
			try {if(p !=null) {p.close();}
				 if(connect !=null) {connect.close();}}
			catch(Exception e2) {e2.printStackTrace();}
		}
		return count;
	}

	
	
	
	
}
