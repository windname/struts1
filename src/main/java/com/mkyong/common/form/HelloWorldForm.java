package com.mkyong.common.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class HelloWorldForm extends ActionForm{
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	String submit;

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	private FormFile upload;

	public FormFile getUpload() {
		return upload;
	}

	public void setUpload(FormFile upload) {
		this.upload = upload;
	}
}