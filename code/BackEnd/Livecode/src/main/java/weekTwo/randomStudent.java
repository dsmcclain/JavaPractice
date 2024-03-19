package weekTwo;

import java.util.concurrent.ThreadLocalRandom;

public class randomStudent {
    public static void main(String[] args) {
       String [] studentArray = {
               "Alan Morales Rueda",
               "Andre Uys",
               "Audomaro Gonzalez",
               "Caio Henrique",
               "Chris Valencia",
               "Daniel Lee",
               "Humberto Rojas",
               "Javier Mendoza",
               "Joao Alonso",
               "Luis Barraza Hernandez",
               "Mariana Duarte",
               "Miguel Angel Rodriguez",
               "Rosendo Galindo",
               "Sean Jaw",
               "Tiffany Yee",
               "Vincent Vu",
               "Nathaniel Schieber",
               "Dylan McClain",
               "Grant Stampfli"
       };

      mutateArray(studentArray);
      System.out.println(studentArray[0]);
      //  System.out.println(getRandomStudent(studentArray));
    }

    public static void mutateArray(String[] arr) {
        arr[0] = "test";
    }

    public static String getRandomStudent(String[] arr) {
        int num = ThreadLocalRandom.current().nextInt(arr.length);
        return arr[num];
    }
}
