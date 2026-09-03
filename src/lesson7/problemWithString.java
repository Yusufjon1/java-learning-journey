package lesson7;

public class problemWithString {
    public static void main(String[] args) {

      /*  String string = "hello ->";
        for (int i = 0; i < 1e2; i++) {
            string = string.concat(String.valueOf(i));
        }
        System.out.println(string); */

        /*
        in this case that is not good idea to use the string method because it takes too much memory
        and makes more cache which system after the end of the method has to clean
         */


        StringBuffer stringBuffer = new StringBuffer(); // stringBuffer keeps the objects in char[]
        stringBuffer.append("hello->");
        stringBuffer.append("hello->12");
        System.out.println(stringBuffer.capacity());
        stringBuffer.append("12");
        System.out.println(stringBuffer.capacity()); // this shows the storage of stringBuffer
        // and this gets larger by this formula 16 + 16 + 2
        System.out.println(stringBuffer.length()); // that shows how many capacity really fulled

        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 1e2; i++) {
            str.append(i);
        }
        System.out.println(str);

        /*
        there is also string builder which almost same with stringBuffer
        string builder works faster because it is single thread and non synchronized and not safe as well. however really useful for dailz use and for small projects
         */
    }
}
