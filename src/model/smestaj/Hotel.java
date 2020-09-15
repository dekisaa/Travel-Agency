package model.smestaj;

import java.io.Serializable;

public class Hotel extends Smestaj {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1052541445592574056L;
	private Integer brojZvezdica;

    @Override
    public Double zakupi() {
        return super.zakupi()+123*brojZvezdica;
    }

    @Override
    public void otkazi() {
        System.out.println("Troskovi se umanjuju za: " + zakupi() + " dinara");

    }


}
