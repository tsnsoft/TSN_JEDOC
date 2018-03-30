package kz.tsn.jedoc2016;

public class jDialog1 extends javax.swing.JDialog {

    public jDialog1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("О программе");
        setAutoRequestFocus(false);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(112, 74, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/tsn/jedoc2016/quit.png"))); // NOI18N
        jButton1.setToolTipText("Закрыть окно");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 110, 40, 23);

        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("<html> <cite>Талипов С.Н., г. Павлодар, 2016 г. </cite><br> <strong> talipovsn@hotmail.com</strong><br> </html>");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 100, 210, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/tsn/jedoc2016/tsn.png"))); // NOI18N
        jLabel1.setToolTipText("Письмо автору");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 60, 60);

        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Электронная справка по Java");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 20, 270, 20);

        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Для платформы NetBeans ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(100, 50, 260, 20);

        jLabel4.setForeground(new java.awt.Color(247, 72, 33));
        jLabel4.setText("Только для использования в учебных целях");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 80, 280, 14);

        jProgressBar1.setIndeterminate(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(110, 40, 230, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/tsn/jedoc2016/fon.png"))); // NOI18N
        jLabel3.setText("sdsfsdfsfsdf");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 370, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 160);

        setSize(new java.awt.Dimension(396, 177));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Закрытие окна "О программе" по кнопке
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // Письмо автору
        new launchMail("talipovsn@hotmail.com?SUBJECT=JavaEDOC2016&BODY=Thank you for your help on Java !!!");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Закрытие окна "О программе"
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
