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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Information relevant only to a restrict entry. NextId: 7
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RestrictItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveFollowUpRestrict driveFollowUpRestrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveLocationRestrict driveLocationRestrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveMimeTypeRestrict driveMimeTypeRestrict;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveTimeSpanRestrict driveTimeSpanRestrict;

  /**
   * The search restrict (e.g. "after:2017-09-11 before:2017-09-12").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchOperator;

  /**
   * @return value or {@code null} for none
   */
  public DriveFollowUpRestrict getDriveFollowUpRestrict() {
    return driveFollowUpRestrict;
  }

  /**
   * @param driveFollowUpRestrict driveFollowUpRestrict or {@code null} for none
   */
  public RestrictItem setDriveFollowUpRestrict(DriveFollowUpRestrict driveFollowUpRestrict) {
    this.driveFollowUpRestrict = driveFollowUpRestrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public DriveLocationRestrict getDriveLocationRestrict() {
    return driveLocationRestrict;
  }

  /**
   * @param driveLocationRestrict driveLocationRestrict or {@code null} for none
   */
  public RestrictItem setDriveLocationRestrict(DriveLocationRestrict driveLocationRestrict) {
    this.driveLocationRestrict = driveLocationRestrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public DriveMimeTypeRestrict getDriveMimeTypeRestrict() {
    return driveMimeTypeRestrict;
  }

  /**
   * @param driveMimeTypeRestrict driveMimeTypeRestrict or {@code null} for none
   */
  public RestrictItem setDriveMimeTypeRestrict(DriveMimeTypeRestrict driveMimeTypeRestrict) {
    this.driveMimeTypeRestrict = driveMimeTypeRestrict;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public DriveTimeSpanRestrict getDriveTimeSpanRestrict() {
    return driveTimeSpanRestrict;
  }

  /**
   * @param driveTimeSpanRestrict driveTimeSpanRestrict or {@code null} for none
   */
  public RestrictItem setDriveTimeSpanRestrict(DriveTimeSpanRestrict driveTimeSpanRestrict) {
    this.driveTimeSpanRestrict = driveTimeSpanRestrict;
    return this;
  }

  /**
   * The search restrict (e.g. "after:2017-09-11 before:2017-09-12").
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchOperator() {
    return searchOperator;
  }

  /**
   * The search restrict (e.g. "after:2017-09-11 before:2017-09-12").
   * @param searchOperator searchOperator or {@code null} for none
   */
  public RestrictItem setSearchOperator(java.lang.String searchOperator) {
    this.searchOperator = searchOperator;
    return this;
  }

  @Override
  public RestrictItem set(String fieldName, Object value) {
    return (RestrictItem) super.set(fieldName, value);
  }

  @Override
  public RestrictItem clone() {
    return (RestrictItem) super.clone();
  }

}
