package tem.bin;

public class Location {
    private String Name;
    private double Longtitude;
    private String Altitude;
    private String City;
    private String Adress;
    private String Postalcode;

    public void setName(String name) {
        Name = name;
    }
    public void setLongtitude(double longtitude) {
        Longtitude = longtitude;
    }
    public void setAltitude(String altitude) {
        Altitude = altitude;
    }
    public void setCity(String city) {
        City = city;
    }
    public void setAdress(String adress) {
        Adress = adress;
    }
    public void setPostalcode(String postalcode) {
        Postalcode = postalcode;
    }
    public String getName() {
        return Name;
    }
    public double getLongtitude() {
        return Longtitude;
    }
    public String getAltitude() {
        return Altitude;
    }
    public String getCity() {
        return City;
    }
    public String getAdress() {
        return Adress;
    }
    public String getPostalcode() {
        return Postalcode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "Name='" + Name + '\'' +
                ", Longtitude=" + Longtitude +
                ", Altitude='" + Altitude + '\'' +
                ", City='" + City + '\'' +
                ", Adress='" + Adress + '\'' +
                ", Postalcode='" + Postalcode + '\'' +
                '}';
    }
}
