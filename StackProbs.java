import java.util.Stack;

public class StackProbs 
{
	public static Stack<Integer> makeStack(int[] nums) 
	{
		Stack<Integer> stack = new Stack<>();
		for (int num : nums)
		stack.push(num);
		return stack;
	}
	static Stack<Integer> doubleUp (Stack<Integer> nums)
	{
		Stack<Integer> temp= new Stack<Integer>();
		int box;
		while(!nums.isEmpty())
		{
			box=nums.pop();
			temp.push(box);
		}
		while(!temp.isEmpty())
		{
			box=temp.pop();
			nums.push(box);
			nums.push(box);
		}
		
		return nums;
	}
	static String reverseVowels (String str)
	{
		Stack<String> vowels= new Stack<String>();
		for(int i=0;i<str.length();i++)
		{
			if(str.substring(i,i+1).equals("a") || str.substring(i,i+1).equals("e") || str.substring(i,i+1).equals("i") || str.substring(i,i+1).equals("o") )
			{
				vowels.push(str.substring(i,i+1));
			}
		}
		Stack<String> v = new Stack<String>();
		String exp;
		while(!vowels.isEmpty())
		{
			exp=vowels.pop();
			v.push(exp);
		}
		while(!v.isEmpty())
		{
			exp=v.pop();
			vowels.push(exp);
			vowels.push(exp);
		}
		for(int i=0;i<str.length();i++)
		{
			if(str.substring(i,i+1).equals("a") || str.substring(i,i+1).equals("e") || str.substring(i,i+1).equals("i") || str.substring(i,i+1).equals("o") )
			{
				String x=str.substring(i,i+1);
				x=vowels.pop();
			}
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println(doubleUp(makeStack(new int[] {1,2,3,4})));
		System.out.println(reverseVowels("hello how are you"));
	}

 
}
