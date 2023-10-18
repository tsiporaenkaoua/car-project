package main;

import pojo.Energie;
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
        System.out.println(maVoiture);
        maVoiture.setEnergie(Energie.GAZ);
        System.out.println(maVoiture);

        VoitureElectrique maVoitureElectrique = new VoitureElectrique();
        System.out.println(maVoitureElectrique instanceof VoitureElectrique);
        System.out.println(maVoitureElectrique instanceof Voiture);
    }
}