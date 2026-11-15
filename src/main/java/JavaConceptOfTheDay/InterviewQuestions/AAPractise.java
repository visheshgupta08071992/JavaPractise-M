package JavaConceptOfTheDay.InterviewQuestions;

import org.testng.annotations.Test;

import java.util.Arrays;

public class AAPractise {

    @Test
    //The Time complexity of given program is o(n) and space complexity is o(n)
    public void Optimized() {
        int[] prices = {10,2,1,0};
        //{7, 1, 5, 3, 6, 4};
        int max=0;
        int profit;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                profit = prices[j] - prices[i];
                if(profit >max){
                    max=profit;
                }
            }
        }
        System.out.println(max);
    }

    @Test
    public void seprateZerosAtLast() {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};
        int [] result = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                result[k]=arr[i];
                k++;
            }
        }
        while(k<arr.length){
            result[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void seprateZerosAtFirst() {
        int[] arr = {14, 0, 5, 2, 0, 3, 0};
        int [] result = new int[arr.length];
        int k=result.length - 1;

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                result[k]=arr[i];
                k--;
            }
        }
        while(k>=0){
            result[k]=0;
            k--;
        }

        System.out.println(Arrays.toString(result));
    }

    @Test
    public void bubbleSort() {
        int[] arr = {5,6,2,3,1,4};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[j] < arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
