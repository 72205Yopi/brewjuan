/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package brewjuan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Anna Reyes
 */
public class historypage extends javax.swing.JFrame {

    int numberOfCustomers = 0,totalProductsSold = 0;
    double todaysIncome = 0.00,totalIncome = 0.00;
    int productSold;
    double income;
    private  historypage history;
    public historypage() {
        this.history = history;
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainpanel = new javax.swing.JPanel();
        customerPanel = new javax.swing.JPanel();
        customer = new javax.swing.JLabel();
        noCustomer = new javax.swing.JLabel();
        customerIconlbl = new javax.swing.JLabel();
        customerPanel2 = new javax.swing.JPanel();
        totalincome = new javax.swing.JLabel();
        totincome = new javax.swing.JLabel();
        incomelblicon = new javax.swing.JLabel();
        customerPanel3 = new javax.swing.JPanel();
        prodsold = new javax.swing.JLabel();
        prodSold = new javax.swing.JLabel();
        soldlbl = new javax.swing.JLabel();
        historyLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("History");

        mainpanel.setBackground(new java.awt.Color(0, 0, 0));
        mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        customerPanel.setBackground(new java.awt.Color(51, 51, 51));
        customerPanel.setForeground(new java.awt.Color(242, 242, 242));

        customer.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        customer.setForeground(new java.awt.Color(242, 242, 242));
        customer.setText("Number of Customers: ");

        noCustomer.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        noCustomer.setForeground(new java.awt.Color(242, 242, 242));
        noCustomer.setText("0");

        customerIconlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/people-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customerIconlbl)
                    .addComponent(customer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanelLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(customerIconlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        customerPanel2.setBackground(new java.awt.Color(51, 51, 51));
        customerPanel2.setForeground(new java.awt.Color(242, 242, 242));

        totalincome.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        totalincome.setForeground(new java.awt.Color(242, 242, 242));
        totalincome.setText("Total Income:  ₱");

        totincome.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        totincome.setForeground(new java.awt.Color(242, 242, 242));
        totincome.setText("0.00");

        incomelblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/totalmoney-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout customerPanel2Layout = new javax.swing.GroupLayout(customerPanel2);
        customerPanel2.setLayout(customerPanel2Layout);
        customerPanel2Layout.setHorizontalGroup(
            customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel2Layout.createSequentialGroup()
                .addComponent(totalincome, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totincome, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(incomelblicon)
                .addGap(60, 60, 60))
        );
        customerPanel2Layout.setVerticalGroup(
            customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(incomelblicon)
                .addGap(35, 35, 35)
                .addGroup(customerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalincome, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totincome))
                .addContainerGap())
        );

        customerPanel3.setBackground(new java.awt.Color(51, 51, 51));
        customerPanel3.setForeground(new java.awt.Color(242, 242, 242));

        prodsold.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        prodsold.setForeground(new java.awt.Color(242, 242, 242));
        prodsold.setText("Total Products Sold: ");

        prodSold.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        prodSold.setForeground(new java.awt.Color(242, 242, 242));
        prodSold.setText("0");

        soldlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sold-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout customerPanel3Layout = new javax.swing.GroupLayout(customerPanel3);
        customerPanel3.setLayout(customerPanel3Layout);
        customerPanel3Layout.setHorizontalGroup(
            customerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanel3Layout.createSequentialGroup()
                .addComponent(prodsold, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prodSold, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanel3Layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(soldlbl)
                .addGap(50, 50, 50))
        );
        customerPanel3Layout.setVerticalGroup(
            customerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(soldlbl)
                .addGap(33, 33, 33)
                .addGroup(customerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodsold, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodSold, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        historyLbl.setBackground(new java.awt.Color(0, 0, 0));
        historyLbl.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        historyLbl.setForeground(new java.awt.Color(255, 255, 255));
        historyLbl.setText("HISTORY");

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(historyLbl)
                .addGap(190, 190, 190)
                .addComponent(backBtn)
                .addGap(52, 52, 52))
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(customerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(customerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(backBtn)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(historyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customerPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        btnspage back = new btnspage(history);
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnMouseClicked
    public void getValues(double inc, int prd){
        income = inc;
        productSold = prd;
    }
    public void loadData(){
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:MySql://localhost:3306/brewjuan";

            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);

            Statement st = con.createStatement();  
            
            String sql = "SELECT SUM(income), SUM(prodSold), MAX(customer)  FROM historytable";
            
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()){
                int customer = rs.getInt(3);
                double income = rs.getDouble(1);
                int prodsold = rs.getInt(2);
                
                noCustomer.setText(String.valueOf(customer));
                prodSold.setText(String.valueOf(prodsold));
                totincome.setText(String.valueOf(income));
            }
            
        }catch (Exception e){
            System.out.println("ERROR" + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(historypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(historypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(historypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(historypage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                historypage frame = new historypage();
                frame.show();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel customer;
    private javax.swing.JLabel customerIconlbl;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JPanel customerPanel2;
    private javax.swing.JPanel customerPanel3;
    private javax.swing.JLabel historyLbl;
    private javax.swing.JLabel incomelblicon;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel noCustomer;
    private javax.swing.JLabel prodSold;
    private javax.swing.JLabel prodsold;
    private javax.swing.JLabel soldlbl;
    private javax.swing.JLabel totalincome;
    private javax.swing.JLabel totincome;
    // End of variables declaration//GEN-END:variables

    }
