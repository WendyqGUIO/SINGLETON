/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author Estudiantes
 */
public class conexionS {
    private static conexionS instancia;
    
    private conexionS(){
    }
    public static conexionS getinstancia(){
    
         if(instancia == null){
             instancia = new conexionS();
         }
         return instancia;
        
    
    
    }
    public void conectar(){
        System.out.println("me conecte a a la base de datos");
    }
    public void desconectar(){
        System.out.println("me conecte a a la base de datos");
    }
    }


