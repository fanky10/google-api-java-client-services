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

package com.google.api.services.cloudiot.v1.model;

/**
 * The configuration of the HTTP bridge for a device registry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud IoT API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpConfig extends com.google.api.client.json.GenericJson {

  /**
   * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests
   * to DeviceService will fail for this registry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String httpEnabledState;

  /**
   * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests
   * to DeviceService will fail for this registry.
   * @return value or {@code null} for none
   */
  public java.lang.String getHttpEnabledState() {
    return httpEnabledState;
  }

  /**
   * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests
   * to DeviceService will fail for this registry.
   * @param httpEnabledState httpEnabledState or {@code null} for none
   */
  public HttpConfig setHttpEnabledState(java.lang.String httpEnabledState) {
    this.httpEnabledState = httpEnabledState;
    return this;
  }

  @Override
  public HttpConfig set(String fieldName, Object value) {
    return (HttpConfig) super.set(fieldName, value);
  }

  @Override
  public HttpConfig clone() {
    return (HttpConfig) super.clone();
  }

}
