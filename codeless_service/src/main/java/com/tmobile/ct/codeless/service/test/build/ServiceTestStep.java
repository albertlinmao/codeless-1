/*******************************************************************************
 * * Copyright 2018 T Mobile, Inc. or its affiliates. All Rights Reserved.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  * use this file except in compliance with the License.  You may obtain a copy
 *  * of the License at
 *  *
 *  *   http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 *  * License for the specific language governing permissions and limitations under
 *  * the License.
 ******************************************************************************/
package com.tmobile.ct.codeless.service.test.build;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class ExcelTestRow.
 *
 * @author Rob Graff
 */
public class ServiceTestStep {

	/** The test name. */
	public String testName;

	/** The service. */
	public String service;

	/** The method. */
	public String method;

	/** The operation. */
	public String operation;

	/** The body template. */
	public String bodyTemplate;

	/** The expected status. */
	public String expectedStatus;

	/** The test data. */
	public List<String> testData = new ArrayList<>();

	/**
	 * Instantiates a new excel test row.
	 */
	public ServiceTestStep(){}
}
