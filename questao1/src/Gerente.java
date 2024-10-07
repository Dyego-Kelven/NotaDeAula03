class Gerente extends Funcionario {
    private String projeto;


    public void informarProjeto() {
        System.out.println("O gerente " + nome + " está gerenciando o projeto: " + projeto);
    }


    public Gerente(String nome, String nasc, double salario, String projeto) {
        super(nome, nasc, salario);  // Chamada ao construtor da superclasse
        this.projeto = projeto;
    }
}
