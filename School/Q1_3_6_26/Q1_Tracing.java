//package Q1_3_6_26;

public class Q1_Tracing {

    public static void main (String[] args){

        int a = 43;
        int b = 56;
        int c = 35;
        int d = 75;

        System.out.println((a++ > b++) && (a++ < b++)); 
        // 43 > 56 → false, right side NOT executed due to &&
        // a = 44, b = 57

        System.out.println(++a * ++c); 
        // a = 45, c = 36 → 45 * 36 = 1620

        System.out.println((a++ < ++c) & (d++ > c++)); 
        // 45 < 37 → false  &  75 > 37 → true
        // a = 46, c = 38, d = 76 → result = false

        System.out.println((d++ > c++) & (d++ < b++)); 
        // 76 > 38 → true  &  77 < 57 → false
        // d = 78, c = 39, b = 58 → result = false

        System.out.println(a++ + ++d); 
        // 46 + 79 = 125
        // a = 47, d = 79

        System.out.println((a++ > b++) & (a++ < b++)); 
        // 47 > 58 → false  &  48 < 59 → true
        // a = 49, b = 60 → result = false

        System.out.println((d++ < ++b) & (a++ > d++)); 
        // 79 < 61 → false  &  49 > 80 → false
        // d = 81, a = 50, b = 61 → result = false

        System.out.println(--a - ++d); 
        // 49 - 82 = -33
        // a = 49, d = 82

        System.out.println((a-- > ++b) & (a++ > b++)); 
        // 49 > 62 → false  &  48 > 62 → false
        // a = 49, b = 63 → result = false

        System.out.println(a++ + ++b); 
        // 49 + 64 = 113
        // a = 50, b = 64

        System.out.println((a++ > b++) & (a++ < ++c)); 
        // 50 > 64 → false  &  51 < 40 → false
        // a = 52, b = 65, c = 40 → result = false

        System.out.println((d++ < ++b) & (a++ > ++b)); 
        // 82 < 66 → false  &  52 > 67 → false
        // d = 83, a = 53, b = 67 → result = false

        System.out.println(a++ > ++b); 
        // 53 > 68 → false
        // a = 54, b = 68

        System.out.println((a++ > ++b) & (a++ > d++)); 
        // 54 > 69 → false  &  55 > 83 → false
        // a = 56, b = 69, d = 84 → result = false

        System.out.println(a++ - ++c); 
        // 56 - 41 = 15
        // a = 57, c = 41
    }
}