/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import conexion.conexionS;
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexionS c = conexionS.getinstancia();
        c.conectar();
        c.desconectar();
        
        
        boolean rpta= c instanceof conexionS;
        System.out.println( rpta);
        }
        // TODO code application logic here
    }
    

