import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Requisito 01: Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        System.out.print("Informe um número: ");
        int x = sc.nextInt();
        
        sc.close();

        System.out.print("O número informado foi " + x);

    }
}
