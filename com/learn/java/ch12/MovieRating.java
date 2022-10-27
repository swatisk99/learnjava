package com.learn.java.ch12;
import java.util.Scanner;

enum Rating{
	HORRIBLE , POOR , AVERAGE , GOOD , EXCELLENT  ;
}
public class MovieRating {
	/**
	 * Map points to ratings
	 * @param movieRating
	 * @return
	 */
	public static Rating findMovieRating(byte movieRating){
		if(movieRating<=0) {
			return Rating.HORRIBLE;
		}
		if(movieRating>=10) {
			return Rating.EXCELLENT;
		}
		return Rating.values()[(movieRating/2)];
	}
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Movie name : ");
			String movieName = scanner.nextLine();
			System.out.println("Rate movie(/10) (Rating above 10 == 10 AND Rating below 0 == 0) : ");
			byte movieRating = scanner.nextByte();
			switch(findMovieRating(movieRating)) {
				case EXCELLENT:	System.out.println(movieName+" is Excellent!!!\nMust watch");
					break;
				case GOOD:		System.out.println(movieName+" is goodd!!!\nRecommend to your friends");
					break;
				case AVERAGE:	System.out.println(movieName+" is average!!!\nFriends may like it");
					break;
				case POOR:		System.out.println(movieName+" is not good!!!\nWatch at your own risk");	
					break;
				case HORRIBLE:	System.out.println(movieName+" is horrible!!!\nWaste of time");
					break; 
			}
		}
		
	}

}
