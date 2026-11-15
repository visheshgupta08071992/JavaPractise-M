package AFrequentlyAskedBasicJavaPrograms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DivisorsOfNo {

    @Test
    public void divisors(){
        int no=126;
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=no;i++){
            if(no%i==0){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
