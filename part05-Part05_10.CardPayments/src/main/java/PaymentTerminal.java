
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment

        
        double remain = 0;
        if (payment >= 2.50) {
            remain = payment - 2.50;
            this.affordableMeals++;
            this.money += 2.50;
        } else {
            remain = payment;
        }
        return remain;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        boolean isOk = false;
        if (card.takeMoney(2.50)) {
            this.affordableMeals++;
            isOk = true;
        }
        return isOk;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        boolean isOk = false;
        if (card.takeMoney(4.30)) {
            this.heartyMeals++;
            isOk = true;
        }
        return isOk;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double remain = 0;
        if (payment >= 4.30) {
            remain = payment - 4.30;
            this.heartyMeals++;
            this.money += 4.30;
        } else {
            remain = payment;
        }
        return remain;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
