/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasGraficas;
import aluno.CadAluno;
/**
 *
 * @author derre
 */
public class Principal {
    public static void main(String args[]){
        CadAluno aluno = new CadAluno();
        aluno.nome = "vitor";
        System.out.println(aluno.nome);
    }
}
