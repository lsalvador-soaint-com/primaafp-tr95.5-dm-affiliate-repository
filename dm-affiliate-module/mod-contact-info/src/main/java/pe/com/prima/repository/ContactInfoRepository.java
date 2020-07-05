package pe.com.prima.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.prima.model.ContactInfo;

@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, String>{
	
	List<ContactInfo> findAll();
	
	Optional<ContactInfo> findById(String id);
	
}