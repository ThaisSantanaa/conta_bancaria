package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {
       public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				
	/* Instanciar Objetos da Classe Conta */
	/*Conta c1 = new Conta(1, 123, 1, "Isabella", 200000.00f);
	 c1.visualizar();
				
	Conta c2 = new Conta(2, 123, 2, "Thiago", 100000.00f);
	 c2.visualizar();*/
				
				
	/* Alteração do Saldo*/
	/*c1.setSaldo(300000.00f);
	c1.visualizar(); */
	
	
	/*If ternário
	 * 
	 * condição ? ação se for verdadeiro : se for falso*/ 
		
	 /*System.out.println("\nSacar R$ 3000000.00 da conta C2: " + (c2.sacar(1000.00f) ? 
						"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
	 c2.visualizar();
		
				
	/*Deposito*/
	    
    /*c2.depositar(50000.00f);
    c2.visualizar();
    
    /*Instanciar Objetos da ContaConrrente*/
    
    /*ContaCorrente cc1 = new ContaCorrente(3, 789, 1, "Raquel", 200000.00f, 2000.00f);
    cc1.visualizar();*/
    
    /*System.out.println("\nSacar R$ 202.000,00 da conta C2: " + (cc1.sacar(203000.00f) ? 
	"Saque efetuado com sucesso!" : "Saldo Insuficiente"));
    cc1.visualizar();*/
    
    ContaPoupanca cp1 = new ContaPoupanca(3, 789, 2, "Raquel", 200000.00f, 25);
    cp1.visualizar();
    
				
				
				
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
				
				
	int opcao  = leia.nextInt();
				
				
				switch(opcao) {
				
				case 1:
					
				     leia.nextLine();
					 System.out.print("\nNome completo: ");
					 String nomeCompleto = leia.nextLine();
					 
					 System.out.print("\nDigite o número da conta: ");
					 int numeroConta = leia.nextInt();
					  
					 break;
				}
			
				
				leia.close();

			}
		}
			
