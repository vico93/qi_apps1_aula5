/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Exercicio.Livro;
import java.util.Scanner;

/**
 *
 * @author Vico
 */
public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        
        Livro ilhaPerdida = new Livro();
        
        System.out.print("Digite o TÌTULO do livro: ");
        ilhaPerdida.titulo = stdin.nextLine();
        
        System.out.print("Digite o AUTOR do livro: ");
        ilhaPerdida.autor = stdin.nextLine();
        
        System.out.print("Digite o GÊNERO do livro: ");
        ilhaPerdida.setGenero(stdin.nextLine());
        
        System.out.print("Digite o ANO do livro: ");
        ilhaPerdida.setAno(stdin.nextInt());
        
        System.out.print("Digite o PREÇO do livro: ");
        ilhaPerdida.setPreco(stdin.nextDouble());
        
        System.out.println(ilhaPerdida);
        System.out.println("\n----------------------------------------");
        System.out.println(ilhaPerdida.verificarPreco());
        
    }
    
}
