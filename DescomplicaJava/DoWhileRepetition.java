package DescomplicaJava;
import java.util.Scanner;


public class DoWhileRepetition {
    public static void main(String[] args) {
        int numero;
        
        do{
            System.out.println("Digite um numero de 0  a 10, ou 99 para sair");
            Scanner entrada = new Scanner(System.in);
            numero = entrada.nextInt();
        }while(numero !=99);

    }
    
}
