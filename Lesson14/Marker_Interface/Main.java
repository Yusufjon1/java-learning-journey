package Lesson14.Marker_Interface;

public class Main implements Cloneable {
    static void main(String[] args) throws Exception {
        // cloneable
        Main main = new Main();
        Main cloneOfMain = (Main) main.clone();

    }
}
