package Lesson18.enumclasses;

public enum Planet {
    MERCURY(1, 3),
    EARTH(1, 3),
    SATURN(1, 3),
    JUPITER(1, 3),
    MOON(1, 3),
    MARS(1, 3),
    NEPTUNE(1, 3),
    URANUS(1, 3);

    private final double planetMass;
    private final double planetRadius;
    private static final double G = 6.67;

    Planet(double planetMass, double planetRadius) {
        this.planetMass = planetMass;
        this.planetRadius = planetRadius;
    }

    public double getPlanetMass() {
        return planetMass;
    }

    public double getPlanetRadius() {
        return planetRadius;
    }

    public double surfaceGravity() {
        return G * planetMass / (Math.pow(planetRadius, 2));
    }

    public double surfaceWeight(double objectMass) {
        return surfaceGravity() * objectMass;
    }
}
