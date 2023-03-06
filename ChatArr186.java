package test6;
public class ChatArr186 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 45, 90};
        int n = arr.length;
        int x = 23;
        int[] newArr = new int[n + 1];
        int i = 0, j = 0;
        while (i < n && arr[i] < x) {
            newArr[j++] = arr[i++];
        }
        newArr[j++] = x;
        while (i < n) {
            newArr[j++] = arr[i++];
        }
        arr = newArr;
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}