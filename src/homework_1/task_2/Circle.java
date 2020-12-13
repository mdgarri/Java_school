package homework_1.task_2;

class Circle implements Shape{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double square() {
        return 3.14*radius*radius;
    }
}
