import CalcLib.MathLib;
import java.util.*;
import java.util.stream.Collectors;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.contains("+")) {
            List<Integer> arr = Arrays.stream(input.split("[+]")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(MathLib.add(arr.get(0), arr.get(1)));
        }
        else if(input.contains("-")) {
            List<Integer> arr = Arrays.stream(input.split("[-]")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(MathLib.subtract(arr.get(0), arr.get(1)));
        }
        else if(input.contains("*")) {
        List<Integer> arr = Arrays.stream(input.split("[*]")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());

            System.out.println(MathLib.mul(arr.get(0), arr.get(1)));
        }
        else if(input.contains("/")) {
        List<Integer> arr = Arrays.stream(input.split("[/]")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());

            System.out.println(MathLib.div(arr.get(0), arr.get(1)));
        } else {
            System.out.println("Unsupported operator");
        }
    }
}
