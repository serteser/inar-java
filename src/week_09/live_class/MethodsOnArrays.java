package week_09.live_class;

public class MethodsOnArrays {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2, 7, 54, 67};

        printArray(reverseWithoutNewArray(list));


    }

    public static int[] getArray() {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((26) + Math.random() * (98 - 26)); // Excluding 98, including 26
        }
        return array;
    }

    public static int[] shiftToLeft(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        return a;
    }

    public static int[] shiftToRight(int[] a) {
        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
        return a;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int consecutiveNumbers(int[] a, int consecutive) {
        int count = 1;
        int index = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                if (count == consecutive) {
                    index = i - 2;
                }
            } else {
                count = 1;
            }
        }
        return index;
    }

    public static void multiplyWith3(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 3;
        }
    }

    public static void multiplyWith5(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * 5;
        }
    }

    public static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int currentMin = a[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (currentMin > a[j]) {
                    currentMin = a[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                a[currentMinIndex] = a[i];
                a[i] = currentMin;
            }
        }
        return a;
    }

    public static int[] shuffleArray(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            int index = (int) (Math.random() * (i + 1));
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
        return a;
    }

    public static int[][] getMatrix() {
        int[][] matrix = new int[7][7];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 500);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.printf("%3d ", matrix[row][column]);
            }
            System.out.println();
        }
    }

    public static int[] matrixToArray(int[][] m) {
        int i = m.length;
        int j = m[0].length;
        int[] f = new int[i * j];
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                f[row * j + column] = m[row][column];
            }
        }
        return f;
    }

    public static int[][] arrayToMatrix(int[] f, int row, int column) {
        if (f.length != row * column) {
            System.out.println("Elements of the matrix is out of permitted limits...\nPlease enter the number of elements convenient with the arrays length.");
            System.exit(1);
        }
        int[][] m = new int[row][column];
        for (row = 0; row < m.length; row++) {
            for (column = 0; column < m[0].length; column++) {
                m[row][column] = f[row * m[0].length + column];
            }
        }
        return m;
    }

    public static int[][] shuffleMatrix(int[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                int rowIndex = (int) (Math.random() * m.length);
                int columnIndex = (int) (Math.random() * m[0].length);
                int temp = m[row][column];
                m[row][column] = m[rowIndex][columnIndex];
                m[rowIndex][columnIndex] = temp;
            }
        }
        return m;
    }

    public static boolean isUnique(int[] a, int number) {
        for (int i = 0; i < a.length; i++) {
            if (number == a[i]) {
                return false;
            }
        }
        return true;
    }

    public static int lengthWithoutDuplicateNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int duplicate = a[i];
            boolean isDuplicate = true;
            for (int j = i + 1; j < a.length; j++) {
                if (duplicate == a[j]) {
                    isDuplicate = false;
                }
            }
            if (isDuplicate) {
                count++;
            }
        }
        return count;
    }

    public static int[] eliminateDuplicates(int[] a) {
        int distinctNumbers = lengthWithoutDuplicateNumbers(a);
        int[] afterEliminate = new int[distinctNumbers];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (isUnique(afterEliminate, a[i])) {
                afterEliminate[index] = a[i];
                index++;
            }
        }
        return afterEliminate;
    }

    public static int[] reverseInANewArray(int[] a) {
        int[] n = new int[a.length];
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            n[j] = a[i];
        }
        return n;
    }

    public static int[] reverseWithoutNewArray(int[] a) {
        int temp;
        for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }


}
