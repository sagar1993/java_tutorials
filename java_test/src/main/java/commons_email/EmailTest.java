package commons_email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

/*To send email via google smtp server
 * To use 
 * allow less secure app 
 * https://myaccount.google.com/lesssecureapps
 * */

public class EmailTest {

	public static void main(String[] args) throws EmailException {
		MultipartEmail();
	}

	public static void simpleEmail() throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("patni.sagar12@gmail.com", "SagarPatni22293"));
		email.setSSLOnConnect(true);
		email.setFrom("patni.sagar12@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("patni.sagar12@gmail.com");
		email.send();
	}

	public static void MultipartEmail() throws EmailException {

		EmailAttachment attachment = new EmailAttachment();
		attachment.setPath("test.jpg");
		attachment.setDisposition(EmailAttachment.ATTACHMENT);
		attachment.setDescription("My image");
		attachment.setName("Image");

		// Create the email message
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("patni.sagar12@gmail.com", "SagarPatni22293"));
		email.setSSLOnConnect(true);
		email.addTo("patni.sagar12@gmail.com");
		email.setFrom("patni.sagar12@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		
		// add the attachment
		email.attach(attachment);

		// send the email
		email.send();

	}
}
