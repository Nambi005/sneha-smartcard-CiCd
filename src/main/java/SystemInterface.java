public class SystemInterface {

    private void run() {
        SmartCard card = new SmartCard();
        card.setSmartCardID(101);
        card.setBalance(20);

        Journey journey = new Journey();
        journey.setJourney(2, 6);

        double fare = journey.calculateFare();

        if (card.deductFare(fare)) {
            System.out.println("Journey successful. Fare: " + fare);
        } else {
            System.out.println("Insufficient balance");
        }

        System.out.println("Remaining balance: " + card.getBalance());
    }

    public static void main(String[] args) {
        new SystemInterface().run();
    }
}
