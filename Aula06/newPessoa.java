package Aula06;


public class newPessoa {
    private String nome;

        

        public newPessoa(String nome){
            this.nome = nome;
            
        }


        public String getNome() {
            return this.nome;
        }   




        @Override
        public String toString() {
            return 
                "Nome: " + getNome() 
                ;
        }

}
