package bms.system.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.Show;
@Repository
public interface ShowRepository extends JpaRepository<Show,Long>{
    List<Show> findbyMovieId(Long movieId);
}
