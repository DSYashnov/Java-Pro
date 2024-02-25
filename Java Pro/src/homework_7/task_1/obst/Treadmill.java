package homework_7.task_1.obst;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }


    @Override
    public String toString() {
        return "Treadmill{" +
                "length=" + length +
                '}';
    }
}
