package oopsconceptsjava.app;

import concreteclasses.Chocolate;
import concreteclasses.Wine;

/**
 *
 * @author: Dejan Smiljić; e-mail: dej4n.s@gmail.com
 *
 */
public class OOPsJavaApp {

    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate(0.7, "Eat Me Now!", "0800158994950", 10);
        Wine wine = new Wine(0.33, "Maid Madallaine", "9393171965102", 20);

        System.out.println(chocolate);
        System.out.println(wine);

    }

}
