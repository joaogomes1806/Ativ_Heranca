/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author Admin
 */
public class Professor extends Pessoa {
    
    private String materia;
    
    public Professor (String nome,int idade,String materia){
    
    super(nome , idade);
    this.materia = materia;
    
    }
    
     public String getMateria (){
        return materia;
    }
     
     public void ensinar (){
        System.out.println(getNome()+" esta Ensinando");
    }
     
     public void apresentarprofessor (){
        apresentar();
        ensinar();
        System.out.println("Materia : " + materia);
        
    }
    
}
