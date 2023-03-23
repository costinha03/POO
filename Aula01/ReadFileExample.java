package Aula01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ReadFileExample {
    public static void main(String[] args){
		Path fich = Paths.get("C:\\Users\\user\\OneDrive - Universidade de Aveiro\\UA\\2º semestre\\POO\\POO\\src\\Aula01\\major.txt");

		try {
			Files.readAllLines(fich).stream().forEach(System.out::println);
		} catch (IOException e) {
			System.out.println("Certifique-se que o ficheiro \"major.txt\" está na raiz da pasta do projeto");
		} 
	}
	
    
}
