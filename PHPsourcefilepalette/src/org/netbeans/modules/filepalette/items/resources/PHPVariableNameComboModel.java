
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
<<<<<<< HEAD
import java.util.LinkedList;
=======

>>>>>>> 405e4781ec7ec4deb4521e193b48c8b7d7eb724d
/**
 *
 * @author Bill
 * Based on code by Ian Hickey
 */
class PHPVariableNameComboModel extends AbstractListModel implements ComboBoxModel {

    
    //initialize variables
    String   selection     = null;
    Set<String> variableNamesArray = new HashSet<String>();
<<<<<<< HEAD
    Set<String> functionNamesArray = new HashSet<String>();
    Set<String> classNamesArray = new HashSet<String>();
    LinkedList< String> MyList = new LinkedList< String>();
    String[] classNames = { " " };
    String[] functionNames = { " " };
    String[] variableNames = { " " };

=======
    String[] variableNames = { " " };
>>>>>>> 405e4781ec7ec4deb4521e193b48c8b7d7eb724d
    String replaceText2, pattern2, pattern3, replaceText3;
    
    /*
     * Main constructor to parse php file
     * @param input. The string containing the file data
     */
    public PHPVariableNameComboModel() throws FileNotFoundException {
        String input = EditorRegistry.lastFocusedComponent().getText();
<<<<<<< HEAD
        String replaceInput = removeComment(input).replaceAll("[)(;]", "");
=======
        String replaceInput = removeComment(input).replaceAll("[)]", "");
>>>>>>> 405e4781ec7ec4deb4521e193b48c8b7d7eb724d
        //enter entries (split) by whitespace
        String words[] = replaceInput.split("\\s+");
        int counter = 0;
        //while there are still words, add them to the variableNamesArray ArrayList
        while(counter<words.length){
            if(words[counter].charAt(0) == '$'){
<<<<<<< HEAD
                
                variableNamesArray.add("   " + words[counter]);
            }
            counter++;
        }
        counter = 1;
        while(counter<words.length){
            if(words[counter - 1].equals("function")){
                
                functionNamesArray.add("   " + words[counter]);
            }
            counter++;
        }
        counter = 1;
        
        while(counter<words.length){
            if(words[counter - 1].equals("class")){
                
                classNamesArray.add("   " + words[counter]);
            
            }
            counter++;
        }
        int i = 0;
        //convert the arraylist to an array
        if(!variableNamesArray.isEmpty()){
            MyList.add("Variables");
            MyList.addAll(variableNamesArray);
        }
        if(!functionNamesArray.isEmpty()){
            MyList.add("Functions");
            MyList.addAll(functionNamesArray);
        }
        if(!classNamesArray.isEmpty()){
             MyList.add("Classes");
             MyList.addAll(classNamesArray);
        }
        this.variableNames = (String[]) MyList.toArray(new String[0]);
=======
                variableNamesArray.add(words[counter]);
            }
            counter++;
        }
        //convert the arraylist to an array
        this.variableNames = (String[]) variableNamesArray.toArray(new String[0]);
        
>>>>>>> 405e4781ec7ec4deb4521e193b48c8b7d7eb724d
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
