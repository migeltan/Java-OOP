//package HW_A2P1;

//Create a Java program using the terneary operator that will produce
//true, false, 25, 30

public class New_A2P1N2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean r1 = (x < y) ? true : false;
        boolean r2 = (x > y) ? true : false;
        int r3 = (x < y) ? x + 15 : y;
        int r4 = (x > y) ? x : y + 10;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}