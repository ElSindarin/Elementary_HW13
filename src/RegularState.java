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
    public void buyItem(Card card, Double price) {
        if (card.getBalance() - price <= -50000.00) {
            System.out.println("Личных и кредитных средств не хватит на эту покупку. Операция будет проведена, но счёт будет заблокирован до погашения избытка использования кредитных средств");
        }
        card.setBalance(card.getBalance() - price);
    }

    @Override
    public void showBalanceStatus(Card card) {
        System.out.println("Банковская карта используется в обычном режиме. Кредитные средства не задействованы");
    }
}
