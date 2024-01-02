package hackerrank;

	import java.util.Scanner;

	class RegexPatternValidIp{

	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new MyRegex().pattern));
	        }

	    }
	}
	  // `[0-9]` matches single digit from `0 to 9`.
	  // `[0-9][0-9]` matches double digits from `00 to 99`.
	  // `[01][0-9][0-9]` matches three digits from `000 to 199`
	  // `2[0-4][0-9]` matches three digits from `200` to 249.
	  // `25[0-5]` matches three digits from `250` to `255`.

	//Write your code 

	class MyRegex{
	  String s="([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
	  public String pattern=s+"."+s+"."+s+"."+s;
	}

