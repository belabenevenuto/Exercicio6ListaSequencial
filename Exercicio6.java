import java.util.Scanner;

public class Exercicio6 {
    
    public static void main(String[] args) {
        double raioDoCirculo, areaDoCirculo;
        Scanner teclado = new Scanner(System.in);
        raioDoCirculo = teclado.nextDouble();
        areaDoCirculo = 3.14 * Math.pow(raioDoCirculo,2);
        System.out.print(" A área do círculo é "+ areaDoCirculo);
    }
}
