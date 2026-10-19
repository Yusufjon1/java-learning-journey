package Lesson18.enumclasses;

public class Main {
    static void main(String[] args) {

        // final String day = "Saturday";

        Day day = Day.MONDAY;
        Day day2 = Day.TUESDAY;
     /*   Day tuesday = Day.TUESDAY;
        Day wednesday = null;*/

     /*   switch (day){
            case FRIDAY -> System.out.println("Juma");
            case MONDAY -> System.out.println("Dushanba");
            case SATURDAY -> System.out.println("Shanba");
        }*/

      /*  System.out.println(day.equals(day2));
        System.out.println(day.ordinal());

        String name = day2.name();
        System.out.println(name.toLowerCase());*/

      /*  Day[] days = Day.values();
        for (Day d : days) {
            System.out.println(d.name().toLowerCase());
        }*/

       /* Day day1 = Day.valueOf("MONDAY");
        System.out.println(day1.ordinal());*/

        Language language = Language.getByName("korean");
        System.out.println(language);


    }
}
