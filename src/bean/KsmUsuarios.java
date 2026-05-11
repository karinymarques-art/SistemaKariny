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
public class KsmUsuarios {
     private int ksmIdUsuarios;
    private String ksmNome;
    private String ksmApelido;
    private String ksmCpf;
    private Date ksmDataNascimento;
    private int ksmNivel;
    private String ksmSenha;
    private String ksmAtivo;
/**
     * @return the ksmIdUsuarios
     o que compoe o metodo ?
     onde esta o corpo? é o que esta entre abre chaves e fecha chaves, mas se o metodo abstrato nao tem corpo*/
    public int getKsmIdUsuarios() {
        return ksmIdUsuarios;
    }

    /**
     * @param ksmIdUsuarios the ksmIdUsuarios to set
     */
    public void setKsmIdUsuarios(int ksmIdUsuarios) {
        this.ksmIdUsuarios = ksmIdUsuarios;
    }

    /**
     * @return the ksmNome
     */
    public String getKsmNome() {
        return ksmNome;
    }

    /**
     * @param ksmNome the ksmNome to set
     */
    public void setKsmNome(String ksmNome) {
        this.ksmNome = ksmNome;
    }

    /**
     * @return the ksmApelido
     */
    public String getKsmApelido() {
        return ksmApelido;
    }

    /**
     * @param ksmApelido the ksmApelido to set
     */
    public void setKsmApelido(String ksmApelido) {
        this.ksmApelido = ksmApelido;
    }

    /**
     * @return the ksmCpf
     */
    public String getKsmCpf() {
        return ksmCpf;
    }

    /**
     * @param ksmCpf the ksmCpf to set
     */
    public void setKsmCpf(String ksmCpf) {
        this.ksmCpf = ksmCpf;
    }

    /**
     * @return the ksmDataNascimento
     */
    public Date getKsmDataNascimento() {
        return ksmDataNascimento;
    }

    /**
     * @param ksmDataNascimento the ksmDataNascimento to set
     */
    public void setKsmDataNascimento(Date ksmDataNascimento) {
        this.ksmDataNascimento = ksmDataNascimento;
    }

    /**
     * @return the ksmNivel
     */
    public int getKsmNivel() {
        return ksmNivel;
    }

    /**
     * @param ksmNivel the ksmNivel to set
     */
    public void setKsmNivel(int ksmNivel) {
        this.ksmNivel = ksmNivel;
    }

    /**
     * @return the ksmSenha
     */
    public String getKsmSenha() {
        return ksmSenha;
    }

    /**
     * @param ksmSenha the ksmSenha to set
     */
    public void setKsmSenha(String ksmSenha) {
        this.ksmSenha = ksmSenha;
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

