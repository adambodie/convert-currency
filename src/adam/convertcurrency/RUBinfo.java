/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adam.convertcurrency;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Adam Bodie
 */
public class RUBinfo extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form RUBinfo
     */
    static String rub1k = "RUB1k";
    static String rub5k = "RUB5k";
    static String rub10k = "RUB10k";
    static String rub50k = "RUB50k";
    static String rub1c = "RUB1c";
    static String rub2c = "RUB2c";
    static String rub5c = "RUB5c";
    static String rub10c = "RUB10c";
    static String rub5 = "RUB5";
    static String rub10 = "RUB10";
    static String rub50 = "RUB50";
    static String rub100 = "RUB100";
    static String rub500 = "RUB500";
    static String rub1000 = "RUB1000";
    static String rub5000 = "RUB5000";
    private static Component JFrame;
    
    public RUBinfo() {
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

        rubButtonGroup = new javax.swing.ButtonGroup();
        rubInfoTab = new javax.swing.JTabbedPane();
        infoTab = new javax.swing.JPanel();
        radioButton5 = new javax.swing.JRadioButton(rub5);
        radioButton10 = new javax.swing.JRadioButton(rub10);
        radioButton50 = new javax.swing.JRadioButton(rub50);
        radioButton100 = new javax.swing.JRadioButton(rub100);
        radioButton500 = new javax.swing.JRadioButton(rub500);
        radioButton1000 = new javax.swing.JRadioButton(rub1000);
        radioButton5000 = new javax.swing.JRadioButton(rub5000);
        banknotePicture = new javax.swing.JLabel(createImageIcon(""));
        jSeparator1 = new javax.swing.JSeparator();
        coin = new javax.swing.JLabel();
        radioButton1k = new javax.swing.JRadioButton(rub1k);
        radioButton5k = new javax.swing.JRadioButton(rub50k);
        radioButton10k = new javax.swing.JRadioButton(rub10k);
        radioButton50k = new javax.swing.JRadioButton(rub50k);
        radioButton1c = new javax.swing.JRadioButton(rub1c);
        radioButton2c = new javax.swing.JRadioButton(rub2c);
        radioButton5c = new javax.swing.JRadioButton(rub5c);
        radioButton10c = new javax.swing.JRadioButton(rub10c);
        coinPicture = new javax.swing.JLabel();
        banknote = new javax.swing.JLabel();
        userTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        officialUserLabel = new javax.swing.JLabel();
        unofficialUserLabel = new javax.swing.JLabel();
        ruLabel = new javax.swing.JLabel();
        abLabel = new javax.swing.JLabel();
        soLabel = new javax.swing.JLabel();
        beLabel = new javax.swing.JLabel();
        otherTab = new javax.swing.JPanel();
        isoLabel = new javax.swing.JLabel();
        bankLabel = new javax.swing.JLabel();
        inflationLabel = new javax.swing.JLabel();
        printerLabel = new javax.swing.JLabel();
        subunitLabel = new javax.swing.JLabel();
        subunitLabel2 = new javax.swing.JLabel();
        inflationLabel2 = new javax.swing.JLabel();
        printerLabel2 = new javax.swing.JLabel();
        bankLabel2 = new javax.swing.JLabel();
        isoLabel2 = new javax.swing.JLabel();
        symbolLabel = new javax.swing.JLabel();
        symbolLabel2 = new javax.swing.JLabel();
        rubInfoTitle = new javax.swing.JLabel();

        setTitle("Russian Ruble");

        rubButtonGroup.add(radioButton5);
        radioButton5.setText("руб5");
        radioButton5.setActionCommand(rub5);
        radioButton5.addActionListener(this);

        rubButtonGroup.add(radioButton10);
        radioButton10.setText("руб10");
        radioButton10.setActionCommand(rub10);
        radioButton10.addActionListener(this);

        rubButtonGroup.add(radioButton50);
        radioButton50.setText("руб50");
        radioButton50.setActionCommand(rub50);
        radioButton50.addActionListener(this);

        rubButtonGroup.add(radioButton100);
        radioButton100.setText("руб100");
        radioButton100.setActionCommand(rub100);
        radioButton100.addActionListener(this);

        rubButtonGroup.add(radioButton500);
        radioButton500.setText("руб500");
        radioButton500.setActionCommand(rub500);
        radioButton500.addActionListener(this);

        rubButtonGroup.add(radioButton1000);
        radioButton1000.setText("руб1000");
        radioButton1000.setActionCommand(rub1000);
        radioButton1000.addActionListener(this);

        rubButtonGroup.add(radioButton5000);
        radioButton5000.setText("руб5000");
        radioButton5000.setActionCommand(rub5000);
        radioButton5000.addActionListener(this);

        banknotePicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        coin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        coin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coin.setText("Coin");

        rubButtonGroup.add(radioButton1k);
        radioButton1k.setText("1k");
        radioButton1k.setActionCommand(rub1k);
        radioButton1k.addActionListener(this);

        rubButtonGroup.add(radioButton5k);
        radioButton5k.setText("5k");
        radioButton5k.setActionCommand(rub5k);
        radioButton5k.addActionListener(this);

        rubButtonGroup.add(radioButton10k);
        radioButton10k.setText("10k");
        radioButton10k.setActionCommand(rub10k);
        radioButton10k.addActionListener(this);

        rubButtonGroup.add(radioButton50k);
        radioButton50k.setText("50k");
        radioButton50k.setActionCommand(rub50k);
        radioButton50k.addActionListener(this);

        rubButtonGroup.add(radioButton1c);
        radioButton1c.setText("руб1");
        radioButton1c.setActionCommand(rub1c);
        radioButton1c.addActionListener(this);

        rubButtonGroup.add(radioButton2c);
        radioButton2c.setText("руб2");
        radioButton2c.setActionCommand(rub2c);
        radioButton2c.addActionListener(this);

        rubButtonGroup.add(radioButton5c);
        radioButton5c.setText("руб5");
        radioButton5c.setActionCommand(rub5c);
        radioButton5c.addActionListener(this);

        rubButtonGroup.add(radioButton10c);
        radioButton10c.setText("руб10");
        radioButton10c.setActionCommand(rub10c);
        radioButton10c.addActionListener(this);

        coinPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        banknote.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        banknote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        banknote.setText("Banknote");

        javax.swing.GroupLayout infoTabLayout = new javax.swing.GroupLayout(infoTab);
        infoTab.setLayout(infoTabLayout);
        infoTabLayout.setHorizontalGroup(
            infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(infoTabLayout.createSequentialGroup()
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoTabLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(radioButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton500)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton1000)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioButton5000))
                    .addGroup(infoTabLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoTabLayout.createSequentialGroup()
                                .addComponent(radioButton1k)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton5k)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton10k)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton50k)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton1c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton2c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton5c)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButton10c))
                            .addComponent(coinPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coin, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTabLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTabLayout.createSequentialGroup()
                        .addComponent(banknotePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoTabLayout.createSequentialGroup()
                        .addComponent(banknote, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        infoTabLayout.setVerticalGroup(
            infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banknote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton50)
                    .addComponent(radioButton100)
                    .addComponent(radioButton500)
                    .addComponent(radioButton1000)
                    .addComponent(radioButton5000)
                    .addComponent(radioButton10)
                    .addComponent(radioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(banknotePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioButton50k)
                    .addComponent(radioButton1c)
                    .addComponent(radioButton2c)
                    .addComponent(radioButton5c)
                    .addComponent(radioButton10c)
                    .addComponent(radioButton10k)
                    .addComponent(radioButton5k)
                    .addComponent(radioButton1k))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(coinPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        rubInfoTab.addTab("Info", infoTab);

        officialUserLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        officialUserLabel.setText("Official Users");

        unofficialUserLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unofficialUserLabel.setText("Unofficial Users");

        ruLabel.setText("Russia");

        abLabel.setText("Abkhazia");

        soLabel.setText("South Ossetia");

        beLabel.setText("Belarus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(beLabel)
                    .addComponent(officialUserLabel)
                    .addComponent(unofficialUserLabel)
                    .addComponent(ruLabel)
                    .addComponent(abLabel)
                    .addComponent(soLabel))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(officialUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unofficialUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(beLabel)
                .addContainerGap(421, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout userTabLayout = new javax.swing.GroupLayout(userTab);
        userTab.setLayout(userTabLayout);
        userTabLayout.setHorizontalGroup(
            userTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );
        userTabLayout.setVerticalGroup(
            userTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        rubInfoTab.addTab("Users", userTab);

        isoLabel.setText("ISO 4217 Code:");

        bankLabel.setText("Central Bank:");

        inflationLabel.setText("Inflation:");

        printerLabel.setText("Printer:");

        subunitLabel.setText("Subunit:");

        subunitLabel2.setText("1/100 (kopeyka)");

        inflationLabel2.setText("6.5%");

        printerLabel2.setText("Goznak");

        bankLabel2.setText("Bank of Russia");

        isoLabel2.setText("RUB");

        symbolLabel.setText("Official Currency Symbol:");

        symbolLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RUBsymbol.gif"))); // NOI18N

        javax.swing.GroupLayout otherTabLayout = new javax.swing.GroupLayout(otherTab);
        otherTab.setLayout(otherTabLayout);
        otherTabLayout.setHorizontalGroup(
            otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherTabLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(symbolLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(symbolLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(subunitLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subunitLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(printerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printerLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(inflationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inflationLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(bankLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bankLabel2))
                    .addGroup(otherTabLayout.createSequentialGroup()
                        .addComponent(isoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isoLabel2)))
                .addGap(339, 339, 339))
        );
        otherTabLayout.setVerticalGroup(
            otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherTabLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isoLabel)
                    .addComponent(isoLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankLabel)
                    .addComponent(bankLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subunitLabel)
                    .addComponent(subunitLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inflationLabel)
                    .addComponent(inflationLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printerLabel)
                    .addComponent(printerLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symbolLabel)
                    .addComponent(symbolLabel2))
                .addContainerGap())
        );

        rubInfoTab.addTab("Other", otherTab);

        rubInfoTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rubInfoTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rubInfoTitle.setText("Russian Ruble");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rubInfoTab)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(rubInfoTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rubInfoTitle)
                .addGap(18, 18, 18)
                .addComponent(rubInfoTab))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RUBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RUBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RUBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RUBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RUBinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abLabel;
    private javax.swing.JLabel bankLabel;
    private javax.swing.JLabel bankLabel2;
    private javax.swing.JLabel banknote;
    private javax.swing.JLabel banknotePicture;
    private javax.swing.JLabel beLabel;
    private javax.swing.JLabel coin;
    private javax.swing.JLabel coinPicture;
    private javax.swing.JLabel inflationLabel;
    private javax.swing.JLabel inflationLabel2;
    private javax.swing.JPanel infoTab;
    private javax.swing.JLabel isoLabel;
    private javax.swing.JLabel isoLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel officialUserLabel;
    private javax.swing.JPanel otherTab;
    private javax.swing.JLabel printerLabel;
    private javax.swing.JLabel printerLabel2;
    private javax.swing.JRadioButton radioButton10;
    private javax.swing.JRadioButton radioButton100;
    private javax.swing.JRadioButton radioButton1000;
    private javax.swing.JRadioButton radioButton10c;
    private javax.swing.JRadioButton radioButton10k;
    private javax.swing.JRadioButton radioButton1c;
    private javax.swing.JRadioButton radioButton1k;
    private javax.swing.JRadioButton radioButton2c;
    private javax.swing.JRadioButton radioButton5;
    private javax.swing.JRadioButton radioButton50;
    private javax.swing.JRadioButton radioButton500;
    private javax.swing.JRadioButton radioButton5000;
    private javax.swing.JRadioButton radioButton50k;
    private javax.swing.JRadioButton radioButton5c;
    private javax.swing.JRadioButton radioButton5k;
    private javax.swing.JLabel ruLabel;
    private javax.swing.ButtonGroup rubButtonGroup;
    private javax.swing.JTabbedPane rubInfoTab;
    private javax.swing.JLabel rubInfoTitle;
    private javax.swing.JLabel soLabel;
    private javax.swing.JLabel subunitLabel;
    private javax.swing.JLabel subunitLabel2;
    private javax.swing.JLabel symbolLabel;
    private javax.swing.JLabel symbolLabel2;
    private javax.swing.JLabel unofficialUserLabel;
    private javax.swing.JPanel userTab;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (    radioButton5.isSelected() ||
                radioButton10.isSelected() ||
                radioButton50.isSelected() ||
                radioButton100.isSelected() ||
                radioButton500.isSelected() ||
                radioButton1000.isSelected() ||
                radioButton5000.isSelected()) {
        banknotePicture.setIcon(createImageIcon("/"
                                        + e.getActionCommand()
                                        + ".gif"));
        } else {
            coinPicture.setIcon(createImageIcon("/"
                                        + e.getActionCommand()
                                        + ".gif"));
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = RUBinfo.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            JOptionPane.showMessageDialog(JFrame, "File Not Found", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
  
}
