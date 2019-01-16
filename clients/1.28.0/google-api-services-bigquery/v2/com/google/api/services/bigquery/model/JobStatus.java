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

package com.google.api.services.bigquery.model;

/**
 * Model definition for JobStatus.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobStatus extends com.google.api.client.json.GenericJson {

  /**
   * [Output-only] Final error result of the job. If present, indicates that the job has completed
   * and was unsuccessful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ErrorProto errorResult;

  /**
   * [Output-only] The first errors encountered during the running of the job. The final message
   * includes the number of errors that caused the process to stop. Errors here do not necessarily
   * mean that the job has completed or was unsuccessful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ErrorProto> errors;

  static {
    // hack to force ProGuard to consider ErrorProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ErrorProto.class);
  }

  /**
   * [Output-only] Running state of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * [Output-only] Final error result of the job. If present, indicates that the job has completed
   * and was unsuccessful.
   * @return value or {@code null} for none
   */
  public ErrorProto getErrorResult() {
    return errorResult;
  }

  /**
   * [Output-only] Final error result of the job. If present, indicates that the job has completed
   * and was unsuccessful.
   * @param errorResult errorResult or {@code null} for none
   */
  public JobStatus setErrorResult(ErrorProto errorResult) {
    this.errorResult = errorResult;
    return this;
  }

  /**
   * [Output-only] The first errors encountered during the running of the job. The final message
   * includes the number of errors that caused the process to stop. Errors here do not necessarily
   * mean that the job has completed or was unsuccessful.
   * @return value or {@code null} for none
   */
  public java.util.List<ErrorProto> getErrors() {
    return errors;
  }

  /**
   * [Output-only] The first errors encountered during the running of the job. The final message
   * includes the number of errors that caused the process to stop. Errors here do not necessarily
   * mean that the job has completed or was unsuccessful.
   * @param errors errors or {@code null} for none
   */
  public JobStatus setErrors(java.util.List<ErrorProto> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * [Output-only] Running state of the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output-only] Running state of the job.
   * @param state state or {@code null} for none
   */
  public JobStatus setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public JobStatus set(String fieldName, Object value) {
    return (JobStatus) super.set(fieldName, value);
  }

  @Override
  public JobStatus clone() {
    return (JobStatus) super.clone();
  }

}
