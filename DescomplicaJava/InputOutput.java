package DescomplicaJava;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Olá Mundo");

        System.out.println("Informe seu nome: ");

        String nome;
        Scanner entrada = new Scanner(System.in);
        nome = entrada.next();
       
        System.out.println("Olá " + nome + " Seja Bem vindo!!!");
    }
}
