package pe.com.prima.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "affiliate")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Affiliate {
	@Id
	@Column(name = "affiliateid", unique=true, nullable=false)
	private String affiliateId;
	@Column(name = "cuspp", nullable=false)
	private String cuspp;
	@Column(name = "documenttype", nullable=false)
	private String documentType;
	@Column(name = "documentnumber", nullable=false)
	private String documentNumber;
}