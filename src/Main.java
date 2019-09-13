public class Main {

    public static void main(String[] args) {
        Card card = new Card(new RegularState(),30000.00);
        System.out.println("Изначальный баланс карты составляет " + card.getBalance());
        card.changeStatus();
        card.showBalanceStatus();
        System.out.println();
        buyItemAttempt(card, 25000.00);
        buyItemAttempt(card, 10000.00);
        buyItemAttempt(card, 20000.00);
        buyItemAttempt(card, 50000.00);
        buyItemAttempt(card, 150000.00);
        card.fillAccount(-50.00);
        card.fillAccount(31000.00);
        card.changeStatus();
        card.showBalanceStatus();


    }

    public static void buyItemAttempt (Card card, Double itemPrice) {
        System.out.println("Происходит попытка покупки товара на сумму " + itemPrice);
        card.buyItem(itemPrice);
        card.changeStatus();
        card.showBalanceStatus();
        System.out.println();
    }
}
