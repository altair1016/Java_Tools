import java.util.*;
public class Test {
    
    public static void main (String[] args){
        Scanner leggi= new Scanner (System.in);
        int i, scelta;
        char risposta=' ';
        Stack nuovo = new Stack ();
        nuovo.disegnoArray();
       
        do{
        graficaProgramma();
        scelta = leggi.nextInt();
        
        switch (scelta){
            case 1:
                nuovo.push();
                nuovo.stampaArray();
                break;
            case 2:
                nuovo.pop();
                nuovo.stampaArray();
                break;
            case 3:
                System.out.println("Premendo il tasto 1, si scegliera di effettuare l'operazione PUSH, ovvero"
                        + "si scegliera di aggiungere dati (in questo esempio numeri), all'interno della memoria.\n"
                        + "Premendo la scelta 2, si effettua l'operazione del POP ovvero la rimozione dei dati "
                        + "Premendo il tasto 4 si effettuerà l'uscita dal programma");
                break;
            case 4:
                System.exit(0);
                break;
        }   
        }while(risposta != 'n');     
        
    }   
        
    
    static void graficaProgramma(){
    System.out.println();
    System.out.println(" _______________________________________");
    System.out.println("|                                       |");
    System.out.println("|  FUNZIONAMENTO DI UNA MEMORIA STACK   |");
    System.out.println("|_______________________________________|");
    System.out.println("Questo programma mostra il funzionamento di uno stack pointer.\n"
            + "Il vostro compito è quello di inserire un numero a vostro piacere, purchè\n"
            + "sia diverso da zero, altrimenti si sceglie di annullare l'operazione di "
            + "inserimento.\n");
    System.out.println("1. Effettuare l'operazione di PUSH\n2. Effettuare l'operazione di POP\n3.Aiuto "
            + "\n4.Uscita dal programma ");
    }
}
