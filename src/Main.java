import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		
		
        menu();
        Scanner entrada = new Scanner(System.in);
        int opcao = entrada.nextInt();
        

        while(opcao != 9) {
            switch (opcao) {
                case 1: {
                    System.out.println("Saldo: "+cc.getSaldo() );
                        
                    break;
                }
                case 2: {
                   
                    System.out.println(cc.getNumero());
                    break;
                }
                case 3: {
                	 cc.imprimirInfosComuns();
                	 break;
                }
                
                case 4: {
                	
                	System.out.println("Digite o valor a ser depositado");
                	Scanner depositoIn = new Scanner(System.in);
                    int valor = depositoIn.nextInt();                    
                    cc.depositar(valor);
                    break;
                }
            }
            menu();
            opcao = entrada.nextInt();
        }
        
    }

    public static void menu() {
        System.out.println("\n=== BANCO RMI (ou FMI?!) ===");
        System.out.println("1 - Saldo da conta");
        System.out.println("2 - Numero da conta");
        System.out.println("3 - Extrato na tela");
        System.out.println("4 - Depositar");
        System.out.println("9 - Sair");
    }

}	
		
		
	


