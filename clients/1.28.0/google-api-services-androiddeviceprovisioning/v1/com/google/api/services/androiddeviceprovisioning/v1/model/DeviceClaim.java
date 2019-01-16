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

package com.google.api.services.androiddeviceprovisioning.v1.model;

/**
 * A record of a device claimed by a reseller for a customer. Devices claimed for zero-touch
 * enrollment have a claim with the type `SECTION_TYPE_ZERO_TOUCH`. To learn more, read [Claim
 * devices for customers](/zero-touch/guides/how-it-works#claim).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Device Provisioning Partner API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceClaim extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the Customer that purchased the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ownerCompanyId;

  /**
   * The ID of the reseller that claimed the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long resellerId;

  /**
   * Output only. The type of claim made on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sectionType;

  /**
   * The ID of the Customer that purchased the device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOwnerCompanyId() {
    return ownerCompanyId;
  }

  /**
   * The ID of the Customer that purchased the device.
   * @param ownerCompanyId ownerCompanyId or {@code null} for none
   */
  public DeviceClaim setOwnerCompanyId(java.lang.Long ownerCompanyId) {
    this.ownerCompanyId = ownerCompanyId;
    return this;
  }

  /**
   * The ID of the reseller that claimed the device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getResellerId() {
    return resellerId;
  }

  /**
   * The ID of the reseller that claimed the device.
   * @param resellerId resellerId or {@code null} for none
   */
  public DeviceClaim setResellerId(java.lang.Long resellerId) {
    this.resellerId = resellerId;
    return this;
  }

  /**
   * Output only. The type of claim made on the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getSectionType() {
    return sectionType;
  }

  /**
   * Output only. The type of claim made on the device.
   * @param sectionType sectionType or {@code null} for none
   */
  public DeviceClaim setSectionType(java.lang.String sectionType) {
    this.sectionType = sectionType;
    return this;
  }

  @Override
  public DeviceClaim set(String fieldName, Object value) {
    return (DeviceClaim) super.set(fieldName, value);
  }

  @Override
  public DeviceClaim clone() {
    return (DeviceClaim) super.clone();
  }

}
