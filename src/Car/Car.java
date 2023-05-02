package Car;

public class Car extends  Thread {
    private String name;
    private  int sleep;
    public Car(String name,int sleep){
        this.name=name;
        this.sleep=sleep;
    }



    @Override
    public void run() {
        Thread thread=new Thread();
        try {
            Thread.sleep(sleep);
            for (int i=0;i<10;i++){
                System.out.println("машина "+name+" "+i);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }

    }


}
