/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JD.Modelo;


public class Usuario {
   private String nit,nombre,apellido;
   private int edad;

    public Usuario(String nit, String nombre, String apellido, int edad) {
         this.nit = nit;
       this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   
   

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
