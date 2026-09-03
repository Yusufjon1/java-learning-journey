package Relationships.HasRelationships;

public class Address {
    private String countryName;
    private String regionName;
    private String streetName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Address(String countryName, String regionName, String streetName) {
        this.countryName = countryName;
        this.regionName = regionName;
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "countryName='" + countryName + '\'' +
                ", regionName='" + regionName + '\'' +
                ", streetName='" + streetName + '\'' +
                '}';
    }
}
