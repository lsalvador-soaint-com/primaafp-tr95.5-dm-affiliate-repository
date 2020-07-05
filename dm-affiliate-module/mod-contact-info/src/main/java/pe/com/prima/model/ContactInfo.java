package pe.com.prima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contacinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactInfo {
	@Id
	@Column(name = "affiliateid", unique=true, nullable=false)
	private String affiliateId;
	@Column(name = "email", nullable=false)
	private String email;
	@Column(name = "phone", nullable=false)
	private String phone;
	
}