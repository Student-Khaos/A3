public class Livro extends Item {
    private String genero;

    /**
     * Construtor que inicializa os atributos de um Livro.
     *
     * @param titulo Título do livro.
     * @param autor  Autor do livro.
     * @param ano    Ano de publicação do livro.
     * @param genero Gênero do livro.
     */
    
    public Livro(String titulo, String autor, int ano, String genero) {
        super(titulo, autor, ano);
        this.genero = genero;
    }
    
    /**
     * Obtém o gênero do livro.
     *
     * @return O gênero do livro.
     */

    public String getGenero() {
        return genero;
    }
    /**
     * Define o gênero do livro.
     *
     * @param genero Novo gênero para o livro.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Gênero: " + genero);
    }
}

