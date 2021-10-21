package com.example.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class IObaseDatos {

    

    public ResultSet creaconegion(String host, String puerto, String nameDB, String user, String pwd, String consulta){
        ResultSet resultCons = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        
        String urlCon = "jdbc:mariadb://"+host+":"+puerto+"/"+nameDB;
            Connection conexBd = DriverManager.getConnection(urlCon, user, pwd);

            Statement encapsulaCons = conexBd.createStatement();

            resultCons = encapsulaCons.executeQuery(consulta);

            encapsulaCons.close();
            conexBd.close();
                    
        }catch(ClassNotFoundException | SQLException cnfe){
            System.out.println(cnfe.getMessage());
        }
        
        return resultCons;
    };

    

    

    
    /*
    Class.forName("org.mariadb.jdbc.Driver");
    String urlCon = "jdbc:mariadb://localhost:3306/proy3te5";
    Connection conexBd = DriverManager.getConnection(urlCon, "root", "admin1234");
    Statement encapsulaCons = conexBd.createStatement();

    //"INSERT INTO DONANTES(DNI, Nombre, Direccion, CodPostal, Localidad, FechaNac, Correo, Telefono, GrupoSang, FactorRH) VALUES('" + dni + "', '" + nomDonante + "', '" + direccionDonante + "', '" + codPostal + "', '" + localidad + "', '" + fechaNac + "', '" + mail + "', '" + telefono + "', '" + grupoSang + "', '" + factorRH + "')
    resulCons = encapsulaCons.executeQuery(consulta);

    encapsulaCons.close();
    conexBd.close();
     */

}
