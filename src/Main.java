public class Main {
    public static void main(String[] args) {
        double PriceTicketRub = 9000.20D;
        int PriceInKops = (int) (PriceTicketRub * 100);
        double OneMileCostrub = 20D;
        int oneMileCostKops = (int) (OneMileCostrub * 100);
        int MilesAmount = PriceInKops / oneMileCostKops;
        System.out.println(MilesAmount);
    }
}

