/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.util.Scanner;

/**
 *
 * @author elizabethguardado
 */
public class clsRecorrer {
    public void despliega(int matriz[][]){
    for (int x = 0; x < matriz.length; x++){
        for (int y = 0; y < matriz[x].length; y++){
            int currentCell = matriz[x][y];
            System.out.print(currentCell);
        }
        System.out.println();
    }
}    
    int matriz[][] = new int [3][8];
      int numero = (int)(Math.random()*9+1);
    public void recorrido () {
      
      
        
        for (int x = 0; x < matriz.length; x++)
        {
            
            
         
           matriz[numero][numero] = 1;
          matriz[numero][0] = 0;
        
        }
       System.out.println("\033[31m\t\t\tINICIO DEL JUEGO:"); 
        despliega(matriz);
        
        
}
    
        public void juego(){
            
		
		
Scanner teclado = new Scanner(System.in);
System.out.print("\033[32mIngrese el numero que utilizara para jugar: ");
int valor = teclado.nextInt();
System.out.print("\033[33m¿A que fila desea llevarlo?: ");
int posx = teclado.nextInt();
System.out.print("\033[33m¿A que columna desea llevarlo?: ");
int posy = teclado.nextInt();



		
matriz[posx][posy] = valor;
System.out.println("\033[31m\t\t\tJUEGO RESUELTO: ");
despliega(matriz);
if (posx == numero) {
    if (posy == numero){
        System.out.println("\033[35m\t\t\tGANASTE!!!!!!!!");
    }
    
}
else {
    System.out.println("\033[36m\t\t\tPERDISTE :(");
}


        }
        
        
        
        
    

    
   
}
    

