package pe.com.prima.expose;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pe.com.prima.business.AffiliateService;
import pe.com.prima.business.ContactInfoService;
import pe.com.prima.model.Affiliate;
import pe.com.prima.model.ContactInfo;

@RestController
@Slf4j
public class AffiliateController {
	
	@Autowired
	private AffiliateService afiliateService;
	
	@Autowired
	private ContactInfoService contactInfoService;
	
	/*
	@GetMapping("/saludo")
	public ResponseEntity<String> getHola(){
		log.info("------------- ms -inicio ---------------");
		String hola = "holaaaaassss";
		log.info("------------- ms - fin ---------------");
		return new ResponseEntity<String>(hola,HttpStatus.OK); 
	}
	*/
	@GetMapping("/consultarAfiliados")
	public ResponseEntity<List<Affiliate>> getAfiliados(){
		log.info("------------- ms - inicio ---------------");
		List<Affiliate> lista = afiliateService.getAfiliates();
		log.info("lista:"+lista);
		log.info("------------- ms - fin ---------------");
		return new ResponseEntity<List<Affiliate>>(lista,HttpStatus.OK); 
	}
	
	@GetMapping("/consultarContactInfos")
	public ResponseEntity<List<ContactInfo>> getContactInfos(){
		log.info("------------- mi - inicio ---------------");
		List<ContactInfo> lista = contactInfoService.getContactInfos();
		log.info("lista:"+lista);
		log.info("------------- ms - fin ---------------");
		return new ResponseEntity<List<ContactInfo>>(lista,HttpStatus.OK); 
	}
	
}