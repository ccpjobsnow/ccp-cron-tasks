package com.ccp.jn.cron.controller;

import java.util.function.Function;

import com.ccp.decorators.CcpJsonRepresentation;
import com.ccp.exceptions.process.CcpAsyncProcess;

public class CcpCronTasksController {

	public static void main(Function<CcpJsonRepresentation, CcpJsonRepresentation> jnAsyncBusinessNotifyError, String taskName, String parameters) throws Exception {
		CcpJsonRepresentation mdParameters = new CcpJsonRepresentation(parameters);
		CcpAsyncProcess.executeProcess(taskName, mdParameters,jnAsyncBusinessNotifyError);
	}
}
