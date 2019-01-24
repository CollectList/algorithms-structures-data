/**
 * 冒泡排序
 *
 * @author weixing
 * @date 2019/1/24 10:20
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 3, 2, 1};
        bubbleSort(a, a.length);
        for (int num : a) {
            System.out.print(num + " ");
        }

    }

    public static void bubbleSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n; ++i) {
            //提前退出循环的标志
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    //交换
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    //表示有交换数据
                    flag = true;
                }
            }
            //没有交换数据，提前退出
            if (!flag) {
                break ;
            }
        }
    }
}
