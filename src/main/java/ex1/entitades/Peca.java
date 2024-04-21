/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex1.entitades;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Peca
 */
public class Peca {


    private String name;
    private Float custo;
    private Float lucro;

    public Peca() {
    }

    public Peca(String name, Float custo, Float lucro) {
        this.name = name;
        this.custo = custo;
        this.lucro = lucro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float custo) {
        this.custo = custo;
    }

    public Float getLucro() {
        return lucro;
    }

    public void setLucro(Float lucro) {
        this.lucro = lucro;
    }

    public float calcularPreco() {

        return custo + lucro;

    }

    public void exibir() {

        System.out.println("Dados da peça: \n"
                + "Nome: " + name +"\n"
                + "Custo: R$ " + String.format("%.2f", custo) + "\n"
                + "Lucro: R$ " + String.format("%.2f", lucro) + "\n"
                + "Preço Final: R$ " + String.format("%.2f",calcularPreco()));

        System.out.println();
        
    }

}