package one.digitalinnovation.gof.aboutme;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite seu nome");
            String firstName = scanner.next();

            System.out.println("Digite seu sobrenome");
            String lastName = scanner.next();

            System.out.println("Digite sua altura");
            double height = scanner.nextDouble();

            System.out.println("Digite sua idade");
            int age = scanner.nextInt();
            System.out.println("Ola, meu nome é: " + firstName + " " + lastName);
            System.out.println("Tenho " + age + " anos");
            System.out.println("Minha altura é " + height + " cm");

        } catch (Exception e) {
            System.out.println("Leia com atenção. os campos são de números: POR FAVOR DIGITE CORRETAMENTE KKKKKK");
        }

    }
}
