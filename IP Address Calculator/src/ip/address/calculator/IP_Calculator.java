
package ip.address.calculator;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Dhanush
 */
public class IP_Calculator extends javax.swing.JFrame {

    boolean nextStep = true;
    
    public static int Subnet_Generator;
    public static int Octet_position;
    public static String IP_Address;
    
    public IP_Calculator() {
        initComponents();
        
        setTitle("Network Calculator");
        setLocationRelativeTo(null);
        setResizable(false);
        
        // combo box values setting....
        for(int i = 0; i < 256; i++){
            
            cmb_byte1.addItem(String.valueOf(i));
            cmb_byte2.addItem(String.valueOf(i));
            cmb_byte3.addItem(String.valueOf(i));
            cmb_byte4.addItem(String.valueOf(i));
            
            
            if(i == 0){
                cmb_byte1.removeItemAt(i);
            }
            else if(i > 223){
                cmb_byte1.removeItem(String.valueOf(i));
            }
        }

        btn_netRange.setEnabled(false);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        bgPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmb_subnet_host = new javax.swing.JComboBox<>();
        txt_needed_s_h = new javax.swing.JTextField();
        cmb_byte1 = new javax.swing.JComboBox<>();
        cmb_byte2 = new javax.swing.JComboBox<>();
        cmb_byte3 = new javax.swing.JComboBox<>();
        cmb_byte4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_find = new javax.swing.JButton();
        bgPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_class = new javax.swing.JTextField();
        txt_dsm = new javax.swing.JTextField();
        txt_csm = new javax.swing.JTextField();
        txt_tot_subnets = new javax.swing.JTextField();
        txt_tot_hosts = new javax.swing.JTextField();
        txt_usable_hosts = new javax.swing.JTextField();
        txt_bit_borrow = new javax.swing.JTextField();
        btn_netRange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(20, 20, 20));

        bgPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Network Address");

        cmb_subnet_host.setBackground(new java.awt.Color(102, 102, 102));
        cmb_subnet_host.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmb_subnet_host.setForeground(new java.awt.Color(255, 255, 255));
        cmb_subnet_host.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Needed Subnets", "Needed Hosts", "/" }));
        cmb_subnet_host.setFocusable(false);

