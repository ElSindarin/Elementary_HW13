public class Card {
    private BalanceStatus balanceStatus;
    private Double balance;

    public Card(BalanceStatus balanceStatus, Double balance) {
        this.balance = balance;
        this.balanceStatus = balanceStatus;
    }

    public void changeStatus() {
        balanceStatus.changeStatus(this);
    }

    public void showBalanceStatus () {
        balanceStatus.showBalanceStatus(this);
    }

    public Double getBalance() {
        return balance;
    }

    public void buyItem (Double price) {
        balanceStatus.buyItem(this,price);
    }

    public void fillAccount (Double amount) {
        if (amount < 0) {
            System.out.println("Нельзя пополнить счёт на отрицательную величину");
        }
        else {
            System.out.println("Счёт пополнен на " +amount + ".");
            balance += amount;
        }
    }

    public void setBalanceStatus(BalanceStatus balanceStatus) {
        this.balanceStatus = balanceStatus;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
