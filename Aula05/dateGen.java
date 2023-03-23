package Aula05;


public class dateGen {
    private int mes;
    private int dia;
    private int ano;
    
    public dateGen(int dia , int mes, int ano) throws Exception{
        if (validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else {throw new Exception("Insira uma data válida");}
    }
    public void set(int dia , int mes, int ano) throws Exception{
        if (validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else {throw new Exception("Insira uma data válida");}
    }
    
    public int getDia(int dia) {
        return dia;
    }
    public int getMes(int mes) {
        return mes;
    }
    public int getAno(int ano) {
        return ano;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String toString() {
        return String.format("%04d"+"-"+"%02d"+"-"+"%02d", ano, mes, dia);}
    
    public static boolean validAno(int ano){
        if (ano > 0){
            return true;
        }
        return false;
    }    
    public static boolean validMes(int mes){
        if (mes > 0 && mes <= 12){
            return true;
        }
        return false;
    }    
    public static boolean validDia(int mes, int dia, int ano){
        if (dia > 0 && dia <= monthDays(mes, ano)){
            return true;
        }
        return false;
    }    
    public static boolean validaData(int dia, int mes, int ano) {

        if (!validMes(mes) || !validAno(ano) || !validDia(dia, mes, ano) ) {
            return false;
        }
        else return true;
    }
    public static int monthDays(int mes, int ano ){
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            return 31;
            }
            else if (mes == 2){
                if (!anoBissexto(ano)){
                    return 28;
                }
                return 29;
            }
            else return 30;
    }
    public static boolean anoBissexto(int ano) {
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public void nextDay(){
        this.dia += 1;
        if(dia > monthDays(mes, ano)){
            this.mes +=1;
            this.dia = 1;
        }
        if (!validMes(mes)){
            this.ano +=1;
            this.mes = 1;
        }
    }
    public void dayBefore(){
        dia -= 1;
        if(!validaData(mes, ano, dia)){
            mes -= 1;
            dia = monthDays(mes,  ano);
        }
        if (!validMes(mes)){
            ano -=1;
            mes = 12;
        }
    }

        
	}



