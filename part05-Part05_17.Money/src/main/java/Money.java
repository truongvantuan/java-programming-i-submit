
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int cents = this.cents + addition.cents();
        int euros = this.euros + addition.euros();

        if (cents >= 100) {
            cents = cents - 100;
            euros += 1;
        }
        
        return new Money(euros, cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        if (this.euros == compared.euros() && this.cents < compared.cents) {
            return true;
        }
        return false;
    }

    public Money minus(Money decreaser) {
        int ce = 0;
        int eu = 0;
        Money newMoney;
        if (this.cents < decreaser.cents) {
            ce = 100 - decreaser.cents;
            eu = this.euros - 1 - decreaser.euros;
        } else {
            eu = this.euros - decreaser.euros;
            ce = this.cents - decreaser.cents;
        }
        if (eu >= 0) {
            newMoney = new Money(eu, ce);
        } else {
            newMoney = new Money(0, 0);
        }
        return newMoney;
    }
}
