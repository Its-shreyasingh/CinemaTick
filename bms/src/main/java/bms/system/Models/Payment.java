package bms.system.Models;

import bms.system.Enums.PaymentMode;
import bms.system.Enums.PaymentStatus;
import jakarta.persistence.Enumerated;

import java.util.*;
import lombok.Getter;

@Getter
public class Payment extends BaseModel {

    private final String referenceID;
    private final Double amount;
    @Enumerated
    private final PaymentMode mode;
    @Enumerated
    private final PaymentStatus status;

    public Payment(Long id,Date createdAt,Date updatedAt,String referenceId,Double amount,PaymentMode mode,PaymentStatus status)
    {
        super(id, createdAt, updatedAt);
        this.referenceID=referenceId;
        this.amount=amount;
        this.mode=mode;
        this.status=status;
    }
}
