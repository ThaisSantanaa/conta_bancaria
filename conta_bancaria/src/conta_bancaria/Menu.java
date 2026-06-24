package conta_bancaria;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
	    
	   private static final Scanner leia = new Scanner(System.in);
	   private static final ContaController contaController = new ContaController();
	   
       public static void main(String[] args) {
				
		criarContasTeste();
		
		int opcao;

		while (true) {
				
				
    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_PURPLE_BACKGROUND);
				
	System.out.println("|*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*>|");
    System.out.println("|                        DEV MONEY                          |");
    System.out.println("|                   BEM-VINDO AO SEU BANCO!                 |");
	System.out.println("|               seu futuro financeiro começa AQUI           |");
    System.out.println("|*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*<>*>|");
	System.out.println("|  1  |  CRIAR CONTA                                        |");
    System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  2  |  LISTAR TODAS AS CONTAS                             |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  3  |  BUSCAR CONTA POR NÚMERO                            |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  4  |  ATUALIZAR DADOS                                    |");
    System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  5  |  APAGAR CONTA                                       |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  6  |  SACAR                                              |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  7  |  DEPOSITAR                                          |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  8  |  TRANSFERIR                                         |");
	System.out.println("|_____|_____________________________________________________|");
	System.out.println("|  0  |  SAIR                                               |");
	System.out.println("|===========================================================|");
	System.out.println("|        DIGITE UMA OPÇÃO E PRESSIONE ENTER:                |");
	System.out.println(" ===========================================================|");
	System.out.println("                                                             " + Cores.TEXT_RESET);
				
	try {			
	opcao = leia.nextInt();
	leia.nextLine();
	}catch(InputMismatchException e) {
		opcao = - 1;
	System.out.println("Digite um número inteiro entre 0e 8");
	leia.nextLine();
	}
				
				
	if (opcao == 0) {
		System.out.println("\nDEV MONEY - Seu futuro financeiro começa AQUI !");
		sobre();
         leia.close();
		System.exit(0);
	}
	switch (opcao) {
	case 1:
		System.out.println("Criar Conta\n\n");
		 cadastrarConta();

		break;
	case 2:
		System.out.println("Listar todas as Contas\n\n");
		 listarContas();
		 keyPress();
		 
		break;	
	case 3:
		System.out.println("Buscar conta por número\n\n");
		keyPress();

		break;
	case 4:
		System.out.println("Atualizar dados da Conta\n\n");
		keyPress();

		break;
	case 5:
		System.out.println("Apagar a Conta\n\n");
		keyPress();

		break;
	case 6:
		System.out.println("Sacar\n\n");
		keyPress();

		break;
	case 7:
		System.out.println("Depositar\n\n");
		keyPress();

		break;
	case 8:
		System.out.println("Transferência entre Contas\n\n");
		keyPress();

		break;
	default:
		System.out.println("\nOpção Inválida!\n");
		keyPress();
		break;
    }
  }
}
       
       public static void sobre() {
   		System.out.println("\n*********************************************************");
   		System.out.println("Projeto Desenvolvido por: Thais de lima santana ");
   		System.out.println("Generation Brasil - thaislimasantana9@gmail.com");
   		System.out.println("github.com/conteudoGeneration");
   		System.out.println("**********************************************************");
  
       }
       
       public static void keyPress() {
   		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
   		leia.nextLine();
   	}
       
		public static void criarContasTeste() {
			contaController.cadastrar(new ContaCorrente(contaController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
            contaController.cadastrar(new ContaPoupanca(contaController.gerarNumero(), 456, 2, "Marcia Condarco", 1000000.00f, 10));
            
		}
	 
		public static void listarContas() {
			contaController.ListarTodas();

		}
		public static void cadastrarConta() {
			
			System.out.println("Digite o número da agência: ");
			int agencia = leia.nextInt();
			
			System.out.println("Digite o nome do titular da conta: ");
			leia.skip("\\R");
			String titular = leia.nextLine();
			
			System.out.println("Digite o tipo da conta(1 -CC | 2 - CP): ");
			int tipo = leia.nextInt();
			
			System.out.println("Digite o saldo da conta: ");
			float saldo = leia.nextFloat();
			
			switch(tipo) {
			case 1 ->{
				System.out.println("Digite o limite da conta: ");
				float limite = leia.nextFloat();
				leia.nextLine();
				
				contaController.cadastrar(
						new ContaCorrente(contaController.gerarNumero(), agencia, tipo, titular, saldo, limite));
			}
			case 2 -> {
				System.out.println("Digite o dia do aniversário da conta: ");
				int aniversario = leia.nextInt();
				leia.nextLine();
				
				contaController.cadastrar(
						new ContaPoupanca(contaController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida!" + Cores.TEXT_RESET);
			
			}

		}
}