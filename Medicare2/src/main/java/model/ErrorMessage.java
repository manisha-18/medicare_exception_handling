package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
private String statuscode,message;

public ErrorMessage(){}

public ErrorMessage(String statuscode, String message) {
	super();
	this.statuscode = statuscode;
	this.message = message;
}

public String getStatuscode() {
	return statuscode;
}

public void setStatuscode(String statuscode) {
	this.statuscode = statuscode;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}




}
