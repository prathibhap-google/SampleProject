package com.example.pprabhakaran.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16};
        Log.i("Binary Search", ""+ findNumber(arr, 13));
    }

    public static int findNumber(int arr[], int k){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] > k){
                right = mid - 1;
            }else if (arr[mid] < k){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
