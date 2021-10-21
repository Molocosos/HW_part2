public class Team {
    private String teamName;
    private Participant[] participants = new Participant[4];

    public Team(String teamName, Participant participant1, Participant participant2, Participant participant3, Participant participant4 ) {
        this.teamName = teamName;
        this.participants[0] = participant1;
        this.participants[1] = participant2;
        this.participants[2] = participant3;
        this.participants[3] = participant4;
    }

    public String getTeamName() {
        return teamName;
    }

    public Participant[] getParticipants() {
        return participants;
    }

    public void whoFinishedTheDistance() {
        for (int i = 0; i < participants.length; i++) {
            if(participants[i].getDistanceCompletedStatus())
                System.out.println(participants[i].getName() + " is finished" );
        }
    }

    public void teamInfo() {
        for (int i = 0; i < participants.length; i++) {
            if(participants[i].getDistanceCompletedStatus()) {
                System.out.println(participants[i].getName() + " is finished");
            } else
                System.out.println(participants[i].getName() + " is not finished");
        }
    }
}
