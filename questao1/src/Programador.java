class Programador extends Funcionario {
    private String linguagem;


    public void informarLinguagem() {
        System.out.println("O programador " + nome + " programa em: " + linguagem);
    }


    public Programador(String nome, String nasc, double salario, String linguagem) {
        this.nome = nome;
        this.nasc = LocalDate.parse(nasc, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.salario = salario;
        this.linguagem = linguagem;
    }
}