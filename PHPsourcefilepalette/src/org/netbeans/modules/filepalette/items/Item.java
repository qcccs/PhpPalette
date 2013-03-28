
/*
* item.java
*
*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items;

//~--- non-JDK imports --------------------------------------------------------

import org.netbeans.modules.filepalette.items.resources.ItemCustomizer;

import org.openide.text.ActiveEditorDrop;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

/**
 *
 *
 */
public class Item implements ActiveEditorDrop {
    private String comment = "";

    /**
     *
     */
    public Item() {}

    private String createBody() {
        String        comment = getComment();
        StringBuilder buffer  = new StringBuilder();

        ///////////////////////
        buffer.append("/** ");
        buffer.append(comment);
        buffer.append(" */\n\t");
        buffer.append("int main(int argc, char** argv) {\n\n\treturn 0;\n\t");
        buffer.append("}\n\n");

        return buffer.toString();

        ///////////////////////
    }

    /**
     *
     * @param targetComponent
     * @return
     */
    public boolean handleTransfer(JTextComponent targetComponent) {
        ItemCustomizer c      = new ItemCustomizer(this, targetComponent);
        boolean        accept = c.showDialog();

        if (accept) {
            String body = createBody();

            try {
                FilePaletteUtilities.insert(body, targetComponent);
            } catch (BadLocationException ble) {
                accept = false;
            }
        }

        return accept;
    }

    /**
     *
     * @return
     */
    public String getComment() {
        return comment;
    }

    /**
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
