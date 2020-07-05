package pe.com.prima.business;

import java.util.List;

import pe.com.prima.model.Affiliate;

public interface AffiliateService {
	
	public Affiliate getAfiliate (String affiliateId);
	public List<Affiliate> getAfiliates ();
}