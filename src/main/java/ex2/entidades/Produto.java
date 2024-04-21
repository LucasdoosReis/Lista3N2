/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ex2.entidades;

/**
 *
 * @author Lucas  Reis <lucaslladder@gmail.com>
 * @date 21/04/24
 * @brief class Produto
 */
public abstract class Produto {

    private String descricao;
    private Double valor;

    public Produto() {
    }

    public Produto(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
  
    public abstract double valorProduto();
    
        
}