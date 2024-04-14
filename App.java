import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Bom dia "+nome);
        int idade;
        System.out.println("Informe sua idade");
        idade = sc.nextInt();
        System.out.println("opa " +nome+ " voce tem " +idade+ " anos");
    }
}
