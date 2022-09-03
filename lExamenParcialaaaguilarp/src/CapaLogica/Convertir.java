/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

/**
 *
 * @author JADPA-20
 */
public class Convertir {
    public static String getConvertir(String valor){
        try{
            return "Su resultado es: "+(Double.parseDouble(valor)/1000);
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
