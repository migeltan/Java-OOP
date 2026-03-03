//package HW_A2P1;

//Create a Java program using biwise operators, produces: true, 10, false, 15

public class New_A2 {
    public static void main(String[] args) {

        int a = 5; 
        int b = 3;   

        boolean result1 = (a & b) == 1;
        int result2 = a << 1;  
        boolean result3 = (a | b) == 7;
        int result4 = a ^ 10;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3 == false);
        System.out.println(result4);
    }
}