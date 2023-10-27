package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import pojo.Energie;
import pojo.Garage;
import pojo.Voiture;
import pojo.VoitureElectrique;

/**
 * Hello world!
 *
 */

public class App  
{
	 
	
    public static void main( String[] args ) {
    	Scanner sc =  new Scanner(System.in);
        //création d'une voiture: energie,state,name
    	//saisie du nom dans name
       System.out.println("Quel est le nom de votre voiture? : ");
       String name = sc.nextLine();
       System.out.println(name);
       
       //saisie de l'état dans isState
       String state="";
       while(!state.equals("o") && !state.equals("n")) {
       System.out.println("Votre voiture est elle allumée? : o/n");
       state =sc.nextLine();
       }
        state = state.equals("o") ? "allumée" :"éteinte";
       System.out.println(state);
       
       //saisie de l'energie dans myEnergy
       System.out.println("Saisissez le numéro correspondant à l'energie consommée par votre voiture : ");
       Energie[] values = Energie.values();
       StringBuilder stringBuilder = new StringBuilder();
       for(int i = 0; i<values.length; i++) {
    	   stringBuilder.append(i).append(" - ").append(values[i]).append("\n");
       }
       System.out.println(stringBuilder);
       
       //Gestion d'erreur
       int energie =-1;
       boolean check = false;
       while(!check) {
    	   try {
        	   energie = sc.nextInt();   
        	   if(energie<0 || energie>=values.length) {
        		   throw new IllegalNumberChoice();//crée une nouvelle exception personnalisée
        	   }
        	   check = true;
           }catch(InputMismatchException e) {
        	   System.out.println("La donnée indiquée n'est pas un chiffre, merci de saisir une valeur de menu");
        	   sc.next();
           }catch (IllegalNumberChoice e) {
        	   System.out.println("Le chiffre indiqué n'est pas valide, merci de saisir une valeur de menu");
           }
       }
       Energie myEnergy = values[energie];
       System.out.println(new Voiture(myEnergy,state,name));
    }
 

}