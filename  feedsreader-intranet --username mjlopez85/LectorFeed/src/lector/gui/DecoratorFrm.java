package lector.gui;

import java.util.Collection;
import java.util.Iterator;

public class DecoratorFrm extends lector.gui.AplicationFrm {

	/**
 *
 */
private Collection<AplicationFrm> aplicationFrm = null;

/**
 * Getter of the property <tt>aplicationFrm</tt>
 *
 * @return Returns the aplicationFrm.
 * 
 */
public Collection<AplicationFrm> getAplicationFrm()
{
	return aplicationFrm;
}
 
/**
 * Returns <tt>true</tt> if this collection contains all of the elements
 * in the specified collection.
 *
 * @param elements collection to be checked for containment in this collection.
 * @see	java.util.Collection#containsAll(Collection)
 *
 */
public boolean containsAllAplicationFrm(Collection<AplicationFrm> aplicationFrm){
	return this.aplicationFrm.containsAll(aplicationFrm);
}

/**
 * Setter of the property <tt>aplicationFrm</tt>
 *
 * @param aplicationFrm the aplicationFrm to set.
 *
 */
public void setAplicationFrm(Collection<AplicationFrm> aplicationFrm){
	this.aplicationFrm = aplicationFrm;
}

public void addFrame(){
	
	}

}
