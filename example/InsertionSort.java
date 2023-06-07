/*
2번째 원소부터 시작하여 그 앞(왼쪽)의 원소들과 비교하여 삽입할 위치를 지정한 후,
원소를 뒤로 옮기고 지정된 자리에 자료를 삽입 하여 정렬하는 알고리즘

1. 두 번째 위치부터 탐색, temp에 임시로 해당 위치 값을 저장, previndex에는 해당 위치의 이전 위치를 저장한다.
2. 이전 위치를 가리키는 previndex가 음수가 되지 않고, 이전 위치 값이 처음 선택한 값보다 크다면, 서로 값을 교환
   previndex가 더 이전 위치를 가리키도록 한다.
3. while 반복문이 끝난 뒤, previndex에는 현재 temp 값보다 작은 값들 중 제일 큰 값의 위치를 가리키게 된다.
   따라서, arr[previndex + 1]에 temp 값을 삽입해준다.
 */

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int previndex = i - 1;
            while ((previndex >= 0) && (arr[previndex] > temp)) { // 이전 previndex 값이 음수가 아니고, 이전 값이 선택한 값보다 크다면 교환
                arr[previndex + 1] = arr[previndex]; // 해당 위치에 이전 값을 부여
                previndex--; // 더 이전 값이 없을 때 까지 반복
            }
            arr[previndex + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {2, 50, 14, 17, 45, 32, 55};
        insertionSort(arr);
    }
}