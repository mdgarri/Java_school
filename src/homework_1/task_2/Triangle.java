package homework_1.task_2;

class Triangle implements Shape{

    private double mainSide;
    private double height;

    Triangle(double mainSide, double height){
        this.mainSide = mainSide;
        this.height = height;
    }

    @Override
    public double square() {
        return 0.5*mainSide*height;
    }
}
