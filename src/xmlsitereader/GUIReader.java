package xmlsitereader;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 ** @author Curtis Conner
 * Company: Eagle Creek Software
 * Services * Date: 2/27/2014
 * Re-factored by Curtis Conner 7-30-2014
 *
 */
public class GUIReader extends javax.swing.JFrame {

    private XML xml = new XML();
    private Object[][] data;
    private String[] columnNames = {"Line#", "URL", "Extension", "Page", "Document", "Media"};
    private String urlToOpen;
    private String pageTypes = xml.getExtensionsOfType(URLType.Page);
    private String documentTypes = xml.getExtensionsOfType(URLType.Document);
    private String mediaTypes = xml.getExtensionsOfType(URLType.Media);
    private DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
        public boolean isCellEditable(int row, int column) {
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
        fileLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        analyzeButton = new javax.swing.JButton();
        fileField = new javax.swing.JTextField();
        scrollPane = new javax.swing.JScrollPane();
        urlTable = new javax.swing.JTable();
        resultsScrollPane = new javax.swing.JScrollPane();
        resultsTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        allRadioButton = new javax.swing.JRadioButton();
        mediaRadioButton = new javax.swing.JRadioButton();
        documentRadioButton = new javax.swing.JRadioButton();
        pageRadioButton = new javax.swing.JRadioButton();
        openUrlButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        pageTypesLabel = new javax.swing.JLabel();
        documentTypesLabel = new javax.swing.JLabel();
        mediaTypesLabel = new javax.swing.JLabel();
        pageTypesField = new javax.swing.JTextField();
        documentTypesField = new javax.swing.JTextField();
        mediaTypesField = new javax.swing.JTextField();
        updatePageTypeButton = new javax.swing.JButton();
        updateDocumentTypeButton = new javax.swing.JButton();
        updateMediaTypeButton = new javax.swing.JButton();
        resetDocumentTypeButton = new javax.swing.JButton();
        resetMediaTypeButton = new javax.swing.JButton();
        resetPageTypeButton = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();

        allRadioButton.setSelected(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eagle Creek Sitemap Analyzer v1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("guiReaderFrame"); // NOI18N

        fileLabel.setText("File:");

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
        urlTable.getColumnModel().getColumn(0).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(2).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(3).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(4).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(5).setMaxWidth(70);

        resultsTextArea.setColumns(20);
        resultsTextArea.setRows(5);
        resultsScrollPane.setViewportView(resultsTextArea);

        jLabel2.setText("Results:");

        jLabel3.setText("Filter by:");

        filterButtonGroup.add(allRadioButton);
        allRadioButton.setText("All");
        allRadioButton.setEnabled(false);
        allRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRadioButtonActionPerformed(evt);
            }
        });

        filterButtonGroup.add(mediaRadioButton);
        mediaRadioButton.setText("Media");
        mediaRadioButton.setEnabled(false);
        mediaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaRadioButtonActionPerformed(evt);
            }
        });

        filterButtonGroup.add(documentRadioButton);
        documentRadioButton.setText("Document");
        documentRadioButton.setEnabled(false);
        documentRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentRadioButtonActionPerformed(evt);
            }
        });

        filterButtonGroup.add(pageRadioButton);
        pageRadioButton.setText("Page");
        pageRadioButton.setEnabled(false);
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

        titleLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLabel.setText("Eagle Creek SiteMap Analyzer");

        pageTypesLabel.setText("Page Types:");

        documentTypesLabel.setText("Document Types:");

        mediaTypesLabel.setText("Media Types:");

        pageTypesField.setText(pageTypes);
        pageTypesField.setToolTipText("Enter page extensions separated by a comma.");
        pageTypesField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pageTypesField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pageTypesFieldKeyTyped(evt);
            }
        });

        documentTypesField.setText(documentTypes);
        documentTypesField.setToolTipText("Enter document extensions separated by a comma.");
        documentTypesField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                documentTypesFieldKeyTyped(evt);
            }
        });

        mediaTypesField.setText(mediaTypes);
        mediaTypesField.setToolTipText("Enter media extensions separated by a comma.");
        mediaTypesField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mediaTypesFieldKeyTyped(evt);
            }
        });

        updatePageTypeButton.setText("Update");
        updatePageTypeButton.setEnabled(false);
        updatePageTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePageTypeButtonActionPerformed(evt);
            }
        });

        updateDocumentTypeButton.setText("Update");
        updateDocumentTypeButton.setEnabled(false);
        updateDocumentTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDocumentTypeButtonActionPerformed(evt);
            }
        });

        updateMediaTypeButton.setText("Update");
        updateMediaTypeButton.setEnabled(false);
        updateMediaTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMediaTypeButtonActionPerformed(evt);
            }
        });

        resetDocumentTypeButton.setText("Restore Defaults");
        resetDocumentTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetDocumentTypeButtonActionPerformed(evt);
            }
        });

        resetMediaTypeButton.setText("Restore Defaults");
        resetMediaTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMediaTypeButtonActionPerformed(evt);
            }
        });

        resetPageTypeButton.setText("Restore Defaults");
        resetPageTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPageTypeButtonActionPerformed(evt);
            }
        });

        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.setEnabled(false);
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1536, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pageRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(documentRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mediaRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openUrlButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerateReport))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(titleLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(documentTypesLabel)
                                    .addComponent(pageTypesLabel)
                                    .addComponent(mediaTypesLabel)
                                    .addComponent(fileLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(documentTypesField)
                                            .addComponent(mediaTypesField)
                                            .addComponent(pageTypesField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(updatePageTypeButton)
                                            .addComponent(updateDocumentTypeButton)
                                            .addComponent(updateMediaTypeButton)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(browseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resetDocumentTypeButton)
                                    .addComponent(resetMediaTypeButton)
                                    .addComponent(resetPageTypeButton)))
                            .addComponent(analyzeButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseButton)
                    .addComponent(fileLabel)
                    .addComponent(fileField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageTypesLabel)
                    .addComponent(pageTypesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePageTypeButton)
                    .addComponent(resetPageTypeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentTypesLabel)
                    .addComponent(documentTypesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDocumentTypeButton)
                    .addComponent(resetDocumentTypeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mediaTypesLabel)
                    .addComponent(mediaTypesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateMediaTypeButton)
                    .addComponent(resetMediaTypeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(analyzeButton)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(allRadioButton)
                    .addComponent(mediaRadioButton)
                    .addComponent(documentRadioButton)
                    .addComponent(pageRadioButton)
                    .addComponent(openUrlButton)
                    .addComponent(btnGenerateReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(resultsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Method to build table of information based on which radio button is
     * selected
     *
     * @param button
     */
    private void buildTable(String button) {
        URL[] urls;
        switch (button) {
            case "all":
                urls = xml.getURLs();
                break;
            case "page":
                urls = xml.getURLsOfType(URLType.Page);
                break;
            case "document":
                urls = xml.getURLsOfType(URLType.Document);
                break;
            default:
                urls = xml.getURLsOfType(URLType.Media);
                break;
        }

        buildData(urls);

        tableModel.setDataVector(data, columnNames);
        urlTable.getColumnModel().getColumn(0).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(2).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(3).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(4).setMaxWidth(70);
        urlTable.getColumnModel().getColumn(5).setMaxWidth(70);
    }

    /**
     * Method to build an Object[][] from a URL[]
     *
     * @param urls
     */
    private void buildData(URL[] urls) {
        data = new Object[urls.length][columnNames.length];
        for (int i = 0; i < urls.length; i++) {
            for (int j = 0; j < columnNames.length; j++) {
                switch (j) {
                    case 0:
                        data[i][j] = new Integer(i + 1);
                        break;
                    case 1:
                        data[i][j] = urls[i].getURL();
                        break;
                    case 2:
                        data[i][j] = urls[i].getExtension();
                        break;
                    case 3:
                        data[i][j] = urls[i].getURLType() == URLType.Page;
                        break;
                    case 4:
                        data[i][j] = urls[i].getURLType() == URLType.Document;
                        break;
                    case 5:
                        data[i][j] = urls[i].getURLType() == URLType.Media;
                        break;
                    default:
                }
            }
        }
    }

    /**
     * Open JFileChooser to select a .xml file to parse
     *
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
                
                if (chooser.getDescription(chooser.getSelectedFile()).toLowerCase().endsWith(".xml")) {
                    xml.setFile(chooser.getSelectedFile());
                    fileField.setText(xml.getFileName());
                    try {
                        xml.parseXML();
                        analyzeButton.setEnabled(true);
                        analyzeButton.requestFocus();
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
     *
     * @param evt
     */
    private void analyzeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analyzeButtonActionPerformed

        try {
            xml.resetCounts();
            xml.parseXML();
            xml.calculateResults();
            resultsTextArea.setText(xml.printResults());
            buildTable(getSelectedFilterButton().toLowerCase());
            allRadioButton.setEnabled(true);
            pageRadioButton.setEnabled(true);
            documentRadioButton.setEnabled(true);
            mediaRadioButton.setEnabled(true);
            btnGenerateReport.setEnabled(true);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
    }//GEN-LAST:event_analyzeButtonActionPerformed

    private String getSelectedFilterButton() {
        for (Enumeration<AbstractButton> buttons = filterButtonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "All";
    }

    private void fileFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileFieldActionPerformed
    /**
     * Filter table results to show all urls.
     *
     * @param evt
     */
    private void allRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRadioButtonActionPerformed
        buildTable("all");
        openUrlButton.setEnabled(false);
    }//GEN-LAST:event_allRadioButtonActionPerformed
    /**
     * Filter table results to show only urls for media.
     *
     * @param evt
     */
    private void mediaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaRadioButtonActionPerformed
        buildTable("media");
        openUrlButton.setEnabled(false);
    }//GEN-LAST:event_mediaRadioButtonActionPerformed
    /**
     * Filter table results to show only urls for documents
     *
     * @param evt
     */
    private void documentRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentRadioButtonActionPerformed
        buildTable("document");
        openUrlButton.setEnabled(false);
    }//GEN-LAST:event_documentRadioButtonActionPerformed
    /**
     * Filter table results to show only urls for pages
     *
     * @param evt
     */
    private void pageRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pageRadioButtonActionPerformed
        buildTable("page");
        openUrlButton.setEnabled(false);
    }//GEN-LAST:event_pageRadioButtonActionPerformed
    /**
     * Get url of selected row so it can be opened in a browser
     *
     * @param evt
     */
    private void urlTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_urlTableMouseClicked
        JTable tempTable = (JTable) evt.getSource();
        urlToOpen = tempTable.getValueAt(tempTable.getSelectedRow(), tempTable.getSelectedColumn()).toString();
        openUrlButton.setEnabled(true);
    }//GEN-LAST:event_urlTableMouseClicked
    /**
     * Opens default browser to url selected from table.
     *
     * @param evt
     */
    private void openUrlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUrlButtonActionPerformed
        if (urlToOpen != null) {
            try {
                Desktop.getDesktop().browse(new URI(urlToOpen));
            } catch (IOException | URISyntaxException ioe) {
            }
        }
    }//GEN-LAST:event_openUrlButtonActionPerformed
    /**
     * Once text is being changed in the pageTypesField enable its update button
     *
     * @param evt
     */
    private void pageTypesFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pageTypesFieldKeyTyped
        updatePageTypeButton.setEnabled(true);
    }//GEN-LAST:event_pageTypesFieldKeyTyped
    // REFACTOR
    /**
     * Get the new page extension arguments and set them in the XML object
     *
     * @param evt
     */
    private void updatePageTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePageTypeButtonActionPerformed
        String extensions = pageTypesField.getText();
        xml.setExtensionsOfType(extensions, URLType.Page);
        updatePageTypeButton.setEnabled(false);
        resetPageTypeButton.setEnabled(true);

    }//GEN-LAST:event_updatePageTypeButtonActionPerformed
    // REFACTOR
    /**
     * Get the new document extension arguments and set them in the XML object
     *
     * @param evt
     */
    private void updateDocumentTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDocumentTypeButtonActionPerformed
        String extensions = documentTypesField.getText();
        xml.setExtensionsOfType(extensions, URLType.Document);
        updateDocumentTypeButton.setEnabled(false);
        resetDocumentTypeButton.setEnabled(true);
    }//GEN-LAST:event_updateDocumentTypeButtonActionPerformed
    // REFACTOR
    /**
     * Get the new media extension arguments and set them in the XML object
     *
     * @param evt
     */
    private void updateMediaTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMediaTypeButtonActionPerformed
        String extensions = mediaTypesField.getText();
        xml.setExtensionsOfType(extensions, URLType.Media);
        updateMediaTypeButton.setEnabled(false);
        resetMediaTypeButton.setEnabled(true);
    }//GEN-LAST:event_updateMediaTypeButtonActionPerformed
    /**
     * Once text is being changed in the documentTypesField enable its update
     * button
     *
     * @param evt
     */
    private void documentTypesFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_documentTypesFieldKeyTyped
        updateDocumentTypeButton.setEnabled(true);
    }//GEN-LAST:event_documentTypesFieldKeyTyped
    /**
     * Once text is being changed in the mediaTypesField enable its update
 button
     *
     * @param evt
     */
    private void mediaTypesFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mediaTypesFieldKeyTyped
        updateMediaTypeButton.setEnabled(true);
    }//GEN-LAST:event_mediaTypesFieldKeyTyped
    /**
     * Reset page types to the default page types
     *
     * @param evt
     */
    private void resetPageTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPageTypeButtonActionPerformed
        xml.resetExtensionsOfType(URLType.Page);
        pageTypes = xml.getExtensionsOfType(URLType.Page);
        pageTypesField.setText(pageTypes);
    }//GEN-LAST:event_resetPageTypeButtonActionPerformed
    /**
     * Reset media types to the default media types
     *
     * @param evt
     */
    private void resetMediaTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMediaTypeButtonActionPerformed
        xml.resetExtensionsOfType(URLType.Media);
        mediaTypes = xml.getExtensionsOfType(URLType.Media);
        mediaTypesField.setText(mediaTypes);
    }//GEN-LAST:event_resetMediaTypeButtonActionPerformed
    /**
     * Reset document types to the default document types
     *
     * @param evt
     */
    private void resetDocumentTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetDocumentTypeButtonActionPerformed
        xml.resetExtensionsOfType(URLType.Document);
        documentTypes = xml.getExtensionsOfType(URLType.Document);
        documentTypesField.setText(documentTypes);
    }//GEN-LAST:event_resetDocumentTypeButtonActionPerformed
    /**
     * Calls createReport() and generates a report in .csv format
     * Check if file exists and asks to overwrite
     *
     * @param evt
     */
    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        
        JFileChooser newChooser = new JFileChooser();
        int chooserResult = newChooser.showSaveDialog(this); 
        
        switch(chooserResult) {
            case JFileChooser.CANCEL_OPTION :
                break;
            case JFileChooser.APPROVE_OPTION :
                File file = new File(newChooser.getSelectedFile().getAbsolutePath() + ".csv");
                if (!file.exists()) {
                    xml.createReport(file);
                }
                else {
                    int overwrite = JOptionPane.showConfirmDialog(null, "This file already exists. \n Do you want to overwrite this file? ", "Warning", JOptionPane.WARNING_MESSAGE);
                    switch(overwrite) {
                        case JOptionPane.YES_OPTION :
                            xml.createReport(file);
                            break;                       
                    }
                }
                break;
            case JFileChooser.ERROR_OPTION :
                JOptionPane.showMessageDialog(null, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }      
    }//GEN-LAST:event_btnGenerateReportActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            @Override
            public void run() {
                new GUIReader().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JButton analyzeButton;
    private javax.swing.JButton browseButton;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JRadioButton documentRadioButton;
    private javax.swing.JTextField documentTypesField;
    private javax.swing.JLabel documentTypesLabel;
    private javax.swing.JTextField fileField;
    private javax.swing.JLabel fileLabel;
    private javax.swing.ButtonGroup filterButtonGroup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton mediaRadioButton;
    private javax.swing.JTextField mediaTypesField;
    private javax.swing.JLabel mediaTypesLabel;
    private javax.swing.JButton openUrlButton;
    private javax.swing.JRadioButton pageRadioButton;
    private javax.swing.JTextField pageTypesField;
    private javax.swing.JLabel pageTypesLabel;
    private javax.swing.JButton resetDocumentTypeButton;
    private javax.swing.JButton resetMediaTypeButton;
    private javax.swing.JButton resetPageTypeButton;
    private javax.swing.JScrollPane resultsScrollPane;
    private javax.swing.JTextArea resultsTextArea;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateDocumentTypeButton;
    private javax.swing.JButton updateMediaTypeButton;
    private javax.swing.JButton updatePageTypeButton;
    private javax.swing.JTable urlTable;
    // End of variables declaration//GEN-END:variables
}
