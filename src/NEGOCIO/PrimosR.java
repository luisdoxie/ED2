/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author hp
 */
public class PrimosR {
    public static boolean primo(int n){
        if(n<2){
            return false;
        }
        return primoR(n,2);
    }
    
    public static boolean primoR(int n, int i){
        if(i*i > n ){
            return true;
        }
        if(n%i==0){
            return false;
        }
        return primoR(n,i+1);
    }
    
    public static void mostrarPrimos(int a, int b){
        if (a<= b){
            
        }
    }
}
