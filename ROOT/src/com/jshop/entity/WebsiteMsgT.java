package com.jshop.entity;

// Generated 2012-8-27 13:29:59 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * WebsiteMsgT generated by hbm2java
 */
public class WebsiteMsgT implements java.io.Serializable {

	private String msgid;
	private String msgtousername;
	private String msgfromuserid;
	private String msgfromusrname;
	private String msgtextid;
	private String state;
	private String title;
	private Date createtime;
	private String msgstate;

	public WebsiteMsgT() {
	}

	public WebsiteMsgT(String msgid, String msgtousername,
			String msgfromuserid, String msgfromusrname, String msgtextid,
			String state, String title, Date createtime, String msgstate) {
		this.msgid = msgid;
		this.msgtousername = msgtousername;
		this.msgfromuserid = msgfromuserid;
		this.msgfromusrname = msgfromusrname;
		this.msgtextid = msgtextid;
		this.state = state;
		this.title = title;
		this.createtime = createtime;
		this.msgstate = msgstate;
	}

	public String getMsgid() {
		return this.msgid;
	}

	public void setMsgid(String msgid) {
		this.msgid = msgid;
	}

	public String getMsgtousername() {
		return this.msgtousername;
	}

	public void setMsgtousername(String msgtousername) {
		this.msgtousername = msgtousername;
	}

	public String getMsgfromuserid() {
		return this.msgfromuserid;
	}

	public void setMsgfromuserid(String msgfromuserid) {
		this.msgfromuserid = msgfromuserid;
	}

	public String getMsgfromusrname() {
		return this.msgfromusrname;
	}

	public void setMsgfromusrname(String msgfromusrname) {
		this.msgfromusrname = msgfromusrname;
	}

	public String getMsgtextid() {
		return this.msgtextid;
	}

	public void setMsgtextid(String msgtextid) {
		this.msgtextid = msgtextid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getMsgstate() {
		return this.msgstate;
	}

	public void setMsgstate(String msgstate) {
		this.msgstate = msgstate;
	}

}
