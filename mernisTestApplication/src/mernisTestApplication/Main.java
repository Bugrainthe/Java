package mernisTestApplication;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("10055245438"),
				"ASLAN",
				"DEM�R",
				1999);
		
		System.out.println("Do�rulma: " + (result ? "Ba�ar�l� giri�" : "Ba�ar�s�z giri�"));
		
	}

}
