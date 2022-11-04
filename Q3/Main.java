package Q3;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FooBaa");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Foo");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Baa");
                continue;
            }
            System.out.println(i);
        }
    }
}
