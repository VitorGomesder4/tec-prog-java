/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testebanco;
/**
 *
 * @author vitor
 */
public class Testebanco {
    public static void main(String args[]){
        br.com.empresa.banco.Banco meuBanco = new br.com.empresa.banco.Banco();
        meuBanco.nome = "Santander";
        System.out.println(meuBanco.nome);
        
    }
}

/*
Tambem pode ser feito com o import

import br.com.empresa.banco.Banco;

public class Testebanco {
    public static void main(String args[]){
        Banco meuBanco = new Banco();
        meuBanco.nome = "Santander"
    }
}

*/