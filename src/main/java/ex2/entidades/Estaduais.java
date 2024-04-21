/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex2.entidades;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Estaduais
 */
public class Estaduais extends Produto {

    private Double imposto = 10.0;

    public Estaduais() {
    }

    public Estaduais(String descricao, Double valor) {
        super(descricao, valor);
    }

    @Override
    public double valorProduto() {

        return super.getValor() + (super.getValor() * (imposto / 100));

    }

    @Override
    public String toString() {
        return ("Dados do Produto Estadual: \n"
                + "Descrição: " + super.getDescricao() + "\n"
                + "Valor: R$ " + String.format("%.2f", super.getValor()) + "\n"
                + "Imposto: R$ " + imposto + "%" + "\n"
                + "Preço Final: R$ " + String.format("%.2f", valorProduto()) + "\n\n"
                + "-------------------------- \n");
    }

}