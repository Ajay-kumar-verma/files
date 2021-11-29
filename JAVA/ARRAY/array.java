public class array{
public static void main(String args[])
{

// int a[]=new int[]{3,5,4};   
// int a[]={3,5,4};
int a[]=get();
for(int e:a)
{
    System.out.println(e+" ");
}

// TWO DIMENSION ARRAY 
int [][]arr={{3,4,5},{5,6,7}};


for (int[] s : arr) {
     for (int  i : s) {
         System.out.print(i+" ");
     }
}

// MULTI DIMENSION ARRAY MEANS ARRAY INSIDE ARRAY
int ar1[][] = new int[3][];  
ar1[0] = new int[3];  
ar1[1] = new int[4];  
ar1[2] = new int[2];  

int count = 0;  
for (int i=0; i<arr.length; i++)  
    for(int j=0; j<arr[i].length; j++)  
        arr[i][j] = count++;  


//printing the data of a jagged array   
for (int i=0; i<arr.length; i++){  
    for (int j=0; j<arr[i].length; j++){  
        System.out.print(arr[i][j]+" ");  
    }  
    System.out.println();//new line  
}  
// GETTING CLASS NAME 
System.out.println("GETTING CLASS NAME");

int ab[]={3,5};
Class c=ab.getClass();
String s=c.getName();

System.out.println(s+" ");
}





static int[] get(){  
    return new int[]{10,30,50,90,60};  
    }  


}