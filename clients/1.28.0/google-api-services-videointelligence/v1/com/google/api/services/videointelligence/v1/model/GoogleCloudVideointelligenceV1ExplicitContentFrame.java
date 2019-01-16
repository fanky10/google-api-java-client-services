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

package com.google.api.services.videointelligence.v1.model;

/**
 * Video frame level annotation results for explicit content.
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
public final class GoogleCloudVideointelligenceV1ExplicitContentFrame extends com.google.api.client.json.GenericJson {

  /**
   * Likelihood of the pornography content..
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pornographyLikelihood;

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeOffset;

  /**
   * Likelihood of the pornography content..
   * @return value or {@code null} for none
   */
  public java.lang.String getPornographyLikelihood() {
    return pornographyLikelihood;
  }

  /**
   * Likelihood of the pornography content..
   * @param pornographyLikelihood pornographyLikelihood or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1ExplicitContentFrame setPornographyLikelihood(java.lang.String pornographyLikelihood) {
    this.pornographyLikelihood = pornographyLikelihood;
    return this;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * location.
   * @return value or {@code null} for none
   */
  public String getTimeOffset() {
    return timeOffset;
  }

  /**
   * Time-offset, relative to the beginning of the video, corresponding to the video frame for this
   * location.
   * @param timeOffset timeOffset or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1ExplicitContentFrame setTimeOffset(String timeOffset) {
    this.timeOffset = timeOffset;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1ExplicitContentFrame set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1ExplicitContentFrame) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1ExplicitContentFrame clone() {
    return (GoogleCloudVideointelligenceV1ExplicitContentFrame) super.clone();
  }

}
