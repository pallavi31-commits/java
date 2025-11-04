public class continue18 {
    public static void main(String[] args) {
        int i=0;
        while(true){
            if(i==3){
                i++;
                continue; //yaha i==3 hai to i badh kr 4 ho jayega aur aage ka code iss rount me run nhi krega
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }
        }
    }
}
