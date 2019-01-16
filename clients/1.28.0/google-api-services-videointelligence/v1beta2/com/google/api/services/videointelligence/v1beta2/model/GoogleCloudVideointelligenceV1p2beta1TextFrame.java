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

package com.google.api.services.videointelligence.v1beta2.model;

/**
 * Video frame level annotation results for text annotation (OCR). Contains information regarding
 * timestamp and bounding box locations for the frames containing detected OCR text snippets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Video Intelligence API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVideointelligenceV1p2beta1TextFrame extends com.google.api.client.json.GenericJson {

  /**
   * Bounding polygon of the detected text for this frame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly rotatedBoundingBox;

  /**
   * Timestamp of this frame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeOffset;

  /**
   * Bounding polygon of the detected text for this frame.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly getRotatedBoundingBox() {
    return rotatedBoundingBox;
  }

  /**
   * Bounding polygon of the detected text for this frame.
   * @param rotatedBoundingBox rotatedBoundingBox or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1TextFrame setRotatedBoundingBox(GoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly rotatedBoundingBox) {
    this.rotatedBoundingBox = rotatedBoundingBox;
    return this;
  }

  /**
   * Timestamp of this frame.
   * @return value or {@code null} for none
   */
  public String getTimeOffset() {
    return timeOffset;
  }

  /**
   * Timestamp of this frame.
   * @param timeOffset timeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p2beta1TextFrame setTimeOffset(String timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1TextFrame set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p2beta1TextFrame) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p2beta1TextFrame clone() {
    return (GoogleCloudVideointelligenceV1p2beta1TextFrame) super.clone();
  }

}
