public class Test {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
//        print(array);
//        System.out.println(sum(array));
//        System.out.println(average(array));
//        System.out.println(minimum(array));
//        System.out.println(maximum(array));
//        System.out.println(evenCountStandard(array));
        for (int i: colSums(array)){
            System.out.println(i);
        }
    }
    public static void print(int[][] array){
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static int sum(int[][] array){
        int sum = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static double average(int[][] array){
        double count = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                count++;
            }
        }
        int sum = sum(array);
        return sum / count;
    }
    public static int minimum(int[][] array){
        int minimum = array[0][0];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (array[i][j] < minimum){
                    minimum = array[i][j];
                }
            }
        }
        return minimum;
    }
    public static int maximum(int[][] array){
        int maximum = array[0][0];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (array[i][j] > maximum){
                    maximum = array[i][j];
                }
            }
        }
        return maximum;
    }
    public static int evenCountStandard(int[][] array){
        int count = 0;
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                if (array[i][j] % 2 == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] rowSums(int[][] array){
        int[] newArray = new int[array.length];
        for (int i = 0;i < array.length;i++){
            int sum = 0;
            for (int j = 0;j < array[i].length;j++){
                sum += array[i][j];
            }
            newArray[i] = sum;
        }
        return newArray;
    }
    public static int[] colSums(int[][] array){
        int[] newArray = new int[array[0].length];
        for (int i = 0;i < array[0].length;i++){
            int sum = 0;
            for (int j = 0;j < array.length;j++){
                sum += array[j][i];
            }
            newArray[i] = sum;
        }
        return newArray;
    }

}
