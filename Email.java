/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_assignment;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;
/**
 *
 * @author BHAVYA
 */
public class Email extends javax.swing.JFrame {
String s50;
String s51;
String s52;

int b;


    /**
     * Creates new form Email
     */
    public Email(String str,String str1,String str2,int n) {
        initComponents();
        s50=str;
        s51=str1;
        s52=str2;
        b=n;
    }
    public void method(){

 String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	Properties props = System.getProperties();
	props.setProperty("mail.smtp.host", "smtp.gmail.com");
	props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	props.setProperty("mail.smtp.socketFactory.fallback", "false");
	props.setProperty("mail.smtp.port", "465");
	props.setProperty("mail.smtp.socketFactory.port", "465");
	props.put("mail.smtp.auth", "true");
	props.put("mail.debug", "true");
	props.put("mail.store.protocol", "pop3");
	props.put("mail.transport.protocol", "smtp");
	 String username = "shreyasejani7@gmail.com";//
	 String password = "tzsk zkcl ioio hzdf";
		try{
			Session session = Session.getDefaultInstance(props, 
                          new Authenticator(){
                             protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(username, password);
                             }});

   // -- Create a new message --
      Message msg = new MimeMessage(session);

   // -- Set the FROM and TO fields --
      msg.setFrom(new InternetAddress("shreyasejani7@gmail.com"));
      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(s52,false));
      msg.setSubject("Quiz Marks");
      msg.setText("YOU HAVE SUBMITTED YOUR EXAM OF  "+s51+"   \n YOUR SCORE :"+String.valueOf(b));
      msg.setSentDate(new Date());
      Transport.send(msg);
      System.out.println("Message sent.");
    }catch (MessagingException e){ 
      System.out.println(e);
    }

}


	/**
	 * @param args the command line arguments
	 */
		
	





    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Email.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Email("a","b","c",0).setVisible(true);
//            }
//        });
//    }
//Email o1=new Email("username","SUBJECT","shreyasejani7@gmail.com",10);
//o1.method();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    }}
