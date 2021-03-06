package com.exercise;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		WebApplicationContext context = getContext();
		servletContext.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispacher = servletContext.addServlet("DispacherServlet",
				new DispatcherServlet(context));
		dispacher.setLoadOnStartup(1);
		dispacher.addMapping("*.html");
		dispacher.addMapping("*.css");
		dispacher.addMapping("*.js");
		dispacher.addMapping("*.png");


	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebConfig.class);
		return context;
	}

}
