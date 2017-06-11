
package calc;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Adv extends javax.swing.JFrame {

   
    public Adv() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abt = new javax.swing.JButton();
        me = new javax.swing.JLabel();
        opt = new javax.swing.JComboBox();
        but = new javax.swing.JButton();
        one = new javax.swing.JTextField();
        two = new javax.swing.JTextField();
        tit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ans = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JCalc");
        setBackground(java.awt.Color.white);
        setForeground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(545, 258));
        setMinimumSize(new java.awt.Dimension(545, 258));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        abt.setText("About JCalc");
        abt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abt.setName("abt"); // NOI18N
        abt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abtActionPerformed(evt);
            }
        });

        me.setFont(new java.awt.Font("Segoe Print", 1, 28)); // NOI18N
        me.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        me.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calc/calc.jpg"))); // NOI18N
        me.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        opt.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        opt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " +   (Add) ", " -   (Subtract)", " x   (Multiply)", " /   (Divide)", "Raised to the power", "Times root" }));
        opt.setName("opt"); // NOI18N
        opt.setPreferredSize(new java.awt.Dimension(176, 40));

        but.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        but.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        but.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        but.setLabel("Calculate");
        but.setName("but"); // NOI18N
        but.setSelected(true);
        but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butActionPerformed(evt);
            }
        });

        one.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        one.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        one.setName("one"); // NOI18N
        one.setPreferredSize(new java.awt.Dimension(40, 40));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        two.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        two.setName("two"); // NOI18N
        two.setPreferredSize(new java.awt.Dimension(40, 40));

        tit.setFont(new java.awt.Font("Pristina", 1, 30)); // NOI18N
        tit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tit.setText("Welcome to JCalc");
        tit.setName("tit"); // NOI18N
        tit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                titMouseExited(evt);
            }
        });

        jPanel1.setBackground(java.awt.Color.white);

        ans.setBackground(java.awt.Color.white);
        ans.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        ans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ans.setText("Solution");
        ans.setName("ans"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(me, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(abt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(but, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(opt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(but, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(abt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
            .addComponent(me, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abtActionPerformed
        
Hello dumb = new Hello();
dumb.setVisible(true);
    }//GEN-LAST:event_abtActionPerformed

    private void butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butActionPerformed
        Exec c = new Exec();
			
			if(opt.getSelectedItem().equals(" +   (Add) "))
        	{
        		
        		try 
        		
        		{
        			
        		double x = Double.parseDouble(one.getText());
        		double y = Double.parseDouble(two.getText());
        		
        		
        			double sum = c.add(x , y);
    			    ShowRes(sum);
        		}
        		
        		catch(Exception err)
        		{
        			DisplayError(err.getMessage());
        		}
        		
		    }
			
			if(opt.getSelectedItem().equals(" -   (Subtract)"))
        	{
        		try{
        			
        		
        		double x = Double.parseDouble(one.getText());
        		double y = Double.parseDouble(two.getText());
        		
        		double diff = c.sub(x , y);
        		ShowRes(diff);
        		}
        		catch(Exception err)
        		{
        			DisplayError(err.getMessage());
        		}
			    
		    }
			
			if(opt.getSelectedItem().equals(" x   (Multiply)"))
        	{
        		
        		try
        		{
        		double x = Double.parseDouble(one.getText());
        		double y = Double.parseDouble(two.getText());
        		
        		double prod = c.prod(x , y);
			    ShowRes(prod);
        		}
        		catch(Exception err)
        		{
        			DisplayError(err.getMessage());
        		}
		    }
			
			if(opt.getSelectedItem().equals(" /   (Divide)"))
        	{
        		
        		try {
        		double x = Double.parseDouble(one.getText());
        		double y = Double.parseDouble(two.getText());
        		
        		double div = c.div(x , y);
			    ShowRes(div);
        		}
        		catch(Exception err)
        		{
        			DisplayError(err.getMessage());
        		}
		    }
			
			if(opt.getSelectedItem().equals("Raised to the power"))
        	{
        		
        		try {
        		double x = Double.parseDouble(one.getText());
        		double y = Double.parseDouble(two.getText());
        		
        		double div = Math.pow(x, y);
			    ShowRes(div);
        		}
        		catch(Exception err)
        		{
        			DisplayError(err.getMessage());
        		}
		    }
			
			if(opt.getSelectedItem().equals("Times root"))
        	{
        		
        		try {
        		double x = Double.parseDouble(one.getText());
        		double y = Double.parseDouble(two.getText());
        		
        		double div = Math.pow(y, 1/x);
			    ShowRes(div);
        		}
        		catch(Exception err)
        		{
        			DisplayError(err.getMessage());
        		}
		    }
		}
			 public void DisplayError (String inform){
			 
			 {
				JOptionPane.showMessageDialog(null,inform);
			 }
			

    }//GEN-LAST:event_butActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        
    }//GEN-LAST:event_oneActionPerformed

    private void titMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titMouseEntered
        tit.setForeground(Color.RED);
    }//GEN-LAST:event_titMouseEntered

    private void titMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titMouseExited
        tit.setForeground(Color.black);
    }//GEN-LAST:event_titMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
     
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
      
    
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Adv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adv().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abt;
    private javax.swing.JLabel ans;
    private javax.swing.JButton but;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel me;
    private javax.swing.JTextField one;
    private javax.swing.JComboBox opt;
    private javax.swing.JLabel tit;
    private javax.swing.JTextField two;
    // End of variables declaration//GEN-END:variables

 
    
     public void ShowRes(double soln)
          {
        	    
        	ans.setText(String.valueOf(soln));
              
          }
    
       
}

