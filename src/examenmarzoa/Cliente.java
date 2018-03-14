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
public class Cliente extends Entidad{
    private String idCliente;

    public Cliente(String idCliente, String nombre, String contacto, String cargoContacto, String direccion, String ciudad, String pais, String telefono) {
        super(nombre, contacto, cargoContacto, direccion, ciudad, pais, telefono);
        this.idCliente = idCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "\n\n\n\tID: " + this.idCliente + super.toString();
    }

    
    
    
}
