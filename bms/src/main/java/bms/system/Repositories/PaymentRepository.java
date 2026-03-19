package bms.system.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bms.system.Models.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long>{
    
}
