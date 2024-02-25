package homework_7.task_1.service;

import homework_7.task_1.actors.Cat;
import homework_7.task_1.actors.Human;
import homework_7.task_1.actors.Participant;
import homework_7.task_1.actors.Robot;
import homework_7.task_1.obst.Obstacle;
import homework_7.task_1.obst.Treadmill;
import homework_7.task_1.obst.Wall;

public class Gen {

    Participant[] generateParticipant(int partNumber) {
        Participant[] arr = new Participant[partNumber];

        for (int i = 0; i < partNumber; i++) {
            int numberPart = getRandomNumber(1, 4);
            switch (numberPart) {
                case 1 -> arr[i] = new Human("Human_" + i, getRandomNumber(0, 3), getRandomNumber(50, 100));
                case 2 -> arr[i] = new Cat("Cat_" + i, getRandomNumber(0, 1), getRandomNumber(5, 15));
                case 3 -> arr[i] = new Robot("Robot_" + i, getRandomNumber(0, 10), getRandomNumber(50, 1000));
            }
        }
        return arr;
    }

    Obstacle[] generateObstacle(int obsNumber) {
        Obstacle[] arr = new Obstacle[obsNumber];

        for (int i = 0; i < obsNumber; i++) {
            int numberPart = getRandomNumber(1, 3);
            switch (numberPart) {
                case 1 -> arr[i] = new Treadmill(getRandomNumber(0, 1000));
                case 2 -> arr[i] = new Wall(getRandomNumber(0, 5));
            }
        }
        return arr;
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}
