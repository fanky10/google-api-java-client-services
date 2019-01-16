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

package com.google.api.services.dfareporting.model;

/**
 * Represents a sorted dimension.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SortedDimension extends com.google.api.client.json.GenericJson {

  /**
   * The kind of resource this is, in this case dfareporting#sortedDimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * An optional sort order for the dimension column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sortOrder;

  /**
   * The kind of resource this is, in this case dfareporting#sortedDimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#sortedDimension.
   * @param kind kind or {@code null} for none
   */
  public SortedDimension setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the dimension.
   * @param name name or {@code null} for none
   */
  public SortedDimension setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * An optional sort order for the dimension column.
   * @return value or {@code null} for none
   */
  public java.lang.String getSortOrder() {
    return sortOrder;
  }

  /**
   * An optional sort order for the dimension column.
   * @param sortOrder sortOrder or {@code null} for none
   */
  public SortedDimension setSortOrder(java.lang.String sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  @Override
  public SortedDimension set(String fieldName, Object value) {
    return (SortedDimension) super.set(fieldName, value);
  }

  @Override
  public SortedDimension clone() {
    return (SortedDimension) super.clone();
  }

}
