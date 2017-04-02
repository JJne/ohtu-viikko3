import java.util.*;
import ohtu.Multiplier;

public class Main {
    public static void main(String[] args) {
        final int MULTIPLIER = 3;

        Scanner scanner = new Scanner(System.in);
        Multiplier kolme = new Multiplier(MULTIPLIER);
        System.out.println("anna luku ");
        int luku = scanner.nextInt();

        System.out.println("luku kertaa kolme on "+kolme.multipliedBy(luku) );
    }
}
