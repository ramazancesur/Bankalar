package wsHastahane;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku;
import tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuCevap;
import tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuIstem;
import tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuProxy;
import tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeleri;
import tr.gov.tcmb.bs.services.bankaSubeOku.Sube;

public class ProjectMainTest {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		BankaSubeOku bankaSubeOku=new BankaSubeOkuProxy();
		BankaSubeOkuIstem param=new BankaSubeOkuIstem();
		param.setBlgTur("TUM");
		BankaSubeOkuCevap cevap=bankaSubeOku.bankaSubeOku(param);
	    List<BankaSubeleri> lstBanka =Arrays.asList(	cevap.getTumCvp());
	    for(BankaSubeleri banka:lstBanka){
	    	System.out.println(banka.getBanka().getBAd());
	    	for(Sube sube:banka.getSube()){
	    		System.out.println("\t"+sube.getSAd()+" "+sube.getAdr());
	    	}
	    	System.out.println("****************"+banka.getBanka().getBAd()+"Subeleri tamamlandý ***********");
	    }
	}

}
