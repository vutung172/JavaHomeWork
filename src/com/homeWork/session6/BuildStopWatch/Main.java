package com.homeWork.session6.BuildStopWatch;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int n = 1; n < arr.length; n++) {
            Random random = new Random();
            arr[n] = random.nextInt();
        }
        StopWatch stopWatch = new StopWatch();

        System.out.println("Mảng ban đầu:");
        printArray(arr);
        // Tiến hành selection sort

        stopWatch.start();
        System.out.println("Thời gian bắt đầu là : "+stopWatch.getStartTime());
        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < arr.length - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        stopWatch.stop();
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
        System.out.println("Thời gian kết thúc là: "+stopWatch.getEndTime());
        System.out.println("Thời gian thực hiện selection sort cho 100000 số là: "+(stopWatch.getEndTime() - stopWatch.getStartTime())+" millisecond");

    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
