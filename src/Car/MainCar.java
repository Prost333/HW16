package Car;

public class MainCar {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread();
//        Car car1=new Car("Audi",1000);
//        Car car2=new Car("BMW",2000);
//        car1.start();
//        car2.start();

        Bike bike1=new Bike("jawa",5000);
        Bike bike2=new Bike("Minsk",1000);
        Bike bike3=new Bike("WV",2000);
        Thread bike1Thrd= new Thread(bike1);
        Thread bike2Thrd=new Thread(bike2);
        Thread bike3Thrd=new Thread(bike3);
        bike1.joinBike(bike1,bike2,bike3);



    }
}
