/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rescateanimal.Controllers;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import rescateanimal.Validar;
import rescateanimal.Controllers.ConexionLogin;
import rescateanimal.Models.Usuario;

/**
 *
 * @author ELIETH COLINDRES
 */
public class CORREO_ELECTRONICO {
    //private String password;
    ConexionLogin con1=new ConexionLogin();
    
	private Session session;
        private final Properties props1 = new Properties();
	String host = "localhost";
        int cont=0;
        String[] posibilities = new String[4];
        String[][] arreglo = new String[cont+1][2];
        Validar val=new Validar();
        String enviar1;
    private void init() {
        props1.put("mail.smtp.auth", "true");
        props1.put("mail.smtp.starttls.enable", "true");
        props1.put("mail.smtp.host", "smtp.gmail.com");
        props1.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props1.put("mail.smtp.port", "587");
        props1.put("mail.smtp.mail.sender","astaclover103@gmail.com");
        props1.put("mail.smtp.user", "astaclover103@gmail.com");
        session = Session.getDefaultInstance(props1);
    }
    public void sendEmail(String correo_usu){
		init();
		try{
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress((String)props1.get("mail.smtp.mail.sender")));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(correo_usu));
                    message.setSubject("Recuperacion de Contraseña");
                    message.setText("A continuacion se le dara una serie de digitos para que digite en el programa: "+this.posibilities[0]+" "+this.posibilities[1]+" "+this.posibilities[2]+" "+this.posibilities[3]
                    );
                    Transport t = session.getTransport("smtp");
                    t.connect((String)props1.get("mail.smtp.user"), "emma63194");
                    t.sendMessage(message, message.getAllRecipients());
                    t.close();
                    System.out.println("enviado");
		}catch (MessagingException me){
                        System.out.println("ERROR"+me);
                        
		}
		
    }
    
    public void generar_cod(Integer id){
        
        Random rand = new Random();
        for(int i = 0; i < this.posibilities.length; i++) {
            int randNum = rand.nextInt(126 - 48 + 1) + 48;
            this.posibilities[i] = Character.toString((char) randNum);
        }
        
        Boolean repeated = false;
        for(int i = 0; i < this.posibilities.length; i++) {
            repeated = val.isReapeted(this.posibilities[i], this.posibilities, i);
            if(repeated) {
                do{
                    int randNum = rand.nextInt(126 - 48 + 1) + 48;
                    this.posibilities[i] = Character.toString((char) randNum);  
                    repeated = val.isReapeted(this.posibilities[i], this.posibilities, i);
                }while(repeated);

            }
        }
        enviar1=posibilities[0]+posibilities[1]+posibilities[2]+posibilities[3];
         con1.buscarCodigo();
            System.out.println();
       
         if(val.Existe_codigo(enviar1)==false){
                
                con1.insertarCodigo(enviar1, id);
            }

    }
}
