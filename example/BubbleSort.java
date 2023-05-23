
// 서로 인접한 두 원소의 대소를 비교하고, 조건에 맞지 않다면 자리를 교환하며 정렬하는 알고리즘

// 1회전에 첫 번째 원소와 두 번째 원소를,
// 두 번째 원소와 세 번째 원소를,
// 세 번째 원소와 네 번째 원소를, … 이런 식으로
// (마지막-1)번째 원소와 마지막 원소를 비교하여 조건에 맞지 않는다면 서로 교환한다.

// 1회전을 수행하고 나면 가장 큰 원소가 맨 뒤로 이동하므로
// 2회전에서는 맨 끝에 있는 원소는 정렬에서 제외되고,
// 2회전을 수행하고 나면 끝에서 두 번째 원소까지는 정렬에서 제외된다.
// 이렇게 정렬을 1회전 수행할 때마다 정렬에서 제외되는 데이터가 하나씩 늘어난다.

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {        // 제외될 원소의 갯수
            for (int j = 1; j < arr.length - i; j++) {  // 원소를 비교할 index를 뽑을 반복문, j는 현재 원소
                if (arr[j - 1] > arr[j]) {              // 이전 원소와 현재 원소를 비교
                    // swap(arr[j-1], arr[j])
                    temp = arr[j - 1];                 // 임시 변수에 이전 원소값 배정
                    arr[j - 1] = arr[j];               // 이전 원소 자리에 현재 원소값 배정
                    arr[j] = temp;                   // 현재 원소 자리에 이전 원소값 배정
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 1, 3, 4, 5, 7};
        bubbleSort(arr);
    }
}