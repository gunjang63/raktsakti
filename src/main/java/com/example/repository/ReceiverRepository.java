package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.BloodBank;
import com.example.entity.Receiver;


@Repository
public interface ReceiverRepository extends JpaRepository<Receiver, Long>{
	
}
