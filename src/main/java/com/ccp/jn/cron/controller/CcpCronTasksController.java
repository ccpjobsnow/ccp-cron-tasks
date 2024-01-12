package com.ccp.jn.cron.controller;

import com.ccp.decorators.CcpJsonRepresentation;
import com.ccp.exceptions.process.CcpAsyncProcess;

public class CcpCronTasksController {

	public static void main(String[] args) throws Exception {
		String taskName = args[0];
		String parameters = args[1];
		CcpJsonRepresentation mdParameters = new CcpJsonRepresentation(parameters);
		CcpAsyncProcess.executeProcess(taskName, mdParameters);
	}
}
