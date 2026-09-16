package calculadora;

import java.util.Scanner;

public class TesteCalculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("===== CALCULADORA =====");
        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - Muultiplicar");
        System.out.print("Opcao: ");
        int opcao = entrada.nextInt();

        System.out.print("Digite o primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = entrada.nextDouble();

        double resultado = 0;
        boolean opcaoValida = true;

        switch (opcao) {
            case 1:
                resultado = calc.somar(num1, num2);
                System.out.println("\nResultado da soma: " + resultado);
                break;
            case 2:
                resultado = calc.subtrair(num1, num2);
                System.out.println("\nResultado da subtração: " + resultado);
                break;
            case 3:
                resultado = calc.multiplicar(num1, num2);
                System.out.println("\nResultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = calc.dividir(num1, num2);
                if (num2 != 0) {
                    System.out.println("\nResultado da divisão: " + resultado);
                }
                break;
            default:
                System.out.println("\nOpcao invalida!");
                opcaoValida = false;
        }

        if (opcaoValida && opcao != 4) {
            System.out.println("Operacao finalizada.");
        } else if (opcao == 4 && num2 == 0) {
            System.out.println("Operacao não realizada.");
        }

        entrada.close();
    }
}
