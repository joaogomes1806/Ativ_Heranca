/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

/**
 *
 * @author Admin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Aluno aluno = new Aluno("Giovanni ",20,"ma25687" );
        aluno.apresentaraluno();
        
        System.out.println("---------------------------------");
        
        Professor professor = new Professor ("Gilmar" ,40," PW1" );
        professor.apresentarprofessor();
        
        
        
        
        
    }
    
}
