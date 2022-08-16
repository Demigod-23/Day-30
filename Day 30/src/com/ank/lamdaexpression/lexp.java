package com.ank.lamdaexpression;
interface Sayable{  
    public String say(String name);  
}  
  
public class lexp{  
    public static void main(String[] args) {    
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Ankesh"));   
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Ankesh"));  
    }  
}