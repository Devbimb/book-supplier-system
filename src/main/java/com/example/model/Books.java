package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long bkId;
	
	private String bkname;
	private String bktitle;
	private String bkauthor;
	private String bkpublisher;
	private String bkedition;
	private String bkqantity;
	private String bktype;
	private String bksource;
	private String sourcetype;
	private String sourceName;
	private String sourceAddress;

	@Column(unique = true)
	private long sourcePhone;
	
	private String bkstate;
	private String bkneed;
	
//------------------------------------------------------------------------
	public Books() {
		super();
	}
//------------------------------------------------------------------------	
	public  Books(String bkname, String bktitle, String bkauthor, String bkpublisher, String bkedition,
			String bkqantity, String bktype, String bksource, String sourcetype, String sourceName, String sourceAddress,
			long sourcePhone, String bkstate, String bkneed) {
		super();
		this.bkname = bkname;
		this.bktitle = bktitle;
		this.bkauthor = bkauthor;
		this.bkpublisher = bkpublisher;
		this.bkedition = bkedition;
		this.bkqantity = bkqantity;
		this.bktype = bktype;
		this.bksource = bksource;
		this.sourcetype = sourcetype;
		this.sourceName = sourceName;
		this.sourceAddress = sourceAddress;
		this.sourcePhone = sourcePhone;
		this.bkstate = bkstate;
		this.bkneed = bkneed;
}
//------------------------------------------------------------------------	

	public long getBkId() {
		return bkId;
	}
	
	public void setBkId(long bkId) {
		this.bkId = bkId;
	}

	public String getBkname() {
		return bkname;
	}

	public void setBkname(String bkname) {
		this.bkname = bkname;
	}

	public String getBktitle() {
		return bktitle;
	}

	public void setBktitle(String bktitle) {
		this.bktitle = bktitle;
	}

	public String getBkauthor() {
		return bkauthor;
	}

	public void setBkauthor(String bkauthor) {
		this.bkauthor = bkauthor;
	}

	public String getBkpublisher() {
		return bkpublisher;
	}

	public void setBkpublisher(String bkpublisher) {
		this.bkpublisher = bkpublisher;
	}

	public String getBkedition() {
		return bkedition;
	}

	public void setBkedition(String bkedition) {
		this.bkedition = bkedition;
	}

	public String getBkqantity() {
		return bkqantity;
	}

	public void setBkqantity(String bkqantity) {
		this.bkqantity = bkqantity;
	}

	public String getBktype() {
		return bktype;
	}

	public void setBktype(String bktype) {
		this.bktype = bktype;
	}

	public String getBksource() {
		return bksource;
	}

	public void setBksource(String bksource) {
		this.bksource = bksource;
	}

	public String getSourcetype() {
		return sourcetype;
	}

	public void setSourcetype(String sourcetype) {
		this.sourcetype = sourcetype;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public long getSourcePhone() {
		return sourcePhone;
	}

	public void setSourcePhone(long sourcePhone) {
		this.sourcePhone = sourcePhone;
	}

	public String getBkstate() {
		return bkstate;
	}

	public void setBkstate(String bkstate) {
		this.bkstate = bkstate;
	}

	public String getBkneed() {
		return bkneed;
	}

	public void setBkneed(String bkneed) {
		this.bkneed = bkneed;
	}
	
}
