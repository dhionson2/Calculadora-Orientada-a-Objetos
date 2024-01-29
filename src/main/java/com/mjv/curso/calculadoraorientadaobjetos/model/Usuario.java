package com.mjv.curso.calculadoraorientadaobjetos.model;


public class Usuario {
    private String nome;
    private String profissao;
    private int idade;

    // Construtor
    public Usuario(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
