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

package com.google.api.services.books.model;

/**
 * Model definition for Volume2.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Books API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Volume2 extends com.google.api.client.json.GenericJson {

  /**
   * A list of volumes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> items;

  static {
    // hack to force ProGuard to consider Volume used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Volume.class);
  }

  /**
   * Resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of volumes.
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getItems() {
    return items;
  }

  /**
   * A list of volumes.
   * @param items items or {@code null} for none
   */
  public Volume2 setItems(java.util.List<Volume> items) {
    this.items = items;
    return this;
  }

  /**
   * Resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type.
   * @param kind kind or {@code null} for none
   */
  public Volume2 setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public Volume2 setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public Volume2 set(String fieldName, Object value) {
    return (Volume2) super.set(fieldName, value);
  }

  @Override
  public Volume2 clone() {
    return (Volume2) super.clone();
  }

}
