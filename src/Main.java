public class Main {
    public static void main(String[] args) {
        double priceTicketRub = 9000.20D;
        int priceInKops = (int) (priceTicketRub * 100);
        double oneMileCostRub = 20D;
        int oneMileCostKops = (int) (oneMileCostRub * 100);
        int milesAmount = priceInKops / oneMileCostKops;
        System.out.println(milesAmount);
    }
}

