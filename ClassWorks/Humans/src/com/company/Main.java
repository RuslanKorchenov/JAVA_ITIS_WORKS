package com.company;


public class Main {

    public static Object min(Object objects[], Comparator comparator) {
        Object min = objects[0];
        for (int i = 1; i < objects.length; i++) {
            int compareResult;
            if (comparator == null) {
                compareResult = ((Comparable)min).compareTo(objects[i]);
            } else {
                compareResult = comparator.compare(min, objects[i]);
            }

            if (compareResult > 0) {
                min = objects[i];
            }
        }

        return min;
    }

    public static Object min(Comparable comparables[]) {
        return min(comparables, null);
    }
    /**
     public static Object min(Comparable comparables[]) {
     Comparable min = comparables[0];
     for (int i = 1; i < comparables.length; i++) {
     if (min.compareTo(comparables[i]) > 0) {
     min = comparables[i];
     }
     }
     return min;
     }
     **/

    /**
     public static Object min(Object objects[]) {
     Object min = objects[0];
     for (int i = 1; i < objects.length; i++) {
     // if ()
     }
     return null;
     }
     **/
    public static Human minHuman(Human humans[]) {
        Human min = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (min.getAge() > humans[i].getAge()) {
                min = humans[i];
            }
        }

        return min;
    }

    public static Rectangle minRectangle(Rectangle rectangles[]) {
        Rectangle min = rectangles[0];
        for (int i = 1; i < rectangles.length; i++) {
            if (min.area() > rectangles[i].area()) {
                min = rectangles[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Human marsel = new Human("Marsel", 23, 185);
        Human guzel = new Human("Guzel", 18, 178);
        Human maksim = new Human("Maksim", 14, 169);
        Human sergey = new Human("Sergey", 16, 182);
        Human veronika = new Human("Verokina", 16, 160);
        Human marat = new Human("Marat", 16, 183);
        Human ruslan = new Human("Ruslan", 16, 181);

        Human humans[] = {guzel, maksim, sergey, veronika, marat, ruslan, marsel};

        Human min = minHuman(humans);
        System.out.println(min);

        Rectangle a = new Rectangle(4, 5);
        Rectangle b = new Rectangle(3, 1);
        Rectangle c = new Rectangle(10, 2);
        Rectangle d = new Rectangle(11, 2);
        Rectangle e = new Rectangle(4, 1);
        Rectangle f = new Rectangle(2, 9);

        Rectangle rectangles[] = {a, b, c, d, e, f};

        Rectangle minRect = minRectangle(rectangles);
        System.out.println(minRect);

        Rectangle elseMinRect = (Rectangle)min(rectangles);
        System.out.println(elseMinRect);

        Human elseMinHuman = (Human)min(humans);
        System.out.println(elseMinHuman);

        Human minHeight = (Human)min(humans, new HumanHeightComparator());
        System.out.println(minHeight);

        Human minAgeHuman = (Human)min(humans);
        System.out.println(minAgeHuman);

        String s1 = "Hello!";
        String s2 = "Hellwo!";

        CharSequence sequence = new CharSequence(s1.toCharArray());
        CharSequence otherSequence = new CharSequence(s2.toCharArray());





    }
}