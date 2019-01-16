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

package com.google.api.services.dfareporting.model;

/**
 * Third-party Tracking URL.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThirdPartyTrackingUrl extends com.google.api.client.json.GenericJson {

  /**
   * Third-party URL type for in-stream video and in-stream audio creatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thirdPartyUrlType;

  /**
   * URL for the specified third-party URL type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Third-party URL type for in-stream video and in-stream audio creatives.
   * @return value or {@code null} for none
   */
  public java.lang.String getThirdPartyUrlType() {
    return thirdPartyUrlType;
  }

  /**
   * Third-party URL type for in-stream video and in-stream audio creatives.
   * @param thirdPartyUrlType thirdPartyUrlType or {@code null} for none
   */
  public ThirdPartyTrackingUrl setThirdPartyUrlType(java.lang.String thirdPartyUrlType) {
    this.thirdPartyUrlType = thirdPartyUrlType;
    return this;
  }

  /**
   * URL for the specified third-party URL type.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * URL for the specified third-party URL type.
   * @param url url or {@code null} for none
   */
  public ThirdPartyTrackingUrl setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ThirdPartyTrackingUrl set(String fieldName, Object value) {
    return (ThirdPartyTrackingUrl) super.set(fieldName, value);
  }

  @Override
  public ThirdPartyTrackingUrl clone() {
    return (ThirdPartyTrackingUrl) super.clone();
  }

}
