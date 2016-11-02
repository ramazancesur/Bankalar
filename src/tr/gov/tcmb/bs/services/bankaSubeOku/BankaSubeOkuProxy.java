package tr.gov.tcmb.bs.services.bankaSubeOku;

public class BankaSubeOkuProxy implements tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku {
  private String _endpoint = null;
  private tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku bankaSubeOku = null;
  
  public BankaSubeOkuProxy() {
    _initBankaSubeOkuProxy();
  }
  
  public BankaSubeOkuProxy(String endpoint) {
    _endpoint = endpoint;
    _initBankaSubeOkuProxy();
  }
  
  private void _initBankaSubeOkuProxy() {
    try {
      bankaSubeOku = (new tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuServiceLocator()).getbankaSubeOku();
      if (bankaSubeOku != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)bankaSubeOku)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)bankaSubeOku)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (bankaSubeOku != null)
      ((javax.xml.rpc.Stub)bankaSubeOku)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOku getBankaSubeOku() {
    if (bankaSubeOku == null)
      _initBankaSubeOkuProxy();
    return bankaSubeOku;
  }
  
  public tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuCevap bankaSubeOku(tr.gov.tcmb.bs.services.bankaSubeOku.BankaSubeOkuIstem parameters) throws java.rmi.RemoteException{
    if (bankaSubeOku == null)
      _initBankaSubeOkuProxy();
    return bankaSubeOku.bankaSubeOku(parameters);
  }
  
  
}