package com.orange.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateRadar {
	static String radarTicket;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Start");
		createRadarTicket();
		System.out.println("Created");
		
	}
	public static void createRadarTicket() throws IOException {	
		String line;
		Process process;
		String CURL_COMMAND = "curl -i -X POST -H \"Accept: application/json\" "
				+ "-H \"Radar-Authentication:427609bb74df874d903f67fade4edd33e657442756e7f4c464ae57b22a9993bc\" "
				+ "-H \"Content-Type: application/json\" "
				+ "-d '{\"classification\":\"Serious Bug\",\"component\":"
				+ "{\"name\":\"Device Services IS&T\",\"version\":\"All\"},"
				+ "\"description\":\"Creating from Script\",\"reproducible\":\"Not Applicable\","
				+ "\"title\":\"Creating from Script1\"}' https://radar-webservices.apple.com/problems";	
		process = Runtime.getRuntime().exec(CURL_COMMAND);
//		StringBuilder output = new StringBuilder();
//		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//			while ((line = reader.readLine()) != null) {
//				output.append(line);
//			}
//			String radarTicket = output.toString();
//			return radarTicket;
	}

}
