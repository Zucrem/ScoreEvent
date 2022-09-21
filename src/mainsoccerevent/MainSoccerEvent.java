/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainsoccerevent;

import java.util.Scanner;

/**
 *
 * @author Zucrem
 */
public class MainSoccerEvent {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Subscriber obj1 = new Subscriber();
        ScoreSource obj = new ScoreSource();
        System.out.print("How many Subscriber : ");
        int people = sc.nextInt();
        sc.nextLine();
        if (people < 2) {
            System.out.println("Error");
            return;
        }
        System.out.println();
        for (int i = 0;i < people;i++) obj.addScoreListener(obj1);
        while (true){
        System.out.print("Enter Score ");
        String score = sc.nextLine();
        if (score.equals("")) break;
        System.out.println();
        obj.setScoreLine(score);
        }
        System.out.println("\nThank you for using This Program");
    }
    
}
