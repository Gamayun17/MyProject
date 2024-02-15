package by.me.data.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loyal_credit")
public class Credit {

    @Id
    @Column(name="credit_id")
    private String creditId;
    @Column(name="name_credit")
    private String nameCredit;
    @Column(name="sum_credit")
    private String sumCredit;
    @Column(name="percentage_credit")
    private String percentageCredit;
}