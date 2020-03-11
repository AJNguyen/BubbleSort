package com.company;

public class Main {
        static void bubbleSort(int a[]) {
            int n = a.length;
            int temp = 0;
            for (int i = 0; i < (n-1); i++) {
                for (int j = 0; j < (n - i - 1); j++) {
                    if (a[j] > a[j+1]) {
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }

                }
            }
        }
        public static void main(String[] args) {
            int a[] = {37,57,40,13,50};
            for(int i = 0; i < a.length; i++) {
                System.out.println(a[i] + " ");
            }
            System.out.println();
            bubbleSort(a);

            System.out.println();
            for(int i=0; i< a.length; i++) {
                System.out.println(a[i] + " ");
            }

        }
}
