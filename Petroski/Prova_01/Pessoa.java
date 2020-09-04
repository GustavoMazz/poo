//================================================================

// Sumário
// 1. Classe Pessoa
// 2. Atributos 
// 3. Construtor 1 (Nome, documento e data de nascimento)
// 4. Construtor 2 (Nome e data de nascimento)
// 5. Setters
//  5.1 setNome
//   Não é permitido nomes com 'lenght' menor que zero e nem numeros
//  5.2 setDoc
//   O documento pode ser rg ou cpf (pode possuir 9 ou 11 digitos), e deve possuir apenas números
// 6. setData  
// 7. Getters
// 8. toString

//===================================================================

public class Pessoa {
    private String nome;
    private String doc;
    private Data data_nasc;

    public Pessoa(String nome, String doc, Data data_nasc) {
        this.setNome(nome);
        this.setDoc(doc);
        this.setData_nasc(data_nasc);
    }

    public Pessoa(String nome, Data data_nasc) {
        this.setNome(nome);
        this.setData_nasc(data_nasc);
    }

    public void setNome(String nome) {
        if (nome.length() >= 0 && nome.substring(0, 20).matches("[A-Z]*")) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public void setDoc(String doc) {
        if (doc.length() == 9 || doc.lenght() == 11 && doc.matches("[0-9]*")){
            this.doc = doc;
        }else{
            System.out.println("Documento invalido.");
        }
    }

    public void setData_nasc(Data data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public int getDoc() {
        return doc;
    }

    public Data getData_nasc() {
        return data_nasc;
    }

    public String toString(){
        String dados_pessoa;
        dados_pessoa = "Nome: "+getNome()+"\nDocumentos: "+getDoc()+"\nData de nascimento: "+getData_nasc();
        return dados_pessoa;
    }
}
