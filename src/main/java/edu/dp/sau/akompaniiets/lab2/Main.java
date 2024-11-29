package edu.dp.sau.akompaniiets.lab2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    private static final int RANDOM_MIN = -100;
    private static final int RANDOM_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the matrix width (max: 20): ");
        int width = getValidInput(scanner, 1, 20);

        System.out.println("Enter the matrix height (max: 20): ");
        int height = getValidInput(scanner, 1, 20);

        int[][] matrix;
        System.out.println("Choose a method for creating a matrix: ");
        System.out.println("1 - manually created");
        System.out.println("2 - random");
        int choice = getValidInput(scanner, 1, 2);

        if (choice == 1) {
            matrix = createMatrixManually(scanner, width, height);
        } else {
            matrix = createMatrixRandomly(width, height);
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        int min = findMin(matrix);
        int max = findMax(matrix);
        double average = calculateAverage(matrix);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }

    private static int getValidInput(Scanner scanner, int min, int max) {
        int input;
        while (true) {
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            }
            System.out.println("Enter a number in the range " + min + " - " + max + ": ");
            scanner.nextLine();
        }
    }

    private static int[][] createMatrixManually(Scanner scanner, int width, int height) {
        int[][] matrix = new int[height][width];
        System.out.println("Enter the matrix elements: ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = getValidInput(scanner, RANDOM_MIN, RANDOM_MAX);
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        int[][] matrix = new int[height][width];
        Random random = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = RANDOM_MIN + random.nextInt(RANDOM_MAX - RANDOM_MIN + 1);
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    private static int findMin(int[][] matrix) {
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < min) {
                    min = value;
                }
            }
        }
        return min;
    }

    private static int findMax(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }

    private static double calculateAverage(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }
}
