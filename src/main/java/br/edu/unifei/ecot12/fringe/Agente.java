package br.edu.unifei.ecot12.fringe;

public class Agente extends Pessoa {
    Agente (Universo universo) {
        super(universo); // repassa para a mãe
    }
    private String capacidade;

    public String getCapacidade() {
        return capacidade;
    }
    
    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }
}
