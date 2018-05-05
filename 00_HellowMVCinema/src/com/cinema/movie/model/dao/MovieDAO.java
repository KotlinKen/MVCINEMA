package com.cinema.movie.model.dao;
import static com.cinema.common.JDBCTemplate.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.cinema.movie.model.vo.Movie;




public class MovieDAO {
	private Properties prop = new Properties();
	
	
	public MovieDAO() {
		URL fileUrl = MovieDAO.class.getResource("/sql/movie/movie-query.properties");
		String fileName = fileUrl.getPath();
		
		try {
			prop.load(new FileReader(fileName));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public int insertMovies(Connection conn, Movie m) {
		int result = 0; 
		
		//mid, name, ename, grade, time, director, actor, genre, 
		//story, reldate, poster, subimg, trailer, regdate : default
		
		PreparedStatement pstmt = null;
		String query = prop.getProperty("insertMovies");
		
		try {
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, m.getMid());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getEname());
			pstmt.setString(4, m.getGrade());
			pstmt.setString(5, m.getTime());
			pstmt.setString(6, m.getDirector());
			pstmt.setString(7, m.getActor());
			pstmt.setString(8, m.getGenre());
			pstmt.setString(9, m.getStory());
			pstmt.setString(10, m.getReldate());
			pstmt.setString(11, m.getPoster());
			pstmt.setString(12, m.getSubimg());
			pstmt.setString(13, m.getTrailer());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}


	public List<Movie> showMovies(Connection conn) {
		List<Movie> mlist = new ArrayList<>(); 
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		
		String query = prop.getProperty("showMovies");

		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			//mid, name, ename, grade, time, director, actor, genre, 
			//story, reldate, poster, subimg, trailer, regdate : default
			
			while(rs.next()) {
				Movie m = new Movie();
				m.setMid(rs.getString("MID"));
				m.setName(rs.getString("NAME"));
				m.setEname(rs.getString("ENAME"));
				m.setGrade(rs.getString("GRADE"));
				m.setTime(rs.getString("TIME"));
				m.setDirector(rs.getString("DIRECTOR"));
				m.setActor(rs.getString("ACTOR"));
				m.setGenre(rs.getString("GENRE"));
				m.setStory(rs.getString("STORY"));
				m.setReldate(rs.getString("RELDATE"));
				m.setPoster(rs.getString("POSTER"));
				m.setSubimg(rs.getString("SUBIMG"));
				m.setTrailer(rs.getString("TRAILER"));
				m.setRegdate(rs.getDate("REGDATE"));
				mlist.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			
		}
		
		return mlist;
	}
	

}
