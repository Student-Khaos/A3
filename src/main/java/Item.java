
public abstract class Item {
    protected String titulo;
    protected String autor;  
    protected int ano;      

    /**
     * Construtor que inicializa os atributos básicos do Item.
     *
     * @param titulo Título do item.
     * @param autor Autor do item.
     * @param ano   Ano de publicação do item.
     */
    public Item(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    
    public abstract void exibirDetalhes();

    /**
     * Obtém o título do item.
     *
     * @return O título do item.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do item.
     *
     * @param titulo Novo título para o item.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém o autor do item.
     *
     * @return O autor do item.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Define o autor do item.
     *
     * @param autor Novo autor para o item.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtém o ano de publicação do item.
     *
     * @return O ano de publicação do item.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano de publicação do item.
     *
     * @param ano Novo ano de publicação para o item.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
}
