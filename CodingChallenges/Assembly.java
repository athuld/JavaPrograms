// There are 'n' students standing in a straight line during morning assembly. They were required to stand in ascending order of their height. But they are standing in a random fashion.
// Find the number of students who are standing in wrong position and their indexes.

// All of them have distinct heights.
// DO NOT USE ANY BUILT IN ARRAY METHODS

import java.util.Scanner;

public class Assembly {

	public int[] SortArray (int [] studentHeights , int totalStudents){
		int tempValue = 0,i,j;
		int [] tempArray = new int[totalStudents];
		for (i=0;i<totalStudents;i++){
			tempArray[i]=studentHeights[i];
		}
		
		//sort the array
		for (i=0;i<totalStudents;i++){
			
			for (j=i+1;j<totalStudents;j++){
				
				if (tempArray[i]>tempArray[j]){
					tempValue = tempArray[i];
					tempArray[i]=tempArray[j];
					tempArray[j]=tempValue;
				}
			}
		}
		return tempArray;
	}

	public void CheckAssembly (int [] sortedArray , int [] studentHeights , int totalStudents){
		int count = 0,i;
		System.out.println("\nOriginal Student Array:");
		for (i = 0;i<totalStudents;i++){
			System.out.print(studentHeights[i]+" ");
		}

		System.out.println("\nSorted Student Array:");
		for (i = 0;i<totalStudents;i++){
			System.out.print(sortedArray[i]+" ");
		}

		System.out.println("\nThe index of students which is out of order is : ");
		for (i=0 ;i<totalStudents;i++){
			if ( studentHeights[i]!=sortedArray[i] ){
				count+=1;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nTotal no students out of order :"+count);
	}

	public static void main (String [] args){
		int i,n;
		Assembly Obj = new Assembly();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total no of students in the assembly : ");
		n = sc.nextInt();
		int [] studentHeights = new int[n];
		
		for (i=0;i<n;i++){
			System.out.print("Enter the height of the student :");
			studentHeights[i]=sc.nextInt();
		} 
		int [] sortedArray = Obj.SortArray(studentHeights,n);
		Obj.CheckAssembly(sortedArray,studentHeights,n);

	}
}
