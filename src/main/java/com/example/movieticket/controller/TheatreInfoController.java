package com.example.movieticket.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.movieticket.entity.MovieEntity;
import com.example.movieticket.entity.ShowtimeEntity;
import com.example.movieticket.entity.UserEntity;
import com.example.movieticket.service.MovieService;
import com.example.movieticket.service.ShowtimeService;
import com.example.movieticket.service.TheatreService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/movieapp")
public class TheatreInfoController {
	
	@Autowired
	TheatreService ts;
	
	@Autowired
	ShowtimeService ss;
	
	@Autowired
	MovieService ms;
	
	@GetMapping("/theatre-info/{theatreId}/{movieId}")
	public String viewTheatreInfo(@PathVariable int theatreId, @PathVariable int movieId, Model m, HttpSession session, HttpServletResponse response) {
				
        UserEntity user = (UserEntity) session.getAttribute("user");

        if (user == null) {
        	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
		MovieEntity movie = ms.getMovieById(movieId);
		if (movie == null) {
			System.out.println("Movie not found!");
			
		}
		
		List<ShowtimeEntity> datesAndTimes = ss.findStartDateAndStartTimeByMovie(movie);
		
		com.example.movieticket.entity.TheatreEntity theatre = ts.getTheatreById(theatreId);
		
		m.addAttribute("selectedTheatre", theatre);
		m.addAttribute("datesAndTimes", datesAndTimes);
		
		return "theatreInfo";
	}
	
	@GetMapping("/theatre-info-movie/{theatreId}/{movieId}")
	public String viewTheatreInfoMovie(@PathVariable int theatreId, @PathVariable int movieId, Model m, HttpSession session, HttpServletResponse response) {
		
        UserEntity user = (UserEntity) session.getAttribute("user");

        if (user == null) {
        	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
		
		MovieEntity movie = ms.getMovieById(movieId);
		if (movie == null) {
			System.out.println("Movie not found!");
		}
		
		List<ShowtimeEntity> datesAndTimes = ss.findStartDateAndStartTimeByMovie(movie);
		
		com.example.movieticket.entity.TheatreEntity theatre = ts.getTheatreById(theatreId);
		
		m.addAttribute("selectedTheatre", theatre);
		m.addAttribute("movieInfo", movie);
		m.addAttribute("datesAndTimes", datesAndTimes);
		
		return "movieDateShowtimeSelection";
	}
	
}