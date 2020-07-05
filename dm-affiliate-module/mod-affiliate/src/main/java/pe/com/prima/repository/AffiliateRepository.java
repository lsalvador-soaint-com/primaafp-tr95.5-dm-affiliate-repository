package pe.com.prima.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.com.prima.model.Affiliate;

@Repository
public interface AffiliateRepository extends JpaRepository<Affiliate, String>{
	
	List<Affiliate> findAll();

}