        txt_needed_s_h.setBackground(new java.awt.Color(51, 51, 51));
        txt_needed_s_h.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_needed_s_h.setForeground(new java.awt.Color(255, 255, 255));
        txt_needed_s_h.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txt_needed_s_h.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_needed_s_h.setSelectionColor(new java.awt.Color(51, 102, 255));
        txt_needed_s_h.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_needed_s_hKeyTyped(evt);
            }
        });

        cmb_byte1.setFocusable(false);

        cmb_byte2.setFocusable(false);

        cmb_byte3.setFocusable(false);

        cmb_byte4.setFocusable(false);

        javax.swing.GroupLayout bgPanel1Layout = new javax.swing.GroupLayout(bgPanel1);
        bgPanel1.setLayout(bgPanel1Layout);
        bgPanel1Layout.setHorizontalGroup(
            bgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(bgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88))
                    .addGroup(bgPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_subnet_host, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(bgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_needed_s_h, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_byte1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_byte2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_byte3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmb_byte4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        bgPanel1Layout.setVerticalGroup(
            bgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_byte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_byte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_byte3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_byte4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(bgPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_subnet_host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_needed_s_h, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Network Calculator");

        btn_find.setBackground(new java.awt.Color(0, 0, 0));
        btn_find.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setText("Find");
        btn_find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_find.setFocusable(false);
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });

        bgPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address Class");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Default Subnet Mask");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Custom Subnet Mask");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Number of Subnets");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Number of Hosts");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Usable Number of Hosts");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bits Borrowed");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Network Range");

        txt_class.setEditable(false);
        txt_class.setBackground(new java.awt.Color(51, 51, 51));
        txt_class.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_class.setForeground(new java.awt.Color(255, 255, 255));
        txt_class.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_class.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_class.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_dsm.setEditable(false);
        txt_dsm.setBackground(new java.awt.Color(51, 51, 51));
        txt_dsm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_dsm.setForeground(new java.awt.Color(255, 255, 255));
        txt_dsm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_dsm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_dsm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_csm.setEditable(false);
        txt_csm.setBackground(new java.awt.Color(51, 51, 51));
        txt_csm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_csm.setForeground(new java.awt.Color(255, 255, 255));
        txt_csm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_csm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_csm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_tot_subnets.setEditable(false);
        txt_tot_subnets.setBackground(new java.awt.Color(51, 51, 51));
        txt_tot_subnets.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tot_subnets.setForeground(new java.awt.Color(255, 255, 255));
        txt_tot_subnets.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tot_subnets.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_tot_subnets.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_tot_hosts.setEditable(false);
        txt_tot_hosts.setBackground(new java.awt.Color(51, 51, 51));
        txt_tot_hosts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_tot_hosts.setForeground(new java.awt.Color(255, 255, 255));
        txt_tot_hosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tot_hosts.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_tot_hosts.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_usable_hosts.setEditable(false);
        txt_usable_hosts.setBackground(new java.awt.Color(51, 51, 51));
        txt_usable_hosts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_usable_hosts.setForeground(new java.awt.Color(255, 255, 255));
        txt_usable_hosts.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usable_hosts.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_usable_hosts.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txt_bit_borrow.setEditable(false);
        txt_bit_borrow.setBackground(new java.awt.Color(51, 51, 51));
        txt_bit_borrow.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_bit_borrow.setForeground(new java.awt.Color(255, 255, 255));
        txt_bit_borrow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_bit_borrow.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_bit_borrow.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btn_netRange.setBackground(new java.awt.Color(0, 0, 0));
        btn_netRange.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_netRange.setForeground(new java.awt.Color(255, 255, 255));
        btn_netRange.setText("Show Network Ranges");
        btn_netRange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_netRange.setFocusable(false);
        btn_netRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_netRangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgPanel2Layout = new javax.swing.GroupLayout(bgPanel2);
        bgPanel2.setLayout(bgPanel2Layout);
        bgPanel2Layout.setHorizontalGroup(
            bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_netRange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_bit_borrow))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_usable_hosts))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tot_hosts))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tot_subnets))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_csm))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dsm))
                    .addGroup(bgPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_class)))
                .addGap(27, 27, 27))
        );
        bgPanel2Layout.setVerticalGroup(
            bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_class, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dsm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_csm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tot_subnets, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tot_hosts, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_usable_hosts, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_bit_borrow, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_netRange))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bgPanelLayout = new javax.swing.GroupLayout(bgPanel);
        bgPanel.setLayout(bgPanelLayout);
        bgPanelLayout.setHorizontalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_find, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgPanelLayout.setVerticalGroup(
            bgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bgPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_find)
                .addGap(18, 18, 18)
                .addComponent(bgPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_needed_s_hKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_needed_s_hKeyTyped
        // TODO add your handling code here:
        txt_needed_s_h.setBorder(new MatteBorder(1,1,1,1, Color.WHITE));
    }//GEN-LAST:event_txt_needed_s_hKeyTyped

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:

        if(txt_needed_s_h.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fields can't be Empty!","Input Error",
                JOptionPane.ERROR_MESSAGE);
            txt_needed_s_h.setBorder(new MatteBorder(1,1,1,1, Color.red));
            nextStep = false;
        }

        String temp1 = txt_needed_s_h.getText();

        for(int i = 0; i < txt_needed_s_h.getText().length(); i++){
            if((int)temp1.charAt(i) >= 65 && (int)temp1.charAt(i) <= 90 ||
                (int)temp1.charAt(i) >= 97 && (int)temp1.charAt(i) <= 122 || (int)temp1.charAt(i) == 32){
                JOptionPane.showMessageDialog(null, "Please Enter Numbers Characters are not allowed!",
                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
                txt_needed_s_h.setText(null);
                nextStep = false;
            }
            else{
                nextStep = true;
            }
        }

// Finding Address Classs...................................

        if(nextStep){
            
            IP_Address = cmb_byte1.getSelectedItem() + "." + cmb_byte2.getSelectedItem() +
                         "." + cmb_byte3.getSelectedItem() + "." + cmb_byte4.getSelectedItem();
            
            
            String getcmb_Byte1 = String.valueOf(cmb_byte1.getSelectedItem()); // Converted to String.........

            int getByte1_as_int = Integer.parseInt(getcmb_Byte1);       // Converted to Integer.............

            char get_IP_Class = ' ';

            if(getByte1_as_int >= 1 && getByte1_as_int <= 127){
                txt_class.setText("A");
                get_IP_Class = 'A';
            }
            else if(getByte1_as_int >= 128 && getByte1_as_int <= 191){
                txt_class.setText("B");
                get_IP_Class = 'B';
            }
            else if(getByte1_as_int >= 192 && getByte1_as_int <= 223){
                txt_class.setText("C");
                get_IP_Class = 'C';
            }

// Finding Default Subnet Mask..................................

            switch(get_IP_Class){
                case 'A':
                txt_dsm.setText("255.0.0.0");
                break;
                case 'B':
                txt_dsm.setText("255.255.0.0");
                break;
                case 'C':
                txt_dsm.setText("255.255.255.0");
                break;
            }

// Finding Custom Subnet Mask....................................

            String dsm_binary = "";

// Subnets............

            if(cmb_subnet_host.getSelectedIndex() == 0){
                if(get_IP_Class == 'A'){

                    int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();

                    int tot1s = 8 + getBitCount;
                    int valid_len = 32;

                    for(int i = 1; i <= valid_len; i++){
                        if(i <= tot1s){
                            dsm_binary += "1";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                        else{
                            dsm_binary += "0";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                    }

                    System.out.println("CSM : " + dsm_binary);

                    String arr_csmA[] = dsm_binary.split("\\.");

                    String CSM = "";

                    for(String ele:arr_csmA){
                        CSM += Integer.parseInt(ele,2) + ".";
                    }

                    txt_csm.setText(CSM.substring(0,CSM.length()-1));

// Finding Total Number of Subnets...................

                    int total_subnets = (int)Math.pow(2,getBitCount);

                    txt_tot_subnets.setText(String.valueOf(total_subnets));
                    
// Finding Total Number of Hosts...................

                    int total_hosts = (int)Math.pow(2,32 - 8 - getBitCount);

                    txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                    txt_usable_hosts.setText(String.valueOf(total_hosts - 2));
                    
// Finding Total Number of Bits Borrowed..............

                    txt_bit_borrow.setText(String.valueOf(tot1s - 8)); 

// Finding SG and OP..................

                    int tempC = 0;

                    for(int i = dsm_binary.length()-1; i >0; i--){
                        if(dsm_binary.charAt(i) == '1'){
                            tempC += 1;
                        }
                    }

                    
                    if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                        Octet_position = 4;
                    }
                    else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                        Octet_position = 3;
                    }
                    else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                        Octet_position = 2;
                    }
                    else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                        Octet_position = 1;
                    }
                    
                    for(int i = 7; i >= 0; i--){
                        if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                            Subnet_Generator = (int)Math.pow(2, (7-i));
                            break;
                        }
                    }
                    
                    
                    System.out.println("SG " + Subnet_Generator);
                    System.out.println("OP " + Octet_position);
                }
                else if(get_IP_Class == 'B'){

                    int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();

                    int tot1s = 16 + getBitCount;
                    int valid_len = 32;

                    for(int i = 1; i <= valid_len; i++){
                        if(i <= tot1s){
                            dsm_binary += "1";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                        else{
                            dsm_binary += "0";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                    }

                    System.out.println("CSM : " + dsm_binary);

                    String arr_csmA[] = dsm_binary.split("\\.");

                    String CSM = "";

                    for(String ele:arr_csmA){
                        CSM += Integer.parseInt(ele,2) + ".";
                    }

                    txt_csm.setText(CSM.substring(0,CSM.length()-1));
                    
// Finding Total Number of Subnets...................

                    int total_subnets = (int)Math.pow(2,getBitCount);

                    txt_tot_subnets.setText(String.valueOf(total_subnets));
                    
// Finding Total Number of Hosts...................

                    int total_hosts = (int)Math.pow(2,32 - 16 - getBitCount);

                    txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                    txt_usable_hosts.setText(String.valueOf(total_hosts - 2));
                    
// Finding Total Number of Bits Borrowed..............

                    txt_bit_borrow.setText(String.valueOf(tot1s - 16));   
                    
// Finding SG and OP..................

                    int tempC = 0;

                    for(int i = dsm_binary.length()-1; i >0; i--){
                        if(dsm_binary.charAt(i) == '1'){
                            tempC += 1;
                        }
                    }

                    
                    if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                        Octet_position = 4;
                    }
                    else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                        Octet_position = 3;
                    }
                    else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                        Octet_position = 2;
                    }
                    else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                        Octet_position = 1;
                    }
                    
                    for(int i = 7; i >= 0; i--){
                        if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                            Subnet_Generator = (int)Math.pow(2, (7-i));
                            break;
                        }
                    }
                    
                    System.out.println("SG " + Subnet_Generator);
                    System.out.println("OP " + Octet_position);
                }
                else if(get_IP_Class == 'C'){

                    int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();

                    int tot1s = 24 + getBitCount;
                    int valid_len = 32;

                    for(int i = 1; i <= valid_len; i++){
                        if(i <= tot1s){
                            dsm_binary += "1";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                        else{
                            dsm_binary += "0";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                    }

                    System.out.println("CSM : " + dsm_binary);

                    String arr_csmA[] = dsm_binary.split("\\.");

                    String CSM = "";

                    for(String ele:arr_csmA){
                        CSM += Integer.parseInt(ele,2) + ".";
                    }

                    txt_csm.setText(CSM.substring(0,CSM.length()-1));


// Finding Total Number of Subnets...................

                    int total_subnets = (int)Math.pow(2, getBitCount);

                    txt_tot_subnets.setText(String.valueOf(total_subnets));
                    
// Finding Total Number of Hosts...................

                    int total_hosts = (int)Math.pow(2,32 - 24 - getBitCount);

                    txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                    txt_usable_hosts.setText(String.valueOf(total_hosts - 2));
                    
// Finding Total Number of Bits Borrowed..............

                    txt_bit_borrow.setText(String.valueOf(tot1s - 24)); 
                    
// Finding SG and OP..................

                    int tempC = 0;

                    for(int i = dsm_binary.length()-1; i >0; i--){
                        if(dsm_binary.charAt(i) == '1'){
                            tempC += 1;
                        }
                    }

                    
                    if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                        Octet_position = 4;
                    }
                    else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                        Octet_position = 3;
                    }
                    else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                        Octet_position = 2;
                    }
                    else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                        Octet_position = 1;
                    }
                    
                    for(int i = 7; i >= 0; i--){
                        if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                            Subnet_Generator = (int)Math.pow(2, (7-i));
                            break;
                        }
                    }
                   
                    System.out.println("SG " + Subnet_Generator);
                    System.out.println("OP " + Octet_position);
                    
                }                  
            }
            
