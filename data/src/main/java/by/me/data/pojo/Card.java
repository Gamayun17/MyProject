package by.me.data.pojo;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name ="loyal_card")
public class Card implements Serializable {
    @Id
   @Column(name="id")
   private int cardId;
    @Column(name = "name")
    private String nameId;
    @OneToMany(mappedBy="card")
    private List<CardDetails> cardDetails;


}