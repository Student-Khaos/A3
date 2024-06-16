  import java.util.Scanner;
  
/**
 *
 * @author anaka
 */
public class Principal {
     /**
     * Inicialização do sistema da biblioteca.
     *
     * @param args Argumentos de linha de comando.
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----------------");
            System.out.println("      Menu      ");
            System.out.println("----------------");
            System.out.println("1. Inserir");
            System.out.println("2. Alterar");
            System.out.println("3. Remover");
            System.out.println("4. Listar");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    inserirItem(biblioteca, scanner);
                    break;
                case 2:
                    alterarItem(biblioteca, scanner);
                    break;
                case 3:
                    removerItem(biblioteca, scanner);
                    break;
                case 4:
                    biblioteca.listarItens();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 5);
    }

    /**
     * Inserir um novo item na biblioteca.
     *
     * @param biblioteca Onde o item será inserido.
     * @param scanner    Scanner para leitura de entrada do usuário.
     */
    private static void inserirItem(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Inserir Livro ou Revista (L/R): ");
        char tipo = scanner.nextLine().charAt(0);

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 'L' || tipo == 'l') {
            System.out.print("Genero: ");
            String genero = scanner.nextLine();
            Livro livro = new Livro(titulo, autor, ano, genero);
            biblioteca.inserirItem(livro);
        } else if (tipo == 'R' || tipo == 'r') {
            System.out.print("Edicao: ");
            int edicao = scanner.nextInt();
            scanner.nextLine(); 
            Revista revista = new Revista(titulo, autor, ano, edicao);
            biblioteca.inserirItem(revista);
        } else {
            System.out.println("Tipo invalido.");
        }
    }

    private static void alterarItem(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Índice do item a alterar: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Alterar para Livro ou Revista (L/R): ");
        char tipo = scanner.nextLine().charAt(0);

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 

        if (tipo == 'L' || tipo == 'l') {
            System.out.print("Genero: ");
            String genero = scanner.nextLine();
            Livro livro = new Livro(titulo, autor, ano, genero);
            biblioteca.alterarItem(index, livro);
        } else if (tipo == 'R' || tipo == 'r') {
            System.out.print("Edicao: ");
            int edicao = scanner.nextInt();
            scanner.nextLine();  
            Revista revista = new Revista(titulo, autor, ano, edicao);
            biblioteca.alterarItem(index, revista);
        } else {
            System.out.println("Tipo invalido.");
        }
    }

    private static void removerItem(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Indice do item a remover: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        
        biblioteca.removerItem(index);
    }
     private static void listarItens(Biblioteca biblioteca) {
        biblioteca.listarItens();
    }
    }