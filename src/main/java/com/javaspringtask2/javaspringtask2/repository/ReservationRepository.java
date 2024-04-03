package com.javaspringtask2.javaspringtask2.repository;

import com.javaspringtask2.javaspringtask2.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
    @Query("SELECT r FROM Reservation r WHERE r.restaurant.restaurantId = :id")
    public List<Reservation> getReservationByReservationId(@Param("id") String id);
}
