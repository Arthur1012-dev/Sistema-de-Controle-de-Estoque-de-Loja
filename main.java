
import java.util.Scanner;

public class MeuProjeto {

    public static void main(String[] args) {
        System.out.println("Bem-vindo(a) ao sistema de");
        System.out.println("Administracao de estoque de loja");
        System.out.println("Oque deseja?:");
        System.out.println("adicionar produto");
        System.out.println("remover produto");
        // Cria um objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicita uma entrada do usuário
        System.out.print("Digite a opcao: ");
        String opcao1 = scanner.nextLine();  // Lê uma linha de texto
        if (opcao1.equalsIgnoreCase("adicionar produto")) {
            System.out.println("OK, preencha os campos a seguir:");
            
            System.out.print("Nome do produto:");
            String nomedoproduto = scanner.nextLine();
            
            System.out.print("Data do produto:");
            String datadoproduto = scanner.nextLine();
            
            System.out.print("descricao do produto:");
            String descricaodoproduto = scanner.nextLine();
            
            System.out.print("KIT? S/N:");
            String kitsimounao = scanner.nextLine();
            
        } else {
            System.out.println("BLZ");
        }
        // Fecha o scanner para evitar vazamento de memória
        scanner.close();
        
    }
    }
