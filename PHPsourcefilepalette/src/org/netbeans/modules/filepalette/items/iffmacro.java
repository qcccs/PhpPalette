
/*
*
*
* To change this template, choose Tools | Templates
* and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items;

//~--- non-JDK imports --------------------------------------------------------

import org.netbeans.modules.filepalette.items.resources.dowhilemacroItemCustomizer;

import org.openide.text.ActiveEditorDrop;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

/**
 *
 *
 */
public class iffmacro implements ActiveEditorDrop {
    private String comment = "";

    /**
     *
     */
    public String abbr = "iff";

    /**
     *
     */
    public iffmacro() {}

    private String createBody() {
        String        comment = getComment();
        StringBuilder buffer  = new StringBuilder();

        ////////////////////////
        buffer.append("// ").append(comment).append("\n");
        buffer.append(abbr);

        ////////////////////////
        return buffer.toString();
    }

    /**
     *
     * @param targetComponent
     * @return
     */
    public boolean handleTransfer(JTextComponent targetComponent) {
        dowhilemacroItemCustomizer c      = new dowhilemacroItemCustomizer(this, targetComponent);
        boolean                    accept = c.showDialog();

        if (accept) {
            String body = this.createBody();

            try {
                FilePaletteUtilities.insertm(body, targetComponent, true);
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
