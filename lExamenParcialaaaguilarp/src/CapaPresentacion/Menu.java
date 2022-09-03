/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaPresentacion;

import CapaLogica.Convertir;
import java.util.Scanner;

/**
 *
 * @author JADPA-20
 */
public class Menu {
    public void Opciones(){
        System.out.println("1-Convertir byte a kilobyte");
        System.out.println("2-Convertir kilobyte a megabyte");
        System.out.println("3-Salir");
        System.out.print("Escoja la opción deseada: ");
    }
    public void SeleccionarOpciones(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido");
        int opc=0;
        while(opc!=3){
            Opciones();
            try{
            opc=sc.nextInt();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            if(opc==3)break;
            switch(opc){
                case 1:
                    System.out.print("Ingrese los byte: ");
                    System.out.println(Convertir.getConvertir(sc.next()));
                    break;
                case 2:
                    System.out.print("Ingrese los kilobyte: ");
                    System.out.println(sc.next());
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        }
    }
}
