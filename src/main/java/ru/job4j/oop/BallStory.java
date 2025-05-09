package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Ball ball = new Ball();
        Fox fox = new Fox();

        wolf.tryEat(ball);
        hare.tryEat(ball);
        fox.tryEat(ball);

    }
}
