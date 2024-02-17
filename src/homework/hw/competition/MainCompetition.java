package homework.hw.competition;

import homework.hw.competition.obstruction.Obstruction;
import homework.hw.competition.obstruction.Treadmill;
import homework.hw.competition.obstruction.Wall;
import homework.hw.competition.participants.Cat;
import homework.hw.competition.participants.Human;
import homework.hw.competition.participants.Participant;
import homework.hw.competition.participants.Robot;

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
                if (!participant.getIsFinishCompetition()) break;
                obstruction.overcome(participant);
            }
        }
    }
}
