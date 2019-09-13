public class BlockedState implements BalanceStatus {
    @Override
    public void changeStatus(Card card) {
        if (card.getBalance() < -50000) {
            card.setBalanceStatus(new BlockedState());
        }
        if (card.getBalance() < 0 && card.getBalance() >= -50000) {
            card.setBalanceStatus(new CreditUseState());
        }
    }

    @Override
    public void buyItem(Card card, Double price) {
        System.out.println("Операция невозможна");
    }

    @Override
    public void showBalanceStatus(Card card) {
        System.out.println("Карта заблокирована");
    }
}