// Host...............
            
            else if(cmb_subnet_host.getSelectedIndex() == 1){

                if(get_IP_Class == 'A'){

                    int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();
                    int tot1s = 32 - getBitCount;
                    int valid_len = 32;
                    
                    for(int i = 1; i <= valid_len; i++){
                        if(i <= tot1s){
                            dsm_binary += "1";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                        else{
                            dsm_binary += "0";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                    }

                    System.out.println("CSM : " + dsm_binary);

                    String arr_csmA[] = dsm_binary.split("\\.");

                    String CSM = "";

                    for(String ele:arr_csmA){
                        CSM += Integer.parseInt(ele,2) + ".";
                    }

                    txt_csm.setText(CSM.substring(0,CSM.length()-1));


// Finding Total Number of Subnets...................

                    int total_subnets = (int)Math.pow(2, Math.abs((32 - 8) - getBitCount));

                    txt_tot_subnets.setText(String.valueOf(total_subnets));
                    
// Finding Total Number of Hosts...................


                    int total_hosts = (int)Math.pow(2,getBitCount);

                    txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                    txt_usable_hosts.setText(String.valueOf(total_hosts - 2));
                    
// Finding Total Number of Bits Borrowed..............

                    txt_bit_borrow.setText(String.valueOf(tot1s - 8));   
                    
// Finding SG and OP..................

                    int tempC = 0;

                    for(int i = dsm_binary.length()-1; i >0; i--){
                        if(dsm_binary.charAt(i) == '1'){
                            tempC += 1;
                        }
                    }

                    
                    if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                        Octet_position = 4;
                    }
                    else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                        Octet_position = 3;
                    }
                    else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                        Octet_position = 2;
                    }
                    else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                        Octet_position = 1;
                    }
                    
                    for(int i = 7; i >= 0; i--){
                        if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                            Subnet_Generator = (int)Math.pow(2, (7-i));
                            break;
                        }
                    }                   
                    System.out.println("SG " + Subnet_Generator);
                    System.out.println("OP " + Octet_position);                    
                }
                else if(get_IP_Class == 'B'){

                    int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();
                    int tot1s = 32 - getBitCount;
                    int valid_len = 32;
                    
                    for(int i = 1; i <= valid_len; i++){
                        if(i <= tot1s){
                            dsm_binary += "1";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                        else{
                            dsm_binary += "0";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                    }

                    System.out.println("CSM : " + dsm_binary);

                    String arr_csmA[] = dsm_binary.split("\\.");

                    String CSM = "";

                    for(String ele:arr_csmA){
                        CSM += Integer.parseInt(ele,2) + ".";
                    }

                    txt_csm.setText(CSM.substring(0,CSM.length()-1));

                        
// Finding Total Number of Subnets................... 
                        
                    int total_subnets = (int)Math.pow(2, Math.abs((32 - 16) - getBitCount));

                    txt_tot_subnets.setText(String.valueOf(total_subnets));
                    
// Finding Total Number of Hosts...................

                    int total_hosts = (int)Math.pow(2,getBitCount);

                    txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                    txt_usable_hosts.setText(String.valueOf(total_hosts - 2));
                    
// Finding Total Number of Bits Borrowed..............

                    txt_bit_borrow.setText(String.valueOf(tot1s - 16)); 
                    
// Finding SG and OP..................

                    int tempC = 0;

                    for(int i = dsm_binary.length()-1; i >0; i--){
                        if(dsm_binary.charAt(i) == '1'){
                            tempC += 1;
                        }
                    }

                    
                    if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                        Octet_position = 4;
                    }
                    else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                        Octet_position = 3;
                    }
                    else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                        Octet_position = 2;
                    }
                    else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                        Octet_position = 1;
                    }
                    
                    for(int i = 7; i >= 0; i--){
                        if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                            Subnet_Generator = (int)Math.pow(2, (7-i));
                            break;
                        }
                    }
                   
                    System.out.println("SG " + Subnet_Generator);
                    System.out.println("OP " + Octet_position);                    

                }
                else if(get_IP_Class == 'C'){

                    int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();
                    int tot1s = 32 - getBitCount;
                    int valid_len = 32;
                    
                    for(int i = 1; i <= valid_len; i++){
                        if(i <= tot1s){
                            dsm_binary += "1";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                        else{
                            dsm_binary += "0";
                            if(i % 8 == 0 && i != 32){
                                dsm_binary += ".";
                            }
                        }
                    }

                    System.out.println("CSM : " + dsm_binary);

                    String arr_csmA[] = dsm_binary.split("\\.");

                    String CSM = "";

                    for(String ele:arr_csmA){
                        CSM += Integer.parseInt(ele,2) + ".";
                    }

                    txt_csm.setText(CSM.substring(0,CSM.length()-1));


// Finding Total Number of Subnets...................

                    int total_subnets = (int)Math.pow(2,Math.abs((32 - 24) - getBitCount));

                    txt_tot_subnets.setText(String.valueOf(total_subnets));                    
                    
// Finding Total Number of Hosts...................

                    int total_hosts = (int)Math.pow(2,getBitCount);

                    txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                    txt_usable_hosts.setText(String.valueOf(total_hosts - 2));

// Finding Total Number of Bits Borrowed..............

                    txt_bit_borrow.setText(String.valueOf(tot1s - 24));

// Finding SG and OP..................

                    int tempC = 0;

                    for(int i = dsm_binary.length()-1; i >0; i--){
                        if(dsm_binary.charAt(i) == '1'){
                            tempC += 1;
                        }
                    }

                    
                    if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                        Octet_position = 4;
                    }
                    else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                        Octet_position = 3;
                    }
                    else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                        Octet_position = 2;
                    }
                    else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                        Octet_position = 1;
                    }
                    
                    for(int i = 7; i >= 0; i--){
                        if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                            Subnet_Generator = (int)Math.pow(2, (7-i));
                            break;
                        }
                    }
                   
                    System.out.println("SG " + Subnet_Generator);
                    System.out.println("OP " + Octet_position);                    
                    
                }                                    
            }
            
