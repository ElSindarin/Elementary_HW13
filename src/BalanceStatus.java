public interface BalanceStatus {
    void changeStatus(Card card);
    void showBalanceStatus(Card card);
    void buyItem(Card card, Double price);
}
