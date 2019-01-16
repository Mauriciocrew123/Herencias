/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia1;

/**
 *
 * @author LAB1
 */
public class Principal {
    
    public static void main(String[] args){
        Estudiante estudiante = new Estudiante(1, 8.4f, "Carlos", "Endara", "la marin" );
                estudiante.mostrasDatos();
                
                Profesor profesor = new Profesor(5, 35, "Juan", "Perez", "San Roque");
                profesor.mostrasDatos();
                
                Secretaria secretaria = new Secretaria(6, 23, "Maria", "Espinosa", "La loma");
                secretaria.mostrasDatos();
                
              
    }
    
    
}
