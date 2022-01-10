package br.com.devbodybuilder.getninjas.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Validator {
	public boolean emailEhValido(String email) {
		   boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(email);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   return result;
		} 
	
	public boolean cepEhValido(String cep) {
		Pattern pattern = Pattern.compile("[0-9]{5}[- ]?[0-9]{3}");
	    Matcher matcher = pattern.matcher(cep);
	    assertTrue(matcher.matches());
	    if (matcher.matches()) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	
	public boolean celularEhValido(String celular) {
		Pattern pattern = Pattern.compile("[0-9]{2}[- ]?[0-9]{5}[- ]?[0-9]{4}");
	    Matcher matcher = pattern.matcher(celular);
	    assertTrue(matcher.matches());
	    if (matcher.matches()) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
	
	public boolean dataEhValida(String data) {
		Pattern pattern = Pattern.compile("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
	    Matcher matcher = pattern.matcher(data);
	    assertTrue(matcher.matches());
	    if (matcher.matches()) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
}
