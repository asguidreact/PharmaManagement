package com.management.Pharma.Exception;
import java.time.LocalDateTime;

public class ErrorInfo {
	
	LocalDateTime timeStamp;
	String msg;
	String url;
	String validationMsg;
	
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorInfo(LocalDateTime timeStamp, String msg, String url) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.url = url;
		
	}
	public ErrorInfo(LocalDateTime timeStamp, String msg, String url, String emsg) {
		super();
		this.timeStamp = timeStamp;
		this.msg = msg;
		this.url = url;
		validationMsg=emsg;
		
		
	}
	
	
	
	
	public String getValidationMsg() {
		return validationMsg;
	}
	public void setValidationMsg(String validationMsg) {
		this.validationMsg = validationMsg;
	}
	public LocalDateTime getTimesatmp() {
		return timeStamp;
	}
	public void setTimesatmp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "ErrorInfo [timeStamp=" + timeStamp + ", msg=" + msg + ", url=" + url + "]";
	}
}
