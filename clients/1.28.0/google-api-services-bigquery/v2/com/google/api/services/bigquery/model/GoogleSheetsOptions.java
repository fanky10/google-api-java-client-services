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

package com.google.api.services.bigquery.model;

/**
 * Model definition for GoogleSheetsOptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleSheetsOptions extends com.google.api.client.json.GenericJson {

  /**
   * [Beta] [Optional] Range of a sheet to query from. Only used when non-empty. Typical format:
   * sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String range;

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the
   * data. The default value is 0. This property is useful if you have header rows that should be
   * skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified -
   * Autodetect tries to detect headers in the first row. If they are not detected, the row is read
   * as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 -
   * Instructs autodetect that there are no headers and data should be read starting from the first
   * row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row
   * N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
   * column names for the detected schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long skipLeadingRows;

  /**
   * [Beta] [Optional] Range of a sheet to query from. Only used when non-empty. Typical format:
   * sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
   * @return value or {@code null} for none
   */
  public java.lang.String getRange() {
    return range;
  }

  /**
   * [Beta] [Optional] Range of a sheet to query from. Only used when non-empty. Typical format:
   * sheet_name!top_left_cell_id:bottom_right_cell_id For example: sheet1!A1:B20
   * @param range range or {@code null} for none
   */
  public GoogleSheetsOptions setRange(java.lang.String range) {
    this.range = range;
    return this;
  }

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the
   * data. The default value is 0. This property is useful if you have header rows that should be
   * skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified -
   * Autodetect tries to detect headers in the first row. If they are not detected, the row is read
   * as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 -
   * Instructs autodetect that there are no headers and data should be read starting from the first
   * row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row
   * N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
   * column names for the detected schema.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSkipLeadingRows() {
    return skipLeadingRows;
  }

  /**
   * [Optional] The number of rows at the top of a sheet that BigQuery will skip when reading the
   * data. The default value is 0. This property is useful if you have header rows that should be
   * skipped. When autodetect is on, behavior is the following: * skipLeadingRows unspecified -
   * Autodetect tries to detect headers in the first row. If they are not detected, the row is read
   * as data. Otherwise data is read starting from the second row. * skipLeadingRows is 0 -
   * Instructs autodetect that there are no headers and data should be read starting from the first
   * row. * skipLeadingRows = N > 0 - Autodetect skips N-1 rows and tries to detect headers in row
   * N. If headers are not detected, row N is just skipped. Otherwise row N is used to extract
   * column names for the detected schema.
   * @param skipLeadingRows skipLeadingRows or {@code null} for none
   */
  public GoogleSheetsOptions setSkipLeadingRows(java.lang.Long skipLeadingRows) {
    this.skipLeadingRows = skipLeadingRows;
    return this;
  }

  @Override
  public GoogleSheetsOptions set(String fieldName, Object value) {
    return (GoogleSheetsOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleSheetsOptions clone() {
    return (GoogleSheetsOptions) super.clone();
  }

}
