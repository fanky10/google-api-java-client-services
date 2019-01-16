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

package com.google.api.services.slides.v1.model;

/**
 * Properties of each row in a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableRowProperties extends com.google.api.client.json.GenericJson {

  /**
   * Minimum height of the row. The row will be rendered in the Slides editor at a height equal to
   * or greater than this value in order to show all the text in the row's cell(s).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimension minRowHeight;

  /**
   * Minimum height of the row. The row will be rendered in the Slides editor at a height equal to
   * or greater than this value in order to show all the text in the row's cell(s).
   * @return value or {@code null} for none
   */
  public Dimension getMinRowHeight() {
    return minRowHeight;
  }

  /**
   * Minimum height of the row. The row will be rendered in the Slides editor at a height equal to
   * or greater than this value in order to show all the text in the row's cell(s).
   * @param minRowHeight minRowHeight or {@code null} for none
   */
  public TableRowProperties setMinRowHeight(Dimension minRowHeight) {
    this.minRowHeight = minRowHeight;
    return this;
  }

  @Override
  public TableRowProperties set(String fieldName, Object value) {
    return (TableRowProperties) super.set(fieldName, value);
  }

  @Override
  public TableRowProperties clone() {
    return (TableRowProperties) super.clone();
  }

}
