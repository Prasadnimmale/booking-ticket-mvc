package com.example.movieticket.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.movieticket.entity.UserEntity;
import com.example.movieticket.service.UserService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/movieapp")
public class ProfileController {

	@Autowired
	private UserService us;
	
	@GetMapping("/profile")
	public String viewProfile(HttpSession session, Model model, HttpServletResponse response) {
		UserEntity user = (UserEntity) session.getAttribute("user");

        if (user == null) {
        	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        model.addAttribute("currentUser", user);
        return "profile";
	}
	
	@GetMapping("/profile/edit")
    public String showEditProfile(HttpSession session, Model model, HttpServletResponse response) {
        UserEntity user = (UserEntity) session.getAttribute("user");
        if (user == null) {
        	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        model.addAttribute("currentUser", user);
        return "editProfile";
    }

    @PostMapping("/profile/update")
    public String updateProfile(@RequestParam String email, @RequestParam String phone, HttpSession session, Model model, HttpServletResponse response) {

        UserEntity user = (UserEntity) session.getAttribute("user");
        if (user == null) {
        	try {
				response.sendRedirect("/movieapp/login");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        boolean isUpdated = us.updateUser(user.getId(), email, phone);

        if (isUpdated) {
            user.setEmail(email);
            user.setPhoneNumber(phone);
            session.setAttribute("user", user);

            model.addAttribute("message", "Profile updated successfully.");
        } else {
            model.addAttribute("error", "Failed to update profile.");
        }

        return "editProfile";
    }
	
	
}