import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do gerente:");
        String nomeGerente = scanner.nextLine();
        System.out.println("Digite a data de nascimento do gerente (dd/MM/yyyy):");
        String nascGerente = scanner.nextLine();
        System.out.println("Digite o salário do gerente:");
        double salarioGerente = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o projeto do gerente:");
        String projetoGerente = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, nascGerente, salarioGerente, projetoGerente);
        gerente.informarSalario();
        gerente.informarProjeto();
        System.out.println("Idade do gerente: " + gerente.calcularIdade() + " anos");


        System.out.println("\nDigite o nome do programador:");
        String nomeProgramador = scanner.nextLine();
        System.out.println("Digite a data de nascimento do programador (dd/MM/yyyy):");
        String nascProgramador = scanner.nextLine();
        System.out.println("Digite o salário do programador:");
        double salarioProgramador = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite a linguagem de programação do programador:");
        String linguagemProgramador = scanner.nextLine();

        Programador programador = new Programador(nomeProgramador, nascProgramador, salarioProgramador, linguagemProgramador);
        programador.informarSalario();
        programador.informarLinguagem();
        System.out.println("Idade do programador: " + programador.calcularIdade() + " anos");

        scanner.close();
    }
}