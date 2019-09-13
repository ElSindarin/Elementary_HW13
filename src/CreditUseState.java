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
    public void buyItem(Card card, Double price) {
        if (card.getBalance() - price <= -50000.00) {
            System.out.println("Кредитных средств не хватит на эту покупку. Операция будет проведена, но счёт будет заблокирован до погашения избытка использования кредитных средств");
        }
        card.setBalance(card.getBalance() - price);
    }

    @Override
    public void showBalanceStatus(Card card) {
        System.out.println("Задействованы кредитные средства в размере " + Math.abs(card.getBalance()));
    }
}
