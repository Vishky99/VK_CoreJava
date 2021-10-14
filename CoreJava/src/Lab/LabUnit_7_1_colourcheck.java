package Lab;

/*public class LabUnit_7_1_colourcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

import java.awt. *;

public class LabUnit_7_1_colourcheck
{
	public static void main(String arg [ ])
	{
		Color rgb;
		rgb = new Color (193,255,183);
		int red, green, blue;
		red = rgb.getRed ( );
		green = rgb.getGreen ( );
		blue = rgb.getBlue ( );
		float x [ ] = {0.0f,0.0f,0.0f};
		
		Color.RGBtoHSB(red, green, blue, x);
		
		System.out.println("RGB Combination");
		System.out.println("Red: "+red+"\tGreen: "+green+"\tBlue: "+blue);
		System.out.println ("Hue: "+x[0]+ "\tSaturation: "+x[1] +"\tBrightness: "+x[2]);
		
	}
}