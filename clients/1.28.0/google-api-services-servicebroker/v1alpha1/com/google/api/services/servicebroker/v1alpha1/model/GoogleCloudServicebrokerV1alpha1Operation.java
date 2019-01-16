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

package com.google.api.services.servicebroker.v1alpha1.model;

/**
 * Describes a long running operation, which conforms to OpenService API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Broker API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudServicebrokerV1alpha1Operation extends com.google.api.client.json.GenericJson {

  /**
   * Optional description of the Operation state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The state of the operation. Valid values are: "in progress", "succeeded", and "failed".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Optional description of the Operation state.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional description of the Operation state.
   * @param description description or {@code null} for none
   */
  public GoogleCloudServicebrokerV1alpha1Operation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The state of the operation. Valid values are: "in progress", "succeeded", and "failed".
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the operation. Valid values are: "in progress", "succeeded", and "failed".
   * @param state state or {@code null} for none
   */
  public GoogleCloudServicebrokerV1alpha1Operation setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudServicebrokerV1alpha1Operation set(String fieldName, Object value) {
    return (GoogleCloudServicebrokerV1alpha1Operation) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudServicebrokerV1alpha1Operation clone() {
    return (GoogleCloudServicebrokerV1alpha1Operation) super.clone();
  }

}
