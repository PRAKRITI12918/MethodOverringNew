package MethodOverridingNew;

public class ParentClass {//parent class
    int newNumber=100;//instance variable
    static float value2= 20.6F;// static variable
    int sub(int a,int b){
        int z=a-b;
        return z;
    }
    int add(int a,int b, int newNumber){//instance method1
        int c=a+b+newNumber;
        return c;
    }
    int add(int a,int b){//instance method2
        int c=a+b;
        return c;
    }
    String  numberStr="1000";//wrapper class: str to int
    Integer str_Int= Integer.parseInt(numberStr);
    String numberFloat="80.2";//wrapper class: str to float
    Float str_Float= Float.parseFloat(numberFloat);

    static void add(Integer str_Int,Integer str_Float) {//static variable
        float wrapperClass = str_Int + str_Float;
        System.out.println("Adding of two numbers:" + wrapperClass);
    }
}
