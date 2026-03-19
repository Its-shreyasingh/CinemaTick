package bms.system.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.Hall;
@Repository
public interface HallRepository extends JpaRepository<Hall,Long>{
    
}
