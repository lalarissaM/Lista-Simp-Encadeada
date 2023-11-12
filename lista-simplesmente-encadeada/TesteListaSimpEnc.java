import java.util.Scanner;

public class TesteListaSimpEnc {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dados = new Scanner(System.in);
		
		ListaSimpEnc<Integer> lista = new ListaSimpEnc<Integer>();
		
		System.out.println("****************MENU*********************\n");
    	System.out.println("0 - Sair");
        System.out.println("1 - Inserir elemento no inicio");
        System.out.println("2 - Inserir elemento no fim");
        System.out.println("3 - Inserir elemento em uma determinada posição");
        System.out.println("4 - Remover elemento no inicio");
        System.out.println("5 - Remover elemento no fim");
        System.out.println("6 - Remover elemento");
        System.out.println("7 - Limpar lista");
        System.out.println("8 - Tamanho da lista");
        System.out.println("9 - Verificar se contém elemento na lista");
        System.out.println("10 - Ver MENU novamente");
        System.out.println();
        
        int opcao = 0;
        System.out.println();
        System.out.println();
        do {
            System.out.println("Digite uma opção do MENU: ");
            opcao=dados.nextInt();
            while (opcao<0 || opcao>10) {
    			System.out.println("-----------------------------------------------");
    			System.out.println("ERRO! Opção inválida.");
    			System.out.println("Digite uma opção do MENU novamente: ");
    			opcao=dados.nextInt();
    		}
            try {
            if (opcao==1) {
            	System.out.println("1 - Inserir elemento no inicio");
                System.out.println("Digite o elemento: ");
                int elemento=dados.nextInt();
                lista.InserirInicio(elemento);
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==2) {
            	System.out.println("2 - Inserir elemento no fim");
            	System.out.println("Digite o elemento: ");
            	int elemento=dados.nextInt();
                lista.InserirFim(elemento);
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==3) {
            	System.out.println("3 - Inserir elemento em uma determinada posição");
                System.out.println("Digite a posição: ");
                int posicao=dados.nextInt();
            	System.out.println("Digite o elemento: ");
            	int elemento=dados.nextInt();
                lista.Inserir(posicao, elemento);
                System.out.println("//////////////////////////////////////////////");
                
            }
            if (opcao==4) {
            	System.out.println("4 - Remover elemento no inicio");
                lista.RemoverInicio();
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==5) {
            	System.out.println("5 - Remover elemento no fim: ");
                lista.RemoverFim();
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==6) {
            	System.out.println("6 - Digite o elemento que deseja remover: ");
                int elemento=dados.nextInt();
                lista.RemoverElemento(elemento);;
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==7) {
                System.out.println("7 - Limpar lista: ");
            	lista.clear();
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==8) {
            	System.out.println("8 - Tamanho da lista");
                System.out.println(lista.size());
                System.out.println("//////////////////////////////////////////////");
            }
            if (opcao==9) {
            	System.out.println("9 - Digite o elemento desejado para verificar na lista: ");
            	int elemento=dados.nextInt();
                System.out.println(lista.contem(elemento));
                System.out.println("//////////////////////////////////////////////");
            }
            }
	        catch (Exception e) {
	    	System.out.println(e.getMessage());
	        }
            if (opcao==10) {
            	System.out.println("****************MENU*********************\n");
    	        System.out.println("0 - Sair");
                System.out.println("1 - Inserir elemento no inicio");
                System.out.println("2 - Inserir elemento no fim");
                System.out.println("3 - Inserir elemento em uma determinada posição");
                System.out.println("4 - Remover elemento no inicio");
                System.out.println("5 - Remover elemento no fim");
                System.out.println("6 - Remover elemento");
                System.out.println("7 - Limpar lista");
                System.out.println("8 - Tamanho da lista");
                System.out.println("9 - Verificar se contém elemento na lista");
                System.out.println("10 - Ver MENU novamente");
                System.out.println();
            }
        }while (!(opcao==0));
        if (opcao==0) {
        	System.out.println("FIM DO SISTEMA");
        }
            
        dados.close();
        
    }

}
