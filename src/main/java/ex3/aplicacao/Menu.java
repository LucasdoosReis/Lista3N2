/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex3.aplicacao;
import ex3.entidades.Lista;
import ex3.entidades.ListaOrdenada;
import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Menu
 */
public class Menu {

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criação da Lista Comum
        Lista listaAleatoria = new Lista();
        
        // Criação da Lista Ordenada
        ListaOrdenada listaOrdenada = new ListaOrdenada();

        System.out.println("Quantos números você deseja adicionar?");
        int n = scanner.nextInt();  // Lê a quantidade de números a serem adicionados

        System.out.println("Digite os números para adicionar nas listas:");
        for (int i = 0; i < n; i++) {
            int numero = scanner.nextInt();  // Lê o próximo número
            listaAleatoria.inserirNumero(numero);
            listaOrdenada.inserirNumero(numero);
        }

        // Exibindo os elementos da Lista Comum
        System.out.println("Lista Comum:");
        listaAleatoria.exibirElementos();

        // Exibindo os elementos da Lista Ordenada
        System.out.println("Lista Ordenada:");
        listaOrdenada.exibirElementos();

        scanner.close();  // Fechando o scanner após o uso
    }
}
