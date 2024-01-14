package by.me.data.entity;

public class Deposit {
    private String depsositid;
    private String depositsummary;
    private String depositexisting;
    private User user;

    public Deposit(){}

    public Deposit(String depsositid, String depositsummary, String depositexisting, User user) {
        this.depsositid = depsositid;
        this.depositsummary = depositsummary;
        this.depositexisting = depositexisting;
        this.user = user;
    }

    public String getDepsositid() {
        return depsositid;
    }

    public void setDepsositid(String depsositid) {
        this.depsositid = depsositid;
    }

    public String getDepositsummary() {
        return depositsummary;
    }

    public void setDepositsummary(String depositsummary) {
        this.depositsummary = depositsummary;
    }

    public String getDepositexisting() {
        return depositexisting;
    }

    public void setDepositexisting(String depositexisting) {
        this.depositexisting = depositexisting;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
