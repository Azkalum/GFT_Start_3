package Exercício_04;

public class Exercício_04 {

    public static void main(String[] args) {
        //Entrada de Dados
        System.out.println(inverter(15485448, 0));
        System.out.println(inverter(2195498, 0));
        System.out.println(inverter(12, 0));
        System.out.println(inverter(98716549, 0));
        System.out.println(inverter(1654891, 0));
    }
    //Resolução
    private static int inverter(int n, int total){
        if (n == 0)
            return total;
        else return inverter(n / 10, total * 10 + n% 10);

    }
}