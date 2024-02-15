package by.me.data.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="loyal_person")
public class Person {
    @Id
    @Column(name = "person_id")
    private String personId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="passport")
    private String passport;
    @Column(name="phone_number")
    private String phoneNumber;
}
