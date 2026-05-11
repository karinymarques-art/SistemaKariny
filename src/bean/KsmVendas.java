/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.Date;

/**
 *
 * @author User
 */
public class KsmVendas {
 private int ksmIdVendas;
private Date ksmDataVenda;
private int ksmFkClientes;
private int ksmFkUsuario;
private String ksmFormaPagamento;
private double ksmValorTotal;
private String ksmObservacoes;

    /**
     * @return the ksmIdVendas
     */
    public int getKsmIdVendas() {
        return ksmIdVendas;
    }

    /**
     * @param ksmIdVendas the ksmIdVendas to set
     */
    public void setKsmIdVendas(int ksmIdVendas) {
        this.ksmIdVendas = ksmIdVendas;
    }

    /**
     * @return the ksmDataVenda
     */
    public Date getKsmDataVenda() {
        return ksmDataVenda;
    }

    /**
     * @param ksmDataVenda the ksmDataVenda to set
     */
    public void setKsmDataVenda(Date ksmDataVenda) {
        this.ksmDataVenda = ksmDataVenda;
    }

    /**
     * @return the ksmFkClientes
     */
    public int getKsmFkClientes() {
        return ksmFkClientes;
    }

    /**
     * @param ksmFkClientes the ksmFkClientes to set
     */
    public void setKsmFkClientes(int ksmFkClientes) {
        this.ksmFkClientes = ksmFkClientes;
    }

    /**
     * @return the ksmFkUsuario
     */
    public int getKsmFkUsuario() {
        return ksmFkUsuario;
    }

    /**
     * @param ksmFkUsuario the ksmFkUsuario to set
     */
    public void setKsmFkUsuario(int ksmFkUsuario) {
        this.ksmFkUsuario = ksmFkUsuario;
    }

    /**
     * @return the ksmFormaPagamento
     */
    public String getKsmFormaPagamento() {
        return ksmFormaPagamento;
    }

    /**
     * @param ksmFormaPagamento the ksmFormaPagamento to set
     */
    public void setKsmFormaPagamento(String ksmFormaPagamento) {
        this.ksmFormaPagamento = ksmFormaPagamento;
    }

    /**
     * @return the ksmValorTotal
     */
    public double getKsmValorTotal() {
        return ksmValorTotal;
    }

    /**
     * @param ksmValorTotal the ksmValorTotal to set
     */
    public void setKsmValorTotal(double ksmValorTotal) {
        this.ksmValorTotal = ksmValorTotal;
    }

    /**
     * @return the ksmObservacoes
     */
    public String getKsmObservacoes() {
        return ksmObservacoes;
    }

    /**
     * @param ksmObservacoes the ksmObservacoes to set
     */
    public void setKsmObservacoes(String ksmObservacoes) {
        this.ksmObservacoes = ksmObservacoes;
    }
   
}
