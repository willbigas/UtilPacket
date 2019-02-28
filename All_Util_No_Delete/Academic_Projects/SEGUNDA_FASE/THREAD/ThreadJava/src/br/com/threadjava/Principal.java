package br.com.threadjava;

public class Principal {

    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        c1.setId(1);
        c2.setId(2);
        c3.setId(3);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3= new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
        
       
    }

}
