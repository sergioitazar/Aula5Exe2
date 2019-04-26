package Aula5Exe1;

import java.lang.reflect.Constructor;

public class Cliente {
    private String nome;
    private String sobreNome;

    public Cliente(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
