/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tareag;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Esta clase, la usamos para representar los datos de la conexion a la base de datos, por lo tanto
 * tenemos los datos de la base de datos que usamos y también un método que devuelve la conexión
 */
public class ConectorBDMYSQL {
    
  
    public static Connection conexion=null;
    
    /**
     * Método que devuelve la conexión a la base de datos.
     * @return devuelve la conexión, si no existe, si existe ya, devuelve la misma.
     */
    public static Connection getConexion() {
        try{
        String servidor="localhost";    
        int puerto=3306;
        String bd="00000000d";
        String usuario="root";
        String password="root123";
            
        Class.forName("com.mysql.jdbc.Driver"); 
        if(conexion==null) {
        conexion =DriverManager.getConnection ("jdbc:mysql://"+servidor+":"+puerto+"/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",usuario,password ); 
        }
        } catch(Exception e){
            e.printStackTrace();
        }
       return conexion;
   }
    
}
