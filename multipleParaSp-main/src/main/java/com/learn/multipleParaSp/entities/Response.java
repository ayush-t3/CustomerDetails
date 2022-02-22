package com.learn.multipleParaSp.entities;



public class Response {
	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private CustomerDetails CustomerDetails;
	
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public int getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}
	public String getMessageType() {
		return MessageType;
	}
	public void setMessageType(String messageType) {
		MessageType = messageType;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public CustomerDetails getCustomerDetails() {
		return CustomerDetails;
	}
	public void setCustomerDetails(CustomerDetails customerDetails) {
		CustomerDetails = customerDetails;
	}
	public Response(int status, int errorCode, String messageType, String message,
			com.learn.multipleParaSp.entities.CustomerDetails customerDetails) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		CustomerDetails = customerDetails;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Response [Status=" + Status + ", ErrorCode=" + ErrorCode + ", MessageType=" + MessageType + ", Message="
				+ Message + ", CustomerDetails=" + CustomerDetails + "]";
	}
	
	
	
	
	
	
	
}
