import java.util.*;
public class parking{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int arr[][]={
             1357,2345,03421,0,2134}
             {0.0.1234},{3245,6789,5432}.
              {5432,7654,0};
 System,out,println("Type'park'to park or'remove'to take vehicle:");
       String a=sc.next();
if*(a.equalsIgnoreCase("park")){
boolean found=false;
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
if(arr[i][j]==0){
System.out.println("parking space available at["+i+"]["+j+"]");
Sysstem.out.println("Enter your 4 digit vehicle number:");
int newnum=sc.nextInt();
arr[i][j]=newnum;
System.out.println("Vechile parked successfully");
found=true;
break;
}
}
if(found)break;
}
if(!found){
System.out.println("Parking area is full");
}
}
else
if(a.equalslgnoreCase("remove")){
System.out.println("Enter your 4 digit vehicle number:");
int num=sc.nextInt();
boolean found=false;
for(int j=0;j<arr[i].length;j++){
if(arr[i][j]==num){
arr[i][j]=0;

remove vehicle
System.out.println("Vechicle removed successfully");
found=true;
break;
}
}
if(found)break;
}
if(!found){
System.out.println("Vehicle not found");
}
}
else{
System.out.println("Invalid option");
}
}
}




