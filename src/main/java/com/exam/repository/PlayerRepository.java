package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Integer> {

}
