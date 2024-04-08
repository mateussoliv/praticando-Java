package Exercicios;
import java.util.Scanner;
import java.util.Random;


public class RandomNumber {
    public static void main(String[] args) {
        Random  gerador = new Random();
        int x = gerador.nextInt(10);


        Scanner entrada = new Scanner(System.in);
        System.out.println("Me envie um numero de 0 a 10");
        int numero = entrada.nextInt();

        if(numero == x){
            System.out.println("Parabens voce acertou!!!");
        }else if(numero > x){
            System.out.println("O numero é menor, tente novamente");
        }else if(numero < x){
            System.out.println("O numero é maior,  tente novamente por favor");
        }else{
            System.out.println("Tente novamente, esta quase lá !!!");
        }


    }


}
