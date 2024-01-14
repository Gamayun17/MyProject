package by.me.data.entity;

public class Credit {

    private String creditid;
    private String creditsummary;
    private String creditexisting;
    private User user;

    public Credit(){}

    public Credit(String creditid, String creditsummary, String creditexisting, User user) {
        this.creditid = creditid;
        this.creditsummary = creditsummary;
        this.creditexisting = creditexisting;
        this.user = user;
    }

    public String getCreditid() {
        return creditid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid;
    }

    public String getCreditsummary() {
        return creditsummary;
    }

    public void setCreditsummary(String creditsummary) {
        this.creditsummary = creditsummary;
    }

    public String getCreditexisting() {
        return creditexisting;
    }

    public void setCreditexisting(String creditexisting) {
        this.creditexisting = creditexisting;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
