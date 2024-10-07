class Gato extends Animal {


    public Gato() {
        super(); // Chama o construtor da superclasse
    }


    public Gato(String nome) {
        super(nome); // Chama o construtor da superclasse com o nome
    }


    public void mia() {
        System.out.println(nome + " está miando ");
    }
}
