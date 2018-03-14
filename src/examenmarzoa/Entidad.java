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
public class Entidad {
    
    private String nombre;
    private String contacto;
    private String cargoContacto;
    private String direccion;
    private String ciudad;
    private String pais;
    private String telefono;

    public Entidad(String nombre, String contacto, String cargoContacto, String direccion, String ciudad, String pais, String telefono) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.cargoContacto = cargoContacto;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public String getCargoContacto() {
        return cargoContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setCargoContacto(String cargoContacto) {
        this.cargoContacto = cargoContacto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "\n\tnombre: " + nombre + "\n\tContacto: " + contacto + "\n\tCargoContacto: " + cargoContacto + "\n\tDireccion: " + direccion + "\n\tCiudad: " + ciudad + "\n\tPais: " + pais + "\n\tTelefono: " + telefono ;
    }
    
    
}
