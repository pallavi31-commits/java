public class string5 {
    public static void main(String[] args) {
        //String functions

        //concatenate
        // String name1 = "Pallavi";
        String name1 = new String("Pallavi");
        String name2 = "Rao";
        String name3 = name1 + " Govind " + name2;
        System.out.println(name3);

        //charAt
        String name = "Pallavi Govind";
        System.out.println(name.charAt(5));

        //length
        System.out.println(name.length());

        //replace
        String name4 = name1.replace('l','p');
        System.out.println(name4);
        System.out.println(name1); //string in java are immutable

        //substring
        System.out.println(name.substring(6,14));
    }
}
