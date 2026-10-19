package Lesson18.enumclasses;

public class PlanetTest {
    static void main(String[] args) {
       /* System.out.println(Planet.EARTH.getPlanetMass());
        System.out.println(Planet.EARTH.getPlanetRadius());*/

      /*  double objectOnEarth = 17;
        System.out.println(Planet.EARTH.surfaceWeight(objectOnEarth));
        System.out.println(Planet.EARTH.surfaceGravity());*/

        double objectOnEarth = 17;
        double objectMassOnEarth = objectOnEarth / Planet.EARTH.surfaceGravity();
        System.out.println(Planet.MARS.surfaceWeight(objectMassOnEarth));
        System.out.println(Planet.EARTH.surfaceWeight(objectMassOnEarth));
        for (Planet planet : Planet.values()) {
            System.out.printf("Object weight on planet %s is %.2f %n", planet.name(), planet.surfaceWeight(objectMassOnEarth));
        }
    }
}
