package com.company;


public class Main {
    public static void sort(Human humans[]) {
        for (int i = humans.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (humans[j].getAge() > humans[j + 1].getAge()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23);
        Human guzel = new Human("Guzel", 18);
        Human maksim = new Human("Maksim", 13);
        Human nika = new Human("Nika", 16);
        Human ruslan = new Human("Ruslan", 16);
        Human marat = new Human("Marat", 16);
        Human karim = new Human("Karim", 16);

        Human humans[] = {marsel, ruslan, maksim, karim, guzel, nika, marat};

        sort(humans);

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getAge() + " " + humans[i].getName());
        }

        System.out.println(maxHuman(humans));
    }

    public static Human maxHuman(Human humans[]) {
        Human min = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (min.getAge() < humans[i].getAge()) {
                min = humans[i];
            }
        }

        return min;
    }

}