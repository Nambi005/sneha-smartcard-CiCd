public class Journey {
    private int start;
    private int end;

    public void setJourney(int start, int end) {
        if (start >= 1 && start <= 10 && end >= 1 && end <= 10 && start != end) {
            this.start = start;
            this.end = end;
        } else {
            System.out.println("Invalid journey");
        }
    }

    public int calculateDistance() {
        return Math.abs(end - start);
    }

    public double calculateFare() {
        return calculateDistance() * 2.0;
    }
}
