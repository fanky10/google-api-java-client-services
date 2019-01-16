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

package com.google.api.services.adsense.model;

/**
 * Model definition for SavedReport.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SavedReport extends com.google.api.client.json.GenericJson {

  /**
   * Unique identifier of this saved report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Kind of resource this is, in this case adsense#savedReport.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * This saved report's name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Unique identifier of this saved report.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier of this saved report.
   * @param id id or {@code null} for none
   */
  public SavedReport setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Kind of resource this is, in this case adsense#savedReport.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Kind of resource this is, in this case adsense#savedReport.
   * @param kind kind or {@code null} for none
   */
  public SavedReport setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * This saved report's name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * This saved report's name.
   * @param name name or {@code null} for none
   */
  public SavedReport setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public SavedReport set(String fieldName, Object value) {
    return (SavedReport) super.set(fieldName, value);
  }

  @Override
  public SavedReport clone() {
    return (SavedReport) super.clone();
  }

}
