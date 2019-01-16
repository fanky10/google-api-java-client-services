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

package com.google.api.services.dlp.v2.model;

/**
 * Request message for UpdateDeidentifyTemplate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends com.google.api.client.json.GenericJson {

  /**
   * New DeidentifyTemplate value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DeidentifyTemplate deidentifyTemplate;

  /**
   * Mask to control which fields get updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateMask;

  /**
   * New DeidentifyTemplate value.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DeidentifyTemplate getDeidentifyTemplate() {
    return deidentifyTemplate;
  }

  /**
   * New DeidentifyTemplate value.
   * @param deidentifyTemplate deidentifyTemplate or {@code null} for none
   */
  public GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest setDeidentifyTemplate(GooglePrivacyDlpV2DeidentifyTemplate deidentifyTemplate) {
    this.deidentifyTemplate = deidentifyTemplate;
    return this;
  }

  /**
   * Mask to control which fields get updated.
   * @return value or {@code null} for none
   */
  public String getUpdateMask() {
    return updateMask;
  }

  /**
   * Mask to control which fields get updated.
   * @param updateMask updateMask or {@code null} for none
   */
  public GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest clone() {
    return (GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest) super.clone();
  }

}
