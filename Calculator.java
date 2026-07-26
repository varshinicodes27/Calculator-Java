import java.util.*;
import java.util.stream.Collectors;
import CalcLib.MathLib;

public class Calculator {

    private static int v1(int a, int b) {
        MathLib ml = new MathLib();
        return ml.add(a,b);
    }
     private static int v2(int a, int b) {
        return MathLib.add(a,b);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.contains("+")) {
          List<Integer> arr = Arrays.stream(input.split("[+]")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(arr);
            System.out.println(v2(arr.get(0), arr.get(1)));
        }
    }
}
