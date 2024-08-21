/*
 * Filename BowlingTeamDemo2.java
 * Written by Divya Rasania
 * Written on 09/11/2023
 */

package ch08.YouDoIt;

import java.util.Scanner;

public class BowlingTeamDemo2 {
    public static void main(String[] args) {
        String name;
        int x, y;
        final int NUM_TEAM_MEMBERS = 4, NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        Scanner input = new Scanner(System.in);

        for (y = 0; y < NUM_TEAMS; ++y) {
            teams[y] = new BowlingTeam();

            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);

            for (x = 0; x < NUM_TEAM_MEMBERS; ++x) {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }

        for (y = 0; y < NUM_TEAMS; ++y) {
            System.out.println("\nMembers of team " + teams[y].getTeamName());

            for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
                System.out.print(teams[y].getMember(x) + " ");

            System.out.println();
        }
    }
}
