package Challenge;

public class Account {
    private String name, kindAccount;
    private double initialAmount;
    public Account(String name, String kindAccount, double initialAmount) {
        this.name = name;
        this.kindAccount = kindAccount;
        this.initialAmount = initialAmount;
    }

    @Override
    public String toString() {
        return "*********************************\n" +
                "Client's Data: \n\n" +
                "Name: " + this.name + '\n' +
                "Kind Account: " + this.kindAccount + '\n' +
                "Initial Amount: R$ " + this.initialAmount + '\n' +
                "*********************************\n\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindAccount() {
        return kindAccount;
    }

    public void setKindAccount(String kindAccount) {
        this.kindAccount = kindAccount;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount += initialAmount;
    }

    public Double checkAmount(){
        return this.getInitialAmount();
    }

    public String receiveCash(double cash){
        if (cash > 0) {
            this.setInitialAmount(cash);
            return updatedBalance();
        } else
           return String.format("Sorry, impossible to receive a negative value (R$ %.2f)\n", cash);
    }

    public String transferCash(double cash){
        if (this.checkAmount() > cash){
            this.setInitialAmount(-cash);
            return updatedBalance();
        } else
            return String.format("Sorry, impossible to transfer R$ %.2f, because you only have R$ %.2f\n", cash, this.checkAmount());
    }

    public String updatedBalance(){
        return "New value updated - R$ " + this.checkAmount().toString();
    }
}
