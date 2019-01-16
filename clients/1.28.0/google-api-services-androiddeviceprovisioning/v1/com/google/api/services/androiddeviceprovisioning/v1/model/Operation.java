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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * This resource represents a long-running operation that is the result of a network API call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * If the value is `false`, it means the operation is still in progress. If `true`, the operation
   * is completed, and either `error` or `response` is available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean done;

  /**
   * This field will always be not set if the operation is created by `claimAsync`, `unclaimAsync`,
   * or `updateMetadataAsync`. In this case, error information for each device is set in
   * `response.perDeviceStatus.result.status`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * This field will contain a `DevicesLongRunningOperationMetadata` object if the operation is
   * created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * The server-assigned name, which is only unique within the same service that originally returns
   * it. If you use the default HTTP mapping, the `name` should have the format of
   * `operations/some/unique/name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This field will contain a `DevicesLongRunningOperationResponse` object if the operation is
   * created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> response;

  /**
   * If the value is `false`, it means the operation is still in progress. If `true`, the operation
   * is completed, and either `error` or `response` is available.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDone() {
    return done;
  }

  /**
   * If the value is `false`, it means the operation is still in progress. If `true`, the operation
   * is completed, and either `error` or `response` is available.
   * @param done done or {@code null} for none
   */
  public Operation setDone(java.lang.Boolean done) {
    this.done = done;
    return this;
  }

  /**
   * This field will always be not set if the operation is created by `claimAsync`, `unclaimAsync`,
   * or `updateMetadataAsync`. In this case, error information for each device is set in
   * `response.perDeviceStatus.result.status`.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * This field will always be not set if the operation is created by `claimAsync`, `unclaimAsync`,
   * or `updateMetadataAsync`. In this case, error information for each device is set in
   * `response.perDeviceStatus.result.status`.
   * @param error error or {@code null} for none
   */
  public Operation setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * This field will contain a `DevicesLongRunningOperationMetadata` object if the operation is
   * created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * This field will contain a `DevicesLongRunningOperationMetadata` object if the operation is
   * created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`.
   * @param metadata metadata or {@code null} for none
   */
  public Operation setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The server-assigned name, which is only unique within the same service that originally returns
   * it. If you use the default HTTP mapping, the `name` should have the format of
   * `operations/some/unique/name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The server-assigned name, which is only unique within the same service that originally returns
   * it. If you use the default HTTP mapping, the `name` should have the format of
   * `operations/some/unique/name`.
   * @param name name or {@code null} for none
   */
  public Operation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This field will contain a `DevicesLongRunningOperationResponse` object if the operation is
   * created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getResponse() {
    return response;
  }

  /**
   * This field will contain a `DevicesLongRunningOperationResponse` object if the operation is
   * created by `claimAsync`, `unclaimAsync`, or `updateMetadataAsync`.
   * @param response response or {@code null} for none
   */
  public Operation setResponse(java.util.Map<String, java.lang.Object> response) {
    this.response = response;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

}
