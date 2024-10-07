import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


class Funcionario {
    protected String nome;
    protected LocalDate nasc;
    protected double salario;


    public void informarSalario() {
        System.out.println("O salário de " + nome + " é: R$ " + salario);
    }


    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(nasc, hoje).getYears();
    }
}