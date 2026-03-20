/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicahospital.Models;

/**
 *
 * @author ESTUDIANTE
 */

class Medico extends Persona{
 
    private String especialidad;
    private String tarjetaProfesional;

        public Medico() {
        }

        public Medico(String especialidad, String tarjetaProfesional) {
            this.especialidad = especialidad;
            this.tarjetaProfesional = tarjetaProfesional;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }

        public String getTarjetaProfesional() {
            return tarjetaProfesional;
        }

        public void setTarjetaProfesional(String tarjetaProfesional) {
            this.tarjetaProfesional = tarjetaProfesional;
        }
    
        public void atender(Consulta c){}

    @Override
    public String toString() {
        return "Medico{" + "especialidad=" + especialidad + ", tarjetaProfesional=" + tarjetaProfesional + '}';
    }
    
    
}
