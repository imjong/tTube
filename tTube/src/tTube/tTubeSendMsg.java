/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tTube;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author 1class-040
 */
public class tTubeSendMsg extends javax.swing.JFrame {
	String msg;
	String Nickname;
	tTubeMain ttm;
	

	
    public tTubeSendMsg(tTubeMain tTubeMain, String msgUserName) {
    	ttm=tTubeMain;
    	this.Nickname=Nickname;
    	initComponents(msgUserName);
    }
    
    public tTubeSendMsg() {
    	
    	
        initComponents("익명의 누군가");
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String Nickname) {
    	
    	setResizable(false);

        jPanel1 = new javax.swing.JPanel();
        lbSendNickname = new javax.swing.JLabel();
        lbSendTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSendMsg = new javax.swing.JTextArea();
        imgBg = new javax.swing.JLabel();
        lbSendMsg = new javax.swing.JLabel();

        
        lbSendMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tTube/images/icSendMsg.png"))); // NOI18N
        jPanel1.add(lbSendMsg);
        lbSendMsg.setBounds(133, 290, 85, 40);
        lbSendMsg.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mousePressed(java.awt.event.MouseEvent evt) {
                lbSendMsgMouseClicked(evt);
            }
        	
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSendMsgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSendMsgMouseExited(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(360, 420));

        jPanel1.setLayout(null);

        lbSendNickname.setFont(new java.awt.Font("나눔바른고딕", 0, 14)); // NOI18N
        lbSendNickname.setForeground(new java.awt.Color(0, 51, 124));
        jPanel1.add(lbSendNickname);
        lbSendNickname.setBounds(150, 50, 80, 40);
        lbSendNickname.setText(Nickname);

        lbSendTitle.setFont(new java.awt.Font("나눔바른고딕", 1, 14)); // NOI18N
        lbSendTitle.setForeground(new java.awt.Color(0, 51, 124));
        lbSendTitle.setText("받는 사람 :");
        jPanel1.add(lbSendTitle);
        lbSendTitle.setBounds(80, 50, 70, 40);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        taSendMsg.setColumns(20);
        taSendMsg.setFont(new java.awt.Font("나눔바른고딕", 0, 13)); // NOI18N
        taSendMsg.setLineWrap(true);
        taSendMsg.setRows(5);
        taSendMsg.setWrapStyleWord(true);
        taSendMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        taSendMsg.setEditable(true);
        
        jScrollPane1.setViewportView(taSendMsg);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 110, 200, 160);

        imgBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tTube/images/imgMsgBg.png"))); // NOI18N
        imgBg.setText("jLabel1");
        jPanel1.add(imgBg);
        imgBg.setBounds(0, -20, 360, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>          
    
    private void lbSendMsgMouseClicked(java.awt.event.MouseEvent evt) {                    
    	msg=taSendMsg.getText();
    	String user=lbSendNickname.getText();
    	ttm.sendPersMsg(user,msg);
    	this.setVisible(false);
    	taSendMsg.setText("");
    	
    } 

    private void lbSendMsgMouseEntered(java.awt.event.MouseEvent evt) {                                       
    	lbSendMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tTube/images/icSendMsgHover.png")));
    }                                      

    private void lbSendMsgMouseExited(java.awt.event.MouseEvent evt) {                                      
    	lbSendMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tTube/images/icSendMsg.png")));
    }
    
    public void setUser(String user) {
    	this.Nickname=user;
    }
    
	public String getUser() {
	    return Nickname;
	}
		
	
	public String getMsg() {
		msg=taSendMsg.getText();
		return msg;
	}

    
   
    
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
            java.util.logging.Logger.getLogger(tTubeSendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tTubeSendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tTubeSendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tTubeSendMsg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tTubeSendMsg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel imgBg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbSendNickname;
    private javax.swing.JLabel lbSendTitle;
    private javax.swing.JTextArea taSendMsg;
    public javax.swing.JLabel lbSendMsg;
    public int hold;
   
    // End of variables declaration                   
}

