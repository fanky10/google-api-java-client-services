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

package com.google.api.services.jobs.v2.model;

/**
 * Deprecated. See CompensationInfo.
 *
 * A compensation entry that represents one component of compensation, such as base pay, bonus, or
 * other compensation type.
 *
 * Annualization: One compensation entry can be annualized if - it contains valid amount or range. -
 * and its expected_units_per_year is set or can be derived. Its annualized range is determined as
 * (amount or range) times expected_units_per_year.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExtendedCompensationInfoCompensationEntry extends com.google.api.client.json.GenericJson {

  /**
   * Optional.
   *
   * Monetary amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedCompensationInfoDecimal amount;

  /**
   * Optional.
   *
   * Compensation description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional.
   *
   * Expected number of units paid each year. If not specified, when Job.employment_types is
   * FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
   * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedCompensationInfoDecimal expectedUnitsPerYear;

  /**
   * Optional.
   *
   * Compensation range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedCompensationInfoCompensationRange range;

  /**
   * Required.
   *
   * Compensation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional.
   *
   * Frequency of the specified amount.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_UNIT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Optional.
   *
   * Indicates compensation amount and range are unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean unspecified;

  /**
   * Optional.
   *
   * Monetary amount.
   * @return value or {@code null} for none
   */
  public ExtendedCompensationInfoDecimal getAmount() {
    return amount;
  }

  /**
   * Optional.
   *
   * Monetary amount.
   * @param amount amount or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setAmount(ExtendedCompensationInfoDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Optional.
   *
   * Compensation description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional.
   *
   * Compensation description.
   * @param description description or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional.
   *
   * Expected number of units paid each year. If not specified, when Job.employment_types is
   * FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
   * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
   * @return value or {@code null} for none
   */
  public ExtendedCompensationInfoDecimal getExpectedUnitsPerYear() {
    return expectedUnitsPerYear;
  }

  /**
   * Optional.
   *
   * Expected number of units paid each year. If not specified, when Job.employment_types is
   * FULLTIME, a default value is inferred based on unit. Default values: - HOURLY: 2080 - DAILY:
   * 260 - WEEKLY: 52 - MONTHLY: 12 - ANNUAL: 1
   * @param expectedUnitsPerYear expectedUnitsPerYear or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setExpectedUnitsPerYear(ExtendedCompensationInfoDecimal expectedUnitsPerYear) {
    this.expectedUnitsPerYear = expectedUnitsPerYear;
    return this;
  }

  /**
   * Optional.
   *
   * Compensation range.
   * @return value or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationRange getRange() {
    return range;
  }

  /**
   * Optional.
   *
   * Compensation range.
   * @param range range or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setRange(ExtendedCompensationInfoCompensationRange range) {
    this.range = range;
    return this;
  }

  /**
   * Required.
   *
   * Compensation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required.
   *
   * Compensation type.
   * @param type type or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Optional.
   *
   * Frequency of the specified amount.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_UNIT.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Optional.
   *
   * Frequency of the specified amount.
   *
   * Default is CompensationUnit.OTHER_COMPENSATION_UNIT.
   * @param unit unit or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Optional.
   *
   * Indicates compensation amount and range are unset.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnspecified() {
    return unspecified;
  }

  /**
   * Optional.
   *
   * Indicates compensation amount and range are unset.
   * @param unspecified unspecified or {@code null} for none
   */
  public ExtendedCompensationInfoCompensationEntry setUnspecified(java.lang.Boolean unspecified) {
    this.unspecified = unspecified;
    return this;
  }

  @Override
  public ExtendedCompensationInfoCompensationEntry set(String fieldName, Object value) {
    return (ExtendedCompensationInfoCompensationEntry) super.set(fieldName, value);
  }

  @Override
  public ExtendedCompensationInfoCompensationEntry clone() {
    return (ExtendedCompensationInfoCompensationEntry) super.clone();
  }

}
