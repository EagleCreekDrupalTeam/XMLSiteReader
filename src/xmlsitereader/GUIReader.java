/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xmlsitereader;

import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cconner
 */
public class GUIReader extends javax.swing.JFrame {

    private XML xml = new XML();
    private Object[][] data;
    private String[] columnNames = {"URL", "Page", "Document", "Image"};
    private String urlToOpen;
    private DefaultTableModel tableModel = new DefaultTableModel(data, columnNames){  
        public boolean isCellEditable(int row, int column){  
        return false;
        }
        public Class<?> getColumnClass(int columnIndex) {
            return data[0][columnIndex].getClass();
        }
    };  

    /**
     * Creates new form GUIReader
     */
    public GUIReader() {
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

        filterButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        analyzeButton = new javax.swing.JButton();
        fileField = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        urlTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        allRadioButton = new javax.swing.JRadioButton();
        imageRadioButton = new javax.swing.JRadioButton();
        documentRadioButton = new javax.swing.JRadioButton();
        pageRadioButton = new javax.swing.JRadioButton();
        openUrlButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        allRadioButton.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eagle Creek Sitemap Analyzer v1.0");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("File:");

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        analyzeButton.setText("Analyze XML");
        analyzeButton.setEnabled(false);
        analyzeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analyzeButtonActionPerformed(evt);
            }
        });

        fileField.setEditable(false);
        fileField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileFieldActionPerformed(evt);
            }
        });

        urlTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        urlTable.setModel(tableModel);
        urlTable.getTableHeader().setReorderingAllowed(false);
        urlTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                urlTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(urlTable);
        urlTable.getColumnModel().getColumn(1).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(2).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(3).setMaxWidth(70);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel2.setText("Results:");

        jLabel3.setText("Filter by:");

        filterButtonGroup.add(allRadioButton);
        allRadioButton.setText("All");
        allRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRadioButtonActionPerformed(evt);
            }
        });

        filterButtonGroup.add(imageRadioButton);
        imageRadioButton.setText("Image");
        imageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageRadioButtonActionPerformed(evt);
            }
        });

        filterButtonGroup.add(documentRadioButton);
        documentRadioButton.setText("Document");
        documentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentRadioButtonActionPerformed(evt);
            }
        });

        filterButtonGroup.add(pageRadioButton);
        pageRadioButton.setText("Page");
        pageRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pageRadioButtonActionPerformed(evt);
            }
        });

        openUrlButton.setText("Open URL");
        openUrlButton.setEnabled(false);
        openUrlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUrlButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1428, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(allRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pageRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(documentRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(imageRadioButton)))
                                .addGap(29, 29, 29)
                                .addComponent(openUrlButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(browseButton)
                                .addGap(18, 18, 18)
                                .addComponent(analyzeButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(jLabel1)
                    .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(analyzeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(allRadioButton)
                    .addComponent(imageRadioButton)
                    .addComponent(documentRadioButton)
                    .addComponent(pageRadioButton)
                    .addComponent(openUrlButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Method to build table of information based on which radio button is selected
     * @param button 
     */
    private void buildTable(String button) {
        URL[] urls;
        switch (button) {
            case "all":
                urls = xml.getURLs();
                break;
            case "page":
                urls = xml.getPageURLs();
                break;
            case "document":
                urls = xml.getDocumentURLs();
                break;
            default:
                urls = xml.getImageURLs();
                break;
        }
        
        buildData(urls);
            
        tableModel.setDataVector(data, columnNames);
        urlTable.getColumnModel().getColumn(1).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(2).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(3).setMaxWidth(70);
    }
    /**
     * Method to build an Object[][] from a URL[]
     * @param urls 
     */
     
    private void buildData(URL[] urls) {
        data = new Object[urls.length][columnNames.length];
        for (int i = 0; i < urls.length; i++) {
            for (int j = 0; j < columnNames.length; j++) {
                switch (j) {
                    case 0:
                        System.out.println(urls[i].getURL());
                        data[i][j] = urls[i].getURL();
                        break;
                    case 1:
                        data[i][j] = urls[i].isPage();
                        System.out.println(urls[i].isPage());
                        break;
                    case 2:
                        data[i][j] = urls[i].isDocument();
                        System.out.println(urls[i].isDocument());
                        break;
                    case 3:
                        data[i][j] = urls[i].isImage();
                        System.out.println(urls[i].isImage());
                        break;
                    default:
                }
            }
        }
    }

/**
 * Open JFileChooser to select a .xml file to parse
 * @param evt 
 */
    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed

        JFileChooser chooser = new JFileChooser();
        int returnOption = chooser.showOpenDialog(this);

        switch (returnOption) {
            case JFileChooser.CANCEL_OPTION:
                
                JOptionPane.showMessageDialog(null, "You must select a file to continue.", "Warning", JOptionPane.WARNING_MESSAGE);
                analyzeButton.setEnabled(false);
                fileField.setText("");
                
                break;
            case JFileChooser.APPROVE_OPTION:
                if (chooser.getTypeDescription(chooser.getSelectedFile()).toLowerCase().contains("xml")) {
                    xml.setFile(chooser.getSelectedFile());
                    fileField.setText(xml.getFileName());
                    try {
                        xml.parseXML();
                        analyzeButton.setEnabled(true);
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You must choose a .xml file.", "Wrong File Type", JOptionPane.INFORMATION_MESSAGE);
                    analyzeButton.setEnabled(false);
                }
                break;
            case JFileChooser.ERROR_OPTION:
                JOptionPane.showMessageDialog(null, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
                analyzeButton.setEnabled(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
                analyzeButton.setEnabled(false);
        }
    }//GEN-LAST:event_browseButtonActionPerformed
    /**
     * Calls parseXML and sets results
     * @param evt 
     */
    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed

        try {            
               
            xml.resetCounts();
            xml.parseXML();
            xml.calculateResults();
            jTextArea1.setText(xml.printResults());
            buildTable("all");            

        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
    }//GEN-LAST:event_analyzeButtonActionPerformed

    private void fileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileFieldActionPerformed
    /**
     * Filter table results to show all urls.
     * @param evt 
     */
    private void allRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRadioButtonActionPerformed
        buildTable("all");
        openUrlButton.setEnabled(false);
    }//GEN-LAST:event_allRadioButtonActionPerformed
    /**
     * Filter table results to show only urls for images.
     * @param evt 
     */
    private void imageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageRadioButtonActionPerformed
       buildTable("iamge");
       openUrlButton.setEnabled(false);
    }//GEN-LAST:event_imageRadioButtonActionPerformed
    /**
     * Filter table results to show only urls for documents
     * @param evt 
     */
    private void documentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentRadioButtonActionPerformed
        buildTable("document");
        openUrlButton.setEnabled(false);
    }//GEN-LAST:event_documentRadioButtonActionPerformed
    /**
     * Filter table results to show only urls for pages
     * @param evt 
     */
    private void pageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageRadioButtonActionPerformed
       buildTable("page");
       openUrlButton.setEnabled(false);
    }//GEN-LAST:event_pageRadioButtonActionPerformed

    private void urlTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlTableMouseClicked
        JTable tempTable = (JTable)evt.getSource();
        urlToOpen = tempTable.getValueAt(tempTable.getSelectedRow(), tempTable.getSelectedColumn()).toString();
        openUrlButton.setEnabled(true);
    }//GEN-LAST:event_urlTableMouseClicked
    /**
     * Opens default browser to url selected from table.
     * @param evt 
     */
    private void openUrlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUrlButtonActionPerformed
        if (urlToOpen != null) {
            try 
            {
                Desktop.getDesktop().browse(new URI(urlToOpen));
            }           
            catch (IOException | URISyntaxException ioe) {}
        }
    }//GEN-LAST:event_openUrlButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUIReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIReader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIReader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JButton analyzeButton;
    private javax.swing.JButton browseButton;
    private javax.swing.JRadioButton documentRadioButton;
    private javax.swing.JTextField fileField;
    private javax.swing.ButtonGroup filterButtonGroup;
    private javax.swing.JRadioButton imageRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton openUrlButton;
    private javax.swing.JRadioButton pageRadioButton;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable urlTable;
    // End of variables declaration//GEN-END:variables
}