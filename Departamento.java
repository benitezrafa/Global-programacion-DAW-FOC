/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareag;

/**
 * Esta clase almacena los datos de la tabla, por lo cual la vamos a usar para mapear los datos, con ello a nivel aplicativo, conseguimos
 * trabajar con objetos.
 */
public class Departamento {
    
     /**
     * Se crean los atributos que corresponden a las columnas de la taba, así como getters, setters y constructor.
     */
    private int id;
    private String nombre;
    private int idLocalizacion;
    private int idManager;

    public Departamento(){
        
    }
    
    public Departamento(int id, String nombre, int idLocalizacion, int idManager) {
        this.id = id;
        this.nombre = nombre;
        this.idLocalizacion = idLocalizacion;
        this.idManager = idManager;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }
    
    /**
     * Este es el método toString que usamos para visualizar las propiedades del objeto departamento
     * @return String, que representa el objeto.
     */
    @Override
    public String toString(){
        String departament;
        departament="Nombre : "+this.nombre+"\n";
        departament+="ID : "+this.id+"\n";
        departament+="ID Manager :"+this.idManager+"\n";
        departament+="ID Localización :"+this.idLocalizacion;
        return departament;
    }
    
    
}
