package tem.bin;

public class floor {
    private String Name;
    private int Number;

    public void setName(String name) {
        Name = name;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public int getNumber() {
        return Number;
    }

    public static void main(String[] args){
        floor f = new floor();
        f.setName("Example");
        f.setNumber(1);
        System.out.println("Name: " + f.getName());
        System.out.println("Number: " + f.getNumber());
    }
}

