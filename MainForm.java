package examples.com.intelligt.modbus.examples;
import com.intelligt.modbus.jlibmodbus.master.ModbusMaster;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CC1-Server3
 */
public class MainForm extends javax.swing.JFrame {

    
    
     public  static String port1;
     
     public  static int sid,wr,wrval,rr,count,cid,totaldev=0,addedDeviceCount=0;
     public static float scale1;
     public static ModbusMaster m = null;
    private String query;
     
    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jButtonAddDevice1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanelSlaveConfig = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerDid = new javax.swing.JSpinner();
        jButtonAddDevice = new javax.swing.JButton();
        jTextFieldName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxCNo = new javax.swing.JComboBox();
        jPanelChanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxC2U2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxC2P2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerC2S2 = new javax.swing.JSpinner();
        jPanelChanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxC1U1 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jComboBoxC1P1 = new javax.swing.JComboBox();
        jSpinnerC1S1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxDevType = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jButtonAddDevice2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jButtonAddDevice1.setText("Add Device");
        jButtonAddDevice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDevice1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Device");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Pnly Logo.png")));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(650, 500));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 330));

        jPanelSlaveConfig.setBackground(new java.awt.Color(204, 255, 204));
        jPanelSlaveConfig.setBorder(javax.swing.BorderFactory.createTitledBorder("Device details"));
        jPanelSlaveConfig.setMaximumSize(new java.awt.Dimension(350, 500));
        jPanelSlaveConfig.setMinimumSize(new java.awt.Dimension(350, 500));
        jPanelSlaveConfig.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanelSlaveConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Device ID");
        jPanelSlaveConfig.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 86, -1, -1));

        jLabel10.setText("No. of Channels");
        jPanelSlaveConfig.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 85, -1, -1));

        jSpinnerDid.setModel(new javax.swing.SpinnerNumberModel(1, 1, 247, 1));
        jSpinnerDid.setPreferredSize(new java.awt.Dimension(47, 22));
        jPanelSlaveConfig.add(jSpinnerDid, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 82, 103, -1));

        jButtonAddDevice.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAddDevice.setText("Add Device");
        jButtonAddDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDeviceActionPerformed(evt);
            }
        });
        jPanelSlaveConfig.add(jButtonAddDevice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 100, 34));

        jTextFieldName.setForeground(new java.awt.Color(0, 153, 153));
        jTextFieldName.setText("_");
        jTextFieldName.setPreferredSize(new java.awt.Dimension(12, 22));
        jPanelSlaveConfig.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 16, 213, -1));

        jLabel6.setText("Name");
        jPanelSlaveConfig.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 20, -1, -1));

        jComboBoxCNo.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxCNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        jComboBoxCNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCNoActionPerformed(evt);
            }
        });
        jPanelSlaveConfig.add(jComboBoxCNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 82, 123, -1));

        jPanelChanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 2"));
        jPanelChanel2.setEnabled(false);
        jPanelChanel2.setMaximumSize(new java.awt.Dimension(220, 144));
        jPanelChanel2.setMinimumSize(new java.awt.Dimension(220, 144));

        jLabel7.setText("Parameter");

        jComboBoxC2U2.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxC2U2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pH", "µS", "PPB" }));
        jComboBoxC2U2.setEnabled(false);

        jLabel16.setText("Unit");

        jComboBoxC2P2.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxC2P2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pH", "Conductivity", "DO" }));
        jComboBoxC2P2.setEnabled(false);

        jLabel4.setText("Scale Factor");

        jSpinnerC2S2.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerC2S2.setPreferredSize(new java.awt.Dimension(47, 22));

        javax.swing.GroupLayout jPanelChanel2Layout = new javax.swing.GroupLayout(jPanelChanel2);
        jPanelChanel2.setLayout(jPanelChanel2Layout);
        jPanelChanel2Layout.setHorizontalGroup(
            jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxC2U2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerC2S2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxC2P2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanelChanel2Layout.setVerticalGroup(
            jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxC2P2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxC2U2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelChanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerC2S2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(10, 10, 10))
        );

        jPanelSlaveConfig.add(jPanelChanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 114, -1, 136));

        jPanelChanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 1"));
        jPanelChanel1.setMaximumSize(new java.awt.Dimension(220, 144));
        jPanelChanel1.setMinimumSize(new java.awt.Dimension(220, 144));

        jLabel8.setText("Parameter");

        jComboBoxC1U1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxC1U1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pH", "µS", "PPB" }));

        jLabel17.setText("Unit");

        jComboBoxC1P1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxC1P1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pH", "Conductivity", "DO" }));

        jSpinnerC1S1.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, null, 1.0d));
        jSpinnerC1S1.setPreferredSize(new java.awt.Dimension(47, 22));

        jLabel3.setText("Scale Factor");

        javax.swing.GroupLayout jPanelChanel1Layout = new javax.swing.GroupLayout(jPanelChanel1);
        jPanelChanel1.setLayout(jPanelChanel1Layout);
        jPanelChanel1Layout.setHorizontalGroup(
            jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinnerC1S1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxC1U1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxC1P1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChanel1Layout.setVerticalGroup(
            jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxC1P1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboBoxC1U1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelChanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerC1S1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16))
        );

        jPanelSlaveConfig.add(jPanelChanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 114, -1, 136));

        jComboBoxDevType.setForeground(new java.awt.Color(0, 153, 153));
        jComboBoxDevType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "LXT-330 Single Channel", "LXT-330 Dual Channel" }));
        jComboBoxDevType.setPreferredSize(new java.awt.Dimension(137, 22));
        jComboBoxDevType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDevTypeActionPerformed(evt);
            }
        });
        jPanelSlaveConfig.add(jComboBoxDevType, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 48, 160, -1));

        jLabel11.setText("Type of Device");
        jPanelSlaveConfig.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 52, -1, -1));

        jButtonAddDevice2.setBackground(new java.awt.Color(0, 102, 102));
        jButtonAddDevice2.setText("Cancel");
        jButtonAddDevice2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddDevice2ActionPerformed(evt);
            }
        });
        jPanelSlaveConfig.add(jButtonAddDevice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 100, 36));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelSlaveConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelSlaveConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 537, -1));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jPanelSlaveConfig.setVisible(true);
