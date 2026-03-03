//Activity #2: Part II

public class New_A2P2N1 {
    public static void main(String[] args) {

        //boolean
        int m = 7;
        int n = 4;
        // 1) Arithmetic + rwlational 
        boolean output1 = (m * 2 > n + 5);
        // 1) Logical + Relational
        boolean output2 = !(m == n) && (m > n);

        //numeric        
        // 1) Bitwise operators
        int output3 = m << 2;
        // 1) Assignment operator
        int p = 30;
        p += 15;
        int output4 = p;

        //numeric
        // 3) tricky increment case
        int q = 5;
        int output5 = q++ + ++q;
        // 6. Arithmetic computation
        int output6 = (20 - 3) * 2;

        //2) six outputs
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
        System.out.println(output6);
    }
}