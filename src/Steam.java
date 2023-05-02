import java.util.ArrayList;
import java.util.Random;

public class Steam extends  Thread{


    @Override
    public void run() {
        Random random= new Random();

        ArrayList<Integer> list1=new ArrayList<>();
        for (int i =0;i<10;i++){
            list1.add((int) (Math.random()*10));
        }
        int sum=0;
        for (int i:list1){
            sum+=i;
        }
        double res=(double) sum/list1.size();
            System.out.println("Поток " + " =" + res);
    }
}
