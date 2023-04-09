package com.adarsh.enumExamples;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        //these are the enum constants
        //public,static and final
        //since its final we can create child enums
        //type is week

        Week(){
            System.out.println("Constructor called for" + this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Saturday;

       /* for (Week day: Week.values()){
            System.out.println(day);
        }*/
        //System.out.println(week.ordinal());
    }
}
