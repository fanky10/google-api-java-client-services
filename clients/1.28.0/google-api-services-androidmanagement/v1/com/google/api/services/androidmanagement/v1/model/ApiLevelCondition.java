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

package com.google.api.services.androidmanagement.v1.model;

/**
 * A compliance rule condition which is satisfied if the Android Framework API level on the device
 * doesn't meet a minimum requirement. There can only be one rule with this type of condition per
 * policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApiLevelCondition extends com.google.api.client.json.GenericJson {

  /**
   * The minimum desired Android Framework API level. If the device doesn't meet the minimum
   * requirement, this condition is satisfied. Must be greater than zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minApiLevel;

  /**
   * The minimum desired Android Framework API level. If the device doesn't meet the minimum
   * requirement, this condition is satisfied. Must be greater than zero.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinApiLevel() {
    return minApiLevel;
  }

  /**
   * The minimum desired Android Framework API level. If the device doesn't meet the minimum
   * requirement, this condition is satisfied. Must be greater than zero.
   * @param minApiLevel minApiLevel or {@code null} for none
   */
  public ApiLevelCondition setMinApiLevel(java.lang.Integer minApiLevel) {
    this.minApiLevel = minApiLevel;
    return this;
  }

  @Override
  public ApiLevelCondition set(String fieldName, Object value) {
    return (ApiLevelCondition) super.set(fieldName, value);
  }

  @Override
  public ApiLevelCondition clone() {
    return (ApiLevelCondition) super.clone();
  }

}
