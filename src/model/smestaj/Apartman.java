package model.smestaj;

import java.io.Serializable;

public class Apartman extends Smestaj{


    /**
	 * 
	 */
	private static final long serialVersionUID = -2768776580809760268L;

	@Override
    public Double zakupi() {

        return super.zakupi();
    }

    @Override
    public void otkazi() {
        System.out.println("Troskovi se umanjuju za: " + zakupi() + " dinara");

    }
}
