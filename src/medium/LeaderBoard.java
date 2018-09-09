package medium;

import java.util.Arrays;

public class LeaderBoard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int totalRanks = calculateRanksFromScore(scores);
        int[] ranks = new int[alice.length];
        System.out.println(totalRanks);
        reverse(scores);
        Arrays.stream(scores).forEach(System.out::println);
        int maxRank = totalRanks+1;
        totalRanks++;
        int lastGame = 0;
        for (int i=0; i<alice.length; i++) {
            for (int j=lastGame; j< scores.length; j++) {
                lastGame = j;
                if (alice[i] > scores[j] && j>0 && scores[j] == scores[j-1]) {
                    continue;
                }
                else if (alice[i] > scores[j] && rankCheck(maxRank, totalRanks)) {
                    totalRanks--;
                    System.out.println("alice : " + alice[i] + " , score: " + scores[j] + " , rank=" + totalRanks);
                } else if (alice[i] == scores[j] && j>0 && scores[j] != scores[j-1]) {
                    totalRanks--;
                } else if (alice[i] == scores[j] && j>0 && scores[j] == scores[j-1]) {
                    continue;
                }
                else {
                    System.out.println("rank: " + totalRanks);
                    break;
                }
                
            }//for
            ranks[i] = totalRanks;
        }
        return ranks;
    }
    
    private static boolean rankCheck(int maxRank, int current) {
        return (current <= maxRank) && (current > 1); 
    }

    private static void reverse(int[] scores) {
        for (int i=0, j=scores.length-1; i < j; i++, j--) {
            int temp = scores[i];
            scores[i] = scores[j];
            scores[j] = temp;
        }

    }

    private static int calculateRanksFromScore(int[] scores) {
        int rank = 1;
        int previousScore = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != previousScore) {
                rank++;
                previousScore = scores[i];
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        int[] scores = {100, 100, 50, 40, 40, 20, 10 };
        int alice[] = { 5, 25, 50, 120};
        int ranks[] = climbingLeaderboard(scores, alice);
        System.out.println("=========================");
        Arrays.stream(ranks).forEach(System.out::println);
    }

}
