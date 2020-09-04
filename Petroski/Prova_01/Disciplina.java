//================================================================

// Sumário
// 1. Imports
// 2. Classe disciplina 
// 3. Construtor 
// 4. SetNome_disc (nome da disciplina)
// 5. setCarga_hora
// 6. Getters  
// 7. ArrayLists
// 8. toString

//===================================================================

import java.util.ArrayList;

public class Disciplina {
    private String nome_disc;
    private int carga_hora;
    private Pessoa pessoa;
    private ArrayList<Aluno> alunos = new ArrayList();
    private ArrayList<Professor> professor = new ArrayList();

    public Disciplina(String nome_disc, int carga_hora, Pessoa pessoa) {
        this.setNome_disc(nome_disc);
        this.setCarga_hora(carga_hora);
    }

    public void setNome_disc(String nome_disc) {
        this.nome_disc = nome_disc;
    }

    public void setCarga_hora(int carga_hora) {
        this.carga_hora = carga_hora;
    }

    public String getNome_disc() {
        return nome_disc;
    }

    public int getCarga_hora() {
        return carga_hora;
    }

    public void AddAluno(Aluno alunos) {
        if (alunos.size() <= 30) {
            alunos.add(alunos);
        } else {
            System.out.println("Limite de alunos atingido.");
        }
    }

    public void addAluno(String nome, String doc, Data data_nasc, String RA, String password, String curso) {
        if (this.nome != nome && this.doc != doc && this.RA != RA) {
            alunos.add(aluno);
        } else {
            System.out.println("Aluno já existente.");
        }
    }

    public void setAlunos(ArrayList<Aluno> listaAlunos) {
        this.alunos = listaAlunos;
    }

    public void setProfessor(ArrayList<Professor> listaProfessor) {
        this.professor = listaProfessor;
    }

    public ArrayList<Aluno> getListaAluno() {
        return alunos;
    }

    public ArrayList<Professor> getListaProfessor() {
        return professor;
    }

    public void AddProfessor(Professor professor) {
        if (professor.size() <= 1) {
            professor.add(professor);
        } else {
            System.out.println("Limite de professor atingido.");
        }
    }
    

    // Imprime as informações da disciplina e uma lista com os nomes de cada aluno
    // Somente deve ser impressos alunos cursando
    // public void Assinaturas(){
    //   for(){
    //
    //    }
    // }
}
