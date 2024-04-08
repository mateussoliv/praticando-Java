package DescomplicaJava;
import DescomplicaJava.PublicMetods;

public class MetodImport {
    public static void main(String[] args) {
        int adtotal = PublicMetods.soma(13, 22);
        int subTotal = PublicMetods.subtracao(10, 20);
        int divTotal = PublicMetods.divisao(10, 30);
        int mulTotal = PublicMetods.multiplicacao(3, 9);


        System.out.println("Total da Adição é: " + adtotal);
        System.out.println("Total da Subtração é: " + subTotal);
        System.out.println("Total da Divisão é: " + divTotal);
        System.out.println("Total da Multiplicação é: " + mulTotal);
    }
    
}
