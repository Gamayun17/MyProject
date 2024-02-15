package by.me.data.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="loyal_deposit")
public class Deposit implements Serializable {
    @Id
    @Column(name="deposit_id")
    private int depsositId;
    @Column(name="deposit_name")
    private String nameDeposit;
    @Column(name="deposit_sum")
    private String sumDeposit;
    @Column(name="percentage_deposit")
    private String percentageDeposit;
}
