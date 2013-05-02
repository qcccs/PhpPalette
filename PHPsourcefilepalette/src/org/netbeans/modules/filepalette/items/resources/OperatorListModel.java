
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Ian
 */
class OperatorListModel extends AbstractListModel implements ComboBoxModel {
    String[] operators = {
        "Assignment", "=", "*=", "/=", "%=", "+=", "-=", ">>=", "<<=", "&=", "^=", 
        "|=", "Arithmetic", "+", "-", "*", "/", "%", "Unary", "+", "-", "++", "--", "!",
        "::","sizeof","new","delete",
        "Equality & Relational", "==", "!=", ">", ">=", "<", "<=", 
        "Conditional", "&&", "||", "?:", "Bitwise and Shift",
        "~", "<<", ">>", ">>>", "&", "^", "|", 
        "Type Casting", "(int)","(float)","(double)", "(string)", "(char)",
        "Pointers", "*", "&"
    };
    String selection = null;

    @Override
    public Object getElementAt(int index) {
        return operators[index];
    }

    @Override
    public int getSize() {
        return operators.length;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selection = (String) anItem;    // to select and register an
    }    // item from the pull-down list

    // Methods implemented from the interface ComboBoxModel
    @Override
    public Object getSelectedItem() {
        return selection;    // to add the selection to the combo box
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
