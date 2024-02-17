package homework.hw.competition.obstruction;

import homework.hw.competition.participants.Participant;

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
            participant.setFinishCompetition(false);
            return;
        }
        System.out.println("Учасник " + participant.getName() + " пройшов перешкоду " + getClass().getSimpleName()
                + " на дистанції " + obstructedHeight);
    }

}

