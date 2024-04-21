/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex1.aplicacao;
import ex1.entitades.Peca;
import ex1.entitades.PecaImportada;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Aplicacao
 */
public class Aplicacao {
    public static void main(String[] args) {
        

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Peca p1 = new Peca("Furadeira", 100f, 20f);

        p1.calcularPreco();
        p1.exibir();

        PecaImportada p2 = new PecaImportada("Serra", 200f, 150f, 180f, 30f);

        p2.calcularPreco();
        p2.exibir();

        Peca p3 = new Peca("Roda", 500f, 300f);

        p3.calcularPreco();
        p3.exibir();

        PecaImportada p4 = new PecaImportada("Volante", 800f, 250f, 600f, 300f);

        p4.calcularPreco();
        p4.exibir();

        sc.close();

    }

}