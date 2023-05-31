/*
해당 순서에 원소를 넣을 위치는 이미 정해져 있고, 어떤 원소를 넣을지 선택하는 알고리즘
- 반복문을 돌며 가장 작은 숫자를 찾아 선택한 뒤 시작값과 위치 변경


우선, 위치(index)를 선택해준다.
i+1번째 원소부터 선택한 위치(index)의 값과 비교를 시작한다.
오름차순이므로 현재 선택한 자리에 있는 값보다 순회하고 있는 값이 작다면, 위치(index)를 갱신해준다.
'2'번 반복문이 끝난 뒤에는 indexMin에 '1'번에서 선택한 위치(index)에 들어가야하는 값의 위치(index)를 갖고 있으므로 서로 교환(swap)해준다.
*/

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int index = 0;
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            index = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[index]) {
                    index = j;
                }
            }
            // swap
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {10, 32, 25, 17, 4, 50, 1};
        selectionSort(arr);
    }
}
