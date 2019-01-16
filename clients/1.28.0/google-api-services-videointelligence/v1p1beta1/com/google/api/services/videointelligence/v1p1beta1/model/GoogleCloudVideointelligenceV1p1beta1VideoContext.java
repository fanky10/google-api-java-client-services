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

package com.google.api.services.videointelligence.v1p1beta1.model;

/**
 * Video context and/or feature-specific parameters.
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
public final class GoogleCloudVideointelligenceV1p1beta1VideoContext extends com.google.api.client.json.GenericJson {

  /**
   * Config for EXPLICIT_CONTENT_DETECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig explicitContentDetectionConfig;

  /**
   * Config for LABEL_DETECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1LabelDetectionConfig labelDetectionConfig;

  /**
   * Video segments to annotate. The segments may overlap and are not required to be contiguous or
   * span the whole video. If unspecified, each video is treated as a single segment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVideointelligenceV1p1beta1VideoSegment> segments;

  /**
   * Config for SHOT_CHANGE_DETECTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1ShotChangeDetectionConfig shotChangeDetectionConfig;

  /**
   * Config for SPEECH_TRANSCRIPTION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig speechTranscriptionConfig;

  /**
   * Config for EXPLICIT_CONTENT_DETECTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig getExplicitContentDetectionConfig() {
    return explicitContentDetectionConfig;
  }

  /**
   * Config for EXPLICIT_CONTENT_DETECTION.
   * @param explicitContentDetectionConfig explicitContentDetectionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoContext setExplicitContentDetectionConfig(GoogleCloudVideointelligenceV1p1beta1ExplicitContentDetectionConfig explicitContentDetectionConfig) {
    this.explicitContentDetectionConfig = explicitContentDetectionConfig;
    return this;
  }

  /**
   * Config for LABEL_DETECTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1LabelDetectionConfig getLabelDetectionConfig() {
    return labelDetectionConfig;
  }

  /**
   * Config for LABEL_DETECTION.
   * @param labelDetectionConfig labelDetectionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoContext setLabelDetectionConfig(GoogleCloudVideointelligenceV1p1beta1LabelDetectionConfig labelDetectionConfig) {
    this.labelDetectionConfig = labelDetectionConfig;
    return this;
  }

  /**
   * Video segments to annotate. The segments may overlap and are not required to be contiguous or
   * span the whole video. If unspecified, each video is treated as a single segment.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVideointelligenceV1p1beta1VideoSegment> getSegments() {
    return segments;
  }

  /**
   * Video segments to annotate. The segments may overlap and are not required to be contiguous or
   * span the whole video. If unspecified, each video is treated as a single segment.
   * @param segments segments or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoContext setSegments(java.util.List<GoogleCloudVideointelligenceV1p1beta1VideoSegment> segments) {
    this.segments = segments;
    return this;
  }

  /**
   * Config for SHOT_CHANGE_DETECTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1ShotChangeDetectionConfig getShotChangeDetectionConfig() {
    return shotChangeDetectionConfig;
  }

  /**
   * Config for SHOT_CHANGE_DETECTION.
   * @param shotChangeDetectionConfig shotChangeDetectionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoContext setShotChangeDetectionConfig(GoogleCloudVideointelligenceV1p1beta1ShotChangeDetectionConfig shotChangeDetectionConfig) {
    this.shotChangeDetectionConfig = shotChangeDetectionConfig;
    return this;
  }

  /**
   * Config for SPEECH_TRANSCRIPTION.
   * @return value or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig getSpeechTranscriptionConfig() {
    return speechTranscriptionConfig;
  }

  /**
   * Config for SPEECH_TRANSCRIPTION.
   * @param speechTranscriptionConfig speechTranscriptionConfig or {@code null} for none
   */
  public GoogleCloudVideointelligenceV1p1beta1VideoContext setSpeechTranscriptionConfig(GoogleCloudVideointelligenceV1p1beta1SpeechTranscriptionConfig speechTranscriptionConfig) {
    this.speechTranscriptionConfig = speechTranscriptionConfig;
    return this;
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1VideoContext set(String fieldName, Object value) {
    return (GoogleCloudVideointelligenceV1p1beta1VideoContext) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVideointelligenceV1p1beta1VideoContext clone() {
    return (GoogleCloudVideointelligenceV1p1beta1VideoContext) super.clone();
  }

}
