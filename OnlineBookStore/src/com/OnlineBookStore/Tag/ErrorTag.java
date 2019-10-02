package com.OnlineBookStore.Tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ErrorTag extends TagSupport{
public ErrorTag(){}
	
	private String property;

	public String getProperty() {
	return property;
	}

	public void setProperty(String property) {
	this.property = property;
	}


	@Override
	public int doEndTag() throws JspException {


	try {
	JspWriter out=pageContext.getOut();

	
	Object obj=pageContext.getAttribute(property,pageContext.REQUEST_SCOPE);
	if(obj!=null){
	out.write(obj.toString());
	}

	} catch (Exception e) {
	
	e.printStackTrace();
	}
	return EVAL_PAGE;

	}

}
