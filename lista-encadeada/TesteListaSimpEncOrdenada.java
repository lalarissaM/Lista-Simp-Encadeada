import java.util.Scanner;

public class TesteListaSimpEncOrdenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dados = new Scanner(System.in);
		
		ListaEncOrdenada<Integer> lista = new ListaEncOrdenada<Integer>();
		
		System.out.println("****************MENU*********************\n");
    	System.out.println("0 - Sair");
        System.out.println("1 � Inserir elemento no fim");
        System.out.println("2 - Inserir elemento no inicio");
        System.out.println("3 - Inserir elemento em uma determinada posi��o");
        System.out.println("4 - Buscar elemento da posi��o");
        System.out.println("5 - Buscar posicao do elemento");
        System.out.println("6 - Remover elemento por posicao");
        System.out.println("7 - Limpar lista");
        System.out.println("8 - Tamanho da lista");
        System.out.println("9 - Verificar se cont�m elemento na lista");
        System.out.println("10 � Mostrar lista ordenada crescente (AO ESCOLHER ESSA OP��O, AUTOMATICAMENTE A ORDENA��O PASSAR� A SER CRESCENTE)");
        System.out.println("11 � Mostrar lista ordenada decrescente (AO ESCOLHER ESSA OP��O, AUTOMATICAMENTE A ORDENA��O PASSAR� A SER DECRESCENTE)");
        System.out.println("12 � Ver MENU novamente");
        System.out.println();
        
        int opcao = 0;
        System.out.println();
        System.out.println();
        do {
            System.out.println("Digite uma op��o do MENU: ");
            opcao=dados.nextInt();
            while (opcao<0 || opcao>12) {
    			System.out.println("-----------------------------------------------");
    			System.out.println("ERRO! Op��o inv�lida.");
    			System.out.println("Digite uma op��o do MENU novamente: ");
    			opcao=dados.nextInt();
    		}
            try {
            if (opcao==1) {
            	System.out.println("1 � Inserir elemento no fim");
                System.out.println("Digite o elemento: ");
                int elemento=dados.nextInt();
                lista.adicionarFim(elemento);
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==2) {
            	System.out.println("2 - Inserir elemento no inicio");
            	System.out.println("Digite o elemento: ");
            	int elemento=dados.nextInt();
                lista.adicionarInicio(elemento);
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==3) {
            	System.out.println("3 - Inserir elemento em uma determinada posi��o");
            	System.out.println("Digite o elemento: ");
            	int elemento=dados.nextInt();
                System.out.println("Digite a posi��o: ");
                int posicao=dados.nextInt();
                lista.adicionar(elemento, posicao);
                System.out.println("//////////////////////////////////////////////");
                
            }
            if (opcao==4) {
            	System.out.println("4 - Buscar elemento da posi��o");
            	System.out.println("Digite a posi��o desejada: ");
                int posicaoBuscada=dados.nextInt();
                System.out.println(lista.get(posicaoBuscada));
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==5) {
            	System.out.println("5 - Buscar posicao do elemento");
            	System.out.println("Digite o elemento desejado: ");
            	int elementoBuscado=dados.nextInt();
                System.out.println(lista.getPos(elementoBuscado));
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==6) {
            	System.out.println("Digite a posi�ao desejada para remover o elemento: ");
                int posicao=dados.nextInt();
                lista.remover(posicao);
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==7) {
            	lista.limpar();
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==8) {
            	System.out.println("10 - Tamanho da lista");
                System.out.println(lista.getTamanho());
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==9) {
            	System.out.println("Digite o elemento desejado para verificar na lista: ");
            	int elemento=dados.nextInt();
                System.out.println(lista.contem(elemento));
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==10) {
            	System.out.println("10 � Mostrar lista ordenada crescente");
            	lista.setTipoOrdenacao(true);
        		System.out.println(lista.toString());
        		System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==11) {
            	System.out.println("11 � Mostrar lista ordenada decrescente");
            	lista.setTipoOrdenacao(false);
        		System.out.println(lista.toString());
        		System.out.println("//////////////////////////////////////////////");
            }
            }
	        catch (Exception e) {
	    	System.out.println(e.getMessage());
	        }
            if (opcao==12) {
            	System.out.println("****************MENU*********************\n");
            	System.out.println("0 - Sair");
                System.out.println("1 � Inserir elemento no fim");
                System.out.println("2 - Inserir elemento no inicio");
                System.out.println("3 - Inserir elemento em uma determinada posi��o");
                System.out.println("4 - Buscar elemento da posi��o");
                System.out.println("5 - Buscar posicao do elemento");
                System.out.println("6 - Remover elemento por posicao");
                System.out.println("7 - Limpar lista");
                System.out.println("8 - Tamanho da lista");
                System.out.println("9 - Verificar se cont�m elemento na lista");
                System.out.println("10 � Mostrar lista ordenada crescente (AO ESCOLHER ESSA OP��O, AUTOMATICAMENTE A ORDENA��O PASSAR� A SER CRESCENTE)");
                System.out.println("11 � Mostrar lista ordenada decrescente (AO ESCOLHER ESSA OP��O, AUTOMATICAMENTE A ORDENA��O PASSAR� A SER DECRESCENTE)");
                System.out.println("12 � Ver MENU novamente");
                System.out.println();
            }
        }while (!(opcao==0));
        if (opcao==0) {
        	System.out.println("FIM DO SISTEMA");
        }
            
        dados.close();
        
    }

}

