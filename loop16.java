public class loop16 {
    public static void main(String[] args) {

        //for loop
        for(int i=100;i>1;i--){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();

        //while loop
        int i=1;
        while(i<=100){
            System.out.print(i);
            System.out.print(" ");
            i++;
        }
        System.out.println();

        //do while
        int k=100;
        do{
            System.out.print(k);
            System.out.print(" ");           
            k--;
        }while(k>0);

    }
}
