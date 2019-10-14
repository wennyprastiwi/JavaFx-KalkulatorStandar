package kalkulatorstandar;
import java.util.Scanner;
/**
*
* @author wennyprastiwi
*/
public class KalkulatorStandar {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
Calsi cal=new Calsi();
double a,b;
while(true){

System.out.println("Enter value a");
a=sc.nextDouble();
System.out.println("Enter operation (+ - * /)");
String operator=sc.next();
System.out.println("Enter value b");
b=sc.nextDouble();
switch(operator){
  
case "+":System.out.println("="+cal.add(a,b));break;
case "-": System.out.println("="+cal.subtract(a, b));break;
case "*":System.out.println("="+cal.multiply(a, b));break;
case "/":System.out.println("="+cal.division(a, b));break;
default:
System.out.println("who have not choosen any operator");
  
}
  
System.out.println("1 to continue and 0 to quit");
int y=sc.nextInt();
if(y==0)break;
  
}

}
  
}
//=====KalkulatorStandar class end==
