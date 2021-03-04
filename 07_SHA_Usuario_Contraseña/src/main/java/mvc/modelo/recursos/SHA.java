package mvc.modelo.recursos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import mvc.Usuario;

public class SHA {

	public static Usuario Codificar(Usuario u) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
	
	byte[] usuario = u.getPass().getBytes();
	MessageDigest md;
	md = MessageDigest.getInstance("SHA-512");
	md.update(usuario);
	byte[] haseado = md.digest();
	String mensajeHashHex = javax.xml.bind.DatatypeConverter.printHexBinary(haseado);
	u.setPass(mensajeHashHex);
	return u;
}}
