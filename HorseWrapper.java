// Tristan Chapman
//10/10/24
// Mr Gross Assignment 2.2

import java.util.ArrayList;

public class HorseWrapper{
    public static void main(String[] args){
        Horse horse1=new Horse("Rex", 2019);
        Horse horse2=new Horse("Tom", 2020);
        Horse horse3=new Horse("Sam", 2020);
        ArrayList<Horse> horseGroup=new ArrayList<Horse>();
        horseGroup.add(horse1);
        horseGroup.add(horse2);
        horseGroup.add(horse3);
        horse1=new Horse("Bob", 2019); //assigning new horse to horse1 label.
        horseGroup.add(horse1);
        horse1=new Horse("Bobbette", 2019);
        horseGroup.add(horse1);
        for(int x=0;x<horseGroup.size();x++){ // Loop to print out all of the horses inside the horsegroup.
            horse1=horseGroup.get(x);
            System.out.println(horse1);
        }
    }



}