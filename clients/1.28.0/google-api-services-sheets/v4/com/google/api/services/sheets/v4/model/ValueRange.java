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

package com.google.api.services.sheets.v4.model;

/**
 * Data within a range of the spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ValueRange extends com.google.api.client.json.GenericJson {

  /**
   * The major dimension of the values.
   *
   * For output, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
   * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting
   * `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`.
   *
   * For input, with `range=A1:B2,majorDimension=ROWS` then `[[1,2],[3,4]]` will set
   * `A1=1,B1=2,A2=3,B2=4`. With `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]` will set
   * `A1=1,B1=3,A2=2,B2=4`.
   *
   * When writing, if this field is not set, it defaults to ROWS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String majorDimension;

  /**
   * The range the values cover, in A1 notation. For output, this range indicates the entire
   * requested range, even though the values will exclude trailing rows and columns. When appending
   * values, this field represents the range to search for a table, after which values will be
   * appended.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String range;

  /**
   * The data that was read or to be written.  This is an array of arrays, the outer array
   * representing all the data and each inner array representing a major dimension. Each item in the
   * inner array corresponds with one cell.
   *
   * For output, empty trailing rows and columns will not be included.
   *
   * For input, supported value types are: bool, string, and double. Null values will be skipped. To
   * set a cell to an empty value, set the string value to an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.util.List<java.lang.Object>> values;

  /**
   * The major dimension of the values.
   *
   * For output, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
   * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting
   * `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`.
   *
   * For input, with `range=A1:B2,majorDimension=ROWS` then `[[1,2],[3,4]]` will set
   * `A1=1,B1=2,A2=3,B2=4`. With `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]` will set
   * `A1=1,B1=3,A2=2,B2=4`.
   *
   * When writing, if this field is not set, it defaults to ROWS.
   * @return value or {@code null} for none
   */
  public java.lang.String getMajorDimension() {
    return majorDimension;
  }

  /**
   * The major dimension of the values.
   *
   * For output, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
   * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas requesting
   * `range=A1:B2,majorDimension=COLUMNS` will return `[[1,3],[2,4]]`.
   *
   * For input, with `range=A1:B2,majorDimension=ROWS` then `[[1,2],[3,4]]` will set
   * `A1=1,B1=2,A2=3,B2=4`. With `range=A1:B2,majorDimension=COLUMNS` then `[[1,2],[3,4]]` will set
   * `A1=1,B1=3,A2=2,B2=4`.
   *
   * When writing, if this field is not set, it defaults to ROWS.
   * @param majorDimension majorDimension or {@code null} for none
   */
  public ValueRange setMajorDimension(java.lang.String majorDimension) {
    this.majorDimension = majorDimension;
    return this;
  }

  /**
   * The range the values cover, in A1 notation. For output, this range indicates the entire
   * requested range, even though the values will exclude trailing rows and columns. When appending
   * values, this field represents the range to search for a table, after which values will be
   * appended.
   * @return value or {@code null} for none
   */
  public java.lang.String getRange() {
    return range;
  }

  /**
   * The range the values cover, in A1 notation. For output, this range indicates the entire
   * requested range, even though the values will exclude trailing rows and columns. When appending
   * values, this field represents the range to search for a table, after which values will be
   * appended.
   * @param range range or {@code null} for none
   */
  public ValueRange setRange(java.lang.String range) {
    this.range = range;
    return this;
  }

  /**
   * The data that was read or to be written.  This is an array of arrays, the outer array
   * representing all the data and each inner array representing a major dimension. Each item in the
   * inner array corresponds with one cell.
   *
   * For output, empty trailing rows and columns will not be included.
   *
   * For input, supported value types are: bool, string, and double. Null values will be skipped. To
   * set a cell to an empty value, set the string value to an empty string.
   * @return value or {@code null} for none
   */
  public java.util.List<java.util.List<java.lang.Object>> getValues() {
    return values;
  }

  /**
   * The data that was read or to be written.  This is an array of arrays, the outer array
   * representing all the data and each inner array representing a major dimension. Each item in the
   * inner array corresponds with one cell.
   *
   * For output, empty trailing rows and columns will not be included.
   *
   * For input, supported value types are: bool, string, and double. Null values will be skipped. To
   * set a cell to an empty value, set the string value to an empty string.
   * @param values values or {@code null} for none
   */
  public ValueRange setValues(java.util.List<java.util.List<java.lang.Object>> values) {
    this.values = values;
    return this;
  }

  @Override
  public ValueRange set(String fieldName, Object value) {
    return (ValueRange) super.set(fieldName, value);
  }

  @Override
  public ValueRange clone() {
    return (ValueRange) super.clone();
  }

}
