//================================================================

// Sumário
// 1. Classe Aluno que extende a classe Usuario
// 2. Construtor 
// 3. Setters 
// 4. Getters
// 5. Login
// 6. toString

//===================================================================

public class Aluno extends Usuario{
    private String RA;
    private String curso;

    public Aluno(String RA, String curso, String username, String password, String nome, String doc, Data data_nasc){
        super(nome, doc, data_nasc,username = RA, password);
        this.setRA(RA);
        this.setCurso(curso);
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getRA() {
        return RA;
    }
    public String getCurso() {
        return curso;
    }

    void login(String password) {
        if (password == this.password) {
            this.password = password;
            System.out.println("Usuário logado no Acadêmico Online");
        }
    }
    public String toString(){
        String dados_aluno;
        dados_aluno = super.toString()+"\nRA: "+getRA()+ "\nCurso: "+getCurso();
        return dados_aluno;
    }
}
