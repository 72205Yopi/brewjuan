/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package brewjuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author justi
 */

public class invpage extends javax.swing.JFrame {

    /**
     * Creates new form invpage
     */
    
    public invpage() {
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

        errorid = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        prodID_label = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        prodName_label = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        type_label = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        stock_label = new javax.swing.JLabel();
        txtStocks = new javax.swing.JTextField();
        price_label = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        stat = new javax.swing.JLabel();
        cmbStats = new javax.swing.JComboBox<>();
        inventory_addBtn = new javax.swing.JButton();
        inventory_updateBtn = new javax.swing.JButton();
        inventory_delBtn = new javax.swing.JButton();
        inventory_clearBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "Type", "Stock", "Price", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(1).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
            Table.getColumnModel().getColumn(4).setResizable(false);
            Table.getColumnModel().getColumn(5).setResizable(false);
            Table.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );

        prodID_label.setText("Product ID:");

        prodName_label.setText("Product Name:");

        type_label.setText("Type:");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type...", "Starter", "Pasta", "Sandwinch & Wrap", "Chicken", "Main Course & Bowl", "Stir-Fried Rice", "Burger", "Coffee", "Non-Coffee", "Specialty", "Refreshment" }));

        stock_label.setText("Stock:");

        price_label.setText("Price:");

        stat.setText("Status:");

        cmbStats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Status...", "Available", "Not Available" }));

        inventory_addBtn.setText("Add");
        inventory_addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_addBtnActionPerformed(evt);
            }
        });

        inventory_updateBtn.setText("Update");
        inventory_updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_updateBtnActionPerformed(evt);
            }
        });

        inventory_delBtn.setText("Delete");
        inventory_delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_delBtnActionPerformed(evt);
            }
        });

        inventory_clearBtn.setText("Clear");
        inventory_clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventory_clearBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(inventory_addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(inventory_updateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(inventory_clearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(inventory_delBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(type_label)
                                    .addComponent(prodName_label)
                                    .addComponent(prodID_label))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(stat)
                                    .addComponent(price_label)
                                    .addComponent(stock_label)))
                            .addComponent(search_button))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbStats, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrice)
                            .addComponent(txtStocks, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(search_field))))
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stock_label)
                            .addComponent(txtStocks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price_label)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stat)
                            .addComponent(cmbStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodID_label)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prodName_label)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(type_label)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_button, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inventory_clearBtn)
                        .addComponent(inventory_delBtn))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inventory_addBtn)
                        .addComponent(inventory_updateBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void loadData(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String url = "jdbc:MYSQL://localhost:3306/brewjuan";
        
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
     DefaultTableModel model = new DefaultTableModel(new String[]{"ProductID", 
         "ProductName", "Type", "Price", "Status", "Date"},0);
     Table.setModel(model);
    String sql = "SELECT * FROM inventory";
    ResultSet rs = st.executeQuery(sql);
    String prodname, id, type, price, status,stock, date;
    
    while(rs.next()){
        prodname = rs.getString("ProductName");
        id = rs.getString("ProductID");
        price = rs.getString("Price");
        type = rs.getString("Type");
        status = rs.getString("Status");
        stock = rs.getString("Stock");
        date = rs.getString("Date");
       model.addRow (new Object []{prodname, id, price, type,stock, status, date});
    }
    
    }catch(Exception e){
        
        System.out.println("Error" + e.getMessage());
    }
    
}
    private void inventory_clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_clearBtnActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtName.setText("");
        txtStocks.setText("");
        txtPrice.setText("");
        cmbType.setSelectedItem("Choose Type...");
        cmbStats.setSelectedItem("Choose Status...");
    }//GEN-LAST:event_inventory_clearBtnActionPerformed

    private void inventory_addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_addBtnActionPerformed
        // TODO add your handling code here:
         String id,PN, PR, stock,status, type, query;
       String data[] = {txtID.getText(), txtName.getText(), txtStocks.getText(), txtPrice.getText(),(String)cmbStats.getSelectedItem(), (String) cmbType.getSelectedItem() };

        DefaultTableModel tblModel = (DefaultTableModel)Table.getModel();
        tblModel.addRow(data);
