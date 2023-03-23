package Aula06;

import Aula05.dateGen;

public class Professor extends Pessoa{
    private String categoria;
    private String departamento;

    public Professor(String nome, int cc, dateGen dNasc, String categoria, String departamento){
        super(nome, cc, dNasc);
        this.categoria = categoria;
        this.departamento = departamento;
    };


    public String getCategoria() {
        return this.categoria;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + ", CC: " + this.getCc() + 
            ", Categoria: " + getCategoria() + "'" +
            ", Departamento: " + getDepartamento() ;
    }

}
