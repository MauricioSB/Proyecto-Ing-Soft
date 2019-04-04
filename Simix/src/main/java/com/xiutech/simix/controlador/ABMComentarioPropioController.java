/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xiutech.simix.controlador;
import com.xiutech.simix.modelo.*;
/**
 *
 * @author fercho117
 */
public class ABMComentarioPropioController {
    
   private int id_marcador;
   private String correo_comentarista;
   private String texto;
   private ComentarioId id_comentario;
    
    public void agregaComentario(){}
    
    public void eliminaComentario(){}
    
    public void editaComentario(){
        Comentario com = new Comentario();
        ComentarioDAO comdao = new ComentarioDAO();
        String comModificado = this.texto;
        com.getId();
        comdao.find(this.id_comentario);
        com.getTexto();
        comdao.delete(com);
        com.setTexto(comModificado);
        comdao.save(com);
        comdao.update(com);
    }
    
}
