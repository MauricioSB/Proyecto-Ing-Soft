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
public class CalificarComentarioController {
    private int id_marcador;
    private String correo_comentarista;
    private int calificacion;
    private String correo_calificador;
    private ComentarioId id_comentario;
    public CalificarComentarioController() {
        
    }
    
    public CalificarComentarioController(int id_marcador, String correo_calificador, int calificacion, String correo_comentarista){
        this.id_marcador = id_marcador;
        this.correo_calificador = correo_calificador;
        this.calificacion = calificacion;
        this.correo_comentarista = correo_comentarista;
    }
    
    public int getIdMarcador() {
        return this.id_marcador;
    }
    
    public String getCorreoCalificador() {
        return this.correo_calificador;
    }
    
    public String getCorreoComentarista() {
        return this.correo_comentarista;
    }
    
    public int getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    public void calificarComentario() {
        CalificacionDAO califao = new CalificacionDAO();
        Calificacion calif = new Calificacion();
        ComentarioDAO comdao = new ComentarioDAO();
        comdao.find(id_comentario);
        calif.getId();
        calif.getComentario();        
        calif.setCalificacion(calificacion++);
        califao.save(calif);
        califao.update(calif);
    }
}
