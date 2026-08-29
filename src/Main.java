package MethodOverridingNew;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Parent Class------------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the a:");
        int a = sc.nextInt();
        System.out.println("Enter the b:");
        int b = sc.nextInt();
        ParentClass Parent  =new ParentClass();//parent class
        int add1=Parent.add(a,b);
        int sub1=Parent.sub(a,b);
        System.out.println("Addition of two Numbers="+add1);
        System.out.println("Subtract of two Numbers="+sub1);
        System.out.println("----------------Method Overloading------------- ");
        System.out.println("Converting String to Integer"+ Parent. str_Int);
        System.out.println("Converting String to Integer"+ Parent. str_Float);
        float wrapperClass1=Parent.str_Int +Parent. str_Float;
        System.out.println("--------------End of the Parent Class-------------- ");

        System.out.println("-----------------Child Class------------------");
        ChildClass Child =new ChildClass();
        int div1=Child.div(a,b);
        System.out.println("Division of two Numbers="+div1);
        System.out.println("--------------End of the Child Class-------------- ");
    }}
