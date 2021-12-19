public class Sources {
    double water1;
    double oil1;

    Sources(double water, double oil){
        water1 = water;
        oil1 = oil;
    }

    void takeShower (){
        double water2 = water1 -48;
        water1 = water2;
        System.out.println("Bierzemy prysznic");
    }


    void takeBath(){
        water1 = water1-86;
        System.out.println("Bierzemy kąpiel");
    }

    void makeDinner(){
water1 = water1 - 4;
oil1 = oil1 - 0.1;
        System.out.println("Gotujemy obiad");
    }
void boilWater(){
    water1 = water1 - 0.5;
    oil1 = oil1 - 0.05;
    System.out.println("Gotujemy obiad");
}

void watchTv (int hour){
        oil1 = oil1 - (0.06*hour);
    System.out.println("oglądamy TV przez " + hour + "godzin");
}

void printInfo(){
    System.out.println("Ilość w wody : " + water1 + " , Ilość ropy : " + oil1);
}
}
