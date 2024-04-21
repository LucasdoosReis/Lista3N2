/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex3.entidades;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Lista
 */
public class Lista {

    List<Integer> num = new ArrayList<>();

    public Lista() {
    }

    public void inserirNumero(int numero) {

        num.add(numero);

    }

    public void removerNumero(int numero) {

        num.remove(numero);

    }

    public void informarTamanho() {

        int tamanho = num.size();

    }

    public void informarValor(int item) {

        int valor = num.get(item); // Lembre-se, o índice começa em 0

        // Imprimindo o elemento acessado
        System.out.println("O elemento na posição " + item + "é: " + valor);

    }

    public void exibirElementos() {

        for (int numero : num) {
            System.out.println(numero);
        }

    }

}
