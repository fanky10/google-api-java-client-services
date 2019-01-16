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

package com.google.api.services.runtimeconfig.v1beta1.model;

/**
 * The `Status` type defines a logical error model that is suitable for different programming
 * environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc).
 * The error model is designed to be:
 *
 * - Simple to use and understand for most users - Flexible enough to meet unexpected needs
 *
 * # Overview
 *
 * The `Status` message contains three pieces of data: error code, error message, and error details.
 * The error code should be an enum value of google.rpc.Code, but it may accept additional error
 * codes if needed.  The error message should be a developer-facing English message that helps
 * developers *understand* and *resolve* the error. If a localized user-facing error message is
 * needed, put the localized message in the error details or localize it in the client. The optional
 * error details may contain arbitrary information about the error. There is a predefined set of
 * error detail types in the package `google.rpc` that can be used for common error conditions.
 *
 * # Language mapping
 *
 * The `Status` message is the logical representation of the error model, but it is not necessarily
 * the actual wire format. When the `Status` message is exposed in different client libraries and
 * different wire protocols, it can be mapped differently. For example, it will likely be mapped to
 * some exceptions in Java, but more likely mapped to some error codes in C.
 *
 * # Other uses
 *
 * The error model and the `Status` message can be used in a variety of environments, either with or
 * without APIs, to provide a consistent developer experience across different environments.
 *
 * Example uses of this error model include:
 *
 * - Partial errors. If a service needs to return partial errors to the client,     it may embed the
 * `Status` in the normal response to indicate the partial     errors.
 *
 * - Workflow errors. A typical workflow has multiple steps. Each step may     have a `Status`
 * message for error reporting.
 *
 * - Batch operations. If a client uses batch request and batch response, the     `Status` message
 * should be used directly inside batch response, one for     each error sub-response.
 *
 * - Asynchronous operations. If an API call embeds asynchronous operation     results in its
 * response, the status of those operations should be     represented directly using the `Status`
 * message.
 *
 * - Logging. If some API errors are stored in logs, the message `Status` could     be used directly
 * after any stripping needed for security/privacy reasons.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Runtime Configuration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Status extends com.google.api.client.json.GenericJson {

  /**
   * The status code, which should be an enum value of google.rpc.Code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer code;

  /**
   * A list of messages that carry the error details.  There is a common set of message types for
   * APIs to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.Map<String, java.lang.Object>> details;

  /**
   * A developer-facing error message, which should be in English. Any user-facing error message
   * should be localized and sent in the google.rpc.Status.details field, or localized by the
   * client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The status code, which should be an enum value of google.rpc.Code.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCode() {
    return code;
  }

  /**
   * The status code, which should be an enum value of google.rpc.Code.
   * @param code code or {@code null} for none
   */
  public Status setCode(java.lang.Integer code) {
    this.code = code;
    return this;
  }

  /**
   * A list of messages that carry the error details.  There is a common set of message types for
   * APIs to use.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.Map<String, java.lang.Object>> getDetails() {
    return details;
  }

  /**
   * A list of messages that carry the error details.  There is a common set of message types for
   * APIs to use.
   * @param details details or {@code null} for none
   */
  public Status setDetails(java.util.List<java.util.Map<String, java.lang.Object>> details) {
    this.details = details;
    return this;
  }

  /**
   * A developer-facing error message, which should be in English. Any user-facing error message
   * should be localized and sent in the google.rpc.Status.details field, or localized by the
   * client.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * A developer-facing error message, which should be in English. Any user-facing error message
   * should be localized and sent in the google.rpc.Status.details field, or localized by the
   * client.
   * @param message message or {@code null} for none
   */
  public Status setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  @Override
  public Status set(String fieldName, Object value) {
    return (Status) super.set(fieldName, value);
  }

  @Override
  public Status clone() {
    return (Status) super.clone();
  }

}
