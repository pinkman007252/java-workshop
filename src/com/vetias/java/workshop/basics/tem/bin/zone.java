package tem.bin;

public class zone {
    private String Namel;
    private double Zone;
    private String Type;
    private double Area;

    public void setNamel(String namel) {
        Namel = namel;
    }
    public void setZone(double zone) {
        Zone = zone;
    }
    public void setType(String type) {
        Type = type;
    }
    public void setArea(double area) {
        Area = area;
    }
    public String getNamel() {
        return Namel;
    }
    public double getZone() {
        return Zone;
    }
    public String getType() {
        return Type;
    }
    public double getArea() {
        return Area;
    }

    public static void main(String[] args){
        // You can test your class here
        zone z = new zone();
        z.setNamel("Test Zone");
        z.setZone(1.0);
        z.setType("Residential");
        z.setArea(100.5);
        System.out.println("Name: " + z.getNamel());
        System.out.println("Zone: " + z.getZone());
        System.out.println("Type: " + z.getType());
        System.out.println("Area: " + z.getArea());
    }
}

