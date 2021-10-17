public class Main {
    public static void main(String[] args) {
        Participant p1 = new Participant("name1");
        Participant p2 = new Participant("name2");
        Participant p3 = new Participant("name3");
        Participant p4 = new Participant("name4");

        Team team1 = new Team("team1", p1, p2, p3 ,p4);

        Course course1 = new Course();

        course1.doIt(team1);

    }
}
