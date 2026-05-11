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
public class KsmCompras {
    private int ksmIdCompras;
private int ksmIdUsuario;
private int ksmIdFornecedor;
private Date ksmDataCompra; // Usando java.sql.Date para o tipo DATE
private String ksmMetodoPagamento;
private double ksmValorTotal;
private String ksmAtivo;

    /**
     * @return the ksmIdCompras
     */
    public int getKsmIdCompras() {
        return ksmIdCompras;
    }

    /**
     * @param ksmIdCompras the ksmIdCompras to set
     */
    public void setKsmIdCompras(int ksmIdCompras) {
        this.ksmIdCompras = ksmIdCompras;
    }

    /**
     * @return the ksmIdUsuario
     */
    public int getKsmIdUsuario() {
        return ksmIdUsuario;
    }

    /**
     * @param ksmIdUsuario the ksmIdUsuario to set
     */
    public void setKsmIdUsuario(int ksmIdUsuario) {
        this.ksmIdUsuario = ksmIdUsuario;
    }

    /**
     * @return the ksmIdFornecedor
     */
    public int getKsmIdFornecedor() {
        return ksmIdFornecedor;
    }

    /**
     * @param ksmIdFornecedor the ksmIdFornecedor to set
     */
    public void setKsmIdFornecedor(int ksmIdFornecedor) {
        this.ksmIdFornecedor = ksmIdFornecedor;
    }

    /**
     * @return the ksmDataCompra
     */
    public Date getKsmDataCompra() {
        return ksmDataCompra;
    }

    /**
     * @param ksmDataCompra the ksmDataCompra to set
     */
    public void setKsmDataCompra(Date ksmDataCompra) {
        this.ksmDataCompra = ksmDataCompra;
    }

    /**
     * @return the ksmMetodoPagamento
     */
    public String getKsmMetodoPagamento() {
        return ksmMetodoPagamento;
    }

    /**
     * @param ksmMetodoPagamento the ksmMetodoPagamento to set
     */
    public void setKsmMetodoPagamento(String ksmMetodoPagamento) {
        this.ksmMetodoPagamento = ksmMetodoPagamento;
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
     * @return the ksmAtivo
     */
    public String getKsmAtivo() {
        return ksmAtivo;
    }

    /**
     * @param ksmAtivo the ksmAtivo to set
     */
    public void setKsmAtivo(String ksmAtivo) {
        this.ksmAtivo = ksmAtivo;
    }

}
