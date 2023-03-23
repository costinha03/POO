package Aula06;

import Aula05.dateGen;

public class Aluno extends Pessoa {
        private int nmec;
        private dateGen dInsc;
        private static int contador = 100;

        public Aluno(String nome, int cc, dateGen dNasc, dateGen dInsc){
            super(nome, cc, dNasc);
            this.nmec = contador++;
            this.dInsc = dInsc;
        };


    public int getNmec() {
        return this.nmec;
    }

    public dateGen getDInsc() {
        return this.dInsc;
    }

    @Override
    public String toString() {
        return this.getNome() +
            " Nmec: " + getNmec() + 
            "; Data de inscrição: " + getDInsc() ;
    }


       
}
