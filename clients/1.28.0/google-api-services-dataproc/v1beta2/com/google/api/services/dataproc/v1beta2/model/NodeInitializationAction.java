/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dataproc.v1beta2.model;

/**
 * Specifies an executable to run on a fully configured node and a timeout period for executable
 * completion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodeInitializationAction extends com.google.api.client.json.GenericJson {

  /**
   * Required. Cloud Storage URI of executable file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executableFile;

  /**
   * Optional. Amount of time executable has to complete. Default is 10 minutes. Cluster creation
   * fails with an explanatory error message (the name of the executable that caused the error and
   * the exceeded timeout period) if the executable is not completed at end of the timeout period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String executionTimeout;

  /**
   * Required. Cloud Storage URI of executable file.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutableFile() {
    return executableFile;
  }

  /**
   * Required. Cloud Storage URI of executable file.
   * @param executableFile executableFile or {@code null} for none
   */
  public NodeInitializationAction setExecutableFile(java.lang.String executableFile) {
    this.executableFile = executableFile;
    return this;
  }

  /**
   * Optional. Amount of time executable has to complete. Default is 10 minutes. Cluster creation
   * fails with an explanatory error message (the name of the executable that caused the error and
   * the exceeded timeout period) if the executable is not completed at end of the timeout period.
   * @return value or {@code null} for none
   */
  public String getExecutionTimeout() {
    return executionTimeout;
  }

  /**
   * Optional. Amount of time executable has to complete. Default is 10 minutes. Cluster creation
   * fails with an explanatory error message (the name of the executable that caused the error and
   * the exceeded timeout period) if the executable is not completed at end of the timeout period.
   * @param executionTimeout executionTimeout or {@code null} for none
   */
  public NodeInitializationAction setExecutionTimeout(String executionTimeout) {
    this.executionTimeout = executionTimeout;
    return this;
  }

  @Override
  public NodeInitializationAction set(String fieldName, Object value) {
    return (NodeInitializationAction) super.set(fieldName, value);
  }

  @Override
  public NodeInitializationAction clone() {
    return (NodeInitializationAction) super.clone();
  }

}
