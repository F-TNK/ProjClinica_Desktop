/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ftana
 */
public class Meses {
    
    public class Mes {
        private String nome;
        private int valor;
        // valor numerico dos meses

        public Mes(String nome, int valor) {
            this.nome = nome;
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }

        @Override
        public String toString() {
            return nome;
        }
    }
    
}
