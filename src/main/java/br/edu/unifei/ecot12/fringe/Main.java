package br.edu.unifei.ecot12.fringe;

public class Main {
    public static void main(String[] args) {
        Real r = new Real();
        Agente o = new Agente(r);

        o.setNome("Olivia");
        o.setIdade(26);
        System.out.println(o.incapacita());
        

        Cientista c = new Cientista(new Alternativo());
        c.setNome("Peter");
        c.setIdade(26);
        System.out.println(c.incapacita());
    }
}