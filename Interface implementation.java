interface IfOwn1
{
public void m1();
public void m2();
}
public class InterImple implements IfOwn1{
public void m1(){
System.out.println("m1 method implemented");
}
public void m2(){
System.out.println("m2 method implemented");
}
public static void main(String args[]){
InterImple o1 = new InterImple();
o1.m1();
o1.m2();}}
