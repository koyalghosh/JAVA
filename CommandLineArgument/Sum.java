//This program will find sum of numbers given during run time in command prompt

class Sum{
	public static void main(String args[]){ //args is an array of string which will convert every coming value to string then receive it
		int sum=0;
		for(int i=0;i<args.length;i++){//will take input in command prompt during run command(java CommandLineArgument)
			sum+=Integer.parseInt(args[i]);//convert string to integer
		}
		System.out.print("Sum is " + sum);
	}
}

/* In command prompt window

D:\Coding\JAVA>javac Sum.java

D:\Coding\JAVA>java Sum 10 20 30
Sum is 60
D:\Coding\JAVA>
*/
