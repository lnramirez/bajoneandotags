package com.bajoneando.tags;

import java.io.IOException;
import java.net.URLEncoder;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author lrmonterosa
 */
public class HTMLEncodeLib extends SimpleTagSupport {
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().println(URLEncoder.encode(value, "UTF-8"));
    }
    
}
