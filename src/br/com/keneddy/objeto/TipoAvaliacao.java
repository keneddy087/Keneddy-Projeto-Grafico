/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.keneddy.objeto;

/**
 *
 * @author SATC
 */
public enum TipoAvaliacao {
    
    PROVA("Avaliação Individual"),
    SEMINARIO("Seminario"),
    TRABALHO("Trabalho");
     
    public String TipoAvaliacao;
    
    private TipoAvaliacao(String TipoAvaliacao) {
         this.TipoAvaliacao = TipoAvaliacao;
         
    }
    public String getTipoAvaliacao() {
        return TipoAvaliacao;
    }
    
}
