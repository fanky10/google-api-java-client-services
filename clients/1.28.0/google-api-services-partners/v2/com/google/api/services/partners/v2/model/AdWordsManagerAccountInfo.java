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

package com.google.api.services.partners.v2.model;

/**
 * Information about a particular AdWords Manager Account. Read more at
 * https://support.google.com/adwords/answer/6139186
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdWordsManagerAccountInfo extends com.google.api.client.json.GenericJson {

  /**
   * Name of the customer this account represents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerName;

  /**
   * The AdWords Manager Account id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Name of the customer this account represents.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerName() {
    return customerName;
  }

  /**
   * Name of the customer this account represents.
   * @param customerName customerName or {@code null} for none
   */
  public AdWordsManagerAccountInfo setCustomerName(java.lang.String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * The AdWords Manager Account id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * The AdWords Manager Account id.
   * @param id id or {@code null} for none
   */
  public AdWordsManagerAccountInfo setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  @Override
  public AdWordsManagerAccountInfo set(String fieldName, Object value) {
    return (AdWordsManagerAccountInfo) super.set(fieldName, value);
  }

  @Override
  public AdWordsManagerAccountInfo clone() {
    return (AdWordsManagerAccountInfo) super.clone();
  }

}
