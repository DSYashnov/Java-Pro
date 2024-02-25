package homework_7.task_1.service;

import homework_7.task_1.actors.Participant;
import homework_7.task_1.obst.Obstacle;
import homework_7.task_1.obst.Treadmill;
import homework_7.task_1.obst.Wall;

public class Games {
    public void run(int userNumber, int obstNumber) {
        Gen gen = new Gen();
        Participant[] participants = gen.generateParticipant(userNumber);
        Obstacle[] obstacles = gen.generateObstacle(obstNumber);

        for (Participant participant : participants) {
            System.out.println(participant);
            for (Obstacle obstacle : obstacles) {
                System.out.println(">>>>" + obstacle);
                if (obstacle instanceof Wall) {
                    int jump = participant.getJump();
                    if (((Wall) obstacle).overcome(jump)) {
                        System.out.println("Fail");
                        break;
                    } else {
                        System.out.println("next...");
                    }
                } else if (obstacle instanceof Treadmill) {
                    int run = participant.getRun();
                    if (run < ((Treadmill) obstacle).getLength()) {
                        System.out.println("Fail");
                        break;
                    } else {
                        System.out.println("next...");
                    }
                }

            }
        }

    }
}
