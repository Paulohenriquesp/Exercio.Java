package src;

public class EncontraMax {

	public static void main(String[] args) {
		numero(1,2);
		isPar(1003);
		exibirMes(22);
		calcularFatorial(4);
	}
	
	
	public static void numero(int numero1, int numero2) {
		if (numero1 > numero2) {
			 System.out.println(numero1);
		}else if(numero2 > numero1) {
			System.out.println(numero2);
		}else {
			System.out.println("Os numero sao iguais");
		}

	}
	
	public static boolean isPar	(int numero1) {
		if (numero1%2 == 0) {
			System.out.println("True");
			return true;		
		}else {
			System.out.println("false");
			return false;
		
		}
	}
	public static void exibirMes (int mes1) {
		switch (mes1) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Marco");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;	
		case 6:
			System.out.println("Junho");
			break;	
		case 7:
			System.out.println("Julho");
			break;	
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default:
			System.out.println("mes invalido");
		}
	}
	
	public static void calcularFatorial (int fatorial) {
		
		long fator = 0;
		
		for(int i = fatorial-1 ; i != 0 ; i-- ) {
			if(fator == 0) {
				fator = i * fatorial;
			}else {
				fator = fator * i;
			}
		}
		
		System.out.println(fator);
	}
}
