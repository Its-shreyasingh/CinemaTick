package bms.system.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.Ticket;
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long>{
    List<Ticket> findByUserId(Long userId);
}
