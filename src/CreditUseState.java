public class CreditUseState implements BalanceStatus {
    @Override
    public void changeStatus(Card card) {
        if (card.getBalance() < -50000) {
            card.setBalanceStatus(new BlockedState());
        }
        if (card.getBalance() >= 0) {
            card.setBalanceStatus(new RegularState());
        }
    }

    @Override
    public void showBalanceStatus(Card card) {
        System.out.println("Задействованы кредитные средства в размере " + Math.abs(card.getBalance()));
    }
}
