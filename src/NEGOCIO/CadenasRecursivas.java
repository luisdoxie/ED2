/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author hp
 */
public class CadenasRecursivas {
    public static int frecuencia (String s, char ch){
        if(s.isEmpty()) return 0;
        return (s.charAt(0)== ch ? 1:0) + frecuencia(s.substring(1), ch);
    }
    public static boolean estanTodos(String s1, String s2){
        if (s1.isEmpty()) {
            return true;
        }
        return (s2.indexOf(s1.charAt(0)) != -1 && estanTodos(s1.substring(1),s2));
    }
    public static boolean todosDigitos(String s){
        if(s.isEmpty()){
            return true;
        }
        return Character.isDigit(s.charAt(0)) && todosDigitos(s.substring(1));
    }
     public static boolean charExcluyentes(String s1, String s2){
         if (s1.isEmpty()) {
             return true;
         }
         return (s2.indexOf(s1.charAt(0)) == -1) && charExcluyentes(s1.substring(1), s2);
     }
     
     public static boolean todosIguales (String s){
         if (s.length() <= 1) {
             return true;
         }
         return s.charAt(0)== s.charAt(1) && todosIguales(s.substring(1));
     }
    
}
