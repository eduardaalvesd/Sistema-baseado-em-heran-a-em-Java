package Animal;
public class Tigre extends Animal {

    //Atributos adicionados
    public String corDosPelos;
    public double velocidade;
    public String comportamentoDeCaça;

    //Chamando o construtor da classe Animal
    public Tigre(String nome,int idade, double peso,String corDosPelos,double velocidade,String comportamentoDeCaça ) {
        super(nome,idade,peso);
        this.corDosPelos = corDosPelos;
        this.velocidade = velocidade;
        this.comportamentoDeCaça = comportamentoDeCaça;
    }

    // Sobreescrevendo os metodos 
    @Override
    public void emitirSom() {
        System.out.println ("O Tigre emite um rugido" );
    }
    @Override
    public void caçar(){
        System.out.println("O Tigre sabe caçar");
     }
     @Override
     public void reconhecerPerigo(){
        System.out.println("O Tigre sabe reconhecer se esta em perigo");
     }
}