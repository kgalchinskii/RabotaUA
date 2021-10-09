public class TestArray {

    public int[] array1 = new int[] {1, 2, 3, 4, 5};
    public int[] array2 = new int[5];
    public int[][] array3 = new int[][] {{1, 2, 3}, {4, 5, 6}};

    public void move(){
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
            array1[i] = 0;
        }
    }

}
