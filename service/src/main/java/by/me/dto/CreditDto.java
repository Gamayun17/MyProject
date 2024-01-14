package by.me.dto;

public class CreditDto {

    private final String creditid;
    private final String creditsummary;
    private final String creditexisting;

    public CreditDto(String creditid, String creditsummary, String creditexisting) {
        this.creditid = creditid;
        this.creditsummary = creditsummary;
        this.creditexisting = creditexisting;
    }

    public String getCreditid() {
        return creditid;
    }

    public String getCreditsummary() {
        return creditsummary;
    }

    public String getCreditexisting() {
        return creditexisting;
    }
}
