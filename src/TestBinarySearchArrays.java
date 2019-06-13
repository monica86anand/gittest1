import java.util.Arrays;
public class TestBinarySearchArrays
{
	public static void main(String[] args)
	{
		String[] s1={"one","five","six"};
		Arrays.sort(s1);
		System.out.println(Arrays.binarySearch(s1, "three"));
	}
}