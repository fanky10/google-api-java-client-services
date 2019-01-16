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

package com.google.api.services.containeranalysis.v1beta1.model;

/**
 * Per resource and severity counts of fixable and total vulnerabilites.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FixableTotalByDigest extends com.google.api.client.json.GenericJson {

  /**
   * The number of fixable vulnerabilities associated with this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fixableCount;

  /**
   * The affected resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resource resource;

  /**
   * The severity for this count. SEVERITY_UNSPECIFIED indicates total across all severities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * The total number of vulnerabilities associated with this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalCount;

  /**
   * The number of fixable vulnerabilities associated with this resource.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFixableCount() {
    return fixableCount;
  }

  /**
   * The number of fixable vulnerabilities associated with this resource.
   * @param fixableCount fixableCount or {@code null} for none
   */
  public FixableTotalByDigest setFixableCount(java.lang.Long fixableCount) {
    this.fixableCount = fixableCount;
    return this;
  }

  /**
   * The affected resource.
   * @return value or {@code null} for none
   */
  public Resource getResource() {
    return resource;
  }

  /**
   * The affected resource.
   * @param resource resource or {@code null} for none
   */
  public FixableTotalByDigest setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The severity for this count. SEVERITY_UNSPECIFIED indicates total across all severities.
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * The severity for this count. SEVERITY_UNSPECIFIED indicates total across all severities.
   * @param severity severity or {@code null} for none
   */
  public FixableTotalByDigest setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * The total number of vulnerabilities associated with this resource.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalCount() {
    return totalCount;
  }

  /**
   * The total number of vulnerabilities associated with this resource.
   * @param totalCount totalCount or {@code null} for none
   */
  public FixableTotalByDigest setTotalCount(java.lang.Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  @Override
  public FixableTotalByDigest set(String fieldName, Object value) {
    return (FixableTotalByDigest) super.set(fieldName, value);
  }

  @Override
  public FixableTotalByDigest clone() {
    return (FixableTotalByDigest) super.clone();
  }

}
