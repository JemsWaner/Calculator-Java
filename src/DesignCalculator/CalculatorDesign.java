package DesignCalculator;

import calculator.Calculator;
import javax.swing.JButton;

public class CalculatorDesign extends javax.swing.JFrame {

    Calculator calcul = new Calculator();

    public CalculatorDesign() {
        initComponents();
    }

    public void buttonValues(JButton buton) {

        for (int i = 0; i < 10; i++) {
            String confirmInput = Integer.toString(i);
            if (buton.getText().equals(confirmInput)) {
                calcul.setNumber(buton.getText());
            }
        }
        shownResult.setText(this.shownResult.getText() + buton.getText());
    }

    /*This overloaded method ButtonValues below is like the first one, but only is called by the "=" (Result) button,
    to send the result number again to the calculator and continue operating*/
    public void buttonValues(String numberResult) {

        calcul.setNumber(numberResult);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        shownResult = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        point = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 33, 33));

        shownResult.setBackground(new java.awt.Color(172, 170, 170));
        shownResult.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        shownResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        shownResult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        shownResult.setOpaque(true);

        clear.setBackground(new java.awt.Color(225, 69, 90));
        clear.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("C");
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(225, 69, 90));
        divide.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        divide.setForeground(new java.awt.Color(255, 255, 255));
        divide.setText("/");
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(225, 69, 90));
        multiply.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setText("*");
        multiply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        rest.setBackground(new java.awt.Color(50, 208, 216));
        rest.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        rest.setForeground(new java.awt.Color(255, 255, 255));
        rest.setText("-");
        rest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restActionPerformed(evt);
            }
        });

        seven.setBackground(new java.awt.Color(94, 86, 86));
        seven.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("7");
        seven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(94, 86, 86));
        eight.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("8");
        eight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(94, 86, 86));
        nine.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("9");
        nine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        plus.setBackground(new java.awt.Color(50, 208, 216));
        plus.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(94, 86, 86));
        four.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("4");
        four.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setBackground(new java.awt.Color(94, 86, 86));
        five.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("5");
        five.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(94, 86, 86));
        six.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("6");
        six.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(94, 86, 86));
        one.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("1");
        one.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(94, 86, 86));
        two.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("2");
        two.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(94, 86, 86));
        three.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("3");
        three.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        equal.setBackground(new java.awt.Color(50, 208, 216));
        equal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setText("=");
        equal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(94, 86, 86));
        cero.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cero.setForeground(new java.awt.Color(255, 255, 255));
        cero.setText("0");
        cero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        cero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        point.setBackground(new java.awt.Color(94, 86, 86));
        point.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        point.setForeground(new java.awt.Color(255, 255, 255));
        point.setText(".");
        point.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(104, 104, 104), 4));
        point.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(shownResult, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(shownResult, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(five, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        shownResult.setText("");
        calcul.clearValues();
    }//GEN-LAST:event_clearActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed

        buttonValues(three);
    }//GEN-LAST:event_threeActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        buttonValues(seven);
    }//GEN-LAST:event_sevenActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        int results = calcul.operation();
        String resultsText = Integer.toString(results);
        shownResult.setText(resultsText);
        calcul.clearValues();
        buttonValues(resultsText);
    }//GEN-LAST:event_equalActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        buttonValues(eight);
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        buttonValues(nine);
    }//GEN-LAST:event_nineActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        buttonValues(plus);
        calcul.addToArrayList(plus.getText());
    }//GEN-LAST:event_plusActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        buttonValues(four);
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        buttonValues(five);
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        buttonValues(six);
    }//GEN-LAST:event_sixActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        buttonValues(one);    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        buttonValues(two);
    }//GEN-LAST:event_twoActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        buttonValues(divide);
        calcul.addToArrayList(divide.getText());
    }//GEN-LAST:event_divideActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        buttonValues(multiply);
        calcul.addToArrayList(multiply.getText());
    }//GEN-LAST:event_multiplyActionPerformed

    private void restActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restActionPerformed
        buttonValues(rest);
        calcul.addToArrayList(rest.getText());
    }//GEN-LAST:event_restActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        buttonValues(cero);
    }//GEN-LAST:event_ceroActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorDesign().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cero;
    private javax.swing.JButton clear;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton rest;
    private javax.swing.JButton seven;
    private javax.swing.JLabel shownResult;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    // End of variables declaration//GEN-END:variables
}
