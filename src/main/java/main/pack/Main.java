package main.pack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Вова!");
        String a = Tester.englishPlus("B1");
        System.out.println(a);
        Tester tester = new Tester();
        tester.remember(false);
        tester.remember();
    }
}
