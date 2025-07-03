package tem.bin;

public class sensor {
    public static void main(String [] args){
        private double SenID;
        private String Name;
        private double Temdate;
        public void setSenID(double senID) {
            SenID = senID;
        }
        public void setName(String name) {
            Name = name;
        }
        public void setTemdate(double temdate) {
            Temdate = temdate;
        }
        public double getSenID() {
            return SenID;
        }
        public String getName() {
            return Name;
        }
        public double getTemdate() {
            return Temdate;
        }
    }

}  

