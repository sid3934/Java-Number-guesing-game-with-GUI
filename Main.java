package com.siddharth;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
	// write your code here
        int systemNo = (int)(Math.random()*10+1);
        int userAns = 0;
        System.out.println("Your guess should have been " + systemNo);
        int count =1;
        while(userAns!=systemNo){
            String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 10", "Guessing Game", 3);
            userAns = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userAns, systemNo, count));
            count++;
        }
    }
    public static String determineGuess(int userAns, int systemNo, int count){
        if(userAns<0 || userAns>10) return "Your guess is invalid" ;
        else if(userAns == systemNo){
            return "Correct ans! \n Your total attempts were: "+count;
        }
        else if(userAns>systemNo) return "Your guess is on the higher side, try again";
        else if(userAns<systemNo) return "Your guess is dropping, try again!";
        else{
            return "Incorrect guess, haha! \n You attempted " + count +" times";
        }
    }
}
