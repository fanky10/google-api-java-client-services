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
 * Properties of a grid.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GridProperties extends com.google.api.client.json.GenericJson {

  /**
   * The number of columns in the grid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer columnCount;

  /**
   * True if the column grouping control toggle is shown after the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean columnGroupControlAfter;

  /**
   * The number of columns that are frozen in the grid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer frozenColumnCount;

  /**
   * The number of rows that are frozen in the grid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer frozenRowCount;

  /**
   * True if the grid isn't showing gridlines in the UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hideGridlines;

  /**
   * The number of rows in the grid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rowCount;

  /**
   * True if the row grouping control toggle is shown after the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean rowGroupControlAfter;

  /**
   * The number of columns in the grid.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getColumnCount() {
    return columnCount;
  }

  /**
   * The number of columns in the grid.
   * @param columnCount columnCount or {@code null} for none
   */
  public GridProperties setColumnCount(java.lang.Integer columnCount) {
    this.columnCount = columnCount;
    return this;
  }

  /**
   * True if the column grouping control toggle is shown after the group.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getColumnGroupControlAfter() {
    return columnGroupControlAfter;
  }

  /**
   * True if the column grouping control toggle is shown after the group.
   * @param columnGroupControlAfter columnGroupControlAfter or {@code null} for none
   */
  public GridProperties setColumnGroupControlAfter(java.lang.Boolean columnGroupControlAfter) {
    this.columnGroupControlAfter = columnGroupControlAfter;
    return this;
  }

  /**
   * The number of columns that are frozen in the grid.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFrozenColumnCount() {
    return frozenColumnCount;
  }

  /**
   * The number of columns that are frozen in the grid.
   * @param frozenColumnCount frozenColumnCount or {@code null} for none
   */
  public GridProperties setFrozenColumnCount(java.lang.Integer frozenColumnCount) {
    this.frozenColumnCount = frozenColumnCount;
    return this;
  }

  /**
   * The number of rows that are frozen in the grid.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFrozenRowCount() {
    return frozenRowCount;
  }

  /**
   * The number of rows that are frozen in the grid.
   * @param frozenRowCount frozenRowCount or {@code null} for none
   */
  public GridProperties setFrozenRowCount(java.lang.Integer frozenRowCount) {
    this.frozenRowCount = frozenRowCount;
    return this;
  }

  /**
   * True if the grid isn't showing gridlines in the UI.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHideGridlines() {
    return hideGridlines;
  }

  /**
   * True if the grid isn't showing gridlines in the UI.
   * @param hideGridlines hideGridlines or {@code null} for none
   */
  public GridProperties setHideGridlines(java.lang.Boolean hideGridlines) {
    this.hideGridlines = hideGridlines;
    return this;
  }

  /**
   * The number of rows in the grid.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRowCount() {
    return rowCount;
  }

  /**
   * The number of rows in the grid.
   * @param rowCount rowCount or {@code null} for none
   */
  public GridProperties setRowCount(java.lang.Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }

  /**
   * True if the row grouping control toggle is shown after the group.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getRowGroupControlAfter() {
    return rowGroupControlAfter;
  }

  /**
   * True if the row grouping control toggle is shown after the group.
   * @param rowGroupControlAfter rowGroupControlAfter or {@code null} for none
   */
  public GridProperties setRowGroupControlAfter(java.lang.Boolean rowGroupControlAfter) {
    this.rowGroupControlAfter = rowGroupControlAfter;
    return this;
  }

  @Override
  public GridProperties set(String fieldName, Object value) {
    return (GridProperties) super.set(fieldName, value);
  }

  @Override
  public GridProperties clone() {
    return (GridProperties) super.clone();
  }

}
