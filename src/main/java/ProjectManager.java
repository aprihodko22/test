import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class ProjectManager {
    public static void main(String[] args){
        int arrya[] = {1, 2, 3};
        String arryaString = Arrays.toString(arrya);
//        System.out.println(arrya[0]);
//        System.out.println(arrya[1]);
//        System.out.println(arrya[2]);
        int temp = arrya[0];
        arrya[0] = arrya[2];
        arrya[2] = temp;
        System.out.println(arrya[0]);
        System.out.println(arryaString);

        String stringValue = "2";
        double stringValueDouble = Double.parseDouble(stringValue);
        double result = stringValueDouble/3;
        DecimalFormat decimalFormat = new DecimalFormat("##.0000");
        double rounding = Double.parseDouble(decimalFormat.format(result));

        System.out.println(rounding);

//        String s1 = "Hyi ";
//        String s2 = "V peske";
//
//        System.out.println(s1+s2);
//        System.out.println("ti " +s1);
//
        System.out.println(result == rounding);


    }
}
