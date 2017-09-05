package com.crocodylus.callService;

public class CScanb {
	private String title;
	private String creditTransferMobileNumber;
	private String transactionAmount;
	private String appId;
	private String requestId;
	
	
	
	public CScanb(String title, String creditTransferMobileNumber, String transactionAmount, String appId,
			String requestId) {
		super();
		this.title = title;
		this.creditTransferMobileNumber = creditTransferMobileNumber;
		this.transactionAmount = transactionAmount;
		this.appId = appId;
		this.requestId = requestId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreditTransferMobileNumber() {
		return creditTransferMobileNumber;
	}
	public void setCreditTransferMobileNumber(String creditTransferMobileNumber) {
		this.creditTransferMobileNumber = creditTransferMobileNumber;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
}
