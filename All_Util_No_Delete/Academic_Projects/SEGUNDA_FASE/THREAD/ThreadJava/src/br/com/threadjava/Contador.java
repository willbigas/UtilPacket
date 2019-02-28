/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.threadjava;

/**
 *
 * @author Alunos
 */
public class Contador implements Runnable {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread" + id + " valor:" + i);
        }
    }

}
