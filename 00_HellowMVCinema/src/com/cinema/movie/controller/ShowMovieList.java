package com.cinema.movie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.movie.model.service.MovieService;
import com.cinema.movie.model.vo.Movie;

/**
 * Servlet implementation class ShowMovieList
 */
@WebServlet("/movie/showMovieList.do")
public class ShowMovieList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		List<Movie> mlist = new MovieService().showMovies();
		
		String view ="/WEB-INF/views/movie/movieList.jsp";
		
		request.setAttribute("mlist", mlist);
		
		request.getRequestDispatcher(view).forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
