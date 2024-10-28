/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kathymhtps
 */

    public class Persona {
    private double altura;  
    private double circunferenciaCadera;  
    private double iac;  

    
    public Persona(double altura, double circunferenciaCadera) {
        this.altura = altura;
        this.circunferenciaCadera = circunferenciaCadera;
    }

    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCircunferenciaCadera() {
        return circunferenciaCadera;
    }

    public void setCircunferenciaCadera(double circunferenciaCadera) {
        this.circunferenciaCadera = circunferenciaCadera;
    }

    public double getIAC() {
        return iac;
    }

   
    public void calcularIAC() {
        
        this.iac = (circunferenciaCadera / (altura * Math.sqrt(altura))) - 18;
    }
}


