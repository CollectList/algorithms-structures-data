package array;

public class SparseArray {

    public static void main(String[] args) {

        // 生成棋盘
        int[][] chessArray = new int[11][11];
        /**
         *  0 表示 无 1 表示黑子 2 表示 蓝子
         */
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;

        for (int[] row : chessArray) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 将二维数组转化为稀疏数组
        //1.先遍历二维数组 得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArray[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("sum="+sum);
        //2.创建对应的稀疏数组
        int[][] sparseArray = new int[sum+1][3];

        //3.给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

        // 4.遍历二维数组将非0 的值放到稀疏数组中
        //记录第几个非0的数据
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(chessArray[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArray[i][j];
                }
            }
        }

        //输出稀疏数组
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
        }
        System.out.println();
    }
}
