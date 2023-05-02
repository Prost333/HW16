package Car;

public class Bike implements Runnable{
    private String name;
    private  int sleep;
    public Bike(String name,int sleep){
        this.name=name;
        this.sleep=sleep;
    }
    @Override
    public void run() {
        Thread thread=new Thread();
        try {
            Thread.sleep(sleep);
            for (int i=0;i<10;i++){
                System.out.println("bike "+name+" "+i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void joinBike (Bike bike1, Bike bike2, Bike bike3){
        Thread bike1Thr=new Thread(bike1);
        Thread bike2Thr=new Thread(bike2);
        Thread bike3Thr=new Thread(bike3);
        try {
            bike1Thr.start();
            bike1Thr.join();
            bike2Thr.start();
            bike3Thr.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
