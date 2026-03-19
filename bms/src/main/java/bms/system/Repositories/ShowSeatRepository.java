package bms.system.Repositories;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.ShowSeat;
@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long>{
    List<ShowSeat> findByShowId(Long showId);
}
