package ru.vsu.cs.aisd2021.g8_2.lavrenko_v_a;

/*Реализовать метод, который строит двоичное дерево для заданного по счету числа Фибоначчи следующим образом:
В корне дерева стоит заданное число Фибоначчи, потомками которого являются два предыдущих числа Фибоначчи.
Любое поддерево в построенном дереве (с числом Фибоначчи) строится по такому же принципу.
Примечание: так как количество элементов в таком дереве будет очень быстро расти, не следует указывать
большие порядковые номера чисел Фибоначчи (до 20).

Числа Фибоначчи: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765.
              i: 0, 1, 2, 3, 4, 5, 6, 7,  8,  9,  10, 11, 12,  13,  14,  15,  16,   17,   18,   19,   20.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter an element number of the Fibonacci sequence (n <= 20): ");
        n = scanner.nextInt();
        SimpleBinaryTree binaryTree = new SimpleBinaryTree(n);
        binaryTree.printTree();

    }
}
