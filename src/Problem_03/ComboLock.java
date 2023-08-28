package LabTest1;

import java.util.Scanner;

public class ComboLock {
    private int firstCombination;
    private int secondCombination;
    private int thirdCombination;
    public int firstInput;
    public int secondInput;
    public int thirdInput;
    boolean f =false,l = false;
    int count =0;


    public ComboLock(int first,int second,int third){
        firstCombination = first;
        secondCombination = second;
        thirdCombination = third;
        firstInput = 0;
        secondInput =0;
        thirdInput = 0;
    }
    public void reset(){
        firstInput = 0;
        secondInput =0;
        thirdInput = 0;

    }

    public void turnLeft(int ticks){
        if(f==false && ticks==firstCombination){
            f = true;
            count++;
        }
        if(f==true && ticks == thirdCombination){
            count++;
        }
    }
    public void turnRight(int ticks){
        if(ticks==secondCombination && f== true && l== false){
            count++;
            l = true;
        }
    }
    public boolean open(){
        if(count==3){
            return true;
        }
        else
            return false;

    }
}
