package mypkg.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import mypkg.bean.Board;
import mypkg.bean.Composit;
import mypkg.bean.Member;
import mypkg.common.SuperDao;

public class CompositDao extends SuperDao{

	
	
	//selectAll List<Composit>   	X 		 return join result
	//joinAll List<Member> 		    X 		 eturn join result
	
	public  List<Composit> selectAll()
	{
		List<Composit> lists = new ArrayList<Composit>();
		PreparedStatement p = null;
		ResultSet rs =null;
		String sql = " select m.id, m.name, b.subject, b.content ";
		sql += " from members m join boards b "; 
		sql +=" on m.id = b.writer ";
	
		try {
			p = super.connect.prepareStatement(sql);
			rs = p.executeQuery();
			
			while(rs.next())
			{
				Composit com = new Composit();
				com.setContent(rs.getString("content"));
				com.setId(rs.getString("id"));
				com.setName(rs.getString("name"));
				com.setSubject(rs.getString("subject"));
				lists.add(com);
				
			}
		} catch (SQLException e) {e.printStackTrace();}
		catch(Exception e2) {e2.printStackTrace();}
		finally {
			try {
					if(rs !=null) {rs.close();}
					if(p !=null) {p.close();}
					if(connect != null) {connect.close();}
				}
			catch(Exception e2) {e2.printStackTrace();}
		}
		
		
		
		
		
		
		return lists;
	}
	
	public  List<Member> joinAll()
	{
			
		String sql = "select * from members m join boards b " + 
					" on m.id = b.writer ";
		List<Member> lists = new ArrayList<Member>();
		PreparedStatement p = null;
		ResultSet rs = null;
		
		try {
			
			p = connect.prepareStatement(sql);
			rs=p.executeQuery();
			
			while(rs.next())
			{
			
				Member bean = new Member();
				
				bean.setAddress(rs.getString("address"));
				bean.setHobby(rs.getString("hobby"));
				bean.setId(rs.getString("id"));
				bean.setManager(rs.getString("manager"));
				bean.setName(rs.getString("name"));
				
				Board board = new Board();
				//Setting of all information from board
				board.setContent(rs.getNString("content"));
				bean.setBoard(board);
				
				
				bean.setSalary(rs.getInt("salary"));
				
				
				lists.add(bean);
			}
		} catch (SQLException e) {e.printStackTrace();}
		catch(Exception e2) {e2.printStackTrace();}
		finally {try{} catch(Exception e2) {e2.printStackTrace();}}
		
		
		
		
		
		
		
		
		
		return lists;
		
	}
}
