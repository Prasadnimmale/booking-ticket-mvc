package com.example.movieticket.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movieticket.entity.PaymentEntity;



@Repository
public interface PaymentRepo extends JpaRepository<PaymentEntity, Integer>{

}