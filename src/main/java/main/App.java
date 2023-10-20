package main;

import java.util.ArrayList;
import java.util.List;

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
    public static void main( String[] args )
    {
        //le mot clef New permet d'instancier une voiture
        //maVoiture est une instance voiture => "une version"
        Voiture maVoiture = new Voiture(); // => type Objet
        maVoiture.setEnergie(Energie.GAZ);

        VoitureElectrique maVoitureElectrique = new VoitureElectrique();
       
       
        Voiture[] mesVoitures = new Voiture[4];
        List<Voiture> maListe = new ArrayList();
        maListe.add(maVoitureElectrique);//ajouter un element dans une liste
        maListe.add(maVoiture);
        
        Garage garage = new Garage(maListe);
        
        
        List<Voiture> garages = garage.getLesVoitures();
     
        
        System.out.println(
        		garages.stream().filter(uneVoiture -> uneVoiture.getEnergie().equals(Energie.ELECTRIQUE)));
        
        
       
         
        
        
        
    }
}