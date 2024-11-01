package nginx.unit;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.SessionCookieConfig;

/*

    <session-config>
        <session-timeout>60</session-timeout>
        <cookie-config></cookie-config>
        <tracking-mode></tracking-mode>
    </session-config>


 */
public class UnitSessionCookieConfig implements SessionCookieConfig {

    private static final String default_name = "JSESSIONID";

    private String name = default_name;
    private String domain;
    private String path;
    private String comment;
    private boolean httpOnly = true;
    private boolean secure = false;
    private int maxAge = -1;
    
    private HashMap<String, String> attributes;
    
    @Override
	public String getAttribute(String arg0) {
		if (attributes != null) {
			return attributes.get(arg0);
		}
		return null;
	}
    
    @Override
    public void setAttribute(String arg0, String arg1) {
    	if (attributes == null) {
    		attributes = new HashMap<>();
    	}
    	attributes.put(arg0, arg1);
    }
    
	@Override
	public Map<String, String> getAttributes() {
		if (attributes == null) {
			return Map.of();
		}
		return Map.copyOf(attributes);
	}

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setDomain(String domain)
    {
        this.domain = domain;
    }

    @Override
    public String getDomain()
    {
        return domain;
    }

    @Override
    public void setPath(String path)
    {
        this.path = path;
    }

    @Override
    public String getPath()
    {
        return path;
    }

    @Override
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    @Override
    public String getComment()
    {
        return comment;
    }

    @Override
    public void setHttpOnly(boolean httpOnly)
    {
        this.httpOnly = httpOnly;
    }

    @Override
    public boolean isHttpOnly()
    {
        return httpOnly;
    }

    @Override
    public void setSecure(boolean secure)
    {
        this.secure = secure;
    }

    @Override
    public boolean isSecure()
    {
        return secure;
    }

    @Override
    public void setMaxAge(int maxAge)
    {
        this.maxAge = maxAge;
    }

    @Override
    public int getMaxAge()
    {
        return maxAge;
    }


}
