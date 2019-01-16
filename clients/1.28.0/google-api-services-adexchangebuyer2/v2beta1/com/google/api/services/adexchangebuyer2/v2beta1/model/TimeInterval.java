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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * An interval of time, with an absolute start and end.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeInterval extends com.google.api.client.json.GenericJson {

  /**
   * The timestamp marking the end of the range (exclusive) for which data is included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The timestamp marking the start of the range (inclusive) for which data is included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The timestamp marking the end of the range (exclusive) for which data is included.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The timestamp marking the end of the range (exclusive) for which data is included.
   * @param endTime endTime or {@code null} for none
   */
  public TimeInterval setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The timestamp marking the start of the range (inclusive) for which data is included.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The timestamp marking the start of the range (inclusive) for which data is included.
   * @param startTime startTime or {@code null} for none
   */
  public TimeInterval setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public TimeInterval set(String fieldName, Object value) {
    return (TimeInterval) super.set(fieldName, value);
  }

  @Override
  public TimeInterval clone() {
    return (TimeInterval) super.clone();
  }

}
