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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * Used to return a list of metrics for a single DateRange / dimension combination
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateRangeValues extends com.google.api.client.json.GenericJson {

  /**
   * The values of each pivot region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PivotValueRegion> pivotValueRegions;

  /**
   * Each value corresponds to each Metric in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * The values of each pivot region.
   * @return value or {@code null} for none
   */
  public java.util.List<PivotValueRegion> getPivotValueRegions() {
    return pivotValueRegions;
  }

  /**
   * The values of each pivot region.
   * @param pivotValueRegions pivotValueRegions or {@code null} for none
   */
  public DateRangeValues setPivotValueRegions(java.util.List<PivotValueRegion> pivotValueRegions) {
    this.pivotValueRegions = pivotValueRegions;
    return this;
  }

  /**
   * Each value corresponds to each Metric in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * Each value corresponds to each Metric in the request.
   * @param values values or {@code null} for none
   */
  public DateRangeValues setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public DateRangeValues set(String fieldName, Object value) {
    return (DateRangeValues) super.set(fieldName, value);
  }

  @Override
  public DateRangeValues clone() {
    return (DateRangeValues) super.clone();
  }

}
