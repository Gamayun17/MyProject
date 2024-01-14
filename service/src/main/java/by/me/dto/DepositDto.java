package by.me.dto;



public class DepositDto {
    private final String depsositid;
    private final String depositsummary;
    private final String depositexisting;

    public DepositDto(String depsositid, String depositsummary, String depositexisting) {
        this.depsositid = depsositid;
        this.depositsummary = depositsummary;
        this.depositexisting = depositexisting;
    }

    public String getDepsositid() {
        return depsositid;
    }

    public String getDepositsummary() {
        return depositsummary;
    }

    public String getDepositexisting() {
        return depositexisting;
    }
}
