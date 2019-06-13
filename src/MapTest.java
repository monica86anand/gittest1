import java.util.HashMap;
import java.util.Map;

public class MapTest
{
public static void main(String[] args)
{
	Map<Object,Object> m1=new HashMap<Object,Object>();
	Dog d=new Dog("clover");
	m1.put(d,"Dog key");
	m1.put(new Dog("clover"),"Dog key1");
	//System.out.println(m1.get(d));
	System.out.println(m1.get(new Dog("clover")));
	Cat c=new Cat("test");
	m1.put(new Cat("test"), "Cat key");
	//d.name="test";
	System.out.println(m1.get(new Cat("test")));
	System.out.println(m1.get(d));
}
}

class Cat{
	String name;
	public Cat(String name)
	{
		this.name=name;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Cat && ((Cat)o).name==name)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public int hashCode()
	{
		return name.length();
	}
	
	
	
}

class Dog
{
	String name;
	Dog(String name)
	{
		this.name=name;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Dog && ((Dog)o).name==name)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int hashCode()
	{
		return name.length();
	}
	
}