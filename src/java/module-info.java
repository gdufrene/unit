module nginx.unit {
	
	requires java.xml;
	requires jakarta.servlet;
	requires io.github.classgraph;
	requires org.eclipse.jetty.util;
	requires org.apache.tomcat.jasper;
	requires org.apache.tomcat.juli;
	requires org.apache.tomcat.util;
	requires org.apache.tomcat.api;
	requires org.eclipse.jetty.http;
	
	opens nginx.unit;
	
}