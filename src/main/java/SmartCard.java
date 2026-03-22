//CI/CD test: triggering pipeline
public class SmartCard {
    private int cardID;
    private double balance;

    public void setSmartCardID(int cardID) {
        this.cardID = cardID;
    }

    public int getSmartCardID() {
        return cardID;
    }

    public void setBalance(double balance) {
        if (balance >= 5) {
            this.balance = balance;
        } else {
            System.out.println("Minimum balance is $5");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void topUp(double amount) {
        balance += amount;
    }

    public boolean deductFare(double fare) {
        if (balance >= fare) {
            balance -= fare;
            return true;
        }
        return false;
    }
}
