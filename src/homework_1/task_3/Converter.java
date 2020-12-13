package homework_1.task_3;

public class Converter {

    //из шкалы Цельсия в шкалу Фарингейта
    static double fromCtoF(double degree){
        return (degree*9)/5 + 32;
    }

    //из шкалы Цельсия в шкалу Кельвина
    static double fromCtoK(double degree){
        return degree+273;
    }

    //test
    public static void main(String[] args) {
        System.out.println(fromCtoF(10.4));
        System.out.println(fromCtoK(10.12));
    }


}
