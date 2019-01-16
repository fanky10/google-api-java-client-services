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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Restriction on Datasource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSourceRestriction extends com.google.api.client.json.GenericJson {

  /**
   * Filter options restricting the results. If multiple filters are present, they are grouped by
   * object type before joining. Filters with the same object type are joined conjunctively, then
   * the resulting expressions are joined disjunctively.
   *
   * The maximum number of elements is 20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FilterOptions> filterOptions;

  /**
   * The source of restriction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * Filter options restricting the results. If multiple filters are present, they are grouped by
   * object type before joining. Filters with the same object type are joined conjunctively, then
   * the resulting expressions are joined disjunctively.
   *
   * The maximum number of elements is 20.
   * @return value or {@code null} for none
   */
  public java.util.List<FilterOptions> getFilterOptions() {
    return filterOptions;
  }

  /**
   * Filter options restricting the results. If multiple filters are present, they are grouped by
   * object type before joining. Filters with the same object type are joined conjunctively, then
   * the resulting expressions are joined disjunctively.
   *
   * The maximum number of elements is 20.
   * @param filterOptions filterOptions or {@code null} for none
   */
  public DataSourceRestriction setFilterOptions(java.util.List<FilterOptions> filterOptions) {
    this.filterOptions = filterOptions;
    return this;
  }

  /**
   * The source of restriction.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * The source of restriction.
   * @param source source or {@code null} for none
   */
  public DataSourceRestriction setSource(Source source) {
    this.source = source;
    return this;
  }

  @Override
  public DataSourceRestriction set(String fieldName, Object value) {
    return (DataSourceRestriction) super.set(fieldName, value);
  }

  @Override
  public DataSourceRestriction clone() {
    return (DataSourceRestriction) super.clone();
  }

}
