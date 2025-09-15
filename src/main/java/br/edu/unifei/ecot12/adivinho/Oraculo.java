package br.edu.unifei.ecot12.adivinho;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Oraculo {
    private Calendar fimMundo = 
        new GregorianCalendar();
    private boolean hojeChove = false;

    // 1) Construtor privado
    private Oraculo() {};

    // 2) Atributo reflexivo estático
    private static Oraculo instancia = new Oraculo();

    // 3) Método estático que retorna a instância
    public static Oraculo getInstancia() {
        return instancia;
    }

    public Calendar getFimMundo() {
        return fimMundo;
    }

    public void setFimMundo(Calendar fimMundo) {
        this.fimMundo = fimMundo;
    }

    public boolean isHojeChove() {
        return hojeChove;
    }

    public void setHojeChove(boolean hojeChove) {
        this.hojeChove = hojeChove;
    }

    public static void setInstancia(Oraculo instancia) {
        Oraculo.instancia = instancia;
    }
    
}
