
package ip.address.calculator;

/**
 *
 * @author Dhanush
 */
public class Network_Ranges extends javax.swing.JFrame {

    public Network_Ranges() {
        initComponents();
                
        
        int counter = IP_Calculator.Subnet_Generator;
        
        int temp1 = Integer.parseInt(IP_Calculator.cmb_byte1.getSelectedItem().toString());
        int temp2 = Integer.parseInt(IP_Calculator.cmb_byte2.getSelectedItem().toString());
        int temp3 = Integer.parseInt(IP_Calculator.cmb_byte3.getSelectedItem().toString());
        int temp4 = Integer.parseInt(IP_Calculator.cmb_byte4.getSelectedItem().toString());
             
// Octet 4..................        
        if(IP_Calculator.Octet_position == 4){ 
            
            if(IP_Calculator.txt_class.getText().equalsIgnoreCase("A")){
                temp2 =0; temp3 = 0; temp4 = 0;
            }
            else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("B")){
                temp3 = 0; temp4 = 0;
            }
            else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("C")){
                temp4 = 0;
            }
            
            for(int i = 1; i <= Integer.parseInt(IP_Calculator.txt_tot_subnets.getText()); i++){
          
                if(IP_Calculator.txt_class.getText().equalsIgnoreCase("A")){
                                        
                    if(temp4 > 256 || counter > 256){
                        if(temp3 >= 255){
                            if(temp2 >= 255){
                                break;
                            }
                            else{
                                temp2 += 1;
                                temp4 = 0;
                                counter = IP_Calculator.Subnet_Generator;
                            }
                        }
                        else{
                            temp3 += 1;
                            temp4 = 0;
                            counter = IP_Calculator.Subnet_Generator;
                        }
                    }
                    else{
                        txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                        temp3 + "." + temp4 + "  ____________________ " + 

                                        temp1 + "." + temp2 + "." + temp3 + "." + 
                                        (counter-1) + "\n\n");

                        temp4 = counter;
                        counter += IP_Calculator.Subnet_Generator;
                    }
                }
                
                else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("B")){
                    
                    if(temp4 > 256 || counter > 256){
                        if(temp3 >= 255){
                            break;
                        }
                        else{
                            temp3 += 1;
                            temp4 = 0;
                            counter = IP_Calculator.Subnet_Generator;
                        }
                    }
                    else{
                        txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                        temp3 + "." + temp4 + "  ____________________ " + 

                                        temp1 + "." + temp2 + "." + temp3 + "." + 
                                        ((temp4 + IP_Calculator.Subnet_Generator)-1) + "\n");

                        temp4 = counter;
                        counter += IP_Calculator.Subnet_Generator;
                    }
                }
                
                else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("C")){
                    
                    if(temp4 > 256 || counter > 256){
                        break;
                    }
                    else{
                        txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                        temp3 + "." + temp4 + "  ____________________ " + 

                                        temp1 + "." + temp2 + "." + temp3 + "." + 
                                        ((temp4 + IP_Calculator.Subnet_Generator)-1) + "\n");

                        temp4 = counter;
                        counter += IP_Calculator.Subnet_Generator;
                    }
                }                
            }            
        }
        
// Octet 3................
        else if(IP_Calculator.Octet_position == 3){ 
            
            if(IP_Calculator.txt_class.getText().equalsIgnoreCase("A")){
                temp2 =0; temp3 = 0; temp4 = 0;
            }
            else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("B")){
                temp3 = 0; temp4 = 0;
            }
            else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("C")){
                temp4 = 0;
            }
            
            for(int i = 1; i <= Integer.parseInt(IP_Calculator.txt_tot_subnets.getText()); i++){
          
                if(IP_Calculator.txt_class.getText().equalsIgnoreCase("A")){
                                        
                    if(temp3 > 256 || counter > 256){
                        if(temp2 >= 255){
                            break;
                        }
                        else{
                            temp2 += 1;
                            temp3 = 0;
                            counter = IP_Calculator.Subnet_Generator;
                        }
                    }
                    else{
                        txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                        temp3 + "." + temp4 + "  ____________________ " + 

                                        temp1 + "." + temp2 + "." + ((temp3 + IP_Calculator.Subnet_Generator)-1) + "." 
                                        + 255 + "\n");

                        temp3 = counter;
                        counter += IP_Calculator.Subnet_Generator;
                    }
                }
                
                else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("B")){
                                        
                    if(temp3 > 256 || counter > 256){
                        break;
                    }
                    else{
                        txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                        temp3 + "." + temp4 + "  ____________________ " + 

                                        temp1 + "." + temp2 + "." + ((temp3 + IP_Calculator.Subnet_Generator)-1) + "." 
                                        + 255 + "\n");

                        temp3 = counter;
                        counter += IP_Calculator.Subnet_Generator;
                    }
                }
                
                else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("C")){
                                        
                    if(temp3 > 256 || counter > 256){
                        break;
                    }
                    else{
                        txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                        temp3 + "." + temp4 + "  ____________________ " + 

                                        temp1 + "." + temp2 + "." + ((temp3 + IP_Calculator.Subnet_Generator)-1) + "." 
                                        + 255 + "\n");

                        temp3 = counter;
                        counter += IP_Calculator.Subnet_Generator;
                    }
                }
                
            }
        }
        
// Octet 2................
        else if(IP_Calculator.Octet_position == 2){ 
            
            if(IP_Calculator.txt_class.getText().equalsIgnoreCase("A")){
                temp2 =0; temp3 = 0; temp4 = 0;
            }
            else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("B")){
                temp3 = 0; temp4 = 0;
            }
            else if(IP_Calculator.txt_class.getText().equalsIgnoreCase("C")){
                temp4 = 0;
            }
            
            for(int i = 1; i <= Integer.parseInt(IP_Calculator.txt_tot_subnets.getText()); i++){
                                                  
                if(temp2 > 256 || counter > 256){
                    break;
                }
                else{
                    txtPane.setText(txtPane.getText() + i+") " +temp1 + "." + temp2 + "." +
                                    temp3 + "." + temp4 + "  ____________________ " + 

                                    temp1 + "." + ((temp2 + IP_Calculator.Subnet_Generator)-1) + "." + 255 + "." 
                                    + 255 + "\n");

                    temp2 = counter;
                    counter += IP_Calculator.Subnet_Generator;
                }
            }
        }
                
        
        setResizable(false);
        setTitle("Network Ranges");
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Network Ranges");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, 388, 60));

        btn_back.setBackground(new java.awt.Color(0, 0, 0));
        btn_back.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setFocusable(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 440, 205, -1));

        txtPane.setEditable(false);
        txtPane.setBackground(new java.awt.Color(30, 30, 30));
        txtPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPane.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtPane);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 388, 314));

        jPanel1.setBackground(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed


    public static void main(String args[]) {
        new Network_Ranges();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtPane;
    // End of variables declaration//GEN-END:variables
}
