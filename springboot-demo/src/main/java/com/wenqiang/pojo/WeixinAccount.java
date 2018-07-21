package com.wenqiang.pojo;

import java.util.Date;



public class WeixinAccount extends BaseModel  {
    @Override
	public String toString() {
		return "WeixinAccount [id=" + id + ", accountname=" + accountname
				+ ", accounttoken=" + accounttoken + ", accountnumber="
				+ accountnumber + ", accounttype=" + accounttype
				+ ", accountemail=" + accountemail + ", accountdesc="
				+ accountdesc + ", accountaccesstoken=" + accountaccesstoken
				+ ", accountappid=" + accountappid + ", accountappsecret="
				+ accountappsecret + ", addtoekntime=" + addtoekntime
				+ ", username=" + username + ", weixinAccountid="
				+ weixinAccountid + ", userid=" + userid + "]";
	}

	private Integer id;

    private String accountname;

    private String accounttoken;

    private String accountnumber;

    private String accounttype;

    private String accountemail;

    private String accountdesc;

    private String accountaccesstoken;

    private String accountappid;

    private String accountappsecret;

    private Date addtoekntime;

    private String username;

    private String weixinAccountid;

    private Integer userid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccounttoken() {
        return accounttoken;
    }

    public void setAccounttoken(String accounttoken) {
        this.accounttoken = accounttoken;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getAccountemail() {
        return accountemail;
    }

    public void setAccountemail(String accountemail) {
        this.accountemail = accountemail;
    }

    public String getAccountdesc() {
        return accountdesc;
    }

    public void setAccountdesc(String accountdesc) {
        this.accountdesc = accountdesc;
    }

    public String getAccountaccesstoken() {
        return accountaccesstoken;
    }

    public void setAccountaccesstoken(String accountaccesstoken) {
        this.accountaccesstoken = accountaccesstoken;
    }

    public String getAccountappid() {
        return accountappid;
    }

    public void setAccountappid(String accountappid) {
        this.accountappid = accountappid;
    }

    public String getAccountappsecret() {
        return accountappsecret;
    }

    public void setAccountappsecret(String accountappsecret) {
        this.accountappsecret = accountappsecret;
    }

    public Date getAddtoekntime() {
        return addtoekntime;
    }

    public void setAddtoekntime(Date addtoekntime) {
        this.addtoekntime = addtoekntime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWeixinAccountid() {
        return weixinAccountid;
    }

    public void setWeixinAccountid(String weixinAccountid) {
        this.weixinAccountid = weixinAccountid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}