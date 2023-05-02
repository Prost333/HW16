import java.util.ArrayList;
import java.util.Random;

public class Steam2 implements Runnable{
    @Override
    public void run() {
        Random random= new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i =0;i<10;i++){
            list.add((int) (Math.random()*100));
        }
        int max=0;
        for (int i:list){
            if (max<i){
                max=i;
            }

        }
        System.out.println(" максимальный элимент: "+max);

    }
}
