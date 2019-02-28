/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outrathread;

/**
 *
 * @author Alunos
 */
public class principal  {
    public static void main(String[] args)throws Exception{
         MeuProcesso p = new MeuProcesso(0L, 1000L);
        Thread t = new Thread(p);
        t.start();
        System.out.println("foi executar");
        t.join();
        System.out.println(p.getSoma());

    }
}
