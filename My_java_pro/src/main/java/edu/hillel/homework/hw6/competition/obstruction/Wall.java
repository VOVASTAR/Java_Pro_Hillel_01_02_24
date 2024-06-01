package edu.hillel.homework.hw6.competition.obstruction;

import edu.hillel.homework.hw6.competition.participants.Participant;

public class Wall implements Obstruction {

    private double obstructedHeight;

    public Wall(double obstructedHeight) {
        this.obstructedHeight = obstructedHeight;
    }

    @Override
    public void overcome(Participant participant) {
        if (!participant.isJump(obstructedHeight)) {
            System.out.println("Учасник " + participant.getName() + " не пройшов перешкоду " + getClass().getSimpleName()
                    + " на дистанції " + obstructedHeight + ". Пройдено " + participant.getMaxJumpingHeight());
            participant.setIsFailedCompetition(true);
            return;
        }
        System.out.println("Учасник " + participant.getName() + " пройшов перешкоду " + getClass().getSimpleName()
                + " на дистанції " + obstructedHeight);
    }

}