try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String url = "jdbc:MYSQL://localhost:3306/brewjuan";
        
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        
        id = txtID.getText();
        PN = txtName.getText();
        PR = txtPrice.getText();
        stock = txtStocks.getText();
        status =(String) cmbStats.getSelectedItem();
        type = (String) cmbType.getSelectedItem();
        
        
         query = "INSERT INTO inventory (prod_id, prod_name, price, type, status ,stock) VALUES ('" + id + "','" + PN + "', '" + PR + "','" 
                 + type + "','" + status +"','" + stock +"')";
            st.executeUpdate(query);
        
        loadData();
        con.close();
            
            
}catch(Exception e){
            System.out.println("Error "+ e.getMessage());
}
    }//GEN-LAST:event_inventory_addBtnActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        btnspage frame = new btnspage();
        frame.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void inventory_updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_updateBtnActionPerformed
        // TODO add your handling code here:
        String ID;
        int notFound = 0;
        String pn, pr, stock;
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String url = "jdbc:MYSQL://localhost:3306/brewjuan";
        
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        
        ID = search_field.getText();
        if("".equals(ID)){
           errorid.showMessageDialog(new JFrame(), "ID is requred", "Dialog",
                    errorid.ERROR_MESSAGE);
        }else{
            String sql = "SELECT * FROM inventory WHERE prod_id="+ID;
            ResultSet rs = st.executeQuery(sql);
             txtID.setText("");
        txtName.setText("");
        txtPrice.setText("");
        txtStocks.setText("");
        showMessageDialog(null, "Successfully registered.");
        loadData();
        con.close();
       }if (notFound == 0){
           errorid.showMessageDialog(new JFrame(), "Invalid ID", "Dialog",
                    errorid.ERROR_MESSAGE);
       }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
        
    }//GEN-LAST:event_inventory_updateBtnActionPerformed

    private void inventory_delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventory_delBtnActionPerformed
        // TODO add your handling code here:
         String ID;
        int notFound = 0;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String url = "jdbc:MYSQL://localhost:3306/brewjuan";
        
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        ID = search_field.getText();
        if ("".equals(ID)){
            errorid.showMessageDialog(new JFrame(), "ID is requred", "Dialog",
                    errorid.ERROR_MESSAGE);
        }else{
            String sql = "SELECT * FROM inventory WHERE prod_id="+ID;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                notFound = 1;
                String sql2= "DELETE FROM inventory WHERE prod_id="+ID;
                st.executeUpdate(sql2);
                loadData();
                con.close();
               }
            if (notFound == 0){
                errorid.showMessageDialog(new JFrame(), "ID is requred", "Dialog",
                    errorid.ERROR_MESSAGE);
            }
        }
            
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }//GEN-LAST:event_inventory_delBtnActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        // TODO add your handling code here:
        String ID;
        int notFound = 0;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        
        String url = "jdbc:MYSQL://localhost:3306/brewjuan";
        
        String user = "root";
        String pass = "";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        
        ID = search_field.getText();
        if ("".equals(ID)){
            errorid.showMessageDialog(new JFrame(), "ID is requred", "Dialog",
                    errorid.ERROR_MESSAGE);
        }else{
            String sql = "SELECT * FROM inventory WHERE prod_id="+ID;
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
             txtID.setText(rs.getString("id"));
             txtName.setText(rs.getString("PN"));
             txtPrice.setText(rs.getString("PR"));
             txtStocks.setText(rs.getString("stock"));
             notFound = 1;
             con.close();
             }
            if(notFound == 0){
            errorid.showMessageDialog(new JFrame(), "ID is requred", "Dialog",
                    errorid.ERROR_MESSAGE);
        }
        }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }//GEN-LAST:event_search_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(invpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form *inventory_addBtn  
        java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               invpage x = new invpage();
                x.loadData();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JComboBox<String> cmbStats;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JOptionPane errorid;
    private javax.swing.JButton inventory_addBtn;
    private javax.swing.JButton inventory_clearBtn;
    private javax.swing.JButton inventory_delBtn;
    private javax.swing.JButton inventory_updateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel prodID_label;
    private javax.swing.JLabel prodName_label;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_field;
    private javax.swing.JLabel stat;
    private javax.swing.JLabel stock_label;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStocks;
    private javax.swing.JLabel type_label;
    // End of variables declaration//GEN-END:variables
}
