package com.ykc.offer.offer.vo;

import java.util.List;

public class OfferVO {
	
	private int seq = 0;
	private String member_id = null;
	private String member_no = null;
	private String ch_no = null;
	private String input_dtm = null;
	private String mod_dtm = null;
	private int week_num = 0;
	private String offer_typ = null;
	private String offer_val = null;
	private String name = null;
	private String offer_dtm = null;
	private String offer_typ_cd = null;
	
	private List<String> cdList = null;
	private List<String> offerDateList = null;
	
	private List<String> dateSqlList = null;
	
	private String startYM = null; 
	private String endYM = null;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_no() {
		return member_no;
	}
	public void setMember_no(String member_no) {
		this.member_no = member_no;
	}
	public String getCh_no() {
		return ch_no;
	}
	public void setCh_no(String ch_no) {
		this.ch_no = ch_no;
	}
	public String getInput_dtm() {
		return input_dtm;
	}
	public void setInput_dtm(String input_dtm) {
		this.input_dtm = input_dtm;
	}
	public String getMod_dtm() {
		return mod_dtm;
	}
	public void setMod_dtm(String mod_dtm) {
		this.mod_dtm = mod_dtm;
	}
	public int getWeek_num() {
		return week_num;
	}
	public void setWeek_num(int week_num) {
		this.week_num = week_num;
	}
	public String getOffer_typ() {
		return offer_typ;
	}
	public void setOffer_typ(String offer_typ) {
		this.offer_typ = offer_typ;
	}
	public String getOffer_val() {
		return offer_val;
	}
	public void setOffer_val(String offer_val) {
		this.offer_val = offer_val;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOffer_dtm() {
		return offer_dtm;
	}
	public void setOffer_dtm(String offer_dtm) {
		this.offer_dtm = offer_dtm;
	}
	public String getOffer_typ_cd() {
		return offer_typ_cd;
	}
	public void setOffer_typ_cd(String offer_typ_cd) {
		this.offer_typ_cd = offer_typ_cd;
	}
	public List<String> getCdList() {
		return cdList;
	}
	public void setCdList(List<String> cdList) {
		this.cdList = cdList;
	}
		
	public List<String> getOfferDateList() {
		return offerDateList;
	}
	public void setOfferDateList(List<String> offerDateList) {
		this.offerDateList = offerDateList;
	}
	public List<String> getDateSqlList() {
		return dateSqlList;
	}
	public void setDateSqlList(List<String> dateSqlList) {
		this.dateSqlList = dateSqlList;
	}
	public String getStartYM() {
		return startYM;
	}
	public void setStartYM(String startYM) {
		this.startYM = startYM;
	}
	public String getEndYM() {
		return endYM;
	}
	public void setEndYM(String endYM) {
		this.endYM = endYM;
	}
	
	
	
	
	
}
