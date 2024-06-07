package javaapplication2;



import java.awt.event.*;
public class Simple_calculator extends javax.swing.JFrame {
    String a;
    double num1,num2,result;
    String operator = "";
    
    public Simple_calculator() {
        initComponents(); 
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        zero = new javax.swing.JButton();
        five = new javax.swing.JButton();
        one = new javax.swing.JButton();
        four = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        two = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        three = new javax.swing.JButton();
        modulo = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        six = new javax.swing.JButton();
        div = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        add = new javax.swing.JButton();
        input = new javax.swing.JTextField();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();
        equal = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(255, 51, 0));
        Cancel.setText("C");
        Cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        jButton11.setText("x^2");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        modulo.setText("%");
        modulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduloActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        div.setText("/");
        div.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        mult.setFont(new java.awt.Font("Liberation Sans", 0, 10)); // NOI18N
        mult.setText("x");
        mult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        sub.setText("-");
        sub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        add.setText("+");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        input.setBackground(new java.awt.Color(204, 204, 204));
        input.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        input.setText("0");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputKeyPressed(evt);
            }
        });

        buttonGroup1.add(on);
        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });

        buttonGroup1.add(off);
        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(204, 204, 204));
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(on)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(off)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(on)
                    .addComponent(off))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(jButton11)
                    .addComponent(div)
                    .addComponent(mult, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seven)
                    .addComponent(eight)
                    .addComponent(nine)
                    .addComponent(sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(four)
                    .addComponent(five)
                    .addComponent(six)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one)
                            .addComponent(two)
                            .addComponent(three))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zero)
                            .addComponent(dot)
                            .addComponent(modulo)))
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        input.addKeyListener(new KeyAdapter(){
                @Override
                public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != '\b') {
                    e.consume();
                }
            }
        });
         getContentPane().add(input);
         setVisible(true);
        
    }//GEN-LAST:event_inputActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
       
        num2=Double.parseDouble(input.getText());
        switch (operator){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                result=num1/num2;
                break;
            case "%":
                result=num1%num2;
                break;
            default:
                result=0;
        }
        operator = "";
        input.setText(Double.toString(result));
    }//GEN-LAST:event_equalActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
      
        input.setEditable(false);
        zero.setEnabled(false);
    }//GEN-LAST:event_offActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
       
        input.setEditable(true);
        zero.setEnabled(true);
    }//GEN-LAST:event_onActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        input.setText("0");
    }//GEN-LAST:event_CancelActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
       a=(input.getText());
        if("0".equals(a)){
            input.setText("0");
        }
        else{
            input.setText(input.getText()+"0");
        }
        
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        
        a=(input.getText());
        if("0".equals(a)){
            input.setText("1");
        }
        else
        {
            input.setText(input.getText()+"1");
        }
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        
        a=(input.getText());
        if("0".equals(a)){
            input.setText("2");
        }
        else
        {
            input.setText(input.getText()+"2");
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        
        a=(input.getText());
        if("0".equals(a)){
            input.setText("3");
        }
        else
        {
            input.setText(input.getText()+"3");
        }
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        
        a=(input.getText());
        if("0".equals(a)){
            input.setText("4");
        }
        else
        {
            input.setText(input.getText()+"4");
        }
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        // TODO add your handling code here:
        a=(input.getText());
        if("0".equals(a)){
            input.setText("5");
        }
        else
        {
            input.setText(input.getText()+"5");
        }
        
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
        a=(input.getText());
        if("0".equals(a)){
            input.setText("6");
        }
        else
        {
            input.setText(input.getText()+"6");
        }
        
        if (num1 != 0.0) {
            equalActionPerformed(evt);
        }
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        a=(input.getText());
        if("0".equals(a)){
            input.setText("7");
        }
        else
        {
            input.setText(input.getText()+"7");
        }
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        a=(input.getText());
        if("0".equals(a)){
            input.setText("8");
        }
        else
        {
            input.setText(input.getText()+"8");
        }
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        a=(input.getText());
        if("0".equals(a)){
            input.setText("9");
        }
        else
        {
            input.setText(input.getText()+"9");
        }
    }//GEN-LAST:event_nineActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(input.getText());
        operator="+";
        input.setText("0");
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(input.getText());
        operator="-";
        input.setText("0");
    }//GEN-LAST:event_subActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(input.getText());
        operator="*";
        input.setText("0");
    }//GEN-LAST:event_multActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(input.getText());
        operator="/";
        input.setText("0");
    }//GEN-LAST:event_divActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(input.getText());
        input.setText(Double.toString(Math.pow(num1,2)));
         
    }//GEN-LAST:event_jButton11ActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        // TODO add your handling code here:
        if(input.getText().contains("."))
        {}
        else{   
        input.setText(input.getText()+".");
        }
    }//GEN-LAST:event_dotActionPerformed

    private void moduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduloActionPerformed
        // TODO add your handling code here:
        num1=Double.parseDouble(input.getText());
        operator="%";
        input.setText("0");
    }//GEN-LAST:event_moduloActionPerformed

    private void inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputKeyPressed
        // TODO add your handling code here:
       if(evt.getKeyChar()>='0'&& evt.getKeyChar()<='9' ||evt.getKeyChar()==KeyEvent.VK_BACK_SPACE||evt.getKeyChar()==KeyEvent.VK_PERIOD)
           {
               if (input.getText().contains(".")) {
                   if (evt.getKeyChar() == '.') {
                       input.setEditable(false);
                   }
               }
               else {
                   input.setEditable(true);
               }   
           }
       else{
               input.setEditable(false);
           }
    }//GEN-LAST:event_inputKeyPressed

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
            java.util.logging.Logger.getLogger(Simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simple_calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simple_calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton11;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JButton modulo;
    private javax.swing.JButton mult;
    private javax.swing.JButton nine;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JButton one;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton sub;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
