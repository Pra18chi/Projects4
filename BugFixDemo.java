    package bugfix;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.Scanner;
	public class BugFixDemo{
	public static void main(String[] args) {
 
 System.out.println("\n**************\n");
 System.out.println("\tWelcome to TheDesk \n");
 System.out.println("**************");
 optionsSelection();
 }
 private static void optionsSelection() {
 String[] arr = {"1. I want see expenditure",
 "2. I want  to add  expenditure",
 "3. I want to delete  expenditure",
 "4. I want to sort the expenditures",
 "5. I want to search for a particular expenditure",
 "6. Close the application"
 };
 int[] arr1 = {1,2,3,4,5,6};
 int slen = arr1.length;
 for(int i=0; i<slen;i++){
 System.out.println(arr[i]);
 
 }
 ArrayList<Integer> arrlist = new ArrayList<Integer>();
 ArrayList<Integer> expenses = new ArrayList<Integer>();
expenses.add(1000);
 expenses.add(2300);
 expenses.add(45000);
 expenses.add(32000);
 expenses.add(110);
 expenses.addAll(arrlist);
 System.out.println("\nEnter choice:\t");
 Scanner sc = new Scanner(System.in);
 int options = sc.nextInt();
 for(int j=1;j<=slen;j++){
 if(options==j){
 switch (options){
 case 1:
 System.out.println("Your saved expenses are listed below: \n");
 System.out.println(expenses+"\n");
 optionsSelection();
 break;
 case 2:
 System.out.println("Enter the value to add Expense: \n");
 int value = sc.nextInt();
 expenses.add(value);
 System.out.println("Your value is updated\n");
 expenses.addAll(arrlist);
 System.out.println(expenses+"\n");
 optionsSelection();
 break;
 case 3:
 System.out.println("you are about to delete all the expenses!\nConfirm again by selecting the same option\n");
 int con_choice = sc.nextInt();
if(con_choice==options){
	 expenses.clear();
	 System.out.println(expenses+"\n");
	 System.out.println("All expenses are erased \n");
	 } else {
	 System.out.println("try again!");
	 }
	 optionsSelection();
	 break;
	 case 4:
	 sortExpenses1(expenses);
	 optionsSelection();
	 break;
	 case 5:
		 searchExpenses(expenses);
		 optionsSelection();
		 break;
		 case 6:
		 closeApp();
		 break;
		 default:
		 System.out.println(" invalid choice!");
		 break;
		 }
		 }
		 }
		 }
		 private static void closeApp() {
		 System.out.println("Close application \nThank you!");
		 
	 }
		 private static void searchExpenses(ArrayList<Integer> arrayList) {
			 int leng = arrayList.size();
			 System.out.println("Enter the expense you wnt to search:\t");
			
			 Scanner sc = new Scanner(System.in);
			 int input = sc.nextInt();
			 
			 for(int i=0;i<leng;i++) {
			 if(arrayList.get(i)==input) {
			 System.out.println("Found the expense " + input + " at " + i + " position");
			 }
			 }
			 }
			 private static void sortExpenses1(ArrayList<Integer> arrayList) {
			 int arrlength = arrayList.size();
				 
				 Collections.sort(arrayList);
				 System.out.println("Sorted expenses: ");
				 for(Integer i: arrayList) {
				 System.out.print(i + " ");
				 }
				 
				 System.out.println("\n");
				 
			 }
	}