package AFrequentlyAskedBasicJavaPrograms;

import org.testng.annotations.Test;

public class ReverseANoWithoutInBuiltFunction {

    @Test
    public void reverse(){
        int no=123;
        int reverse =0;
        while(no>0){
            reverse = reverse *10 + (no%10);
            no=no/10;
        }
        System.out.println(reverse);
    }

    @Test
    public void reverse1(){
        int no=123;
        StringBuilder sb=new StringBuilder(String.valueOf(no));
        no = Integer.valueOf(sb.reverse().toString());
        System.out.println(no);
    }
}
