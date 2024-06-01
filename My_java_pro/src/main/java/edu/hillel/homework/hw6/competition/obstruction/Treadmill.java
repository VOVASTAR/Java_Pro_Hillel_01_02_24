package edu.hillel.homework.hw6.competition.obstruction;

import edu.hillel.homework.hw6.competition.participants.Participant;

public class Treadmill implements Obstruction {

    private double obstructedLength;

    public Treadmill(double obstructedLength) {
        this.obstructedLength = obstructedLength;
    }

    @Override
    public void overcome(Participant participant) {
        if (!participant.isRun(obstructedLength)) {
            System.out.println("Учасник " + participant.getName() + " не пройшов перешкоду " + getClass().getSimpleName()
                    + " на дистанції " + obstructedLength + ". Пройдено " + participant.getMaxRunningDistance());
            participant.setIsFailedCompetition(true);
            return;
        }
        System.out.println("Учасник " + participant.getName() + " пройшов перешкоду " + getClass().getSimpleName()
                + " на дистанції " + obstructedLength);
    }

}
