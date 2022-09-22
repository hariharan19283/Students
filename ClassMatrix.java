CG2576
HARI HARAN
import java.util.Scanner;
public classMatrix{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int row, col; 
        int mat1[][] = new int[2][2];
        int mat2[][] = new int[2][2];
        System.out.println("Enter the 2x2 matrix elements for 1st matrix : "); 
        for(row=0;row<2;row++) 
            for(col=0;col<2;col++) 
                mat1[row][col] = scan.nextInt();
                System.out.print("1st matrix : "); 
        for(row=0;row<2;row++) 
        { 
            System.out.print("\n"); 
            for(col=0;col<2;col++) 
            { 
                System.out.print(mat1[row][col]+" "); 
            } 
        }
        System.out.println("\nEnter the 2x2 matrix elements for 2nd matrix : ");    
        for(row=0;row<2;row++) 
            for(col=0;col<2;col++) 
                mat2[row][col] = scan.nextInt();
        
        System.out.print("2nd matrix : "); 
        for(row=0;row<2;row++) 
        { 
            System.out.print("\n"); 
            for(col=0;col<2;col++) 
            { 
                System.out.print(mat2[row][col]+" "); 
            } 
        }        
        int res[][] = new int[2][2], operationHolder = 0;
        int choice ;
        while(true)
        {
            System.out.println("\n\nBASIC MATRIX OPERATIONS");
            System.out.println("_________");
            System.out.println("1. Addition of two matrices");
            System.out.println("2. Multiplication of two matrices");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.println("_________");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1: res = add(mat1,mat2);
                        System.out.println("After add operation");
                        printMatrix(res);
                        break;
                case 2: res = prod(mat1,mat2);
                        System.out.println("After multiply operation");
                        printMatrix(res);
                        break;
                case 3: res = trans(mat1);
                        System.out.println("After transpose operation");
                        printMatrix(res);
                        break;
                case 4: System.out.println("Exited from the program");
                        return;
                default: System.out.println("Wrong input, please try again!!");
            }
        }
        
    }
    static void printMatrix(int arr[][])
    {
        int row, col;
        System.out.print("The array elements are : ");
        for(row=0;row<2;row++)
        {
            System.out.print("\n");
            for(col=0;col<2;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
        }
    }
    static int[][] add(int[][] mat1,int[][] mat2)
    {
        int row, col, add[][] = new int[2][2];
        for(row=0;row<2;row++)
            for(col=0;col<2;col++)
                add[row][col] = mat1[row][col]+mat2[row][col];
        return add;
    }
    static int[][] prod(int[][] mat1,int[][] mat2)
    {
        int row, col, prod[][] = new int[2][2];
        for(row=0;row<2;row++)
            for(col=0;col<2;col++)
            {
                prod[row][col] = 0;
                for(int i = 0; i<2; i++)
                    prod[row][col]+=mat1[row][i]*mat2[i][col];
            }
        return prod;
    }