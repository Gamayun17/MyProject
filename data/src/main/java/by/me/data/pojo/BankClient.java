package by.me.data.pojo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "loyal_client")
public class BankClient implements Serializable {
    @Id
    @Column(name = "id")
    private int bankClientId;
    @Column(name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "id_loyal_role")
    private Role role;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;}