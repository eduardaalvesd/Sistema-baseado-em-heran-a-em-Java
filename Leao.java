package Animal;
public class Leao extends Animal {

    //Atributos adicionados 
    public String sexo;
    public double altura;
    public String juba;

// Chamando o construtor da classe Animal
    public leao(String nome,int idade, double peso, String sexo, double altura, Strink juba) {
        super(nome,idade,peso);
        this.sexo = sexo;
        this.altura= altura;
        this.juba= juba;
    }

    // Sobreescrevendo os metodos 
    @Override
    public void emitirSom() {
        System.out.println ("O Leao emite um rugido" );
    }
    @Override
    public void caçar(){
        System.out.println("O Leao sabe caçar");
     }
     @Override
     public void reconhecerPerigo(){
        System.out.println("O Leao sabe reconhecer se esta em perigo");
     }
}