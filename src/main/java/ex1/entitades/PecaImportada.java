/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex1.entitades;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class PecaImportada
 */
public class PecaImportada extends Peca {

    private Float taxaImportacao;
    private Float taxaFrete;

    public PecaImportada() {
    }

    public PecaImportada(String name, Float custo, Float lucro, Float taxaImportacao, Float taxaFrete) {
        super(name, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public Float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public Float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(Float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calcularPreco() {

        return super.getCusto() + super.getLucro() + taxaImportacao + taxaFrete;

    }

    @Override
    public void exibir() {

        System.out.println("Dados da peça importada: \n"
                + "Nome: " + super.getName() +"\n"
                + "Custo: R$ " + String.format("%.2f", super.getCusto()) + "\n"
                + "Lucro: R$ " + String.format("%.2f", super.getLucro()) + "\n"
                + "Taxa de Importação: R$ " + String.format("%.2f", taxaImportacao) + "\n"
                + "Taxa de Frete: R$ " + String.format("%.2f", taxaFrete) + "\n"
                + "Preço Final: R$ " + String.format("%.2f", calcularPreco()));

        System.out.println();

        
    }

}
