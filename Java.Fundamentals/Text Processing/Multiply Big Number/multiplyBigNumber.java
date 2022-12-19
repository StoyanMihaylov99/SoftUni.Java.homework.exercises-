package textProcessing.Exercise;

import java.util.Scanner;

public class multiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        String s1 = new StringBuilder(num1).reverse().toString();
        String s2 = new StringBuilder(num2).toString();
        int[] m = new int[s1.length()+s2.length()];

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length() ; j++) {
                m[i+j] = m[i+j]+(s1.charAt(i) - '0')*(s2.charAt(j)-'0');
            }

        }
        String product = new String();
        for (int i = 0; i < m.length; i++) {
            int digit = m[i] % 10;
            int carry = m[i] /10;
            if (i+1< m.length){
                m[i+1] = m[i+1]+carry;
            }
            product = digit +product;

        }
        while (product.length()>1 && product.charAt(0)=='0'){
            product = product.substring(1);
        }
        System.out.println(product);
    }
}

