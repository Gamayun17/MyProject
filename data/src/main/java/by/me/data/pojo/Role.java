package by.me.data.pojo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "loyal_role")
public class Role implements Serializable {
    @Id
    @Column(name = "id")
    private Integer roleId;
    @Column(name = "role")
    private String role;
    @OneToOne(mappedBy ="role")
    private BankClient bankClient;

}