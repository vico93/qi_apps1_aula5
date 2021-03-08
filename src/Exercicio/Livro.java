/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio;

/**
 *
 * @author Vico
 */
public class Livro {
    public String titulo;
    public String autor;
    private String genero;
    private int ano;
    private double preco;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public String verificarPreco()
    {
        String retorno;
        if (this.preco > 80.00)
        {
            retorno = "Tem desconto";
        }
        else
        {
            retorno = "Não tem desconto";
        }
        
        return retorno;
    }

    @Override
    public String toString() {
        return "Livro:" + "\nTítulo: " + titulo + "\nAutor: " + autor + "\nGênero: " + genero + "\nAno: " + ano + "\nPreço: R$ " + preco;
    }
    
    
}
