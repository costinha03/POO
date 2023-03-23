package Aula06;
import Aula05.dateGen;

public class Pessoa {
        private String nome;
        private int cc;
        private dateGen dNasc;

        public Pessoa(String nome, int cc, dateGen dNasc){
            this.nome = nome;
            this.cc = cc;
            this.dNasc = dNasc;
        }


        public String getNome() {
            return this.nome;
        }   

        public int getCc() {
            return this.cc;
        }

        public dateGen getDNasc() {
            return this.dNasc;
        }

        @Override
        public String toString() {
            return 
                "Nome: " + getNome() +
                "; CC: " + getCc() + 
                "; Data de nascimento: " + getDNasc() 
                ;
        }

}
