public class Main {
    public static void main(String[] args) {
        double priceticketrub = 9000.20D;
        int priceInKops = (int) (priceticketrub * 100);
        double onemilecostrub = 20D;
        int onemilecostKops = (int) (onemilecostrub * 100);
        int milesamount = priceInKops / onemilecostKops;
        System.out.println(milesamount);
    }
}

