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

package com.google.api.services.analytics.model;

/**
 * An segment collection lists Analytics segments that the user has access to. Each resource in the
 * collection corresponds to a single Analytics segment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Segments extends com.google.api.client.json.GenericJson {

  /**
   * A list of segments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Segment> items;

  static {
    // hack to force ProGuard to consider Segment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Segment.class);
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of
   * resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
   * otherwise specified by the max-results query parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer itemsPerPage;

  /**
   * Collection type for segments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Link to next page for this segment collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextLink;

  /**
   * Link to previous page for this segment collection.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String previousLink;

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-
   * index query parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startIndex;

  /**
   * The total number of results for the query, regardless of the number of results in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalResults;

  /**
   * Email ID of the authenticated user
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String username;

  /**
   * A list of segments.
   * @return value or {@code null} for none
   */
  public java.util.List<Segment> getItems() {
    return items;
  }

  /**
   * A list of segments.
   * @param items items or {@code null} for none
   */
  public Segments setItems(java.util.List<Segment> items) {
    this.items = items;
    return this;
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of
   * resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
   * otherwise specified by the max-results query parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getItemsPerPage() {
    return itemsPerPage;
  }

  /**
   * The maximum number of resources the response can contain, regardless of the actual number of
   * resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or
   * otherwise specified by the max-results query parameter.
   * @param itemsPerPage itemsPerPage or {@code null} for none
   */
  public Segments setItemsPerPage(java.lang.Integer itemsPerPage) {
    this.itemsPerPage = itemsPerPage;
    return this;
  }

  /**
   * Collection type for segments.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Collection type for segments.
   * @param kind kind or {@code null} for none
   */
  public Segments setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Link to next page for this segment collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextLink() {
    return nextLink;
  }

  /**
   * Link to next page for this segment collection.
   * @param nextLink nextLink or {@code null} for none
   */
  public Segments setNextLink(java.lang.String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

  /**
   * Link to previous page for this segment collection.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreviousLink() {
    return previousLink;
  }

  /**
   * Link to previous page for this segment collection.
   * @param previousLink previousLink or {@code null} for none
   */
  public Segments setPreviousLink(java.lang.String previousLink) {
    this.previousLink = previousLink;
    return this;
  }

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-
   * index query parameter.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartIndex() {
    return startIndex;
  }

  /**
   * The starting index of the resources, which is 1 by default or otherwise specified by the start-
   * index query parameter.
   * @param startIndex startIndex or {@code null} for none
   */
  public Segments setStartIndex(java.lang.Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The total number of results for the query, regardless of the number of results in the response.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalResults() {
    return totalResults;
  }

  /**
   * The total number of results for the query, regardless of the number of results in the response.
   * @param totalResults totalResults or {@code null} for none
   */
  public Segments setTotalResults(java.lang.Integer totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  /**
   * Email ID of the authenticated user
   * @return value or {@code null} for none
   */
  public java.lang.String getUsername() {
    return username;
  }

  /**
   * Email ID of the authenticated user
   * @param username username or {@code null} for none
   */
  public Segments setUsername(java.lang.String username) {
    this.username = username;
    return this;
  }

  @Override
  public Segments set(String fieldName, Object value) {
    return (Segments) super.set(fieldName, value);
  }

  @Override
  public Segments clone() {
    return (Segments) super.clone();
  }

}
