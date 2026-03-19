package bms.system.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {
    
}
