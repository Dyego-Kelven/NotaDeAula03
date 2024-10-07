import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o nome do cachorro?");
        String nomeCachorro = sc.nextLine();
        Cachorro cachorro = new Cachorro(nomeCachorro);


        System.out.println("Qual o nome do gato?");
        String nomeGato = sc.nextLine();
        Gato gato = new Gato(nomeGato);


        cachorro.caminha();
        cachorro.late();


        gato.caminha();
        gato.mia();

        sc.close();
    }
}


