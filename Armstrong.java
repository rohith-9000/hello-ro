import java.util.Scanner;
class Armstrong{
public static void main(String[]args)
 {
int n,rev=0,r,m,count=0;
 Scanner sc=new Scanner(System.in);
 System.out.println(" enter any number");
n=sc.nextInt();
m=n;
while(n!=0)
{

count++;
 n=n/10;}
n=m;

while(n!=0)
 {
 r=n%10;
 rev=rev+(int)Math.pow(r,count);
 n=n/10;}
if(rev==m)
 System.out.println( count  + " Digit Arm strong number");
else 
System.out.println(count + " Digit not an arm strong number"); }}