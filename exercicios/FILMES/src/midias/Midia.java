package midias;

// O que uma midia(filme/serie) tem? Titulo, descricao, tipo(se é filme ou serie), duracao, elenco, etc...
// O que é necessario para a parte 1 do exercicio? Titulo e tipo. 

public class Midia {
    private String titulo;
    private String tipo;

    // Construtor...
    public Midia(String titulo, String tipo) {
        this.titulo = titulo;
        this.tipo = tipo;
    }

    // Getters && Setters...
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodos...
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Tipo de midia: " + tipo;
    }

}
