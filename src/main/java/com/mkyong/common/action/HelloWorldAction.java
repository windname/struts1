package com.mkyong.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mkyong.common.form.HelloWorldForm;

public class HelloWorldAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		if (helloWorldForm == null) {
			helloWorldForm.setMessage("Hello World! Struts1");
		} else {
			String msg = helloWorldForm.getMessage();
			if (msg == null) {
				helloWorldForm.setMessage("Hello World! Struts2");
			} else {
				helloWorldForm.setMessage(helloWorldForm.getMessage() + " " + helloWorldForm.getSubmit() + " " + helloWorldForm.getUpload());
			}
		}
		
		return mapping.findForward("success");
	}
	
}