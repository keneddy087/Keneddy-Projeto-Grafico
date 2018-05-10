
package br.com.keneddy.objeto;

import java.util.List;


public class Aluno {
    
    private String nome;
    private int matricula;
    private List<Nota>notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
}
