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

package com.google.api.services.dataflow.model;

/**
 * A message describing the state of a particular execution stage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionStageState extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the stage transitioned to this state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String currentStateTime;

  /**
   * The name of the execution stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionStageName;

  /**
   * Executions stage states allow the same set of values as JobState.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionStageState;

  /**
   * The time at which the stage transitioned to this state.
   * @return value or {@code null} for none
   */
  public String getCurrentStateTime() {
    return currentStateTime;
  }

  /**
   * The time at which the stage transitioned to this state.
   * @param currentStateTime currentStateTime or {@code null} for none
   */
  public ExecutionStageState setCurrentStateTime(String currentStateTime) {
    this.currentStateTime = currentStateTime;
    return this;
  }

  /**
   * The name of the execution stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionStageName() {
    return executionStageName;
  }

  /**
   * The name of the execution stage.
   * @param executionStageName executionStageName or {@code null} for none
   */
  public ExecutionStageState setExecutionStageName(java.lang.String executionStageName) {
    this.executionStageName = executionStageName;
    return this;
  }

  /**
   * Executions stage states allow the same set of values as JobState.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionStageState() {
    return executionStageState;
  }

  /**
   * Executions stage states allow the same set of values as JobState.
   * @param executionStageState executionStageState or {@code null} for none
   */
  public ExecutionStageState setExecutionStageState(java.lang.String executionStageState) {
    this.executionStageState = executionStageState;
    return this;
  }

  @Override
  public ExecutionStageState set(String fieldName, Object value) {
    return (ExecutionStageState) super.set(fieldName, value);
  }

  @Override
  public ExecutionStageState clone() {
    return (ExecutionStageState) super.clone();
  }

}
