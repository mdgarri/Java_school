package homework_1.task_2;

class Rectangle implements Shape{


    private double height;
    private double width;

    Rectangle(double height, double width ){
        this.height = height;
        this.width = width;
    }

    @Override
    public double square() {
        return height*width;
    }
}


