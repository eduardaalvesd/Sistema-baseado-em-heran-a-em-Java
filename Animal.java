//Super classe Animal.java
package Animal;
public class Animal {
    private String nome;
    private int idade;
    private double peso;

    // Construtor da classe Animal
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    //Metodo Emitir Som
    public void emitirSom() {
        System.out.println(" O animal emite um rugido" );  }
 }

 //Metodo para caçar
 public void caçar(){
    System.out.println("O animal sabe caçar");
 }

 //Metodo para Reconhecer Perigo 
 public void reconhecerPerigo(){
    System.out.println("O animal sabe reconhecer se esta em perigo");
 }
 // Gett e sett 
 public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}
public double getPeso(){
    return peso;
}
public void serPeso(double peso){
    this.peso = peso;
}
}
   
