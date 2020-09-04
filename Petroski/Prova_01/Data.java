//================================================================

// Sumário
// 1. Imports
// 2. Classe data
// 3. Atributos
// 4. Construtor
// 5. Método toString
// 6. Setters
//  6.1 setDia
//   Se o mes for diferente de 2 (fevereiro), é possivel colocar um dia entre 1 e 31,
//   mas se o mes for igual a 2, ém possivel apenas colocar o dia até 28.
//  6.2 setMes
//   Apenas valores entre 1 e 12
//  6.3 setAno
//   Apenas valores menores que o ano atual
// 7. Getters


//===================================================================


import java.util.Calendar;

public class Data {
    // ATRIBUTOS
    private int dia;
    private int mes;
    private int ano;

    // CONSTRUTOR
    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    // Método toString
    public String toString() {
        String data;
        data = getDia() + "/" + getMes() + "/" + getAno();
        return data;
    }

    // SETTERS
    public void setDia(int dia) {
        if (dia >= 0 && dia <= 31 && this.mes != 2) {
            this.dia = dia;
        }
        if (this.mes == 2) {
            if (dia >= 0 && dia <= 28) {
                this.dia = dia;
            } else {
                System.out.println("Mês de feveiro possui apenas 28 dias");
            }
        } else {
            System.out.println("Data inválida.");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido");
        }
    }

    public void setAno(int ano) {
        if (ano < Calendar.getInstance().get(Calendar.YEAR)) {
            this.ano = ano;
        }
    }

    // GETTERS
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

}
