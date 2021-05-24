package mernisTestApplication;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("10055245438"),
				"ASLAN",
				"DEMÝR",
				1999);
		
		System.out.println("Doðrulma: " + (result ? "Baþarýlý giriþ" : "Baþarýsýz giriþ"));
		
	}

}
