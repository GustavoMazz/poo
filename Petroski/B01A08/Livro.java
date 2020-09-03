import java.util.ArrayList;

/**
 * A classe Livro encapsula os dados de um livro. Para simplificar, somente os
 * campos e métodos mais básicos são implementados nesta classe.
 */
class Livro {
    /**
     * Declaração dos campos da classe
     */
    private String titulo; // o título e autor do livro
    private ArrayList<Autor> autores = new ArrayList();
    private int pages;
    private double preco;
    private int tiragem;
    private char classif;
    private double nota;

    public Livro(String titulo, int pages, double preco, int tiragem, char classif, Double nota) {
        // super(autor);
		this.titulo = "Titulo";
        this.pages = pages;
        this.preco = preco;
        this.tiragem = tiragem;
        this.setClassif(classif);
        this.setNota(nota);
    }

    public Livro() {

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // public void setAutor(Autor autor) {
    //     this.autor = autor;
    // }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public void setClassif(char classif) {
        this.classif = classif;
        System.out.println(classif);
        switch(classif) {
            case 'L':
            System.out.println("Livre");
            break;
            case '0':
            System.out.println("Não recomendado para menores de 10 anos");
            break;
            case'2':
            System.out.println("Não recomendado para menores de 12 anos");
            break;
            case'4':
            System.out.println("Não recomendado para menores de 14 anos");
            break;
            case'6':
            System.out.println("Não recomendado para menores de 16 anos");
            break;
            case '8':
            System.out.println("Não recomendado para menores de 18 anos");
            break;
            default:
            throw new IllegalArgumentException(
                    "a classificação somente pode ter os valores ’L’, ’0’, ’2’,’4’, ’6’ ou ’8’!");
        }

    }

    public void setNota(double nota) {
        this.nota = nota;
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida");
        } else {
            System.out.println("Nota dada. ");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    // public Autor getAutor() {
    //     return autor;
    // }

    public int getPages() {
        return pages;
    }

    public double getPreco() {
        return preco;
    }

    public int getTiragem() {
        return tiragem;
    }

    public char getClassif() {
        return classif;
    }

    public double getNota() {
        return nota;
    }

    // Método addAutor
    
    public void AddAutor(Autor autor) {
        if (autores.size() < 5) {
            autores.add(autor);
        } else {
            System.out.println("Limite de autores atingido.");
        }
    }

    public ArrayList<Autor> getListaAutor() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> listaAutor) {
        this.autores = listaAutor;
    }

    // Método removeAutor
    public void removeAutor(String nomeAutor) {

        for (Autor autor : autores) {
            if (autor.getNome() == nomeAutor) {
                autores.remove(autor);
                break;
            }
        }
    }

    @Override
    public String toString() {
        // Retorna diretamente uma string criada com os valores dos campos.
        return "Título: " + titulo + "\n" + "Autores: " + autores + "\n" + "Páginas: " + pages + "\n" + "Preço: " + preco
                + "\n" + "Tiragem: " + "\n" + "Classificação: " + classif + "\n" + "Nota: " + nota + "\n";
    }

}