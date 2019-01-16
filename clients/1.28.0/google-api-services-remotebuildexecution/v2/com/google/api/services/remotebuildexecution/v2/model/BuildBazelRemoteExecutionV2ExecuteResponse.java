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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * The response message for Execution.Execute, which will be contained in the response field of the
 * Operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2ExecuteResponse extends com.google.api.client.json.GenericJson {

  /**
   * True if the result was served from cache, false if it was executed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean cachedResult;

  /**
   * The result of the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2ActionResult result;

  /**
   * An optional list of additional log outputs the server wishes to provide. A server can use this
   * to return execution-specific logs however it wishes. This is intended primarily to make it
   * easier for users to debug issues that may be outside of the actual job execution, such as by
   * identifying the worker executing the action or by providing logs from the worker's setup phase.
   * The keys SHOULD be human readable so that a client can display them to a user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, BuildBazelRemoteExecutionV2LogFile> serverLogs;

  /**
   * If the status has a code other than `OK`, it indicates that the action did not finish
   * execution. For example, if the operation times out during execution, the status will have a
   * `DEADLINE_EXCEEDED` code. Servers MUST use this field for errors in execution, rather than the
   * error field on the `Operation` object.
   *
   * If the status code is other than `OK`, then the result MUST NOT be cached. For an error status,
   * the `result` field is optional; the server may populate the output-, stdout-, and stderr-
   * related fields if it has any information available, such as the stdout and stderr of a timed-
   * out action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleRpcStatus status;

  /**
   * True if the result was served from cache, false if it was executed.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCachedResult() {
    return cachedResult;
  }

  /**
   * True if the result was served from cache, false if it was executed.
   * @param cachedResult cachedResult or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteResponse setCachedResult(java.lang.Boolean cachedResult) {
    this.cachedResult = cachedResult;
    return this;
  }

  /**
   * The result of the action.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ActionResult getResult() {
    return result;
  }

  /**
   * The result of the action.
   * @param result result or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteResponse setResult(BuildBazelRemoteExecutionV2ActionResult result) {
    this.result = result;
    return this;
  }

  /**
   * An optional list of additional log outputs the server wishes to provide. A server can use this
   * to return execution-specific logs however it wishes. This is intended primarily to make it
   * easier for users to debug issues that may be outside of the actual job execution, such as by
   * identifying the worker executing the action or by providing logs from the worker's setup phase.
   * The keys SHOULD be human readable so that a client can display them to a user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, BuildBazelRemoteExecutionV2LogFile> getServerLogs() {
    return serverLogs;
  }

  /**
   * An optional list of additional log outputs the server wishes to provide. A server can use this
   * to return execution-specific logs however it wishes. This is intended primarily to make it
   * easier for users to debug issues that may be outside of the actual job execution, such as by
   * identifying the worker executing the action or by providing logs from the worker's setup phase.
   * The keys SHOULD be human readable so that a client can display them to a user.
   * @param serverLogs serverLogs or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteResponse setServerLogs(java.util.Map<String, BuildBazelRemoteExecutionV2LogFile> serverLogs) {
    this.serverLogs = serverLogs;
    return this;
  }

  /**
   * If the status has a code other than `OK`, it indicates that the action did not finish
   * execution. For example, if the operation times out during execution, the status will have a
   * `DEADLINE_EXCEEDED` code. Servers MUST use this field for errors in execution, rather than the
   * error field on the `Operation` object.
   *
   * If the status code is other than `OK`, then the result MUST NOT be cached. For an error status,
   * the `result` field is optional; the server may populate the output-, stdout-, and stderr-
   * related fields if it has any information available, such as the stdout and stderr of a timed-
   * out action.
   * @return value or {@code null} for none
   */
  public GoogleRpcStatus getStatus() {
    return status;
  }

  /**
   * If the status has a code other than `OK`, it indicates that the action did not finish
   * execution. For example, if the operation times out during execution, the status will have a
   * `DEADLINE_EXCEEDED` code. Servers MUST use this field for errors in execution, rather than the
   * error field on the `Operation` object.
   *
   * If the status code is other than `OK`, then the result MUST NOT be cached. For an error status,
   * the `result` field is optional; the server may populate the output-, stdout-, and stderr-
   * related fields if it has any information available, such as the stdout and stderr of a timed-
   * out action.
   * @param status status or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecuteResponse setStatus(GoogleRpcStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecuteResponse set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2ExecuteResponse) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecuteResponse clone() {
    return (BuildBazelRemoteExecutionV2ExecuteResponse) super.clone();
  }

}
