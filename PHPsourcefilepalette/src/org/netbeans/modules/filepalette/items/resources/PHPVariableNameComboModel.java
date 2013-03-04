
/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

//~--- non-JDK imports --------------------------------------------------------



import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import org.netbeans.api.editor.EditorRegistry;

/**
 *
 * @author Bill
 * Based on code by Ian Hickey
 */
class PHPVariableNameComboModel extends AbstractListModel implements ComboBoxModel {

    
    //initialize variables
    String   selection     = null;
    Set<String> variableNamesArray = new HashSet<String>();
    String[] variableNames = { " " };
    String replaceText2, pattern2, pattern3, replaceText3;
    
    /*
     * Main constructor to parse php file
     * @param input. The string containing the file data
     */
    public PHPVariableNameComboModel() throws FileNotFoundException {
        String input = EditorRegistry.lastFocusedComponent().getText();
        String replaceInput = removeComment(input).replaceAll("[)]", "");
        //enter entries (split) by whitespace
        String words[] = replaceInput.split("\\s+");
        int counter = 0;
        //while there are still words, add them to the variableNamesArray ArrayList
        while(counter<words.length){
            if(words[counter].charAt(0) == '$'){
                variableNamesArray.add(words[counter]);
            }
            counter++;
        }
        //convert the arraylist to an array
        this.variableNames = (String[]) variableNamesArray.toArray(new String[0]);
        
    }
    
    public final String removeComment(String input){
        
        pattern2 = "(?://.*)|(/\\*(?:.|[\\n\\r])*?\\*/)";
        pattern3 = "\"(?i)(\\\")(.+?)(\\\")\"";
        
        replaceText2 = input.replaceAll(pattern2, " ");
        replaceText3 = replaceText2.replaceAll(pattern3, " ");
        return replaceText3;
    }

    public void Refresh() {

        
    }

    @Override
    public Object getElementAt(int index) {
        return variableNames[index];
    }

    @Override
    public int getSize() {
        return variableNames.length;
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
