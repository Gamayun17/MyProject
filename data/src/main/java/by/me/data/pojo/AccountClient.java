package by.me.data.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="loyal_account_client")
public class AccountClient {
   @Id
   @Column(name="client_account_id")
   private String clientAccountId;
    @Column(name="account_number")
    String accountNumber;
    @Column(name="account_currency")
    private String accountCurrency;
    @Column(name="account_balance")
    private String accountBalance;
}
