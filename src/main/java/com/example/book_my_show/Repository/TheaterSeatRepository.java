package com.example.book_my_show.Repository;

import com.example.book_my_show.Entities.TheaterSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatRepository extends JpaRepository<TheaterSeatEntity, Integer> {
}
