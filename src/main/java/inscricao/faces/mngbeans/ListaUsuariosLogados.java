/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inscricao.faces.mngbeans;

import inscricao.faces.entity.UsuarioLogado;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

/**
 *
 * @author Samsung
 */
@ManagedBean
@ApplicationScoped
public class ListaUsuariosLogados implements Serializable{
    
    private static final long serialVersionUID = 1L;

    private List<UsuarioLogado> lista = new Vector<>();
    
    private DataModel<UsuarioLogado> listaDM = new ListDataModel<>(lista);

    public List<UsuarioLogado> getLista() {
        return lista;
    }

    public void setLista(List<UsuarioLogado> lista) {
        this.lista = lista;
    }

    public DataModel<UsuarioLogado> getListaDM() {
        return listaDM;
    }

    public void setListaDM(DataModel<UsuarioLogado> listaDM) {
        this.listaDM = listaDM;
    }

    public void adicionarUsuario(UsuarioLogado usuario) {
        this.lista.add(usuario);
    }

}
