public class conditionalStatement13 {
    public static void main(String[] args) {
        boolean isSunUp = true;
        if(isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");

        //logical operators (&&)
        int a=60;
        int b=10;
        
        if(a<50 && b<50)
            System.out.println("both less than 50");

        //logical operators (||)
        if(a<50 || b<50)
            System.out.println("atleast one less than 50");

        //logical operators (!)
        boolean isAdult = false;
        if(!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");
    }
}
