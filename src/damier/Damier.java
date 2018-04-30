/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damier;

import java.util.Scanner;
// ça, ça sert à importer le scanner dans la bibliothèque Java
/**
 *
 * @author Christilla
 */
public class Damier {
// ne rien écrire ici... Sais pas pourquoi
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //crée la console Scanner
        System.out.print("Saisir la valeur d'un côté du damier : ");
        //Crée la phrase qui demandera la valeur choisie dans la console
             int coteDamier = sc.nextInt();
        System.out.println(coteDamier);
        //Crée la variable Cotedamier qui sera la première colonne
         
        for (int ligneDamier = 0; ligneDamier < coteDamier; ligneDamier ++ ) {
            System.out.println();
            //Première boucle pour créer les lignes du tableau
            boolean cell = true;  
            //variable cell qui sera affiché aléatoirement (V/F) dans les cases du tableau
            for (int a = 0; a <= coteDamier; a++) {
                //Deuxième boucle qui va remplir les lignes du tableau
                if (cell == true){
                    System.out.print("*");
                    //Première condition: si cell = vrai, affiche * dans la case
                }else{
                    System.out.print(" ");
                    //Deuxième conditon: si cell est faux, affiche / dans la case
                }
                cell = !cell;
                //Flag (?) pour inverser la condition de cell et afficher * et / à la suite
            }
        }    
    }    
}
