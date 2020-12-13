package homework_1.task_2;

class Square implements Shape{

    private double side;

    Square(double side){
        this.side = side;
    }

    @Override
    public double square() {
        return side*side;
    }
}
