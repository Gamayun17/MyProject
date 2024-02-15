package by.me.data.pojo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="loyal_card_details")
public class CardDetails implements Serializable {
    @Id
    @Column(name="id")
    private int cardDetailsId;
    @Column(name="card_number")
    private String cardNumber;
    @Column(name="card_balance")
    private String cardBalance;
    @Column(name="card_cvv")
    private int cardCvv;

    @ManyToOne
    @JoinColumn(name="loyal_card_id")
    private Card card;
}
