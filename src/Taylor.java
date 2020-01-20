
import java.util.ArrayList;
import javax.swing.JOptionPane;

//import java.util.ListIterator;
import javax.swing.DefaultListModel;

public class Taylor extends javax.swing.JFrame {
ArrayList<Product> stuff=new ArrayList();
DefaultListModel list = new DefaultListModel();
Product p;
static int index;
static int numprod;
static int price;
    public Taylor() {
        initComponents();
     price=200;
     p=new Dress("");
     stuff.add(p);
     list.addElement(p.getName());
     txtnumber.setText(""+numprod);
     txtindex.setText(""+index);
     
      
    }
   public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midp = 0;

        while (left <= right) {
            midp = (left + right) / 2;
            int result = ((Comparable) a.get(midp)).compareTo(searchValue);

            if (result < 0) {
                left = midp + 1;
            } else {
                right = midp - 1;
            }
        }
       if (((Comparable) a.get(midp)).compareTo(searchValue) < 0) {
          midp++;
       }
        return midp;
    }
     public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size()-1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

    }
    
    
    public final void computetotalprice(){
        price=price+p.sumworth();
        
    }
    public final int getprice(){
    return price;};
    public void clearmenu(){
        txtname.setText("");
        txtfashion.setText("");
        txtcomfort.setText("");
        txtwork.setText("");
        txtmatcosts.setText("");
        txtexclusive.setText("");
        txtprice.setText("");
        txtindex.setText("");
        txtnumber.setText("");
        lblexclusive.setText("");}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblname = new javax.swing.JLabel();
        lblfashion = new javax.swing.JLabel();
        lblcomfort = new javax.swing.JLabel();
        lblwork = new javax.swing.JLabel();
        lblmatcosts = new javax.swing.JLabel();
        lblexclusive = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtfashion = new javax.swing.JTextField();
        txtcomfort = new javax.swing.JTextField();
        txtwork = new javax.swing.JTextField();
        txtmatcosts = new javax.swing.JTextField();
        txtexclusive = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        lblprice = new javax.swing.JLabel();
        lblnumber = new javax.swing.JLabel();
        txtnumber = new javax.swing.JTextField();
        btnfirst = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        lblindex = new javax.swing.JLabel();
        txtindex = new javax.swing.JTextField();
        txtnummaintenances = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMInewdress = new javax.swing.JMenuItem();
        jMInewbag = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIlining = new javax.swing.JMenuItem();
        jMIdecorations = new javax.swing.JMenuItem();
        jMIlock = new javax.swing.JMenuItem();
        jMInoiron = new javax.swing.JMenuItem();
        jMImaintenance = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMISell = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMIexit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        lblname.setText("model name");

        lblfashion.setText("fashion level");

        lblcomfort.setText("comfort level");

        lblwork.setText("working time");

        lblmatcosts.setText("cost of materials");

        txtwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtworkActionPerformed(evt);
            }
        });

        lblprice.setText("selling price ");

        lblnumber.setText("total number of products");

        txtnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumberActionPerformed(evt);
            }
        });

        btnfirst.setText("<|");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprevious.setText("<");
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        lblindex.setText("current index");

        jLabel1.setText("n. maintenance coupons");

        jMenu1.setText("New     ");

        jMInewdress.setText("new dress");
        jMInewdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInewdressActionPerformed(evt);
            }
        });
        jMenu1.add(jMInewdress);

        jMInewbag.setText("new bag");
        jMInewbag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInewbagActionPerformed(evt);
            }
        });
        jMenu1.add(jMInewbag);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Customise    ");

        jMIlining.setText("add lining");
        jMIlining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIliningActionPerformed(evt);
            }
        });
        jMenu2.add(jMIlining);

        jMIdecorations.setText("add decorations");
        jMIdecorations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIdecorationsActionPerformed(evt);
            }
        });
        jMenu2.add(jMIdecorations);

        jMIlock.setText("add safety lock for bag");
        jMIlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIlockActionPerformed(evt);
            }
        });
        jMenu2.add(jMIlock);

        jMInoiron.setText("add noiron tissue for dress");
        jMInoiron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInoironActionPerformed(evt);
            }
        });
        jMenu2.add(jMInoiron);

        jMImaintenance.setText("add maintenance coupons ");
        jMImaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMImaintenanceActionPerformed(evt);
            }
        });
        jMenu2.add(jMImaintenance);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sell     ");

        jMISell.setText("Sell current item");
        jMISell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISellActionPerformed(evt);
            }
        });
        jMenu3.add(jMISell);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Exit");

        jMIexit.setText("Exit program");
        jMIexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIexitActionPerformed(evt);
            }
        });
        jMenu4.add(jMIexit);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnfirst)
                .addGap(46, 46, 46)
                .addComponent(btnprevious)
                .addGap(69, 69, 69)
                .addComponent(btnnext)
                .addGap(51, 51, 51)
                .addComponent(btnlast)
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblcomfort)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblfashion)
                                            .addComponent(lblname)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblwork, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblmatcosts)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblprice)
                                                    .addComponent(lblindex))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(lblexclusive)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfashion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(txtcomfort, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtexclusive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                        .addComponent(txtwork, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtmatcosts, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnummaintenances, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(lblnumber)
                        .addGap(29, 29, 29)
                        .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfashion)
                    .addComponent(txtfashion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcomfort)
                    .addComponent(txtcomfort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblwork)
                    .addComponent(txtwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmatcosts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmatcosts))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtexclusive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexclusive))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprevious)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprice, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnummaintenances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumber)
                    .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblindex))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMInoironActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInoironActionPerformed
     stuff.get(index).addfeatures(); 
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     txtexclusive.setText(""+stuff.get(index).getEasytoiron());
     price=200+2*stuff.get(index).sumworth();
     txtprice.setText(""+price);
    // jMInoiron.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jMInoironActionPerformed

    private void jMImaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMImaintenanceActionPerformed
        stuff.get(index).discountmaintenance();
        if (stuff.get(index) instanceof Dress)
        {txtexclusive.setText(""+stuff.get(index).getEasytoiron());}
        else{txtexclusive.setText(""+stuff.get(index).getSafetoclose());}
        price=200+stuff.get(index).sumworth();
        txtprice.setText(""+price);
        txtnummaintenances.setText(""+Product.getNumberofMaintenance());
       // jMImaintenance.setEnabled(false);

    }//GEN-LAST:event_jMImaintenanceActionPerformed

    private void jMIexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIexitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jMIexitActionPerformed

    private void jMInewdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInewdressActionPerformed
      
      String m=JOptionPane.showInputDialog(this, "Enter dress model");
      
       Product temp =new Dress(m);
       int alreadyinlist= search(stuff,temp );
        if (alreadyinlist >=0)
            
           {JOptionPane.showMessageDialog(this,"bag model is already in the list!");
           clearmenu();
           return; }
           else {
        int locinsert = findInsertPoint(stuff,temp);
        
        stuff.add(locinsert,temp);
        list.add(locinsert, temp.getName());//}     
    
     txtname.setText(temp.getName());     
     txtfashion.setText(""+temp.getFashion());
     txtcomfort.setText(""+temp.getComfort());
     txtwork.setText(""+temp.getWorktime());
     txtmatcosts.setText(""+temp.getMaterialcosts());
     lblexclusive.setText("easiness to iron");
     
     txtexclusive.setText(""+temp.getEasytoiron());
     price=200;
     txtprice.setText(""+price);
     index=locinsert;
     numprod++;
     txtnumber.setText(""+numprod);
     txtindex.setText(""+index);
     //jMIlock.setEnabled(false);
    // jMInoiron.setEnabled(true);
    // jMIlining.setEnabled(true);
    // jMIdecorations.setEnabled(true);
    // jMImaintenance.setEnabled(true);
    }//GEN-LAST:event_jMInewdressActionPerformed
    }// 
    private void jMInewbagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInewbagActionPerformed
       String m=JOptionPane.showInputDialog(this, "Enter bag model");
       Product temp =new Bag(m);
      int alreadyinlist= search(stuff,temp );
        if (alreadyinlist >=0)
            
           {JOptionPane.showMessageDialog(this,"bag model is already in the list!");
           clearmenu();
           return; }
           else 
       { 
        int locinsert = findInsertPoint(stuff,temp);
        
        stuff.add(locinsert,temp);
        list.add(locinsert, temp.getName());//
     txtname.setText(temp.getName());     
     txtfashion.setText(""+temp.getFashion());
     txtcomfort.setText(""+temp.getComfort());
     txtwork.setText(""+temp.getWorktime());
     txtmatcosts.setText(""+temp.getMaterialcosts());
     lblexclusive.setText("safety of closure");
     txtexclusive.setText(""+temp.getSafetoclose());
     price=200;
     txtprice.setText(""+price);
     index=locinsert;
     numprod++;
     txtnumber.setText(""+numprod);
     txtindex.setText(""+index);
     
    }//GEN-LAST:event_jMInewbagActionPerformed
    }
    private void jMIliningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIliningActionPerformed
      stuff.get(index).addlinen(); 
      txtcomfort.setText(""+stuff.get(index).getComfort());
      txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     price=200+stuff.get(index).sumworth();
     txtprice.setText(""+price);
    
    }//GEN-LAST:event_jMIliningActionPerformed

    private void jMIdecorationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIdecorationsActionPerformed
      stuff.get(index).addflowers();
      txtfashion.setText(""+stuff.get(index).getFashion());
      txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
      txtwork.setText(""+stuff.get(index).getWorktime());
     
     price=200+stuff.get(index).sumworth();
     txtprice.setText(""+price);
   
    }//GEN-LAST:event_jMIdecorationsActionPerformed

    private void txtworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtworkActionPerformed

    private void jMIlockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIlockActionPerformed
      stuff.get(index).addfeatures(); 
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     txtexclusive.setText(""+stuff.get(index).getSafetoclose());
    price=200+stuff.get(index).sumworth();
     
     txtprice.setText(""+price); 
    }//GEN-LAST:event_jMIlockActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
       clearmenu();
        index=1;
       
        txtname.setText(stuff.get(index).getName());     
     txtfashion.setText(""+stuff.get(index).getFashion());
     txtcomfort.setText(""+stuff.get(index).getComfort());
     txtwork.setText(""+stuff.get(index).getWorktime());
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     if (stuff.get(index) instanceof Bag){
     lblexclusive.setText("safety of closure");}
     else{lblexclusive.setText("easiness to iron");}
     txtexclusive.setText(""+stuff.get(index).getworth());
     //txtexclusive.setText(""+stuff.get(index).getworth());
    price=200+stuff.get(index).sumworth();
    txtprice.setText(""+price);
    txtnumber.setText(""+numprod);
     txtindex.setText(""+index);
     txtnummaintenances.setText(""+Product.getNumberofMaintenance());
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
       clearmenu();
        index=numprod;
       
        txtname.setText(stuff.get(index).getName());     
     txtfashion.setText(""+stuff.get(index).getFashion());
     txtcomfort.setText(""+stuff.get(index).getComfort());
     txtwork.setText(""+stuff.get(index).getWorktime());
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
    if (stuff.get(index) instanceof Bag){
     lblexclusive.setText("safety of closure");}
     else{lblexclusive.setText("easiness to iron");}
      txtexclusive.setText(""+stuff.get(index).getworth());
    // txtexclusive.setText(""+p.getSafetoclose());
    price=200+stuff.get(index).sumworth();
    txtprice.setText(""+price);
    txtnumber.setText(""+numprod);
     txtindex.setText(""+index);
     txtnummaintenances.setText(""+Product.getNumberofMaintenance());
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
     if (index==numprod){return;}
     if (index<numprod)index++;  
     
        txtname.setText(stuff.get(index).getName());     
     txtfashion.setText(""+stuff.get(index).getFashion());
     txtcomfort.setText(""+stuff.get(index).getComfort());
     txtwork.setText(""+stuff.get(index).getWorktime());
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     if (stuff.get(index) instanceof Bag){
     lblexclusive.setText("safety of closure");}
     else{lblexclusive.setText("easiness to iron");}
      txtexclusive.setText(""+stuff.get(index).getworth());
   price=200+stuff.get(index).sumworth();
    txtprice.setText(""+price);
    txtnumber.setText(""+numprod);
     txtindex.setText(""+index);
     txtnummaintenances.setText(""+Product.getNumberofMaintenance());
     
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
      if (index==1){return;}
     if (index>1)index--;  
     
        txtname.setText(stuff.get(index).getName());     
     txtfashion.setText(""+stuff.get(index).getFashion());
     txtcomfort.setText(""+stuff.get(index).getComfort());
     txtwork.setText(""+stuff.get(index).getWorktime());
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
    if (stuff.get(index) instanceof Bag){
     lblexclusive.setText("safety of closure");}
     else{lblexclusive.setText("easiness to iron");}
      txtexclusive.setText(""+stuff.get(index).getworth());
    price=200+stuff.get(index).sumworth();
    txtprice.setText(""+price);
    txtnumber.setText(""+numprod);
     txtindex.setText(""+index); 
     txtnummaintenances.setText(""+Product.getNumberofMaintenance());
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void jMISellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISellActionPerformed
     if (index==stuff.size()-1){
        stuff.remove(stuff.get(index));
    list.removeElementAt(index);
    numprod--;
    index--;
    clearmenu();
       txtname.setText(stuff.get(index).getName());     
     txtfashion.setText(""+stuff.get(index).getFashion());
     txtcomfort.setText(""+stuff.get(index).getComfort());
     txtwork.setText(""+stuff.get(index).getWorktime());
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     if (stuff.get(index) instanceof Bag){
     lblexclusive.setText("safety of closure");}
     else{lblexclusive.setText("easiness to iron");}
      txtexclusive.setText(""+stuff.get(index).getworth());
    price=200+stuff.get(index).sumworth();
    txtprice.setText(""+price);
    txtnumber.setText(""+numprod);
     txtindex.setText(""+index);}
     else {
         stuff.remove(stuff.get(index));
    list.removeElementAt(index);
    numprod--;
    clearmenu();
       txtname.setText(stuff.get(index).getName());     
     txtfashion.setText(""+stuff.get(index).getFashion());
     txtcomfort.setText(""+stuff.get(index).getComfort());
     txtwork.setText(""+stuff.get(index).getWorktime());
     txtmatcosts.setText(""+stuff.get(index).getMaterialcosts());
     if (stuff.get(index) instanceof Bag){
     lblexclusive.setText("safety of closure");}
     else{lblexclusive.setText("easiness to iron");}
      txtexclusive.setText(""+stuff.get(index).getworth());
    price=200+stuff.get(index).sumworth();
    txtprice.setText(""+price);
    txtnumber.setText(""+numprod);
     txtindex.setText(""+index);}
     
         
     
    
    }//GEN-LAST:event_jMISellActionPerformed

    private void txtnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumberActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    
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
            java.util.logging.Logger.getLogger(Taylor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taylor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taylor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taylor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taylor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMISell;
    private javax.swing.JMenuItem jMIdecorations;
    private javax.swing.JMenuItem jMIexit;
    private javax.swing.JMenuItem jMIlining;
    private javax.swing.JMenuItem jMIlock;
    private javax.swing.JMenuItem jMImaintenance;
    private javax.swing.JMenuItem jMInewbag;
    private javax.swing.JMenuItem jMInewdress;
    private javax.swing.JMenuItem jMInoiron;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblcomfort;
    private javax.swing.JLabel lblexclusive;
    private javax.swing.JLabel lblfashion;
    private javax.swing.JLabel lblindex;
    private javax.swing.JLabel lblmatcosts;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnumber;
    private javax.swing.JLabel lblprice;
    private javax.swing.JLabel lblwork;
    private javax.swing.JTextField txtcomfort;
    private javax.swing.JTextField txtexclusive;
    private javax.swing.JTextField txtfashion;
    private javax.swing.JTextField txtindex;
    private javax.swing.JTextField txtmatcosts;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumber;
    private javax.swing.JTextField txtnummaintenances;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtwork;
    // End of variables declaration//GEN-END:variables
}
