
public class L1_Intro1 {
    public static void main(String[] args){
        int x = 55;
        int y = 52;
        int z = 33;
        int a = 28;
        int b = 41;

        System.out.println(a++ + --b); // 28 + 40 = 68
        System.out.println(++x + ++y); // 56 + 53 = 109
        System.out.println(++z + a--); // 34 + 29 = 63
        System.out.println(--b + ++x); // 39 + 57 = 96
        System.out.println(y++ + --z); // 53 + 33 = 86
        System.out.println(++a + ++b); // 29 + 40 = 69
        System.out.println(x++ + --y); // 57 + 53 = 110
        System.out.println(++z - ++a); // 34 - 30 = 4
        System.out.println(b++ + --x); // 40 + 57 = 97
        System.out.println(y++ + --z); // 53 + 33 = 86
    }

}

/*Key principles of OOP:
    1. Polymorphism
    2. Inheritance
    3. Abstraction
    4. Encapsulation

    Brief history:
    Called the Green Project. Originally called OAK but had trademark issues.
    Java - From Java Coffee

    SE - Standard Edition, LTS - Long Term Support (Enterprise Environments)
    Java Community & Java Enterprise

    Write Once Run Anywhere
    Robust - Exception handling, to know errors
    Dynamic - Runtime, can adapt while running the code.

    JVM -> JRE -> JDK
     */

/* Phases of Java:
1. Write source code -> .java
2. Compiles by javac
3. Generates bytecode
.class is the one that JVM executes, which is the bytecode.
4. JVM executes bytecode 
 */

