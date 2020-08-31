package CodeSamples;

public class AreaofTriangle {
	
		static double b,h;
		public static void main(String[] args) {

		b = 15;
		h = 10;
		
		//*****Before calculating area, verifying given values are not equal to zero**********
		//*********Verifying given values are only numbers and double cannot be a null*****************

		if(b!=0&h!=0&&b==(int)b&&h==(int)h) {

		double area = b*h/2;

		System.out.println("Area of triangle is "+area);

		}

		else {

		System.out.println("Given values are wrong");
		}

	}

}
