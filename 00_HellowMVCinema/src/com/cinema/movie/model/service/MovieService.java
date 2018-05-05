package com.cinema.movie.model.service;

import java.sql.Connection;
import java.util.List;

import com.cinema.movie.model.dao.MovieDAO;
import com.cinema.movie.model.vo.Movie;
import static com.cinema.common.JDBCTemplate.*;

public class MovieService {

	public int insertMovie(Movie m) {
		
		int result =0;
		Connection conn = getConnection();
		result = new MovieDAO().insertMovies(conn, m);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		} 
		close(conn);
		
		return result;
	}

	public List<Movie> showMovies() {
		Connection conn =getConnection();
		List<Movie> mList = new MovieDAO().showMovies(conn); 
		
		if(mList != null) {
			System.out.println("바쁘구만");
		}else {
			System.out.println("널널하구만");
			
		}
		close(conn);
		
		return mList;
	}

}
