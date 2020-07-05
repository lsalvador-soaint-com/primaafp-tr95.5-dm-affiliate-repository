package pe.com.prima.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pe.com.prima.model.ContactInfo;
import pe.com.prima.repository.ContactInfoRepository;

@Service
@Slf4j
public class ContactInfoServiceImpl implements ContactInfoService {
	
	@Autowired
	private ContactInfoRepository contactInfoRepository;

	public ContactInfo getContactInfo(String affiliateId) {

		Optional<ContactInfo> optional = contactInfoRepository.findById(affiliateId);
		//System.out.println("entro al metodo y afiliadoRepository:"+afiliadoRepository);
		return optional.get();
	}

	public List<ContactInfo> getContactInfos() {
		log.info("Metodo:getContactInfos - inicio");
		List<ContactInfo> lista = contactInfoRepository.findAll();
		log.info("lista:"+lista);
		log.info("Metodo:getContactInfos - fin");
		return lista;
	}
	
}
