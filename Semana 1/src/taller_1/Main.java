/**
 *
 * @author Kmylho https://linktr.ee/Kmylho
 */
package taller_1;
import taller_1.Person;

import java.util.Date;

class Main {

    public static void main(String[] args) {

        Person P1;
        P1 = new Person("Andres","Piratova","Pineda",new Date("2022/02/07") ,61);

        System.out.println(P1.dateBirth);
    }
}

