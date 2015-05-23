package com.maven.lib.functions;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import tldgen.BodyContentType;
import tldgen.Tag;
import tldgen.TagAttribute;

@Tag(bodyContentType = BodyContentType.EMPTY, value = "helloTag", displayName = "helloTag", description = "This tag only returns hello message!")
public class HelloTag extends TagSupport {
	private static final long serialVersionUID = -4710381856461807374L;

	private String var;
	private static final String helloMessage = "Hello Danh!!!";

	@Override
	public int doEndTag() throws JspException {
		pageContext.setAttribute(var, helloMessage);
		return super.doEndTag();
	}

	@TagAttribute(required = true, runtimeValueAllowed = true)
	public void setVar(String var) {
		this.var = var;
	}

}
