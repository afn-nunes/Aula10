package programa;

import java.util.Scanner;

import classes.Motorista;
import exceptions.HabilitacaoInvalidaException;
import exceptions.MatriculaInvalidaException;

public class App {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        Motorista motorista = new Motorista("Raphael");
        
        while(motorista.getHabilitacao() == null){
        try {
            System.out.println("Informe a habilitação do motorista");
        String habilitacao = sc.next();
            motorista.setHabilitacao(habilitacao);
        } catch (HabilitacaoInvalidaException e1) {
            System.out.println(e1.getMessage());
        }
        }
        sc.nextLine();

        while (motorista.getMatricula() == null){
        try {
            System.out.println("Informe a matricula do motorista: ");
            String matricula = sc.next();
            motorista.setMatricula(matricula);
        } catch (MatriculaInvalidaException e) {
           System.out.println(e.getMessage());
        }   
        }
       


        sc.close();

    }
}
