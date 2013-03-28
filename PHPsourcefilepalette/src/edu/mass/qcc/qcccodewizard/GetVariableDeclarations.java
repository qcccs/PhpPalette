
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package edu.mass.qcc.qcccodewizard;

//~--- non-JDK imports --------------------------------------------------------


//~--- JDK imports ------------------------------------------------------------

import java.util.ArrayList;

/**
 *
 * @author Ian
 */
public class GetVariableDeclarations  {
    ArrayList myNameArray = new ArrayList();
    ArrayList myTypeArray = new ArrayList();

   

    /**
     * @return the myNameArray
     */
    public ArrayList getMyArray() {
        return myNameArray;
    }

    /**
     * @param myArray 
     */
    public void setMyArray(ArrayList myArray) {
        this.myNameArray = myArray;
    }

    /**
     * @return the myTypeArray
     */
    public ArrayList getMyTypeArray() {
        return myTypeArray;
    }

    /**
     * @param myTypeArray the myTypeArray to set
     */
    public void setMyTypeArray(ArrayList myTypeArray) {
        this.myTypeArray = myTypeArray;
    }
}




//~ Formatted by Jindent --- http://www.jindent.com
