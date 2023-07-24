// indicate this is inside of package file
package com.src;

public class Calculator{

    private int a = 0;
    private int b = 0;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int addition(){
        return this.a + this.b;
    }
    public int subtract(){
        return this.a - this.b;
    }
}