package bms.system.DTOs;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class PaymentDto {
    private String referenceId;
    private String paymentMode;
    private String status;
    private LocalDateTime paymentTime;
}
