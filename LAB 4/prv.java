class rectangle
{
	private int l,b;
	rectangle(int x,int y)
	{ l=x; b=y;}
	int area()
	{return(l*b);}
}
class cube extends rectangle
{
	int h;
	cube(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	int volume()
	{
		return(area()*h);
	}
}
class prv
{
	public static void main(String args[])
	{
		cube cb=new cube(30,50,55);
		int a1=cb.area();
		int v1=cb.volume();
		System.out.println("Area of Rectange : "+a1);
		System.out.println("Volume of cube : "+v1);
	}
}