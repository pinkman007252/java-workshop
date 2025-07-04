package tem.bin;
import java.util.Arrays;
public class employe {
  public static void main(String [] args) {
    String[][] employes = new String[5][3];
    employes[0][0] = "cable";
    employes[0][1] = "100000";
    employes[1][0] = "shahul";
    employes[1][1] = "200000";
    employes[2][0] = "zameer";
    employes[2][1] = "1000000";
    employes[3][0] = "subsah";
    employes[3][1] = "100000";
    employes[4][0] = "logesh";
    employes[4][1] = "1500000";
    for(String[] employe : employes) {
      System.out.println(Arrays.toString(employe));
    }

  }

}
