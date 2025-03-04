package com.example.movieticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.movieticket.entity.ShowtimeEntity;
import com.example.movieticket.entity.UserEntity;
import com.example.movieticket.service.ShowtimeService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/movieapp")
public class MoviesInTheatreController {
    
    @Autowired
    private ShowtimeService ss;
    
    @GetMapping("/view-theatre/{theatreId}")
    public String moviesInTheatre(@PathVariable int theatreId, Model m, HttpSession session) {
        UserEntity user = (UserEntity) session.getAttribute("user");
        
        if (user == null) {
            return "redirect:/movieapp/login";  // Proper redirection
        }
        
        List<ShowtimeEntity> movies = ss.findByTheatreId(theatreId);
        
        if (!movies.isEmpty()) {  // Check if movies list is not empty
            m.addAttribute("theatreName", movies.get(movies.size() - 1).getTheatre().getName());
        } else {
            m.addAttribute("theatreName", "Unknown Theatre");
        }
        
        m.addAttribute("movieList", movies);
        m.addAttribute("theatreId", theatreId);
        
        return "moviesInTheatre";
    }
}
