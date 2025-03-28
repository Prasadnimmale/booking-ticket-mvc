package com.example.movieticket.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.movieticket.entity.BookingEntity;
import com.example.movieticket.entity.PaymentEntity;
import com.example.movieticket.entity.ShowtimeEntity;
import com.example.movieticket.entity.UserEntity;
import com.example.movieticket.service.BookingService;
import com.example.movieticket.service.PaymentService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/movieapp")
public class PaymentController {
	
	@Autowired
	private PaymentService ps;
	
	@Autowired
	private BookingService bs;

	@GetMapping("/payments/{totalPrice}")
	public String viewPayments(@PathVariable String totalPrice, Model m, HttpSession session, HttpServletResponse response) {
		
	    UserEntity user = (UserEntity) session.getAttribute("user");
	    
	    if (user == null) {
	    	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
		m.addAttribute("totalPrice", totalPrice);
		
		return "payments";
	}
	
	@GetMapping("/payments/confirm/{amount}")
	public String confirmPayment(HttpSession session, @PathVariable double amount, HttpServletResponse response) {
			
		UserEntity user = (UserEntity) session.getAttribute("user");
		
	    if (user == null) {
	    	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
		ShowtimeEntity showtime = (ShowtimeEntity) session.getAttribute("showtimeId");
		
		PaymentEntity donePayment = ps.processPayment(user.getId(), amount);
		
		BookingEntity doneBooking = bs.createBooking(user, showtime, donePayment);
		
		if(doneBooking != null) {
			return "thankyou";
		}
		
		return null;
	}
}