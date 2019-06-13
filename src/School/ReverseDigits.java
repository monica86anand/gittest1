package School;
public class ReverseDigits
{
public static void main(String[] args)
{
int a=3215678;
int mod=0;
int rev=0;
while(a>=10)
{
mod=a%10;
a=a/10;
rev=rev*10+mod*10;
}
rev=rev+a;
System.out.println(rev);
}
}