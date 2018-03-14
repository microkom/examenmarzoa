/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmarzoa;

import static examenmarzoa.Util.writeFile;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author german
 */
public class Empresa {

    private String nombre;
    ArrayList<Entidad> entity = new ArrayList<Entidad>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Entidad> getEntity() {
        return entity;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEntity(ArrayList<Entidad> entity) {
        this.entity = entity;
    }

    public void consultaDB(String country) {
        Conexion login = new Conexion();
        Connection con = null;
        PreparedStatement stmt = null;
        PreparedStatement stmt2 = null;
        
        

        try {
            //conexión a la base de datos
            con = login.conectar();

            stmt = con.prepareStatement("select * from clientes where pais=?");
            stmt.setString(1, country);
            ResultSet rs = stmt.executeQuery();

            Entidad person = null;

            while (rs.next()) {
                person = new Cliente(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8));
                    entity.add(person);

            }
            File fichero1 = new File("clientes.txt");
            String text = "EMPRESA: "+this.nombre+"\nCLIENTES DE: "+country;
            for (Entidad obj : entity) {
                if (obj instanceof Cliente) {
                    text += obj.toString();
                }
            }
            writeFile(fichero1,text);
            
            stmt2 = con.prepareStatement("select * from proveedores where pais=?");
            stmt2.setString(1, country);
            ResultSet rs2 = stmt2.executeQuery();
            
            while (rs2.next()) {
                person = new Proveedor(rs2.getInt(1), rs2.getString(2),
                        rs2.getString(3), rs2.getString(4), rs2.getString(5),
                        rs2.getString(6), rs2.getString(7), rs2.getString(8));

                    entity.add(person);

            }
            File fichero2 = new File("proveedores.txt");
            String text2 = "EMPRESA: "+this.nombre+"\nPROVEEDORES DE: "+country;
            for (Entidad obj : entity) {
                if (obj instanceof Proveedor) {
                    text2 += obj.toString();
                }
            }
            writeFile(fichero2,text2);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            login.desconectar(con);
        }
    }

   

}
