import java.util.ArrayList;

public class Method {
  private static double num1;
  private static double num2;
  private static double num3;
  private static double num4;
  private static double num5;
  private static double sum;
  
  public Method() {
    num1 = 0;
    num2 = 0;
    num3 = 0;
    num4 = 0;
    num5 = 0;
  }
  
  public static double sum(ArrayList<Double> list) {
    num1 = list.get(0);
    num2 = list.get(1);
    num3 = list.get(2);
    num4 = list.get(3);
    num5 = list.get(4);
    sum = (num1 + num2 + num3 + num4 + num5);
    
    
    
   
    return sum;
  }
  }

