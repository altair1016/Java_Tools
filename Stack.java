import java.util.*;
public class Stack {
   public int [] pila;
   Scanner leggi = new Scanner (System.in); 
   
   public Stack (){
   pila = new int [20];
   
   }
   
   public void push(){
   int i;
     for (i = pila.length-1; i!=0; i--){
            pila[i]=leggi.nextInt();
            if (pila[i] == 0) break;
                
     }
   }
   
   public void pop(){
   int i;
    if (pila[pila.length -1]==0)
           System.out.println("L'array è già vuoto");
   for (i=0;i< pila.length; i++){
       if (pila [i]!= 0){
        pila[i]=0;
        break;
        }
   }
   }
   
   
   public void disegnoArray(){
   int i;
        for (i=0; i<pila.length; i++){
           pila[i]=0;
        }
   
   }

   public void stampaArray(){
   int i;
    for (i=0;i<pila.length;i++)
        System.out.print(pila[i]+" ");
            
   
   }

}
