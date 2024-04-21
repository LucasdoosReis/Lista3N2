/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex2.entidades;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Importado
 */
public class Importado extends Produto {

    private Double imposto = 10.0;
    private Double taxa = 5.0;
    private Double taxaImportacao = 5.0;

    public Importado() {
    }

    public Importado(String descricao, Double valor) {
        super(descricao, valor);
    }

    @Override
    public double valorProduto() {

        return super.getValor() + (super.getValor() * (imposto / 100)) + (super.getValor() * (taxa / 100)) + (super.getValor() * (taxaImportacao / 100));

    }

    @Override
    public String toString() {
        return ("Dados do Produto Importado: \n"
                + "Descrição: " + super.getDescricao() + "\n"
                + "Valor: R$ " + String.format("%.2f", super.getValor()) + "\n"
                + "Imposto: R$ " + imposto + "%" + "\n"
                + "Taxa: R$ " + taxa + "%" + "\n"
                + "Taxa de Importação: R$ " + taxaImportacao + "%" + "\n"
                + "Preço Final: R$ " + String.format("%.2f", valorProduto()) + "\n\n"
                + "-------------------------- \n");
    }

}
