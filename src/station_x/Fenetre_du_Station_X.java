/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package station_x;

/**
 *
 * @author idrisse a a
 */
public class Fenetre_du_Station_X extends javax.swing.JFrame {

    /**
     * Creates new form Fenetre_du_Station_X
     */
    double prix_litr=1.0;
    
    public Fenetre_du_Station_X() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        new date_time ();
        TextField_Somme_a_payer_lettre.setText(" ");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Label_date_heure = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextField_Qantite_litre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        B_7 = new javax.swing.JButton();
        B_8 = new javax.swing.JButton();
        B_9 = new javax.swing.JButton();
        B_4 = new javax.swing.JButton();
        B_5 = new javax.swing.JButton();
        B_6 = new javax.swing.JButton();
        B_1 = new javax.swing.JButton();
        B_2 = new javax.swing.JButton();
        B_3 = new javax.swing.JButton();
        B_0 = new javax.swing.JButton();
        B_point = new javax.swing.JButton();
        B_Rectifier = new javax.swing.JButton();
        B_Valider = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TextField_Somme_a_payer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TextField_Somme_a_payer_lettre = new javax.swing.JTextField();
        TextField_prix_litr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Button_Fixer_Changer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Label_date_heure1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Station_X");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Label_date_heure.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Label_date_heure.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Label_date_heure.setText(" dimanche 01 juin 2016 - 10:06:38");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText(" Prix du litre :");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText(" Veuillez entrer la quantite que vous desirez :");

        TextField_Qantite_litre.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        TextField_Qantite_litre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText(" Litre(s)");

