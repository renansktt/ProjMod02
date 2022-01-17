import java.util.Scanner;
public class Classe02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int seletor = 0;
		Classe01 cliente01 = new Classe01();
		Classe01 cliente02 = new Classe01();
		while (seletor <6) {
			System.out.println("AGÊNCIA DE VIAJENS AEROBRISA");
			System.out.println("-----------MENU-------------");
			System.out.println("   1. CADASTRO DE CLIENTE");
			System.out.println("   2. MARCAR VIAJEM PARA O ULTIMO CLIENTE CADASTRADO");
			System.out.println("   3. CADASTRAR NOVO CLIENTE");
			System.out.println("   4. DESTINO NOVO CLIENTE");
			System.out.println("   5. CONSULTAR CRONOGRAMA DE VIAJENS");
			System.out.println("   6. SAIR DO PROGRAMA");
			seletor = entrada.nextInt();
				if (seletor == 1) {
					cliente01.cadastrocliente();
				}
					else if (seletor == 2) {
						cliente01.cadastrodestino();
					}
						else if (seletor == 3) {
							cliente02.cadastrocliente();
						}
							else if (seletor == 4) {
								cliente02.cadastrodestino();
							}
							else if (seletor == 5) {
								cliente01.consulta();
								cliente02.consulta();
							}
								else if (seletor == 6) {
									System.out.println("ATÉ LOGO");
								}
								else {
									System.out.println("COMANDO INVÁLIDO");
								}
		}
		
		entrada.close();
		

	}

}
