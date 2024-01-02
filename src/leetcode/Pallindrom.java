package leetcode;

public class Pallindrom {
		public static boolean isPalindrome(int x) {
			 if(x<0){
		            return false;
		        }
		        int rev=0;
		        int temp=x;
		        while(temp!=0){
		            int digit=temp%10;
		            rev=rev*10+digit;
		            temp=temp/10;
		        }
		        return (rev==x);
		       
		    }
		public static void main(String[] args) {
			System.out.println(isPalindrome(100));
		}
	}


