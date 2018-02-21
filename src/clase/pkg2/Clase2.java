/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Clase2 {
    
    public static long fibonnaci (int n){
        long []f = new long[n+1] ;       
        f[0] = 0;
        if(n>=1){
            f[1] = 1;
        }
        for(int i=2; i<=n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
    
    public static long pascal(int n , int k){
        long [][] p = new long [n+1][k+1];
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= k; j++){
                if (j == 0 && j != i){
                    p[i][j] = 1;
                }
                else{
                    if (j == i){
                        p[i][j] = 1;
                        break;
                    }
                    else{
                        p[i][j] = p[i-1][j-1] + p[i-1][j];
                    }
                }
            }
        }
        return p[n][k];
    }
    public static void main(String[] args) {
        /*double TInicio, TFin;        
        Scanner t = new Scanner(System.in);
        int i= t.nextInt();
        TInicio = System.currentTimeMillis();
        for (int ii=0; ii<i;ii++ ){
            System.out.println(fibonnaci(ii)+ " ");
        }
        TFin = System.currentTimeMillis();
        System.out.println(TFin-TInicio);*/
        System.out.println(pascal(3 ,3));
    }
    
}