        B_7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_7.setText("7");
        B_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_7ActionPerformed(evt);
            }
        });

        B_8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_8.setText("8");
        B_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_8ActionPerformed(evt);
            }
        });

        B_9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_9.setText("9");
        B_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_9ActionPerformed(evt);
            }
        });

        B_4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_4.setText("4");
        B_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_4ActionPerformed(evt);
            }
        });

        B_5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_5.setText("5");
        B_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_5ActionPerformed(evt);
            }
        });

        B_6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_6.setText("6");
        B_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_6ActionPerformed(evt);
            }
        });

        B_1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_1.setText("1");
        B_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_1ActionPerformed(evt);
            }
        });

        B_2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_2.setText("2");
        B_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_2ActionPerformed(evt);
            }
        });

        B_3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_3.setText("3");
        B_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_3ActionPerformed(evt);
            }
        });

        B_0.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_0.setText("0");
        B_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_0ActionPerformed(evt);
            }
        });

        B_point.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_point.setText(".");
        B_point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_pointActionPerformed(evt);
            }
        });

        B_Rectifier.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_Rectifier.setText("Rectifier");
        B_Rectifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RectifierActionPerformed(evt);
            }
        });

        B_Valider.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        B_Valider.setText("Valider");
        B_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ValiderActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText(" Somme à payer :");

        TextField_Somme_a_payer.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        TextField_Somme_a_payer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText(" $ Dollar");

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText(" Votre demande a été approuvée veuillez d'abord payer");

        jLabel9.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel9.setText(" à la caisse. Merci");

        TextField_Somme_a_payer_lettre.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        TextField_Somme_a_payer_lettre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextField_Somme_a_payer_lettre.setText("DOUZE MILLE SIX CENT  Dollar ($12600)");

        TextField_prix_litr.setFont(new java.awt.Font("DialogInput", 1, 16)); // NOI18N
        TextField_prix_litr.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setText(" $ Dollar");

        Button_Fixer_Changer.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Button_Fixer_Changer.setText("Fixer le prix");
        Button_Fixer_Changer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Fixer_ChangerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(TextField_Somme_a_payer)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(B_7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_Rectifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(TextField_Qantite_litre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(B_1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B_2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B_3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(B_0, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B_point, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(B_4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B_Valider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(TextField_Somme_a_payer_lettre, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_date_heure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextField_prix_litr, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Button_Fixer_Changer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_date_heure, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_prix_litr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Fixer_Changer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TextField_Qantite_litre, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_7)
                    .addComponent(B_8)
                    .addComponent(B_9)
                    .addComponent(B_Rectifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_4)
                    .addComponent(B_5)
                    .addComponent(B_6)
                    .addComponent(B_Valider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_1)
                    .addComponent(B_2)
                    .addComponent(B_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_0)
                    .addComponent(B_point))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Somme_a_payer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Somme_a_payer_lettre))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Develloped from :");

        jLabel15.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Idi_Soft Company");

        jLabel23.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Contact us :");

        jLabel22.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("IdiSoft@gmail.com");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Label_date_heure1.setFont(new java.awt.Font("DialogInput", 1, 48)); // NOI18N
        Label_date_heure1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_date_heure1.setText("Station de Lébo");
        Label_date_heure1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label_date_heure1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_date_heure1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_7ActionPerformed
        TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"7");
    }//GEN-LAST:event_B_7ActionPerformed

    private void B_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_8ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"8");
    }//GEN-LAST:event_B_8ActionPerformed

    private void B_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_9ActionPerformed
        TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"9");
    }//GEN-LAST:event_B_9ActionPerformed

    private void B_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_4ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"4");
    }//GEN-LAST:event_B_4ActionPerformed

    private void B_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_5ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"5");
    }//GEN-LAST:event_B_5ActionPerformed

    private void B_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_6ActionPerformed
        TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"6");
    }//GEN-LAST:event_B_6ActionPerformed

    private void B_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_1ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"1");
    }//GEN-LAST:event_B_1ActionPerformed

    private void B_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_2ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"2");
    }//GEN-LAST:event_B_2ActionPerformed

    private void B_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_3ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"3");
    }//GEN-LAST:event_B_3ActionPerformed

    private void B_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_0ActionPerformed
       TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+"0");
    }//GEN-LAST:event_B_0ActionPerformed

    private void B_pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_pointActionPerformed
        TextField_Qantite_litre.setText(TextField_Qantite_litre.getText()+".");
    }//GEN-LAST:event_B_pointActionPerformed

    private void B_RectifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RectifierActionPerformed
        TextField_Qantite_litre.setText(null);
    }//GEN-LAST:event_B_RectifierActionPerformed

    private void B_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ValiderActionPerformed
        prix_litr=Double.parseDouble(TextField_prix_litr.getText());
        
        if( ! TextField_Qantite_litre.getText().isEmpty())
        { double Quntite_litr=Float.parseFloat(TextField_Qantite_litre.getText());
        double Somme_a_payer=Quntite_litr * prix_litr;
        TextField_Somme_a_payer.setText("$ "+Somme_a_payer);
        ConvertierMontantEnLettre c = new ConvertierMontantEnLettre();
        c.setMontant("" + (int)Somme_a_payer + ".00");
        c.calculer_glob();
        TextField_Somme_a_payer_lettre.setText(c.getMontantLettre().toUpperCase() + "Dollar $"+Somme_a_payer);
        }else System.out.println("error");
        
    }//GEN-LAST:event_B_ValiderActionPerformed

    private void Button_Fixer_ChangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Fixer_ChangerActionPerformed
        if(Button_Fixer_Changer.getLabel().contains("Fixer"))
        {    TextField_prix_litr.setEditable(false);
             Button_Fixer_Changer.setText("Changer le prix");
        }
        else 
        {    TextField_prix_litr.setEditable(true);
             Button_Fixer_Changer.setText("Fixer le prix");
        }
    }//GEN-LAST:event_Button_Fixer_ChangerActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_0;
    private javax.swing.JButton B_1;
    private javax.swing.JButton B_2;
    private javax.swing.JButton B_3;
    private javax.swing.JButton B_4;
    private javax.swing.JButton B_5;
    private javax.swing.JButton B_6;
    private javax.swing.JButton B_7;
    private javax.swing.JButton B_8;
    private javax.swing.JButton B_9;
    private javax.swing.JButton B_Rectifier;
    private javax.swing.JButton B_Valider;
    private javax.swing.JButton B_point;
    private javax.swing.JButton Button_Fixer_Changer;
    public static javax.swing.JLabel Label_date_heure;
    public static javax.swing.JLabel Label_date_heure1;
    private javax.swing.JTextField TextField_Qantite_litre;
    private javax.swing.JTextField TextField_Somme_a_payer;
    private javax.swing.JTextField TextField_Somme_a_payer_lettre;
    private javax.swing.JTextField TextField_prix_litr;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}


