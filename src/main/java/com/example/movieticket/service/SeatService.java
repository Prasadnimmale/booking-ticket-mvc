package com.example.movieticket.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.movieticket.Repository.SeatRepo;
import com.example.movieticket.Repository.ShowtimeRepo;
import com.example.movieticket.entity.SeatEntity;
import com.example.movieticket.entity.ShowtimeEntity;

import jakarta.transaction.Transactional;

@Service
public class SeatService {

	@Autowired
	private SeatRepo seatRepo;
	
	@Autowired
	private ShowtimeRepo se;
	
	public List<SeatEntity> findSeatsByShowtime(ShowtimeEntity showtime) {
		return seatRepo.findByShowtime(showtime);
	}
	
    @Transactional
    @Scheduled(fixedRate = 60000)
    public void updateSeatStatus() {
        LocalDateTime now = LocalDateTime.now();

        List<ShowtimeEntity> endedShowtimes = se.findByEndTimeBefore(now);

        for (ShowtimeEntity showtime : endedShowtimes) {
            seatRepo.markSeatsAsNotBooked(showtime.getShowTimeId());
        }
    }
    
    
	
}