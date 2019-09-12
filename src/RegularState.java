public class RegularState implements BalanceStatus {
    @Override
    public void changeStatus(Card card) {
        if (card.getBalance() < -50000) {
            card.setBalanceStatus(new BlockedState());
        }
        else {
            if (card.getBalance() < 0) {
                card.setBalanceStatus(new CreditUseState());
            }
        }
    }

    @Override
    public void showBalanceStatus(Card card) {
        System.out.println("Банковская карта используется в обычном режиме. Кредитные средства не задействованы");
    }
}
