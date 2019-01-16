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
 * Dynamic segment definition for defining the segment within the request. A segment can select
 * users, sessions or both.
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
public final class DynamicSegment extends com.google.api.client.json.GenericJson {

  /**
   * The name of the dynamic segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Session Segment to select sessions to include in the segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SegmentDefinition sessionSegment;

  /**
   * User Segment to select users to include in the segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SegmentDefinition userSegment;

  /**
   * The name of the dynamic segment.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the dynamic segment.
   * @param name name or {@code null} for none
   */
  public DynamicSegment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Session Segment to select sessions to include in the segment.
   * @return value or {@code null} for none
   */
  public SegmentDefinition getSessionSegment() {
    return sessionSegment;
  }

  /**
   * Session Segment to select sessions to include in the segment.
   * @param sessionSegment sessionSegment or {@code null} for none
   */
  public DynamicSegment setSessionSegment(SegmentDefinition sessionSegment) {
    this.sessionSegment = sessionSegment;
    return this;
  }

  /**
   * User Segment to select users to include in the segment.
   * @return value or {@code null} for none
   */
  public SegmentDefinition getUserSegment() {
    return userSegment;
  }

  /**
   * User Segment to select users to include in the segment.
   * @param userSegment userSegment or {@code null} for none
   */
  public DynamicSegment setUserSegment(SegmentDefinition userSegment) {
    this.userSegment = userSegment;
    return this;
  }

  @Override
  public DynamicSegment set(String fieldName, Object value) {
    return (DynamicSegment) super.set(fieldName, value);
  }

  @Override
  public DynamicSegment clone() {
    return (DynamicSegment) super.clone();
  }

}
