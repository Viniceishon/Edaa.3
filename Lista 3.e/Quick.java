import java.util.Scanner;

public class Quick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();
        
        char[] chars = input.toCharArray();
        
        quickSort(chars, 0, chars.length - 1);
        
        String orderedString = new String(chars);
        
        System.out.println("String ordenada: " + orderedString);
        
        scanner.close();
    }
    
    public static void quickSort(char[] chars, int low, int high) {
        if (low < high) {
            int pi = partition(chars, low, high);
            
            quickSort(chars, low, pi - 1);
            quickSort(chars, pi + 1, high);
        }
    }
    
    public static int partition(char[] chars, int low, int high) {
        char pivot = chars[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (chars[j] < pivot) {
                i++;
                swap(chars, i, j);
            }
        }
        
        swap(chars, i + 1, high);
        
        return i + 1;
    }
    
    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
