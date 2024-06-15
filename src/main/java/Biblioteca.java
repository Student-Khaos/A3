 import java.util.ArrayList;
public class Biblioteca {

    private ArrayList<Item> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

     /**
     * Insere um novo item na biblioteca.
     *
     * @param item Novo item inserido.
     */
    
    public void inserirItem(Item item) {
        itens.add(item);
    }
    
     /**
     * Altera item na biblioteca.
     *
     * @param index Índice do item alterado na lista.
     * @param item  Novo item com as alterações.
     */

    public void alterarItem(int index, Item item) {
        if (index >= 0 && index < itens.size()) {
            itens.set(index, item);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    /**
     * Remove item da biblioteca.
     *
     * @param index Índice do item removido na lista.
     */
    
    public void removerItem(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listarItens() {
        for (Item item : itens) {
            item.exibirDetalhes();
        }
    }
}
   

