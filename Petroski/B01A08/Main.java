/*
Aluna: Gláucia Dias
RA: 17242826
*/

public class Main {
    public static void main(String args[]) {
        System.out.println("########### Livros ###########");
        Autor autor_01 = new Autor("nome_01", "email_01", 15);
        Autor autor_02 = new Autor("nome_02", "email_02", 20);
        Autor autor_03 = new Autor("nome_03", "email_03", 25);
        Autor autor_04 = new Autor("nome_04", "email_04", 35);
        Autor autor_05 = new Autor("nome_05", "email_05", 45);
        Autor autor_06 = new Autor("nome_06", "email_06", 55);

        Livro livro_1 = new Livro("\nTitulo", 500, 100, 1, '0', 9.0);
        livro_1.AddAutor(autor_01);
        livro_1.AddAutor(autor_02);
        livro_1.AddAutor(autor_03);
        livro_1.AddAutor(autor_04);
        livro_1.AddAutor(autor_05);
        livro_1.AddAutor(autor_06);
      
        System.out.println("########### Livros ###########");
        Livro livro_2 = new Livro("\nTitulo_02", 150, 120, 3, 'L', 8.1);
        livro_2.AddAutor(autor_01);
        livro_2.AddAutor(autor_02);
        livro_2.AddAutor(autor_03);
        livro_2.AddAutor(autor_04);
        livro_2.AddAutor(autor_05);
        livro_2.AddAutor(autor_06);

        System.out.println(livro_1.toString());
        System.out.println(livro_2.toString());

    }
}