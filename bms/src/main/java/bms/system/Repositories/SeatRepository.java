package bms.system.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.Seat;
@Repository
public interface SeatRepository extends JpaRepository<Seat,Long>{
    List<Seat> findByHallId(Long hall_id);
}
