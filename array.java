//search whether in array there is 30 0r not

// import java.util.*;

// public class array {
//     public  static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int[]oneDArray= {10,20,30,40,50};
// 		boolean flag = false;
// 		for(int i=0;i<=oneDArray.length-1;i++) {
// 			if(oneDArray[i]== 30)
// 			{
// 				//System.out.println("true");
// 				//return ;
// 				flag = true;
// 				break;
// 			}
			
// 		}
// 		if(flag == true)
// 		System.out.println("true");
// 		else
// 			System.out.println("false");
// }
	

// }

// import java.util.*;

// public class array {
//     public  static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		int[]oneDArray= {10,20,30,40,50};
//         for(int i=0;i<=oneDArray.length-1;i++){
//             if 

//             }
            
//         }


//common string method
// String sample ="Hello Java!";
// System.out.println("Length:"+sample.length());
// System.out.println("To Uppercase:" + sample.toUpperCase());
// System.out.println("Char at 1:"+sample.charAt(0));

//Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
// import java.util.*;
// public class array {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str1=sc.nextLine();
    
//         for(int i=0; i<str1.length(); i++){
//             System.out.println(str1.charAt(i));
//         }
        
//     }
// }

// import java.util.*;
// public class array {

//     public static void main(String[] args) {
        // int[]marks=new int[3];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=95;
        // int size=sc.nextInt();
        // int numbers[]=new int[size];
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // for(int i=0;i<3;i++){
//         for(int i=0;i<size;i++){
//             // System.out.println(marks[i]);
//             System.out.println(numbers[i]);
//         }
//     }
// }


//taking an array as input and printing its elements
// import java.util.*;
// public class array {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int numbers[]=new int[size];

//         for(int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }
//         for(int i=0;i<numbers.length;i++){
//             System.out.print(numbers[i]+" ");
//         }
//     }
// }


//take an array of names as input from the user and print them on the screen
// import java.util.*;
// public class array {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         String name[]=new String[size];
//         for(int i=0;i<size;i++){
//             name[i]=sc.next();
//         }
//         for(int i=0;i<name.length;i++){
//             System.out.print(name[i]+" ");
//         }

//     }
// }


//two d aaray
// import java.util.*;
// public class array {

//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int rows=sc.nextInt();
//                 int cols=sc.nextInt();
//                 int[][]numbers=new int[rows][cols];
//                 for(int i=0;i<rows;i++){
//                         for(int j=0;j<cols;j++){
//                                 numbers[i][j]=sc.nextInt();
//                         }
//                 }
//                 for(int i=0;i<rows;i++){
//                         for(int j=0;j<cols;j++){
//                                 System.out.print(numbers[i][j]+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }



//take a matrix as input from the user.Search for a given number x and print the indices at which it occurs
// import java.util.*;
// public class array {

//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int rows=sc.nextInt();
//                 int cols=sc.nextInt();
//                 int[][]numbers=new int[rows][cols];
//                 for(int i=0;i<rows;i++){
//                         for(int j=0;j<cols;j++){
//                                 numbers[i][j]=sc.nextInt();
//                         }
//                 }
//                 int x=sc.nextInt();
//                 for(int i=0;i<rows;i++){
//                         for(int j=0;j<cols;j++){
//                                 if(numbers[i][j]==x){
//                                         System.out.println("x found at locations("+i+","+j+")");
//                                 }
//                         }
//                 }


//         }
// }


//find the maximum and minimum number in an array of integers
// import java.util.*;
// public class array {

        // public static void main(String[] args) {
        //         Scanner sc=new Scanner(System.in);
        //                 int size=sc.nextInt();
        //                 int numbers[]=new int[size];
        //                 for(int i=0;i<size;i++){
        //                         numbers[i]=sc.nextInt();
        //                 }
        //                 int max=Integer.MIN_VALUE;
        //                 int min=Integer.MAX_VALUE;
        //                 for(int i=0;i<numbers.length;i++){
        //                         if(numbers[i]<min){
        //                                 min=numbers[i];
        //                         }
        //                         if(numbers[i]>max){
        //                                 max=numbers[i];
        //                         }
        //                 }
        //                 System.out.println("Largest number is:"+max);
        //                 System.out.println("Smallest number is:"+min);
        //         }
        // }


        //take an array of numbers as input and check if it is array sorted in ascending order
// import java.util.*;
// public class array {

//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int size=sc.nextInt();
//                 int numbers[]=new int[size];
//                 for(int i=0;i<size;i++){
//                         numbers[i]=sc.nextInt();
//                 }
//                 boolean isAscending=true;
//                 for(int i=0;i<numbers.length-1;i++){
//                         if(numbers[i]>numbers[i+1]){
//                                 isAscending=false;
//                         }

//                 }
//                 if(isAscending){
//                         System.out.println("the array is soted in ascending order");
//                 }
//                 else{
//                         System.out.println("the array is not sorted in ascending order");
//                 }
//         }
// } 


//question on 2d array
//print the spiral order matrix as output for a given matrix of numbers
// import java.util.*;
// public class array {

//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 int m=sc.nextInt();
//                 int matrix[] []=new int [n] [m];
//                 for(int i=0;i<n;i++){
//                         for(int j=0;j<m;j++){
//                                 matrix[i][j]=sc.nextInt();
//                         }
//                 }
//                 System.out.println("the spiral order matrix is: ");
//                 int rowStart=0;
//                 int rowEnd=n-1;
//                 int colStart=0;
//                 int colEnd=m-1;
//                 //to print the spiral order matrix
//                 while(rowStart <= rowEnd && colStart <= colEnd){
//                         for(int col=colStart;col<=colEnd;col++){
//                                 System.out.println(matrix[rowStart][col]+" ");
//                         }
//                         rowStart++;
//                         for(int row=rowStart;row<=rowEnd;row++){
//                                 System.out.println(matrix[row][colEnd]+" ");
//                         }
//                         colEnd--;
//                         for(int col=colEnd;col>=colStart;col--){
//                                 System.out.println(matrix[rowEnd][col]+" ");

//                         }
//                         rowEnd--;
//                         for(int row=rowEnd;row>=rowStart;row--){
//                                 System.out.println(matrix[row][colStart]+" ");
//                         }
//                         colStart++;
//                 }
//                 System.out.println();
                
//         }
// }


//for a given matrix n*m print its transpose
// import java.util.*;
// public class array {

//         public static void main(String[] args) {
//                 Scanner sc=new Scanner(System.in);
//                 int n=sc.nextInt();
//                 int m=sc.nextInt();
//                 int matrix[][]=new int[n][m];
//                 for(int i=0;i<n;i++){
//                         for(int j=0;j<m;j++){
//                                 matrix[i][j]=sc.nextInt();

//                         }
//                 }
//                 System.out.println("the transpose is :");
//                 for(int j=0;j<m;j++){
//                         for(int i=0;i<n;i++){
//                                 System.out.print(matrix[i][j]+" ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

















    

