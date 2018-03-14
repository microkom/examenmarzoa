/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmarzoa;

/**
 *
 * @author german
 */
public class Proveedor extends Entidad{
    
    private int idProveedor;

    public Proveedor(int idProveedor, String nombre, String contacto, String cargoContacto, String direccion, String ciudad, String pais, String telefono) {
        super(nombre, contacto, cargoContacto, direccion, ciudad, pais, telefono);
        this.idProveedor = idProveedor;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
         return "\n\n\n\tID: " + this.idProveedor + super.toString();
    }
    
    
}
