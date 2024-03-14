package com.learning.core.day4;

import java.util.Scanner;

public class D04P02{
	 
	    private String playerName;
	    private float critic1;
	    private float critic2;
	    private float critic3;
	    private static float avgRating;
	    private static String coins;

	    public D04P02(String playerName, float critic1, float critic2) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        calculateAverageRating(critic1, critic2);
	        this.coins = calculateCoins();
	    }  
	    public D04P02(String playerName, float critic1, float critic2, float critic3) {
	        this.playerName = playerName;
	        this.critic1 = critic1;
	        this.critic2 = critic2;
	        this.critic3 = critic3;
	        calculateAverageRating(critic1, critic2, critic3);
	        this.coins = calculateCoins();
	    }

	    public void calculateAverageRating(float critic1, float critic2) {
	        avgRating = (critic1 + critic2) / 2;
	    }

	    public void calculateAverageRating(float critic1, float critic2, float critic3) {
	        avgRating = (critic1 + critic2 + critic3) / 3;
	    } 
	    private String calculateCoins() {
	        if (avgRating >= 7) {
	            return "Gold";
	        } else if (avgRating >= 5) {
	            return "Silver";
	        } else if (avgRating >= 2) {
	            return "Copper";
	        } else {
	            throw new NotEligibleException("Average rating is less than two");
	        }
	    }
           public static void main(String[] args) {
	    	Scanner sr = new Scanner(System.in);
	    	System.out.println("");
	    	String playerName=sr.nextLine();
	    	System.out.println("");
	    	float critic1=sr.nextFloat();
	    	System.out.println("");
	    	float critic2=sr.nextFloat();
	    	System.out.println("");
	    	float critic3=sr.nextFloat();
	    	try {
	    	 D04P02 player=new D04P02(playerName,critic1,critic2,critic3);
	    	 System.out.println(playerName);
		        System.out.println(avgRating);
		        System.out.println(coins);
	    	}
	    	catch(NotEligibleException e)
	    	{
	    		System.out.println("error:"+e.getMessage());
	    	}
	    }
	}
	 
	class NotEligibleException extends RuntimeException {
	    public NotEligibleException(String message) {
	        super(message);
	    }
	}

