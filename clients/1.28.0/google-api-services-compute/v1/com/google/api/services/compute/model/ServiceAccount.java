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

package com.google.api.services.compute.model;

/**
 * A service account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceAccount extends com.google.api.client.json.GenericJson {

  /**
   * Email address of the service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The list of scopes to be made available for this service account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scopes;

  /**
   * Email address of the service account.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Email address of the service account.
   * @param email email or {@code null} for none
   */
  public ServiceAccount setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The list of scopes to be made available for this service account.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScopes() {
    return scopes;
  }

  /**
   * The list of scopes to be made available for this service account.
   * @param scopes scopes or {@code null} for none
   */
  public ServiceAccount setScopes(java.util.List<java.lang.String> scopes) {
    this.scopes = scopes;
    return this;
  }

  @Override
  public ServiceAccount set(String fieldName, Object value) {
    return (ServiceAccount) super.set(fieldName, value);
  }

  @Override
  public ServiceAccount clone() {
    return (ServiceAccount) super.clone();
  }

}