// Slash Notation (/) ................            

            else if(cmb_subnet_host.getSelectedIndex() == 2){
                
                if(get_IP_Class == 'A'){
                    
                    if(Integer.parseInt(txt_needed_s_h.getText()) <= 32){
                        
                        int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();
                        int tot1s = Integer.parseInt(txt_needed_s_h.getText());
                        int valid_len = 32;

                        for(int i = 1; i <= valid_len; i++){
                            if(i <= tot1s){
                                dsm_binary += "1";
                                if(i % 8 == 0 && i != 32){
                                    dsm_binary += ".";
                                }
                            }
                            else{
                                dsm_binary += "0";
                                if(i % 8 == 0 && i != 32){
                                    dsm_binary += ".";
                                }
                            }
                        }

                        System.out.println("CSM : " + dsm_binary);

                        String arr_csmA[] = dsm_binary.split("\\.");

                        String CSM = "";

                        for(String ele:arr_csmA){
                            CSM += Integer.parseInt(ele,2) + ".";
                        }

                        txt_csm.setText(CSM.substring(0,CSM.length()-1));


// Finding Total Number of Subnets...................

                        int tot0s = 32 - tot1s, tempSubC = tot1s;

                        int total_subnets = (int)Math.pow(2, Math.abs(tot1s - 8));

                        txt_tot_subnets.setText(String.valueOf(total_subnets));

// Finding Total Number of Hosts...................

                        int total_hosts = (int)Math.pow(2,(tot0s));

                        txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                        txt_usable_hosts.setText(String.valueOf(total_hosts - 2));

    // Finding Total Number of Bits Borrowed..............

                        txt_bit_borrow.setText(String.valueOf(tot1s - 8));   

    // Finding SG and OP..................

                        int tempC = 0;

                        for(int i = dsm_binary.length()-1; i >0; i--){
                            if(dsm_binary.charAt(i) == '1'){
                                tempC += 1;
                            }
                        }


                        if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                            Octet_position = 4;
                        }
                        else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                            Octet_position = 3;
                        }
                        else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                            Octet_position = 2;
                        }
                        else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                            Octet_position = 1;
                        }

                        for(int i = 7; i >= 0; i--){
                            if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                                Subnet_Generator = (int)Math.pow(2, (7-i));
                                break;
                            }
                        }                   
                        System.out.println("SG " + Subnet_Generator);
                        System.out.println("OP " + Octet_position); 
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Input!",
                                "Invalid Input",JOptionPane.ERROR_MESSAGE);
                        txt_needed_s_h.setBorder(new MatteBorder(1,1,1,1,Color.red));
                    }                     
                }
                else if(get_IP_Class == 'B'){

                    if(Integer.parseInt(txt_needed_s_h.getText()) <= 32){
                        
                        int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();
                        int tot1s = Integer.parseInt(txt_needed_s_h.getText());
                        int valid_len = 32;

                        for(int i = 1; i <= valid_len; i++){
                            if(i <= tot1s){
                                dsm_binary += "1";
                                if(i % 8 == 0 && i != 32){
                                    dsm_binary += ".";
                                }
                            }
                            else{
                                dsm_binary += "0";
                                if(i % 8 == 0 && i != 32){
                                    dsm_binary += ".";
                                }
                            }
                        }

                        System.out.println("CSM : " + dsm_binary);

                        String arr_csmA[] = dsm_binary.split("\\.");

                        String CSM = "";

                        for(String ele:arr_csmA){
                            CSM += Integer.parseInt(ele,2) + ".";
                        }

                        txt_csm.setText(CSM.substring(0,CSM.length()-1));


// Finding Total Number of Subnets...................

                        int tot0s = 32 - tot1s;

                        int total_subnets = (int)Math.pow(2, Math.abs(tot1s - 16));

                        txt_tot_subnets.setText(String.valueOf(total_subnets));

// Finding Total Number of Hosts...................

                        int total_hosts = (int)Math.pow(2,tot0s);

                        txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                        txt_usable_hosts.setText(String.valueOf(total_hosts - 2));

    // Finding Total Number of Bits Borrowed..............

                        txt_bit_borrow.setText(String.valueOf(tot1s - 16));   

    // Finding SG and OP..................

                        int tempC = 0;

                        for(int i = dsm_binary.length()-1; i >0; i--){
                            if(dsm_binary.charAt(i) == '1'){
                                tempC += 1;
                            }
                        }


                        if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                            Octet_position = 4;
                        }
                        else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                            Octet_position = 3;
                        }
                        else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                            Octet_position = 2;
                        }
                        else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                            Octet_position = 1;
                        }

                        for(int i = 7; i >= 0; i--){
                            if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                                Subnet_Generator = (int)Math.pow(2, (7-i));
                                break;
                            }
                        }                   
                        System.out.println("SG " + Subnet_Generator);
                        System.out.println("OP " + Octet_position); 
                    }                   
                    else{
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Input!",
                                "Invalid Input",JOptionPane.ERROR_MESSAGE);
                        txt_needed_s_h.setBorder(new MatteBorder(1,1,1,1,Color.red));
                    }
                    
                }
                else if(get_IP_Class == 'C'){

                    if(Integer.parseInt(txt_needed_s_h.getText()) <= 32){
                        
                        int getBitCount = Integer.toBinaryString(Integer.parseInt(txt_needed_s_h.getText())).length();
                        int tot1s = Integer.parseInt(txt_needed_s_h.getText());
                        int valid_len = 32;

                        for(int i = 1; i <= valid_len; i++){
                            if(i <= tot1s){
                                dsm_binary += "1";
                                if(i % 8 == 0 && i != 32){
                                    dsm_binary += ".";
                                }
                            }
                            else{
                                dsm_binary += "0";
                                if(i % 8 == 0 && i != 32){
                                    dsm_binary += ".";
                                }
                            }
                        }

                        System.out.println("CSM : " + dsm_binary);

                        String arr_csmA[] = dsm_binary.split("\\.");

                        String CSM = "";

                        for(String ele:arr_csmA){
                            CSM += Integer.parseInt(ele,2) + ".";
                        }

                        txt_csm.setText(CSM.substring(0,CSM.length()-1));


// Finding Total Number of Subnets...................

                        int tot0s = 32 - tot1s;

                        int total_subnets = (int)Math.pow(2, Math.abs(tot1s - 24));

                        txt_tot_subnets.setText(String.valueOf(total_subnets));

// Finding Total Number of Hosts...................

                        int total_hosts = (int)Math.pow(2,(tot0s));

                        txt_tot_hosts.setText(String.valueOf(total_hosts)); 
                        txt_usable_hosts.setText(String.valueOf(total_hosts - 2));

// Finding Total Number of Bits Borrowed..............

                        txt_bit_borrow.setText(String.valueOf(tot1s - 24));   

// Finding SG and OP..................

                        int tempC = 0;

                        for(int i = dsm_binary.length()-1; i >0; i--){
                            if(dsm_binary.charAt(i) == '1'){
                                tempC += 1;
                            }
                        }


                        if((32 - tempC) >= 1 && (32 - tempC) <= 8){
                            Octet_position = 4;
                        }
                        else if((32 - tempC) >= 9 && (32 - tempC) <= 16){
                            Octet_position = 3;
                        }
                        else if((32 - tempC) >= 17 && (32 - tempC) <= 24){
                            Octet_position = 2;
                        }
                        else if((32 - tempC) >= 25 && (32 - tempC) <= 32){
                            Octet_position = 1;
                        }

                        for(int i = 7; i >= 0; i--){
                            if(arr_csmA[Octet_position-1].charAt(i) == '1'){
                                Subnet_Generator = (int)Math.pow(2, (7-i));
                                break;
                            }
                        }                   
                        System.out.println("SG " + Subnet_Generator);
                        System.out.println("OP " + Octet_position); 
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Please Enter a Valid Input!",
                                "Invalid Input",JOptionPane.ERROR_MESSAGE);
                        txt_needed_s_h.setBorder(new MatteBorder(1,1,1,1,Color.red));
                    }
                }
            }
            
            btn_netRange.setEnabled(true);
        }
    }//GEN-LAST:event_btn_findActionPerformed

    private void btn_netRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_netRangeActionPerformed
        // TODO add your handling code here:
        new Network_Ranges();
        System.out.println(Subnet_Generator);
    }//GEN-LAST:event_btn_netRangeActionPerformed

    public static void main(String args[]) {
        new IP_Calculator();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel bgPanel1;
    private javax.swing.JPanel bgPanel2;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_netRange;
    public static javax.swing.JComboBox<String> cmb_byte1;
    public static javax.swing.JComboBox<String> cmb_byte2;
    public static javax.swing.JComboBox<String> cmb_byte3;
    public static javax.swing.JComboBox<String> cmb_byte4;
    private javax.swing.JComboBox<String> cmb_subnet_host;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_bit_borrow;
    public static javax.swing.JTextField txt_class;
    private javax.swing.JTextField txt_csm;
    private javax.swing.JTextField txt_dsm;
    private javax.swing.JTextField txt_needed_s_h;
    private javax.swing.JTextField txt_tot_hosts;
    public static javax.swing.JTextField txt_tot_subnets;
    private javax.swing.JTextField txt_usable_hosts;
    // End of variables declaration//GEN-END:variables
}
