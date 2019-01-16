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
 * Model definition for HTTPHealthCheck.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HTTPHealthCheck extends com.google.api.client.json.GenericJson {

  /**
   * The value of the host header in the HTTP health check request. If left empty (default value),
   * the IP on behalf of which this health check is performed will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * The TCP port number for the health check request. The default value is 80. Valid values are 1
   * through 65535.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portName;

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyHeader;

  /**
   * The request path of the HTTP health check request. The default value is /.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestPath;

  /**
   * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the
   * default value), the status code determines health. The response data can only be ASCII.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String response;

  /**
   * The value of the host header in the HTTP health check request. If left empty (default value),
   * the IP on behalf of which this health check is performed will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * The value of the host header in the HTTP health check request. If left empty (default value),
   * the IP on behalf of which this health check is performed will be used.
   * @param host host or {@code null} for none
   */
  public HTTPHealthCheck setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * The TCP port number for the health check request. The default value is 80. Valid values are 1
   * through 65535.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The TCP port number for the health check request. The default value is 80. Valid values are 1
   * through 65535.
   * @param port port or {@code null} for none
   */
  public HTTPHealthCheck setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortName() {
    return portName;
  }

  /**
   * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined,
   * port takes precedence.
   * @param portName portName or {@code null} for none
   */
  public HTTPHealthCheck setPortName(java.lang.String portName) {
    this.portName = portName;
    return this;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyHeader() {
    return proxyHeader;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * @param proxyHeader proxyHeader or {@code null} for none
   */
  public HTTPHealthCheck setProxyHeader(java.lang.String proxyHeader) {
    this.proxyHeader = proxyHeader;
    return this;
  }

  /**
   * The request path of the HTTP health check request. The default value is /.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestPath() {
    return requestPath;
  }

  /**
   * The request path of the HTTP health check request. The default value is /.
   * @param requestPath requestPath or {@code null} for none
   */
  public HTTPHealthCheck setRequestPath(java.lang.String requestPath) {
    this.requestPath = requestPath;
    return this;
  }

  /**
   * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the
   * default value), the status code determines health. The response data can only be ASCII.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponse() {
    return response;
  }

  /**
   * The string to match anywhere in the first 1024 bytes of the response body. If left empty (the
   * default value), the status code determines health. The response data can only be ASCII.
   * @param response response or {@code null} for none
   */
  public HTTPHealthCheck setResponse(java.lang.String response) {
    this.response = response;
    return this;
  }

  @Override
  public HTTPHealthCheck set(String fieldName, Object value) {
    return (HTTPHealthCheck) super.set(fieldName, value);
  }

  @Override
  public HTTPHealthCheck clone() {
    return (HTTPHealthCheck) super.clone();
  }

}
