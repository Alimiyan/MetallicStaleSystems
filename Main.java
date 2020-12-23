import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // finding the mortgage

  Scanner scanner = new Scanner(System.in);
  double Principal=0;
  double Interest=0;
  double period=0;
  double payment=0;
  while(true){
      System.out.print("Principal ($1k-$1m): ");
      Principal= scanner.nextDouble();
    if (Principal>=1000 && Principal <=1000000)
      break;
    else
      System.out.println("enter a number between 1000 and 1000000");
      continue;
  }
  while(true){
      System.out.print("Annual Interest rate: ");
      Interest= scanner.nextDouble();
    if(Interest >0 && Interest <=30){
      Interest= Interest/100/12;
      break;
    }
    else
      System.out.println("enter a number between 1 and 30");
      continue;
  }
  while(true){
      System.out.print("Period (Years):");
      period= scanner.nextDouble();
    if(period >0 && period <=30){
      payment= period*12;
      break;
    }
    else
      System.out.println("enter a number between 1 and 30");
      continue;
  }
  double mortgage= Principal*(Interest *Math.pow(1+Interest,payment))/(Math.pow(1+Interest,payment)-1);
  String finalAnswer=NumberFormat.getCurrencyInstance().format(mortgage);
  System.out.print("Mortgage: "+ finalAnswer );
}
}