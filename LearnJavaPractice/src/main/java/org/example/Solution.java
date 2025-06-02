package org.example;
import java.util.Scanner;



//Class tournament
class Tournament{
    private String name;
    private int year;
    private int noOfCentury;

//    Parameterized constructor
    public Tournament(String name,int year,int noOfCentury){
        this.name=name;
        this.year=year;
        this.noOfCentury=noOfCentury;
    }

//    Getters
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public int getNoOfCentury(){
        return noOfCentury;
    }

//    Setters
    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setNoofCentury(int noOfCentury){
        this.noOfCentury=noOfCentury;
    }
}
public class Solution {
    public static int totalNumberOfCentury(Tournament[] tournaments){
        int totalCenturies=0;
        if(tournaments!=null){
            for(int i=0;i< tournaments.length;i++){
                totalCenturies+=tournaments[i].getNoOfCentury();
            }
        }
        return totalCenturies;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Tournament[] tournmanents = new Tournament[n];

        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            int year=Integer.parseInt(sc.nextLine());
            int noOfCentury=Integer.parseInt(sc.nextLine());
            tournmanents[i] = new Tournament(name,year,noOfCentury);
        }

        int result = Solution.totalNumberOfCentury(tournmanents);

        if(result==0){
            System.out.println("No Century.");
        }else{
            System.out.println("Number of Centuries-" + result);
        }
        sc.close();
    }
}
/*********************************************************
* INPUT 1
* 3
IPL
2020
5
WorldCup
2019
10
TestSeries
2021
4
*
OUTPUT
* Number of Centuries-19

*************************************************************/