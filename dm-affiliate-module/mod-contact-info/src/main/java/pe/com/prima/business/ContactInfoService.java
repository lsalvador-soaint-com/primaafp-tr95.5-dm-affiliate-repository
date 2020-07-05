package pe.com.prima.business;

import java.util.List;

import pe.com.prima.model.ContactInfo;

public interface ContactInfoService {
	
	public ContactInfo getContactInfo (String affiliateId);
	public List<ContactInfo> getContactInfos ();
}