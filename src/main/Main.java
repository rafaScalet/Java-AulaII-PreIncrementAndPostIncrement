package main;

public class Main {
    public static void main(String[] args) {
        int num = 1; //bit: 00000000000000000000000000000001
        System.out.println(num);
        num = num << 1; //bit: 00000000000000000000000000000010
        System.out.println(num);
        num = num << 2; //bit: 00000000000000000000000000001000
        System.out.println(num);
    }
}
