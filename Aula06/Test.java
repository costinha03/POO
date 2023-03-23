package Aula06;

import Aula05.dateGen;

public class Test {
    public static void main(String[] args) throws Exception {
        Aluno al = new Aluno ("Andreia Melo", 9855678,
        new dateGen(18, 7, 1990), new dateGen(1, 9, 2018)); 
        Professor prof = new Professor("Andreia Melo", 9855678,
        new dateGen(18, 7, 1990), "catedátrico", "DETI");
        Bolseiro bls = new Bolseiro ("Igor Santos", 8976543, new dateGen(11, 5, 1985),new dateGen(11, 5, 1985), 900, prof);
        bls.setMensal(1050);
        System.out.println("Aluno: " + al.getNome());
        System.out.println(al);
        System.out.println("Bolseiro: " + bls.getNome() + ", NMec: "
        + bls.getNmec() + ", Bolsa: " + bls.getMensal() + ", Orientador: " +
        bls.getOrientador());
        System.out.println(bls);
        }
}
