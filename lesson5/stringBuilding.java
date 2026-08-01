package lesson5;

public class stringBuilding {
    public static void main(String[] args) {
     /*   String str = "";
        for (int i = 0; i < 50; i++) {
            str = str + i;
        }
        System.out.println(str);*/


        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 50; i++) {
           // stringBuilder.append(i);
            stringBuilder.insert(0, i);
        }
        String str = stringBuilder.toString();
        System.out.println(str);
    }

}
