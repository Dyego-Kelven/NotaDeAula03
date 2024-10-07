class Animal {
    protected String nome;
    protected String raca;


    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }


    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida"; // A raça pode ser configurada depois, se necessário
    }


    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }
}
