package L11_Sorting;

import java.util.Scanner;

public class StudentSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] id = new int[n];
        float[] mark = new float[n];

        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
            mark[i] = sc.nextFloat();
        }

        for (int i = 0; i < n; i++) {
            insertionSort(id, mark, i, mark[i]);
        }

        for (int i = 0; i < m; i++) {
            System.out.println(id[i]);
        }
    }

    private static void insertionSort(int[] id, float[] mark, int i, float value) {
        int j = i;
        int value_id = id[i];
        while (j > 0) {
            if (mark[j- 1] > value) {
                mark[j] = value;
                break;
            } else if (mark[j- 1] == value) {
                if (id[j - 1] > value_id) {
                    mark[j] = mark[j- 1];
                    mark[j-1] = value;
                    id[j] = id[j- 1];
                    id[j-1] = value_id;
                }
            } else {
                mark[j] = mark[j- 1];
                mark[j-1] = value;
                id[j] = id[j- 1];
                id[j-1] = value_id;
            }
            j--;
        }
    }
}
