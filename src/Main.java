public class Main {
    public static void main(String[] args) {
        double priceticketrub = 9000.20D;
        int priceInKops = (int) (priceticketrub * 100);
        double oneMileCostrub = 20D;
        int oneMileCostKops = (int) (oneMileCostrub * 100);
        int milesamount = priceInKops / oneMileCostKops;
        System.out.println(milesamount);
    }
}

