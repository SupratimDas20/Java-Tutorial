package org.example.Player;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Player[] P= new Player[n];
        for(int i=0;i<n;i++){
            int player=Integer.parseInt(sc.nextLine());
            String skill=sc.nextLine();
            String level=sc.nextLine();
            int points=Integer.parseInt(sc.nextLine());
            P[i]=new Player(player,skill,level,points);
        }
        String skill=sc.nextLine();
        String levelSearch=sc.nextLine();
        findPointsForGivenSkill(P,skill);
        getPlayerBasedOnLevel(P,levelSearch,skill);
    }
    public static void findPointsForGivenSkill(Player[] P,String skill){
        int sum=0;
        for(int i=0;i<P.length;i++){
            if(P[i].skill.equalsIgnoreCase(skill)){
                sum=sum+P[i].points;
            }
        }
        if(sum>0){
            System.out.println(sum);
        }else{
            System.out.println("The given skill is not available");
        }

    }
    public static void getPlayerBasedOnLevel(Player[] P,String levelSearch, String skill){
            boolean found=false;
            for(int i=0;i<P.length;i++){
                if(P[i].skill.equalsIgnoreCase(skill) && P[i].level.equalsIgnoreCase(levelSearch) && P[i].points>=20){
                    System.out.println(P[i].player);
                    found= true;
                    break;

                }
            }
            if(!found){
                System.out.println("No player is available with specified level, skill and eligible points");
            }
    }
}
class Player{
    int player;
    String skill;
    String level;
    int points;

    public Player(int player, String skill,String level, int points){
        this.player=player;
        this.skill=skill;
        this.level=level;
        this.points=points;
    }
}