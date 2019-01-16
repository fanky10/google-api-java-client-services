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

package com.google.api.services.servicemanagement.model;

/**
 * Strategy that specifies how clients of Google Service Controller want to send traffic to use
 * different config versions. This is generally used by API proxy to split traffic based on your
 * configured precentage for each config version.
 *
 * One example of how to gradually rollout a new service configuration using this strategy: Day 1
 *
 *     Rollout {       id: "example.googleapis.com/rollout_20160206"       traffic_percent_strategy
 * {         percentages: {           "example.googleapis.com/20160201": 70.00
 * "example.googleapis.com/20160206": 30.00         }       }     }
 *
 * Day 2
 *
 *     Rollout {       id: "example.googleapis.com/rollout_20160207"       traffic_percent_strategy:
 * {         percentages: {           "example.googleapis.com/20160206": 100.00         }       }
 * }
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrafficPercentStrategy extends com.google.api.client.json.GenericJson {

  /**
   * Maps service configuration IDs to their corresponding traffic percentage. Key is the service
   * configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum
   * must equal to 100.0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Double> percentages;

  /**
   * Maps service configuration IDs to their corresponding traffic percentage. Key is the service
   * configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum
   * must equal to 100.0.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Double> getPercentages() {
    return percentages;
  }

  /**
   * Maps service configuration IDs to their corresponding traffic percentage. Key is the service
   * configuration ID, Value is the traffic percentage which must be greater than 0.0 and the sum
   * must equal to 100.0.
   * @param percentages percentages or {@code null} for none
   */
  public TrafficPercentStrategy setPercentages(java.util.Map<String, java.lang.Double> percentages) {
    this.percentages = percentages;
    return this;
  }

  @Override
  public TrafficPercentStrategy set(String fieldName, Object value) {
    return (TrafficPercentStrategy) super.set(fieldName, value);
  }

  @Override
  public TrafficPercentStrategy clone() {
    return (TrafficPercentStrategy) super.clone();
  }

}
