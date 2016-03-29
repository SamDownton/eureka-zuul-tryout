/**
 * ApplicationStarter.java
 * 
 * Copyright (C) 2016 by Arménio Pinto.
 * Please read LICENSE.TXT for the license details.
 */
package com.armeniopinto.zuul.proxy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author armenio.pinto
 */
@SpringBootApplication
@RestController
@EnableZuulProxy
@EnableDiscoveryClient
public class ApplicationStarter {

	public static void main(final String[] args) {
		new SpringApplicationBuilder(ApplicationStarter.class).web(true).run(args);
	}

}
// This is my first edit!

// And this is my second.
