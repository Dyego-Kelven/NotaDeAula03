class Cachorro extends Animal {


    public Cachorro() {
        super(); // Chama o construtor da superclasse
    }


    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse com o nome
    }


    public void late() {
        System.out.println(nome + " está latindo ");
    }
}


