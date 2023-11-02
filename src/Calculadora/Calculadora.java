package Calculadora;

public class Calculadora {
	// definiçao dos atributos da minha classe calculadora
	private double operando_01;
	private double operando_02;
	private double result;
	private int operador_utilizado;
	private String informaçoes;
	private String infoerro;
	
	// construtor iniciadndo todos os atibutos com valor nulo. no caso 0
	public Calculadora () {
		this.operando_01 = 0.0;
		this.operando_02 = 0.0;
		this.result = 0.0;
		this.operador_utilizado = 0;
		this.informaçoes = "";
		this.infoerro = "";
		
	}
	// getters e setters
	public double getOperando_01() {
		return operando_01;
	}

	public void setOperando_01(double operando_01) {
		this.operando_01 = operando_01;
	}

	public double getOperando_02() {
		return operando_02;
	}

	public void setOperando_02(double operando_02) {
		this.operando_02 = operando_02;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public int getOperador_utilizado() {
		return operador_utilizado;
	}

	public void setOperador_utilizado(int operador_utilizado) {
		this.operador_utilizado = operador_utilizado;
	}

	public String getInformaçoes() {
		return informaçoes;
	}

	public void setInformaçoes(String informaçoes) {
		this.informaçoes = informaçoes;
	}
	// metodo de soma
	private double somar() {
		return operando_01 + operando_02;
		
	}
	// metodo de subtraçao
	private double subtrair() {
		return operando_01 - operando_02;
		
	}
	// metodo de multiplicaçao
	private double multiplicar() {
		return operando_01 * operando_02;
		
	}
	// metodo para divisao. sendo possivel ser visto uma verificaçao antes do metodo ser acionado.
	private double divisao() throws zeroByZeroException, byZeroException {
		
        if (operando_02 != 0) {
            return operando_01 / operando_02;
        } if (operando_01 == 0 && operando_02 == 0) {
        	throw new zeroByZeroException ("Não é possivel executar a divisao !");
        } else {
        	throw new byZeroException ("Não é possivel executar a divisao !");
        }
    }
	 public void realizarOperacao() {
	        switch (operador_utilizado) {
	            case 1:
	                result = somar();
	                informaçoes = "Operação executada foi a: Soma";
	                break;
	            case 2:
	                result = subtrair();
	                informaçoes = "Operação executada foi a: Subtração";
	                break;
	            case 3:
	                result = multiplicar();
	                informaçoes = "Operação executada foi a: Multiplicação";
	                break;
	            case 4:
	                
	            	try {
	                	result = divisao();
	                }catch(Exception e) {
	                	infoerro = ("Não é possivel executar a divisao !");
	                	
	                }
	                informaçoes = "Operação executada foi a: Divisão";
	                break;
	            default:
	                informaçoes = "Operador inválido!";
	                break;
	        }
	        System.out.println();
	        String emoji = "\uD83D\uDE00";
	       
	        System.out.println("Obrigado por usar minha Calculadora  "+emoji);
	        System.out.println();
	    }
	public String getInfoerro() {
		return infoerro;
	}
	public void setInfoerro(String infoerro) {
		this.infoerro = infoerro;
	}
	}
