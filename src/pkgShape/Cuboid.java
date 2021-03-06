package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int iDepth;

	public Cuboid(int iLength, int iWidth, int iDepth) {
		super(iLength, iWidth);
		this.iDepth = iDepth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume()
	{
		return super.area()*this.iDepth;
	}
	
	@Override
	public double area()
	{
		double a = 2 * super.area() + 2 * (this.getiLength() + this.getiWidth()) * this.getiDepth();
		return a;
		
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException
	{
		throw new UnsupportedOperationException("This method is not valid.");
	}
	
	@Override
	public String toString()
	{
		return "(" 
				+ this.getiLength() + ", " + this.getiWidth() + ", " + this.getiDepth()
				+ ", Area:" + this.area() + ", Volume:" + this.volume() 
				+ ")";
	}
	
	@Override
	public int compareTo(Object o)
	{
		return 0;
	}
	
	public class SortByArea implements Comparator<Cuboid>
	{
		@Override
		public int compare(Cuboid a, Cuboid b)
		{
			return (int) (a.area() - b.area());
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>
	{
		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			return (int)(o1.volume()-o2.volume());
		}
	}
	
}
