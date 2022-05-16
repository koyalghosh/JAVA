//This program will sort a float array
class Sort{
	public static void main(String ... args){ //accept zero or more arguments
		float ar[];
		ar=new float[args.length];
		for(int i=0;i<args.length;i++)  //Copying elements to an float array
			ar[i]=Float.parseFloat(args[i]);
		for(int i=0;i<args.length-1;i++){   //sorting the float array
			for(int j=i+1;j<args.length;j++){
				if(ar[i] > ar[j]){
					float temp;
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.print("Sorted arrays is ");
		for(float e : ar)
			System.out.print(e + "\t");
	}
}

/* 
In Command Prompt window

D:\Coding\JAVA>javac Sort.java

D:\Coding\JAVA>java Sort 10.3f 5.5f 6.3f 20.4f
Sorted arrays is 5.5    6.3     10.3    20.4
D:\Coding\JAVA>

*/