jTextFieldName.setText("");
        
    
    }//GEN-LAST:event_formWindowOpened

    private void jButtonAddDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDeviceActionPerformed
         try {
             addDeviceDetails();
         } catch (SQLException ex) {
             Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        

    }//GEN-LAST:event_jButtonAddDeviceActionPerformed

    public void addDeviceDetails() throws SQLException{
        JdbcSQLiteConnection.tableName = "DeviceDetails";
        JdbcSQLiteConnection.shutdown();
        Connection con1 = JdbcSQLiteConnection.createConnection();
        Statement st = null;
         try {
             st = con1.createStatement();
         } catch (SQLException ex) {
             Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
         }
        int did= Integer.parseInt(jSpinnerDid.getValue().toString());
        int chno=Integer.parseInt(jComboBoxCNo.getSelectedItem().toString());
        String c1p1=(jComboBoxC1P1.getSelectedItem().toString());
        String c1u1=(jComboBoxC1U1.getSelectedItem().toString());
        String c2p2=(jComboBoxC2P2.getSelectedItem().toString());
        String c2u2=(jComboBoxC2U2.getSelectedItem().toString());
        float c1s1= Float.parseFloat(jSpinnerC1S1.getValue().toString());
        float c2s2= Float.parseFloat(jSpinnerC2S2.getValue().toString());
        
        if(c2p2 == null && c2u2 == null)
        {    
         query = "insert into DeviceDetails (dev_name,DevType,dev_ID,no_channel,c1para,c1unit,c1scale) values ('"+jTextFieldName.getText() +"','"+jComboBoxDevType.getSelectedItem()+"',"+did+","+jComboBoxCNo.getSelectedItem().toString()+",'"+c1p1+"','"+c1u1+"',"+c1s1+")";
        }   
        else
        {    
        query = "insert into DeviceDetails(dev_name,DevType,dev_ID,no_channel,c1para,c1unit,c1scale,c2para,c2unit,c2scale) values ("
                     + "'"+jTextFieldName.getText() +"','"+jComboBoxDevType.getSelectedItem()+"',"+did+","+jComboBoxCNo.getSelectedItem().toString()+","
                + "'"+c1p1+"','"+c1u1+"',"+c1s1+",'"+c2p2+"','"+c2u2+"',"+c2s2+")";
        }
            
        //query = "Select * from DeviceDetails";
       System.out.println(query);
         try {
             st.execute(query);
             addedDeviceCount++;     
             //jButtonAddDevice.setEnabled(false);
             JOptionPane.showMessageDialog(null,"Device Added", "Add Device",  JOptionPane.INFORMATION_MESSAGE);    
             jPanelSlaveConfig.setVisible(false);
         } catch (SQLException ex) {
             Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
         }
         con1.close();
    }    

    private void jComboBoxCNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCNoActionPerformed

    }//GEN-LAST:event_jComboBoxCNoActionPerformed

    private void jComboBoxDevTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDevTypeActionPerformed
if(jComboBoxDevType.getSelectedItem() !="LXT-330 Dual Channel")        // TODO add your handling code here:
{
jPanelChanel2.setEnabled(false);
jComboBoxC2P2.setEnabled(false);
jComboBoxC2U2.setEnabled(false);
jComboBoxCNo.setSelectedIndex(0);
jComboBoxCNo.setEnabled(false);
jSpinnerC2S2.setEnabled(false);
}
else
{
jPanelChanel2.setEnabled(true);
jComboBoxC2P2.setEnabled(true);
jComboBoxC2U2.setEnabled(true);
jComboBoxCNo.setSelectedIndex(1);
jComboBoxCNo.setEnabled(true);
jSpinnerC2S2.setEnabled(true);
}       // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDevTypeActionPerformed

    private void jButtonAddDevice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDevice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddDevice1ActionPerformed

    private void jButtonAddDevice2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddDevice2ActionPerformed
         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddDevice2ActionPerformed

    public void populateSlaveConfigPanel(String S)
    {
    
        // TODO add your handling code here:
    }
    
    
    public void populteTable (String r63,Timestamp tm)
            
    {
    }
    
    
    
    /*
    
    
    * @param args the command line arguments
    */
    
    
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddDevice;
    private javax.swing.JButton jButtonAddDevice1;
    private javax.swing.JButton jButtonAddDevice2;
    private javax.swing.JComboBox jComboBoxC1P1;
    private javax.swing.JComboBox jComboBoxC1U1;
    private javax.swing.JComboBox jComboBoxC2P2;
    private javax.swing.JComboBox jComboBoxC2U2;
    private javax.swing.JComboBox jComboBoxCNo;
    private javax.swing.JComboBox jComboBoxDevType;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelChanel1;
    private javax.swing.JPanel jPanelChanel2;
    private javax.swing.JPanel jPanelSlaveConfig;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JSpinner jSpinnerC1S1;
    private javax.swing.JSpinner jSpinnerC2S2;
    private javax.swing.JSpinner jSpinnerDid;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

}
