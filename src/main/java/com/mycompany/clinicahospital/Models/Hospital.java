/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.Models;

import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Hospital {
    
    private String nombre;
    private String ciudad;
    private List<Consulta> consultas;

    public Hospital() {
    }

    public Hospital(String nombre, String ciudad, List<Consulta> consultas) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consultas = consultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", consultas=" + consultas + '}';
    }
    
   
}
