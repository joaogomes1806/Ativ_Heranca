/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program;

/**
 *
 * @author Admin
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    
    
    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    

    public String getNome (){
        return nome;
        
    }
    
    public int getIdade (){
        return idade;
    }
    
    public void apresentar (){
        System.out.println("Nome : " + nome);
        System.out.println("Idade : " + idade);
    }
    
}
