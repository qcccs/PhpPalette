/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.filepalette.items.resources;

import edu.mass.qcc.qcccodewizard.CheckVariableName;
import edu.mass.qcc.qcccodewizard.CodeDrop;
import edu.mass.qcc.qcccodewizard.GroupButtonUtils;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.netbeans.api.editor.EditorRegistry;
import org.netbeans.modules.filepalette.OpenHelpUrl;
//change
import org.netbeans.modules.filepalette.items.BasicVariable;
import org.openide.DialogDescriptor;
import org.openide.DialogDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle;

/**
 *
 * @author Ian
 */
public class BasicVariablePopup extends javax.swing.JPanel {

    private Dialog dialog = null;
    private DialogDescriptor descriptor = null;
    private boolean dialogOK = false;
    //change
    BasicVariable ifitem;
    JTextComponent target;

    /**
     * Creates new Popup form
     * @param item
     * @param target  
     */
    //change
    public BasicVariablePopup(BasicVariable item, JTextComponent target) {
        this.ifitem = item;
        this.target = target;
        initComponents();

    }

    /**
     *
     * @return
     */
    public boolean showDialog() {
        addVariableButton.setVisible(false);
        dialogOK = false;

        String displayName = "";
        try {
            displayName = NbBundle.getBundle("org.netbeans.modules.filepalette.items.resources.Bundle").getString("NAME_html-BasicVariable");
        } catch (Exception e) {
        }

        descriptor = new DialogDescriptor(this, NbBundle.getMessage(NewObjectPopup.class, "LBL_Customizer_InsertPrefix") + " " + displayName, true,
                DialogDescriptor.OK_CANCEL_OPTION, DialogDescriptor.CANCEL_OPTION,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!descriptor.getValue().equals(DialogDescriptor.CANCEL_OPTION)) {
                            evaluateInput();
                            dialogOK = true;

                            addVariableButton.doClick();
                        }
                        dialog.dispose();

                    }
                });

        dialog = DialogDisplayer.getDefault().createDialog(descriptor);

        dialog.setVisible(true);
        repaint();

        return dialogOK;

    }

    private void evaluateInput() {

        String comment = jTextField1.getText();
        ifitem.setComment(comment);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        expPane = new javax.swing.JPanel();
        vCb4 = new javax.swing.JComboBox();
        vCb5 = new javax.swing.JComboBox();
        vCb6 = new javax.swing.JComboBox();
        vCb8 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        addVariableButton = new javax.swing.JButton();
        StringCheck = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        varPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        varNameCombo1 = new javax.swing.JTextField();

        expPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.expPane.border.title"))); // NOI18N

        vCb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=" }));

        vCb5.setEditable(true);
        vCb5.setModel(new VariableNameComboModel());
        vCb5.setToolTipText(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.vCb5.toolTipText")); // NOI18N

        vCb6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Assignment", "=", "Arithmetic", "+", "-", "*", "/", "%", "Unary", "+", "-", "++", "--", "!", "Equality & Relational", "==", "!=", ">", ">=", "<", "<=", "Conditional", "&&", "||", "?:", "Bitwise and Shift", "~", "<<", ">>", ">>>", "&", "^", "|", " " }));
        vCb6.setSelectedIndex(9);

        vCb8.setEditable(true);
        vCb8.setModel(new VariableNameComboModel());
        vCb8.setToolTipText(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.vCb8.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel41, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.jLabel41.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(addVariableButton, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.addVariableButton.text")); // NOI18N
        addVariableButton.setToolTipText(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.addVariableButton.toolTipText")); // NOI18N
        addVariableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVariableButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(StringCheck, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.StringCheck.text")); // NOI18N
        StringCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StringCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout expPaneLayout = new javax.swing.GroupLayout(expPane);
        expPane.setLayout(expPaneLayout);
        expPaneLayout.setHorizontalGroup(
            expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(expPaneLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addVariableButton))
                    .addGroup(expPaneLayout.createSequentialGroup()
                        .addComponent(vCb4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vCb5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StringCheck)
                            .addGroup(expPaneLayout.createSequentialGroup()
                                .addComponent(vCb6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vCb8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        expPaneLayout.setVerticalGroup(
            expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(expPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(StringCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, expPaneLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(addVariableButton)))
                    .addGroup(expPaneLayout.createSequentialGroup()
                        .addGroup(expPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vCb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vCb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vCb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vCb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.jLabel1.text")); // NOI18N

        jTextField1.setText(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.jTextField1.text")); // NOI18N

        varPane.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.varPane.border.title"))); // NOI18N
        varPane.setToolTipText(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.varPane.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.jLabel4.text")); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/mass/qcc/qcccodewizard/Question.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel33, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.jLabel33.text")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel39, org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.jLabel39.text")); // NOI18N

        varNameCombo1.setText(org.openide.util.NbBundle.getMessage(BasicVariablePopup.class, "BasicVariablePopup.varNameCombo1.text")); // NOI18N

        javax.swing.GroupLayout varPaneLayout = new javax.swing.GroupLayout(varPane);
        varPane.setLayout(varPaneLayout);
        varPaneLayout.setHorizontalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(105, 105, 105))
        );
        varPaneLayout.setVerticalGroup(
            varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(varPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel39)
                    .addComponent(varNameCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
            .addGroup(varPaneLayout.createSequentialGroup()
                .addComponent(jLabel33)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addComponent(varPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(varPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(expPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 42, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 42, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addVariableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVariableButtonActionPerformed

        //This adds a new variable into the current document
        GroupButtonUtils gbu = new GroupButtonUtils();
        if (!varNameCombo1.getText().equals("")) {
            //Get the currently open java source
            try {
                JTextComponent jtc = EditorRegistry.lastFocusedComponent();
                CodeDrop codedrop = new CodeDrop();
                //Find the type of variable

                
                String varName = varNameCombo1.getText();
                System.out.println(varName);

                //Make sure its a valid variable name...
                CheckVariableName cvn = new CheckVariableName();
                if (cvn.isGood(varName)) {
                    //If name is valid, add it to the editor.
                    System.out.println("Valid Name");

                    //Check if we need to add a value or simple expression.
                    String value1 = "";
                    String value2 = "";
                    String value3 = "";
                    String operator = "";
                    if(StringCheck.isSelected()){
                        if (vCb5.getSelectedItem() != null) {
                            value1 = vCb5.getSelectedItem().toString();
                            value1 = "\"" + value1 + "\"";
                            operator = vCb4.getSelectedItem().toString();
                         }  
                    }
                    else{   
                        if (vCb5.getSelectedItem() != null) {
                            value1 = vCb5.getSelectedItem().toString();
                            operator = vCb4.getSelectedItem().toString();
                        }
                    
                        if (vCb6.getSelectedItem() != null) {
                            value2 = vCb6.getSelectedItem().toString();
                        }
                    
                    
                        if (vCb8.getSelectedItem() != null) {
                            value3 = vCb8.getSelectedItem().toString();
                        } else {
                            value2 = "";
                        }
                    }

                    //Construct the output string
                    String code = "$" + varName + " " + operator + " " + value1 + " " + value2 + " " + value3 + ";";
                    try {
                        //Insert into document
                        System.out.println("Inserting Code");
                        CodeDrop.insert(code, jtc);
                    } catch (BadLocationException ex) {
                        Exceptions.printStackTrace(ex);
                    }

                } else {

                    JOptionPane.showMessageDialog(this, "Invalid Variable Name. Try Again.");
                    System.out.println("Variable name not valid!");
                }

            } catch (java.lang.Throwable t) {

                JOptionPane.showMessageDialog(this, "All Fields must be filled out.");
                t.printStackTrace();

            }
        }//end if
        //Call combobox models visit method to update with the new variable.
    }//GEN-LAST:event_addVariableButtonActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // Variable Help Page
        OpenHelpUrl o = new OpenHelpUrl("http://php.net/manual/en/language.variables.php");
    }//GEN-LAST:event_jLabel33MouseClicked

    private void StringCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StringCheckActionPerformed
        if(StringCheck.isSelected()){
            vCb6.setVisible(false);
            vCb8.setVisible(false);
        }
        if(!StringCheck.isSelected()){
            vCb6.setVisible(true);
            vCb8.setVisible(true);
        }
    }//GEN-LAST:event_StringCheckActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox StringCheck;
    private javax.swing.JButton addVariableButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel expPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox vCb4;
    private javax.swing.JComboBox vCb5;
    private javax.swing.JComboBox vCb6;
    private javax.swing.JComboBox vCb8;
    private javax.swing.JTextField varNameCombo1;
    private javax.swing.JPanel varPane;
    // End of variables declaration//GEN-END:variables
}
