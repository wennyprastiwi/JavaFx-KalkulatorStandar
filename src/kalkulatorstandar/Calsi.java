package kalkulatorstandar;
public class Calsi implements NewInterface{

@Override
public double add(double a, double b) {

return a + b;
}

@Override
public double subtract(double a, double b) {

return a - b;
}

@Override
public double multiply(double a, double b) {
return a * b;
}

@Override
public double division(double a, double b) {

double temp=0.0;
try{
temp= a/b;}
catch(Exception e)
{
System.out.println(e);
}
return temp;
}
}
//========class calsi end============