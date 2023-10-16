import java.util.*;
import java.io.*;

public class PangramCheck
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your string: ");
String str=sc.nextLine();
str = str.toLowerCase();  
boolean x = true;  
for (char ch = 'a'; ch <= 'z'; ch++)   
{   
if (!str.contains(str.valueOf(ch)))   
{  
x = false;  
break;  
}  
}  
if (x)  
System.out.println("Yes-Pangram");  
else  
System.out.println("Not a pangram");  
}
}  
