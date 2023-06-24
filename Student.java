package firstproject;

public class Student {

	public static void main(String[] args) {
		System.out.println("Following are the basic mathematical formulas performed based on arithmetic operations: ");
		Student s = new Student();
		s.PerimeterOfSqr(13);
		s.PerimeterofRect(5, 6);
		s.AreaOfSqr(40);
		s.AreaOfRect(25, 7);
		s.AreaOfTriangle(22, 40);
		s.AreaOfCircle(4);
		s.VolumeOfCone(6, 25);
		s.VolumeOfCylinder(5, 90);
		s.SurfaceAreaOfCone(25.5, 90.1);
		s.SurfaceAreaOfCylinder(2.2, 40.2);
		s.SurfaceAreaOfCube(31);
	}

	void PerimeterOfSqr(int a) {
		int p = 4 * a;
		System.out.println("1) Perimeter Of Square is: " + p);
	}

	void PerimeterofRect(int l, int b) {
		int p = 2 * (l + b);
		System.out.println("2) Perimeter of rectangle is: " + p);
	}

	void AreaOfSqr(int a) {
		int b = a * a;
		System.out.println("3) Area of Square is: " + b);
	}

	void AreaOfRect(int l, int b) {
		int a = l * b;
		System.out.println("4) Area of Rectangle is: " + a);
	}

	void AreaOfTriangle(int b, int h) {
		int a = b * h / 2;
		System.out.println("5) Area of Triangle is: " + a);
	}

	void AreaOfCircle(double r) {
		double a = 3.142 * r * r;
		System.out.println("6) Area of Circle is: " + a);

	}

	void VolumeOfCone(int b, int h) {
		int v = b * h / 3;
		System.out.println("7) Volume of Cone is: " + v);
	}

	void VolumeOfCylinder(int b, int h) {
		int v = b * h;
		System.out.println("8) Volume of Cylinder is: " + v);
	}

	void SurfaceAreaOfCone(double r, double l) {
		double s = 3.142 * r * l;
		System.out.println("9) Surface Area of Cone is: " + s);
	}

	void SurfaceAreaOfCylinder(double r, double h) {
		double s = 2 * 3.14 * r * h;
		System.out.println("10) Surface Area of Cylinder is: " + s);

	}

	void SurfaceAreaOfCube(int a) {
		int s = 6 * a * a;
		System.out.println("11) Surface Area of Cube: " + s);

	}

}
