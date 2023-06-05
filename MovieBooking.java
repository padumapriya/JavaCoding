/**
* program for movie information
* @author paduma
* @since 09-04-2023
* @version jdk 11.07
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a movie id : ");
        int movieId=sc.nextInt();
        System.out.println();
        System.out.print("Enter a movie Name : ");
        String movieName=sc.next();
        System.out.println();
        System.out.print("Enter a movie Description : ");
        String movieDescription=sc.next();
        System.out.println();
        System.out.print("Enter a movie Language : ");
        String movieLanguage=sc.next();
        System.out.println();
        System.out.print("Enter a movie Genre : ");
        String movieGenre=sc.next();
        System.out.println();
        System.out.print("Enter a movie release Date : ");
        String movieDate=sc.next();
        System.out.println();
        System.out.print("Enter a Seat cost : ");
        float movieCost=sc.nextFloat();
        System.out.println();

        System.out.println("Movie Details Are");
        System.out.println("Movie ID :"+movieId);
        System.out.println("Movie Name :"+movieName);
        System.out.println("Movie Description :"+movieDescription);
        System.out.println("Movie Language :"+movieLanguage);
        System.out.println("Movie Genre :"+movieGenre);
        System.out.println("Movie Release Date"+movieDate);
        System.out.println("Movie Seat Cost :"+movieCost);

    }


