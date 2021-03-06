package com.example.productmngmt.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "custom_seq")
public class CustomSequence {

	@Id
	private String id;
	private Long proSeq;
	private Long userSeq;
	private Long blackListTokenSeq;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getProSeq() {
		return proSeq;
	}

	public void setProSeq(Long proSeq) {
		this.proSeq = proSeq;
	}

	public Long getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(Long userSeq) {
		this.userSeq = userSeq;
	}

	public Long getBlackListTokenSeq() {
		return blackListTokenSeq;
	}

	public void setBlackListTokenSeq(Long blackListTokenSeq) {
		this.blackListTokenSeq = blackListTokenSeq;
	}

}
