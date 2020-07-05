package pe.com.prima.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pe.com.prima.model.Affiliate;
import pe.com.prima.repository.AffiliateRepository;

@Service
@Slf4j
public class AffiliateServiceImpl implements AffiliateService {
	
	@Autowired
	private AffiliateRepository afiliateRepository;

	public Affiliate getAfiliate(String affiliateId) {

		//Afiliate bean = afiliateRepository.findById(affiliateId);
		//System.out.println("entro al metodo y afiliadoRepository:"+afiliadoRepository);
		
		return null;
	}

	public List<Affiliate> getAfiliates() {
		log.info("Metodo:getAfiliates - inicio");
		List<Affiliate> lista = afiliateRepository.findAll();
		log.info("lista:"+lista);
		log.info("Metodo:getAfiliates - fin");
		return lista;
	}
	

}
