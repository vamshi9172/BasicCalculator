/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorvamshi;

/**
 *
 * @author hello
 */
public class Calculatorvamshi extends javax.swing.JFrame implements calculations {

    /**
     * Creates new form Calculatorvamshi
     */
    public Calculatorvamshi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bpercentile = new javax.swing.JButton();
        bsqrt = new javax.swing.JButton();
        bxsquare = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        bback = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        bsub = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b1byx = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        baddsub = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdot = new javax.swing.JButton();
        bequals = new javax.swing.JButton();
        tf = new javax.swing.JTextField();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bpercentile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bpercentile.setText("%");
        bpercentile.setName("percentile"); // NOI18N
        bpercentile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpercentileActionPerformed(evt);
            }
        });

        bsqrt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsqrt.setText("sqrt");
        bsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsqrtActionPerformed(evt);
            }
        });

        bxsquare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bxsquare.setText("x^2");
        bxsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bxsquareActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        bce.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bce.setText("CE");
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });

        bc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bback.setText("<--");
        bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbackActionPerformed(evt);
            }
        });

        bdiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        badd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        badd.setText("+");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        bsub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bsub.setText("-");
        bsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsubActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b1byx.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b1byx.setText("1/x");
        b1byx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1byxActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bmul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bmul.setText("*");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });

        baddsub.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        baddsub.setText("-+");
        baddsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddsubActionPerformed(evt);
            }
        });

        b0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdot.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bdot.setText(".");
        bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdotActionPerformed(evt);
            }
        });

        bequals.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bequals.setText("=");
        bequals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequalsActionPerformed(evt);
            }
        });

        tf.setEditable(false);
        tf.setBackground(new java.awt.Color(204, 255, 255));
        tf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(baddsub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(b4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bce, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                            .addComponent(bpercentile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(b7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bsqrt, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(bc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bxsquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bdot, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdiv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(badd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1byx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(bmul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bequals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpercentile)
                    .addComponent(bsqrt)
                    .addComponent(bxsquare)
                    .addComponent(b1byx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bce)
                    .addComponent(bc)
                    .addComponent(bback)
                    .addComponent(bdiv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2)
                    .addComponent(b1)
                    .addComponent(b3)
                    .addComponent(badd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsub, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b9)
                    .addComponent(bmul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(baddsub)
                    .addComponent(b0)
                    .addComponent(bdot)
                    .addComponent(bequals))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bpercentileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpercentileActionPerformed
        // TODO add your handling code here:(
        if(!tf.getText().equals(""))
        {
            setDefault(Double.toString(Double.parseDouble(tf.getText())/100));
        }
        
    }//GEN-LAST:event_bpercentileActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        // TODO add your handling code here:
        label.setText(tf.getText()+"+");try{
        a=Double.parseDouble(tf.getText());}catch(Exception e){tf.setText("");
        label.setText("");}
        tf.setText("");
        ch='+';
    }//GEN-LAST:event_baddActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"3");
    }//GEN-LAST:event_b3ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        // TODO add your handling code here:
        tf.setText(tf.getText()+"0");
    }//GEN-LAST:event_b0ActionPerformed

    private void bdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdotActionPerformed
        // TODO add your handling code here:
        if(decbool){
           tf.setText(tf.getText()+".");
           decbool=false;
        }
    }//GEN-LAST:event_bdotActionPerformed

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bceActionPerformed
        // TODO add your handling code here:
        tf.setText("");
    }//GEN-LAST:event_bceActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        // TODO add your handling code here:
        tf.setText("");
        label.setText("");
    }//GEN-LAST:event_bcActionPerformed

    private void baddsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddsubActionPerformed
        // TODO add your handling code here:
        addsubbool=!addsubbool;
        if(addsubbool)
        tf.setText("-"+tf.getText());
        else
         tf.setText(tf.getText().substring(1,tf.getText().length()));
    }//GEN-LAST:event_baddsubActionPerformed

    private void bbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbackActionPerformed
        // TODO add your handling code here:
        if(!tf.getText().equals(""))
        tf.setText(tf.getText().substring(0,tf.getText().length()-1));
    }//GEN-LAST:event_bbackActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
        // TODO add your handling code here:
        label.setText(tf.getText()+"/");
        try{
        a=Double.parseDouble(tf.getText());}
        catch(NumberFormatException e){tf.setText("");
        label.setText("");}
        tf.setText("");
        ch='/';
    }//GEN-LAST:event_bdivActionPerformed

    private void bsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsubActionPerformed
        // TODO add your handling code here:
        label.setText(tf.getText()+"-");
        try{
        a=Double.parseDouble(tf.getText());}
        catch(Exception e){tf.setText("");
        label.setText("");}
        tf.setText("");
        ch='-';
    }//GEN-LAST:event_bsubActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
        // TODO add your handling code here:
        label.setText(tf.getText()+"*");try{
        a=Double.parseDouble(tf.getText());}catch(Exception e){tf.setText("");
        label.setText("");}
        tf.setText("");
        ch='*';
    }//GEN-LAST:event_bmulActionPerformed

    private void bequalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bequalsActionPerformed
        // TODO add your handling code here:
        try{
        b=Double.parseDouble(tf.getText());
          //Calculatorvamshi vk=new Calculatorvamshi();
        switch (ch) {
            case '+':
                add(a,b);
                break;
            case '-':
                sub(a,b);
                break;
            case '/':
                div(a,b);
                break;
            default:
                mul(a,b);
                break;
        }}
        catch(Exception e){tf.setText("");
        label.setText("");}
    }//GEN-LAST:event_bequalsActionPerformed

    private void bsqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsqrtActionPerformed
        // TODO add your handling code here:
        if(!tf.getText().equals("")){
        setDefault(Double.toString(Math.sqrt(Double.parseDouble(tf.getText()))));}
    }//GEN-LAST:event_bsqrtActionPerformed

    private void bxsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bxsquareActionPerformed
        // TODO add your handling code here:
        if(!tf.getText().equals("")){
        double tempdb=Double.parseDouble(tf.getText());
        setDefault(Double.toString(tempdb*tempdb));}
    }//GEN-LAST:event_bxsquareActionPerformed

    private void b1byxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1byxActionPerformed
        // TODO add your handling code here:
        if(!tf.getText().equals(""))
        {
            setDefault(Double.toString(1/Double.parseDouble(tf.getText())));
        }
    }//GEN-LAST:event_b1byxActionPerformed
    @Override
    public void add(double a,double b){
    setDefault(Double.toString(a+b));
}
    @Override
    public void sub(double a,double b){
        setDefault(Double.toString(a-b));
    }
    @Override
    public void mul(double a,double b){
        setDefault(Double.toString(b*a));
    }
    @Override
    public void div(double a,double b){
        setDefault(Double.toString(a/b));
    }
    private void setDefault(String result){
        tf.setText(result);
        label.setText("");
    }
    static boolean decbool=true,addsubbool=false;
    static double a,b;
    static char ch;
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
            java.util.logging.Logger.getLogger(Calculatorvamshi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculatorvamshi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculatorvamshi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculatorvamshi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculatorvamshi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b1byx;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton badd;
    private javax.swing.JButton baddsub;
    private javax.swing.JButton bback;
    private javax.swing.JButton bc;
    private javax.swing.JButton bce;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bdot;
    private javax.swing.JButton bequals;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bpercentile;
    private javax.swing.JButton bsqrt;
    private javax.swing.JButton bsub;
    private javax.swing.JButton bxsquare;
    private javax.swing.JLabel label;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
