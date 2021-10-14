package Lab;

import java.awt.*;

public class LabUnit_7_2_font {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Font F;
		F = new Font("TimesNewRoman", Font.BOLD+Font.ITALIC, 12);
		String font = F.getName();
		int style = F.getStyle();
		int size = F.getSize();
		boolean bold = F.isBold();
		boolean normal = F.isPlain();
		boolean italic = F.isItalic();
		
		System.out.println("Font: "+font+"\nStyle: "+style+"\nSize: "+size
				+"\nBold: "+bold+"\nNormal: "+normal+"\nItalic: "+italic);
	}

}
