package com.barn;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        findBEMSFromBarn(2450);
        System.out.println("--------------------");
        findBarnCapacityFromLastBEMSAmount(88);

        System.out.println("Print from barn2");
        
    }

    static void findBEMSFromBarn(int getBarnCapacity) {
        int BEMS = 0;
        int barnCapacity = 50;
        while (barnCapacity < getBarnCapacity) {
            if (barnCapacity < 1000) {
                barnCapacity += 25;
            } else {
                barnCapacity += 50;
            }
            BEMS++;
        }
        int BAmount = (BEMS * (BEMS + 1) / 2);
        double days = (double) BAmount * 3 / 89;
        int getExactlyDay = (int) days;
        if (days > getExactlyDay) {
            getExactlyDay = getExactlyDay + 1;
        }
        System.out.printf("To upgrade Barn's capacity to %d\nYou have to use\nBolt: %d\nPlank: %d\nTape: %d\nAll is: " +
                        "%d\nLast BEMS amount: %d\nIf you get 89 BEMS per Day,\nSpend: %d days to complete\n",
                getBarnCapacity, BAmount, BAmount, BAmount, BAmount * 3, BEMS, getExactlyDay);

        if (days >= 365) {
            int year = getExactlyDay / 365;
            int day = getExactlyDay % 365;
            System.out.printf("Spend %d years and %d days to complete\n", year, day);
        }
    }

    static void findBarnCapacityFromLastBEMSAmount(int lastBEMSAmount) {
        int BEMS = 0;
        int barnCapacity = 50;

        while (BEMS < lastBEMSAmount) {
            if (barnCapacity < 1000) {
                barnCapacity += 25;
            } else {
                barnCapacity += 50;
            }
            BEMS++;
        }

        System.out.println("If your last BEMS upgrade amount is: " + lastBEMSAmount + "\nYour Barn's capacity is: " + barnCapacity);
    }
}
