
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;


public class TaskProgram extends javax.swing.JFrame {

    ArrayList list;
    ListIterator li;
    int curtask, tottask;
    Task t;
    
    public TaskProgram() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask = 0;
        tottask = 0;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdesc = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lblctask = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblttask = new javax.swing.JLabel();
        btnlastleft = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlastright = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JMenuItem();
        mnuremove = new javax.swing.JMenuItem();
        mnurestore = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JMenuItem();
        mnuafter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtdesc.setColumns(20);
        txtdesc.setRows(5);
        jScrollPane1.setViewportView(txtdesc);

        jLabel3.setText("Current Task:");

        lblctask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblctask.setText("n/a");
        lblctask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Total Tasks:");

        lblttask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblttask.setText("0");
        lblttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnlastleft.setText("|<");

        btnlast.setText("<");

        btnnext.setText(">");

        btnlastright.setText(">|");

        jMenu1.setText("Program");

        mnushowall.setText("Show All Tasks");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnushowall);

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setText("Replace Current Task");
        jMenu2.add(mnureplace);

        mnuremove.setText("Remove Current Task");
        jMenu2.add(mnuremove);

        mnurestore.setText("Restore Current Task to Screen");
        mnurestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestoreActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestore);

        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubefore.setText("Before Current Task");
        jMenu3.add(mnubefore);

        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(txtname))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblctask, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblttask, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnlastleft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlast)
                                .addGap(18, 18, 18)
                                .addComponent(btnnext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlastright)
                                .addGap(46, 46, 46))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblctask)
                    .addComponent(jLabel4)
                    .addComponent(lblttask))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlastleft)
                    .addComponent(btnlast)
                    .addComponent(btnnext)
                    .addComponent(btnlastright))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnushowallActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnurestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnurestoreActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        Task t = new Task(nm, d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if(tottask>0) li.next();
        
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lblttask.setText(""+tottask);
        lblctask.setText(""+curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnuafterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnlastleft;
    private javax.swing.JButton btnlastright;
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblttask;
    private javax.swing.JMenuItem mnuafter;
    private javax.swing.JMenuItem mnubefore;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnureplace;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
