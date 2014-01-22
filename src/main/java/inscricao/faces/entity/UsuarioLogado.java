/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inscricao.faces.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Samsung
 */
public class UsuarioLogado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String nome;
    private Date dataLogin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataLogin() {
        return dataLogin;
    }

    public void setDataLogin(Date dataLogin) {
        this.dataLogin = dataLogin;
    }
    
    
    
}
