package com.example;

import java.util.Optional;

public class LambdaApp {
	 
    public static void main(String[] args) {
    	Optional<String> name = Optional.of(null); // java.lang.NullPointerException
        System.out.println(name);
        
         int w=7;
        Operationable operation;
        operation = (x,y)->x+y+w;
         
        int result = operation.calculate(10, 20);
        System.out.println(result); //30
    }   
}
interface Operationable{
    int calculate(int x, int y);
}
