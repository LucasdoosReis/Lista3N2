/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex3.entidades;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class ListaOrdenada
 */
public class ListaOrdenada extends Lista {

    @Override
    public void inserirNumero(int numero) {
        // Encontrando a posição correta para inserção para manter a lista ordenada
        int pos = 0;
        while (pos < num.size() && num.get(pos) < numero) {
            pos++;
        }
        num.add(pos, numero); // Inserir o número na posição correta
    }

    // Não é necessário sobrescrever os outros métodos se eles não alteram a ordem
}
