public class Main {
    public static void main(String[] args) throws InterruptedException {


        for (int i=1;i<11;i++){
            System.out.println("potok"+i+" ");
            Thread thread=new Thread(new Steam2());
            thread.start();
            thread.join();
        }

    }
}