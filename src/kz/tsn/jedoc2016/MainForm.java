package kz.tsn.jedoc2016;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class MainForm extends JFrame {

    MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("Копировать выделение в буфер");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Отмена");
        jPopupMenu1.add(jMenuItem2);

        jMenuItem5.setText("Вставить из буфера");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        jMenuItem3.setText("Копировать выделение в буфер");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        jMenuItem4.setText("Отмена");
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Электронная справка по курсу \"Программирование на Java (NetBeans)\", v2016 (win, linux)");
        setBackground(new java.awt.Color(212, 180, 180));
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/tsn/jedoc2016/java.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, -10, 60, 60);

        jComboBox1.setBackground(new java.awt.Color(238, 240, 245));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox1.setMaximumRowCount(16);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1. Настройка NetBeans и запуск программ", "2. Простейшие программы", "3. Работа с таблицами JTable", "4. Типы данных. Управляющие конструкции", "5. Работа с массивами", "6. Формы, панели, вкладки", "7. Работа со строками", "8. Компоненты работы текстовыми данными", "9. Работа с таймерами, звуком, графикой, треем, потоками, реестром", "10. Многооконные программы", "11. Компоненты списков и выбора", "12. Компоненты работы с числовыми данными", "13. Работа с меню и диалогами", "14. Работа с файлами", "15. Многоклассовые программы" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(80, 20, 650, 30);

        jEditorPane1.setEditable(false);
        jEditorPane1.setBackground(new java.awt.Color(238, 240, 245));
        jEditorPane1.setAlignmentX(1.0F);
        jEditorPane1.setAlignmentY(1.0F);
        jEditorPane1.setComponentPopupMenu(jPopupMenu1);
        jEditorPane1.setMargin(new java.awt.Insets(15, 10, 15, 10));
        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 770, 430);

        jButton1.setText("Найти по тексту");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 510, 150, 23);

        jTextField1.setBackground(new java.awt.Color(238, 240, 245));
        jTextField1.setComponentPopupMenu(jPopupMenu2);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 510, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 224, 163));
        jLabel4.setText("ЧТО ИСКАТЬ:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 510, 110, 20);

        jButton2.setText("Убрать подсветку");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 510, 170, 23);

        jButton3.setText("Выход");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(675, 510, 100, 23);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/tsn/jedoc2016/information.png"))); // NOI18N
        jButton4.setToolTipText("О программе");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(740, 20, 49, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kz/tsn/jedoc2016/fon.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 810, 550);

        setSize(new java.awt.Dimension(818, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // Загрузка локального (из каталога готового jar-файла) rtf-документа в JEditorPane
        {
            try {
                jEditorPane1.setContentType("text/rtf");
                jEditorPane1.setEditable(false);
                jEditorPane1.setText("");
                jEditorPane1.read(getClass().getClassLoader().
                        getResourceAsStream("kz/tsn/jedoc2016/JEDoc/" + jComboBox1.getSelectedItem().toString() + ".rtf"), null);
                jEditorPane1.setCaretPosition(0);
            } catch (Exception ex) {
            }
            jButton1ActionPerformed(null);
        };    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Инициализация программы
        jComboBox1ActionPerformed(null);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // Копировать выделение из jEditorPane1 в буфер обмена
        jEditorPane1.copy();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Подсветка искомого значения
        // Получение содержимого документа
        boolean f = false;
        DefaultStyledDocument doc = (DefaultStyledDocument) jEditorPane1.getDocument();
        MutableAttributeSet attr = new SimpleAttributeSet(); // Атрибуты текста
        StyleConstants.setBackground(attr, new Color(255, 255, 177)); // Установка цвета
        String s2 = jTextField1.getText().toUpperCase(); // Искомый текст большими буквами
        String s = null; // Текст документа
        int d = s2.length(); // Длина искомого текста
        try {
            // Получение текста документа большими буквами
            s = doc.getText(0, doc.getLength()).toUpperCase();
        } catch (BadLocationException ex) {
        }
        int k = 1, k2 = 0; // Инициализация переменных
        while (k > 0) { // Цикл пока находится искомое значение
            k = s.indexOf(s2, k2); // Поиск искомого значения в тексте документа
            if (k > 0) { // Если поиск успешен, то
                // Установка атрибутов тексту документа
                doc.setCharacterAttributes(k, d, attr, false);
                f = true;
                k2 = k + d;
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Убрать подсветку с найденных значений
        jTextField1.setText("");
        jComboBox1ActionPerformed(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Выход
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Копировать выделение в буфер
        jTextField1.copy();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // Вставить из буфера
        jTextField1.paste();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // О программе
        new jDialog1(null, true).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Выход из программы
        jButton3ActionPerformed(null);
    }//GEN-LAST:event_formWindowClosing

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // Нажатие клавиши "Enter"
        int key = evt.getKeyCode(); // Получаем код нажатой клавиши
        if (key == KeyEvent.VK_ENTER) { // Если нажата, клавиша "Enter", то
            // jButton1.requestFocus();
            jButton1ActionPerformed(null);
        }
        }//GEN-LAST:event_jTextField1KeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                final MainForm MainForm1;
                    new MainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
