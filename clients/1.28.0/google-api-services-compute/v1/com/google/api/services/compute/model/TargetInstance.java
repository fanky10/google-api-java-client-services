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
 * A TargetInstance resource. This resource defines an endpoint instance that terminates traffic of
 * certain protocols. (== resource_for beta.targetInstances ==) (== resource_for v1.targetInstances
 * ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetInstance extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * A URL to the virtual machine instance that handles traffic for this target instance. When
   * creating a target instance, you can provide the fully-qualified URL or a valid partial URL to
   * the desired virtual machine. For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance  -
   * projects/project/zones/zone/instances/instance  - zones/zone/instances/instance
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * [Output Only] The type of the resource. Always compute#targetInstance for target instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default
   * value) is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String natPolicy;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] URL of the zone where the target instance resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public TargetInstance setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public TargetInstance setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public TargetInstance setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * A URL to the virtual machine instance that handles traffic for this target instance. When
   * creating a target instance, you can provide the fully-qualified URL or a valid partial URL to
   * the desired virtual machine. For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance  -
   * projects/project/zones/zone/instances/instance  - zones/zone/instances/instance
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * A URL to the virtual machine instance that handles traffic for this target instance. When
   * creating a target instance, you can provide the fully-qualified URL or a valid partial URL to
   * the desired virtual machine. For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance  -
   * projects/project/zones/zone/instances/instance  - zones/zone/instances/instance
   * @param instance instance or {@code null} for none
   */
  public TargetInstance setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * [Output Only] The type of the resource. Always compute#targetInstance for target instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] The type of the resource. Always compute#targetInstance for target instances.
   * @param kind kind or {@code null} for none
   */
  public TargetInstance setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public TargetInstance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default
   * value) is supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getNatPolicy() {
    return natPolicy;
  }

  /**
   * NAT option controlling how IPs are NAT'ed to the instance. Currently only NO_NAT (default
   * value) is supported.
   * @param natPolicy natPolicy or {@code null} for none
   */
  public TargetInstance setNatPolicy(java.lang.String natPolicy) {
    this.natPolicy = natPolicy;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public TargetInstance setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] URL of the zone where the target instance resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the zone where the target instance resides. You must specify this field as
   * part of the HTTP request URL. It is not settable as a field in the request body.
   * @param zone zone or {@code null} for none
   */
  public TargetInstance setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public TargetInstance set(String fieldName, Object value) {
    return (TargetInstance) super.set(fieldName, value);
  }

  @Override
  public TargetInstance clone() {
    return (TargetInstance) super.clone();
  }

}
