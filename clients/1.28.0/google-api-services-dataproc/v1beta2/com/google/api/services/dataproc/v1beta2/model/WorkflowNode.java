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
 * The workflow node.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkflowNode extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The error detail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String error;

  /**
   * Output only. The job id; populated after the node enters RUNNING state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * Output only. Node's prerequisite nodes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> prerequisiteStepIds;

  /**
   * Output only. The node state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The name of the node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepId;

  /**
   * Output only. The error detail.
   * @return value or {@code null} for none
   */
  public java.lang.String getError() {
    return error;
  }

  /**
   * Output only. The error detail.
   * @param error error or {@code null} for none
   */
  public WorkflowNode setError(java.lang.String error) {
    this.error = error;
    return this;
  }

  /**
   * Output only. The job id; populated after the node enters RUNNING state.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * Output only. The job id; populated after the node enters RUNNING state.
   * @param jobId jobId or {@code null} for none
   */
  public WorkflowNode setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Output only. Node's prerequisite nodes.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrerequisiteStepIds() {
    return prerequisiteStepIds;
  }

  /**
   * Output only. Node's prerequisite nodes.
   * @param prerequisiteStepIds prerequisiteStepIds or {@code null} for none
   */
  public WorkflowNode setPrerequisiteStepIds(java.util.List<java.lang.String> prerequisiteStepIds) {
    this.prerequisiteStepIds = prerequisiteStepIds;
    return this;
  }

  /**
   * Output only. The node state.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The node state.
   * @param state state or {@code null} for none
   */
  public WorkflowNode setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The name of the node.
   * @return value or {@code null} for none
   */
  public java.lang.String getStepId() {
    return stepId;
  }

  /**
   * Output only. The name of the node.
   * @param stepId stepId or {@code null} for none
   */
  public WorkflowNode setStepId(java.lang.String stepId) {
    this.stepId = stepId;
    return this;
  }

  @Override
  public WorkflowNode set(String fieldName, Object value) {
    return (WorkflowNode) super.set(fieldName, value);
  }

  @Override
  public WorkflowNode clone() {
    return (WorkflowNode) super.clone();
  }

}
