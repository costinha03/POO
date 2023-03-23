package Aula06;

import Aula05.dateGen;

public class Bolseiro extends Aluno {
    private double mensal;
    private Professor orientador;

    public Bolseiro(String nome, int cc, dateGen dNasc, dateGen dInsc, int mensal, Professor orientador ){
            super(nome, cc, dNasc, dInsc);
            this.mensal = mensal;
            this.orientador = orientador;
    }

    public double getMensal() {
        return this.mensal;
    }

    public void setMensal(double mensal) {
        this.mensal = mensal;
    }

    public Professor getOrientador() {
        return this.orientador;
    }

    public void setOrientador(Professor orientador) {
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return this.getNome() +
        " Nmec: " + getNmec() + 
        "; Data de inscrição: " + getDInsc() + "; Valor mensal: " + this.getMensal()
        + "; Professor orientador: " + this.getOrientador() ;

    }

}
