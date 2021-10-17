public class Course {

    private Object[] course =  new Object[2];
    private SwimmingPool sp;
    private TreadMill tm;

    public Course() {
        this.sp = new SwimmingPool();
        this.tm = new TreadMill();
        this.course[0] = this.sp;
        this.course[1] = this.tm;
    }

    public Object[] getCourse() {
        return course;
    }

    public void doIt(Team team) {
        for (int i = 0; i < team.getParticipants().length; i++) {
            for (int j = 0; j < course.length; j++) {
                if (course[j] instanceof SwimmingPool) {
                    if (getRandomIntegerBetweenRange() >= sp.getCompleteValue()) {
                        System.out.println("SwimmingPool: ");
                        printInfo(team, i, true);
                    } else {
                        System.out.println("SwimmingPool: ");
                        printInfo(team, i, false);
                    }
                } else if (course[j] instanceof TreadMill)
                    if (getRandomIntegerBetweenRange() >= tm.getCompleteValue()) {
                        System.out.println("TreadMill: ");
                        printInfo(team, i, true);
                    }else {
                        System.out.println("TreadMill: ");
                        printInfo(team, i, false);
                    }
            }
        }
    }

    public double getRandomIntegerBetweenRange(){
        double x = (int)(Math.random()*((10-1)+1))+1;
        return x;
    }

    public void printInfo(Team team, int i, boolean status){
        team.getParticipants()[i].setDistanceCompletedStatus(status);
        System.out.println("Participant "
                + team.getParticipants()[i].getName()
                + " distance status: "
                + team.getParticipants()[i].getDistanceCompletedStatus()
                + " ");
    }
}
