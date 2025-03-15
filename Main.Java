package app;
import Animal.Leao;
import Animal.Tigre;
public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Maya",4, 4.7,"Feminino",3.3,1,37);
        Tigre tigre = new Tigre("Zeus",7,87.5,"Caramelo com Listras Pretas",60,"Solitario");

        Leao.exibirInfo();
        System.out.println();
        Tigre.exibirInfo();
    }
}