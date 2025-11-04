public class casting8 {
    public static void main(String[] args){
        //implicit casting -> java allow conversion from int to double
        double price = 100.00;
        double finalPrice = price + 18;

        System.out.println(finalPrice);

        //explicit casting -> cannot convert from double to int
        int p = 100;
        int fp = p + (int)18.99;
        System.out.println(fp);
    }
}
