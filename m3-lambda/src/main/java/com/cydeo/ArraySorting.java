package com.cydeo;



public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();

        as.sort(qs);
        as.sort(bs);

        Sorting quicksort = () -> System.out.println("Quick sorting");

        as.sort(quicksort);  // or
        as.sort(() -> System.out.println("Quick sorting"));





    }

    private void sort(Sorting sorting){
        sorting.sort();
    }


}
