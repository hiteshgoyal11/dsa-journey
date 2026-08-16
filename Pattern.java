public class Pattern {
//     public static void hollowRectangle(int rows, int columns) {
//         for(int i = 1; i <= rows; i++) {
//             for(int j = 1; j <= columns; j++){
//                 if(i == 1 || i == rows || j == 1 || j == columns) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }


// Inverted Rotated Half Pyramid
//     public static void inverted_rotated_half_pyramid(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1;j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// Inverted Half Pyramid With Numbers
//     public static void inverted_half_pyramid_with_numbers(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= n-i+1; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }


// Floyd's Triangle
//     public static void floyds_triangle(int n, int counter) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(counter);
//                 counter++;
//             }
//             System.out.println();
//         }
//     }


// 0-1 Triangle
//     public static void zeroonetriangle(int n) {
//         int counter = 0;
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= i; j++) {
//                 if(counter == 0) {
//                     counter++;
//                 } else {
//                     counter--;
//                 }
//                 System.out.print(counter);
//             }
//             System.out.println();
//         }
//     }

// Butterfly Pattern
// public static void butterfly(int n) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= i; j++) {
//             System.out.print("* ");
//         }
//         for(int j = 1; j <= 4*(n-i); j++) {
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= i; j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
//     for(int i = n; i >= 1; i--) {
//         for(int j = 1; j <= i; j++) {
//             System.out.print("* ");
//         }
//         for(int j = 1; j <= 4*(n-i); j++) {
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= i; j++) {
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }

// Solid Rhombus
//     public static void solidrhombus(int n) {
//         for(int i = 1; i <= n; i++) {
//             for(int j = 1; j <= 2*n-i; j++) {
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= n; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// Hollow Rhombus
// public static void hollowrhombus(int n, int n1) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= 3*n-i; j++) {
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= n1; j++) {
//             if(i == 1 || i == n1 || j == 1 || j == n1) {
//                 System.out.print("* ");
//             } else {
//                 System.out.print("  ");
//             }
//         }
//         System.out.println();
//     }
// }

// Diamond Pattern
// public static void diamond(int n) {
//     for(int i = 1; i <= n; i++) {
//         for(int j = 1; j <= n-i; j++) {
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= 2*i-1; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     for(int i = n; i >= 1; i--) {
//         for(int j = 1; j <= n-i; j++) {
//             System.out.print(" ");
//         }
//         for(int j = 1; j <= 2*i-1; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
    public static void main(String args[]) {
        // hollowRectangle(7,19);
        // inverted_rotated_half_pyramid(8);
        // inverted_half_pyramid_with_numbers(5);
        // floyds_triangle(5, 1);
        // zeroonetriangle(5);
        // butterfly(5);
        // solidrhombus(4);
        // hollowrhombus(10,10);
        // diamond(4);
    }
}