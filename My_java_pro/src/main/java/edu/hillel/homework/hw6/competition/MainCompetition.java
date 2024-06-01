package edu.hillel.homework.hw6.competition;

import edu.hillel.homework.hw6.competition.obstruction.Obstruction;
import edu.hillel.homework.hw6.competition.obstruction.Treadmill;
import edu.hillel.homework.hw6.competition.obstruction.Wall;
import edu.hillel.homework.hw6.competition.participants.Cat;
import edu.hillel.homework.hw6.competition.participants.Human;
import edu.hillel.homework.hw6.competition.participants.Participant;
import edu.hillel.homework.hw6.competition.participants.Robot;

public class MainCompetition {
    public static void main(String[] args) {

        Participant[] participants = {
                new Cat("Barsik", 250.6, 2.5),
                new Human("Kolya", 1250.6, 2.1),
                new Robot("T1000", 2250.6, 1.5),
        };

        Obstruction[] obstructions = {
                new Treadmill(1100.5),
                new Wall(1.4),
                new Treadmill(200),
                new Wall(2),
                new Treadmill(1000),
        };

        for (Participant participant : participants) {
            for (Obstruction obstruction : obstructions) {
                if (participant.getIsFailedCompetition()) break;
                obstruction.overcome(participant);
            }
        }
    }
}
