public class Revista extends Item {
    private int edicao;
    /**
     * Construtor que inicializa os atributos de uma Revista.
     *
     * @param titulo Título da revista.
     * @param autor  Autor da revista.
     * @param ano    Ano de publicação da revista.
     * @param edicao Edição da revista.
     */
    public Revista(String titulo, String autor, int ano, int edicao) {
        super(titulo, autor, ano);
        this.edicao = edicao;
    }
    /**
     * Obtém a edição da revista.
     *
     * @return A edição da revista.
     */
    public int getEdicao() {
        return edicao;
    }
    /**
     * Define a edição da revista.
     *
     * @param edicao Nova edição para a revista.
     */
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    
    /**
     * {@inheritDoc}
     */
    
    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + titulo + ", Autor: " + autor + ", Ano: " + ano + ", Edição: " + edicao);
    }
}

