import java.util.Scanner;  //importing Scanner Class for inserting values from user
import java.lang.Math;		//importing package java.lang to use math class
class BinarySearchAlgo{  //class to create a method to find the element using binary search
	int middle=0;  //initializing variable in integer data type
	public void Binary(int arr[],int first, int last, int search) //method created to find the element using binary search
        {
		middle = (first+last)/2;    //finding the middle element in the array
		while (first <= last)      //loop that will run till the first element is less than or equal to last element in the array
		{
			if(arr[middle] < search)    //checks the searched element is less than the middle element of the array
			{
				first = middle + 1;   //changing the middle element with one and assigning the value to first element

			}
			else if(arr[middle] == search)  //check if middle element is equal to the searched element
			{
				System.out.println(search+" Found at " +(middle+1));  //prints if the element is found in the array
				break;			//break is called so that it can come out of the condition
			}
			else
			{
				 last = middle - 1;   //if the element is not found the middle value is decremented with 1 and assigned to last 
			}
			middle = (first + last)/2;  //middle element is found by adding first and last element and dividing it with 2 
		}
		if(first > last)			//checks if the last element is larger than the first element in the array
		{
			System.out.println(search+" Not found in the array!");   //displaying the output on the console
		}
        }
}
public class BinarySearch {   //main class 
	public static void main(String[] args) {  //main method of the program
        // TODO code application logic here
        int [] arr = new int[50];	//creating array and setting the array size of 50
		int size;					//initializing the variable with integer data type 
		int i, search;					//initializing the variables with integer data type
		
		Scanner sc= new Scanner(System.in);    //creating scanner object 
		BinarySearchAlgo b = new BinarySearchAlgo();    //creating the object of BinarySeachAlgo class
		System.out.println("Enter the size of the array: ");  //printing the message on console
		size = sc.nextInt();			//taking the input from user to get the size of the array
		System.out.println("Enter the elements in the array: ");  //printing the message on console
		for(i=0;i<size;i++)			//for loop to insert the element in the array
		{
			arr[i] = sc.nextInt();	//taking the input from user inserted in the array
		}
		System.out.println("Enter the element to search");  //printing the message on console
		search = sc.nextInt();     //taking the input from user to find the element
		sc.close();			//closing the scanner class
        b.Binary(arr, 0, size, search);		//calling the Binary method using the object of the class
                
    }
    
}
