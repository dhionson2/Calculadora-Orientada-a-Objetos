package com.mjv.curso.calculadoraorientadaobjetos.service;

import com.mjv.curso.calculadoraorientadaobjetos.Util.Calculadora;
import com.mjv.curso.calculadoraorientadaobjetos.model.Usuario;

public class CalculadoraService {
    public static void main(String[] args) {
        // Crie um objeto Usuario
        Usuario usuario = new Usuario("Fulano", "Engenheiro", 30);

        // Crie um objeto Calculadora
        Calculadora calculadora = new Calculadora();

        // Teste de operações
        int resultadoSoma = calculadora.somar(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair(8, 3);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicar(4, 6);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        try {
            double resultadoDivisao = calculadora.dividir(10.0, 2.0);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
