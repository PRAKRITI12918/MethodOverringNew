package MethodOverridingNew;

public class ChildClass extends ParentClass{
    int sub(int a, int b){//override
        int c=a-b;
        return c;
    }
    int div(int a, int b){
        int c=a/b;
        return c;
    }
}
