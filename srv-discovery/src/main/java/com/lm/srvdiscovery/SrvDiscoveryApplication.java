package com.lm.srvdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

	@EnableSidecar
	@SpringBootApplication
	public class SrvDiscoveryApplication {

		public static void main(String[] args) {
			SpringApplication.run(SrvDiscoveryApplication.class, args);
		}
	}


