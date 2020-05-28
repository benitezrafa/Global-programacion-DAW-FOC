/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareag;

import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * Esta clase, la usamos para acceder a la base de datos, por ello aislamos las clases a sus funcionalidades.
 */

public class DepartamentoDAO {

    private final static String FIND_ALL_SQL = "select * from departamentos";

    /**
     * En este método, se inserta un departamento en la base de datos, para ello, tenemos un departamento como argumento y se inserta en la 
     * base de datos
     * @param dep parámetro de entrada
     * @return devuelve una lista de IDS de los departamentos que hay en la base de datos.
     */
    public static List<String> insertar(Departamento dep) {
        Connection conexion = ConectorBDMYSQL.getConexion();
        
        String SQL = "INSERT INTO departamentos (id,nombre,idLocalizacion,idManager) "
                + "VALUES(" + dep.getId() + ",'" + dep.getNombre() + "'," + dep.getIdLocalizacion() + "," + dep.getIdManager() + ")";
        try {
            Statement statement = conexion.createStatement();
            statement.executeUpdate(SQL);

        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error en DepartamentoDAO: \n"+e.getLocalizedMessage()); 
        }
        return findAll();
    }

    /**
     * Esta clase borra el departamento de la base de datos con un id del departamento.
     * @param id id del departamento
     * @return  devuelve un listado de IDs de los departamentos que hay en la base de datos.
     */
    public static List<String> borrar(int id) {
        Connection conexion = ConectorBDMYSQL.getConexion();
        
        String SQL = "DELETE FROM departamentos WHERE id= "+id;
        try {
            Statement statement = conexion.createStatement();
            statement.executeUpdate(SQL);

        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error en DepartamentoDAO: \n"+e.getLocalizedMessage()); 
        }
        return findAll();
    }

    /**
     * Método que borra un departamento.
     * @param dep departamento de entrada
     * @return listado de ids de los departammentos que hay en la base de datos.
     */
    public static List<String> modificar(Departamento dep) {
        Connection conexion = ConectorBDMYSQL.getConexion();
        
        String SQL = "UPDATE  departamentos SET nombre= '"+dep.getNombre()+"', idLocalizacion= "+dep.getIdLocalizacion()+", idManager= "+dep.getIdManager()+" WHERE id= "+dep.getId() ;
        try {
            Statement statement = conexion.createStatement();
            statement.executeUpdate(SQL);

        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error en DepartamentoDAO: \n"+e.getLocalizedMessage()); 
        }
        return findAll();
    }

    /**
     * Con este método conseguimor recuperar un departamento dado su id
     * @param id id del departamento
     * @return devuelve un deparatmento dado su id
     */
    public static Departamento mostrar(int id) {
        Connection conexion = ConectorBDMYSQL.getConexion();
        Departamento dep= new Departamento();
        String sql="SELECT * FROM departamentos where id= "+id;

        try {
            Statement statement = conexion.createStatement();
            ResultSet filasTabla;
            filasTabla = statement.executeQuery(sql);

            while (filasTabla.next()) {       
               dep.setId(filasTabla.getInt("id"));
               dep.setNombre(filasTabla.getString("nombre"));
               dep.setIdLocalizacion(filasTabla.getInt("idLocalizacion"));
               dep.setIdManager(filasTabla.getInt("idManager"));
               break;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error en DepartamentoDAO: \n"+e.getLocalizedMessage()); 
        }
        return dep;
    }

    /**
     * Método que usamos para recuperar todos los departamentos
     * @return devuelve un listado de IDs del departamento
     */
    public static List<String> findAll() {
        Connection conexion = ConectorBDMYSQL.getConexion();
        List<String> departamentos = new ArrayList<>();

        try {
            Statement statement = conexion.createStatement();
            ResultSet filasTabla;
            filasTabla = statement.executeQuery(FIND_ALL_SQL);

            while (filasTabla.next()) {       
                departamentos.add(""+filasTabla.getInt("id"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog (null,"Error en DepartamentoDAO: \n"+e.getLocalizedMessage()); 
        }
        return departamentos;
    }

}
