/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto3;

import javax.swing.JTextField;

/**
 *
 * @author ol196
 */
public class Cliente {
    private int idCliente;
    private String ID;
    private String nombre;
    private int edad;
    private  String Edad1;
    private String correo;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String ID, String nombre, String Edad1, String correo, String telefono) {
        this.ID = ID;
        this.nombre = nombre;
        this.Edad1 = Edad1;
        this.correo = correo;
        this.telefono = telefono;
    }
    

   public Cliente(int idCliente, String nombre, int edad, String correo, String telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEdad1() {
        return Edad1;
    }

    public void setEdad1(String Edad1) {
        this.Edad1 = Edad1;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
            
}
