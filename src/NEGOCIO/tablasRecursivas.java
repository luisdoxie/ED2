/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NEGOCIO;

/**
 *
 * @author hp
 */
public class tablasRecursivas {

      // ----------------------------- EJERCICIO 1 -----------------------------
    // tabla(n): Procedimiento que muestra la tabla de multiplicación de 3 factores de 1 a n.
    public static void tabla(int n) {
        tablaAux(n, 1, 1, 1);
    }
    public tablasRecursivas(){
        
    }
    private static void tablaAux(int n, int i, int j, int k) {
        if (i > n) return;
        if (j > n) {
            tablaAux(n, i + 1, 1, 1);
            return;
        }
        if (k > n) {
            tablaAux(n, i, j + 1, 1);
            return;
        }
        System.out.println(i + " x " + j + " x " + k + " = " + (i * j * k));
        tablaAux(n, i, j, k + 1);
    }

    // ----------------------------- EJERCICIO 2 -----------------------------
    // tabla(n, k): Procedimiento que muestra la tabla de multiplicación de 1 a n, 
    // mostrando solo cuando los factores dan como resultado k.
    public static void tabla(int n, int valor) {
        tablaAux2(n, 1, 1, 1, valor);
    }

    private static void tablaAux2(int n, int i, int j, int k, int valor) {
        if (i > n) return;
        if (j > n) {
            tablaAux2(n, i + 1, 1, 1, valor);
            return;
        }
        if (k > n) {
            tablaAux2(n, i, j + 1, 1, valor);
            return;
        }
        if (i * j * k == valor)
            System.out.println(i + " x " + j + " x " + k + " = " + valor);
        tablaAux2(n, i, j, k + 1, valor);
    }

    // ----------------------------- EJERCICIO 3 -----------------------------
    // tablaAscDescAsc(n): i ascendente, j descendente, k ascendente
    public static void tablaAscDescAsc(int n) {
        tablaAux3(n, 1, n, 1);
    }

    private static void tablaAux3(int n, int i, int j, int k) {
        if (i > n) return;
        if (j < 1) {
            tablaAux3(n, i + 1, n, 1);
            return;
        }
        if (k > n) {
            tablaAux3(n, i, j - 1, 1);
            return;
        }
        System.out.println(i + " x " + j + " x " + k + " = " + (i * j * k));
        tablaAux3(n, i, j, k + 1);
    }

    // ----------------------------- EJERCICIO 4 -----------------------------
    // tablaDescAscDesc(n): i descendente, j ascendente, k descendente
    public static void tablaDescAscDesc(int n) {
        tablaAux4(n, n, 1, n);
    }

    private static void tablaAux4(int n, int i, int j, int k) {
        if (i < 1) return;
        if (j > n) {
            tablaAux4(n, i - 1, 1, n);
            return;
        }
        if (k < 1) {
            tablaAux4(n, i, j + 1, n);
            return;
        }
        System.out.println(i + " x " + j + " x " + k + " = " + (i * j * k));
        tablaAux4(n, i, j, k - 1);
    }

    // ----------------------------- EJERCICIO 5 -----------------------------
    // tablaPares(n): Procedimiento que muestra tabla de multiplicar de n con factores pares
    public static void tablaPares(int n) {
        tablaAux5(n, 2, 2, 2);
    }

    private static void tablaAux5(int n, int i, int j, int k) {
        if (i > n) return;
        if (j > n) {
            tablaAux5(n, i + 2, 2, 2);
            return;
        }
        if (k > n) {
            tablaAux5(n, i, j + 2, 2);
            return;
        }
        System.out.println(i + " x " + j + " x " + k + " = " + (i * j * k));
        tablaAux5(n, i, j, k + 2);
    }

    // ----------------------------- EJERCICIO 6 -----------------------------
    // tablaParImpar(n): Procedimiento que muestra la tabla de multiplicar de n 
    // con factores pares e impares (no todos pares y no todos impares).
    public static void tablaParImpar(int n) {
        tablaAux6(n, 1, 1, 1);
    }

    private static void tablaAux6(int n, int i, int j, int k) {
        if (i > n) return;
        if (j > n) {
            tablaAux6(n, i + 1, 1, 1);
            return;
        }
        if (k > n) {
            tablaAux6(n, i, j + 1, 1);
            return;
        }

        boolean iPar = i % 2 == 0;
        boolean jPar = j % 2 == 0;
        boolean kPar = k % 2 == 0;

        // Al menos un par y al menos un impar
        if (!((iPar && jPar && kPar) || (!iPar && !jPar && !kPar))) {
            System.out.println(i + " x " + j + " x " + k + " = " + (i * j * k));
        }

        tablaAux6(n, i, j, k + 1);
    }
    
    public void cicloI(int n, int i){
        if(i > n) return ;
        cicloJ(n,i,1);
        System.out.println();
        System.out.println("");
        cicloI(n,i+1);
    }
    
    public void cicloJ(int n, int i, int j){
        if(j>n)return;
        System.out.println(i+ " x "+j+" = " + i*j);
        cicloJ(n,i,j+1);
    }
    
    public static void main(String[] args){
        tablasRecursivas L = new tablasRecursivas();
        L.cicloI(1, 2);
    } 
}
