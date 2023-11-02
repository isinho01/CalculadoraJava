package Calculadora;

import java.util.Scanner;

public class Teste {
	 
	 public static void main(String[] args) {
		 // criaçao do obejto, imortaçao do scanner e criaçao de variaveis para receber os valores do usuario
	        Calculadora calc = new Calculadora();
	        Scanner tec = new Scanner (System.in);
	        System.out.println("utilize a calculadora abaixo. ");
	        System.out.println("###################");
	        System.out.println("#                 #");
	        System.out.println("# *************** #");
	        System.out.println("# *             * #");
	        System.out.println("# *             * #");
	        System.out.println("# *************** #");
	        System.out.println("#                 #");
	        System.out.println("# 1 Soma          #");
	        System.out.println("# 2 Subtração     #");
	        System.out.println("# 3 Multiplicação #");
	        System.out.println("# 4 Divisão       #");
	        System.out.println("#                 #");
	        System.out.println("#                 #");
	        System.out.println("#                 #");
	        System.out.println("#                 #");
	        System.out.println("###################");
	        int qual_operador = tec.nextInt();
	        System.out.println("por favor informe qual o primeiro numero voce deseja realizar a operaçao.");
	        Double operando_01 = tec.nextDouble();
	        calc.setOperando_01(operando_01);
	        System.out.println("por favor informe qual o segundo numero voce deseja realizar a operaçao.");
	        Double operando_02 = tec.nextDouble();
	        calc.setOperando_02(operando_02);
	        calc.setOperador_utilizado(qual_operador); 
	        
	        calc.realizarOperacao();
	        // impressao dos resultados no terminal 
	        System.out.println("Operando 1: " + calc.getOperando_01());
	        System.out.println("Operando 2: " + calc.getOperando_02());
	        System.out.println("Resultado: " + calc.getResult());
	        System.out.println("Operador: " + calc.getOperador_utilizado());
	        System.out.println("Informação: " + calc.getInformaçoes());
	    }
}
