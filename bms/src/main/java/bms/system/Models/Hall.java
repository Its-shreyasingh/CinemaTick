package bms.system.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Hall extends BaseModel {

    @ManyToOne
    @JoinColumn(name="theater_id")
    private Theater theater;
}
