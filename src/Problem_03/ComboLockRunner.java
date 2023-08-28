package LabTest1;

import java.util.Scanner;

public class ComboLockRunner {
    public static void main(String[] args) {
        ComboLock lock1 = new ComboLock(30,8,7);
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter left turn ticks:");
//
        lock1.turnLeft(30);
        lock1.turnRight(4);
        lock1.turnLeft(7);
        if(lock1.open()){
            System.out.println("Lock open successfully!!");
        }
        else{
            System.out.println("Wrong combination.!");
        }
    }
}
