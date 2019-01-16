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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * Billing related configuration of the service.
 *
 * The following example shows how to configure monitored resources and metrics for billing:
 *
 *     monitored_resources:     - type: library.googleapis.com/branch       labels:       - key:
 * /city         description: The city where the library branch is located in.       - key: /name
 * description: The name of the branch.     metrics:     - name:
 * library.googleapis.com/book/borrowed_count       metric_kind: DELTA       value_type: INT64
 * billing:       consumer_destinations:       - monitored_resource: library.googleapis.com/branch
 * metrics:         - library.googleapis.com/book/borrowed_count
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Billing extends com.google.api.client.json.GenericJson {

  /**
   * Billing configurations for sending metrics to the consumer project. There can be multiple
   * consumer destinations per service, each one must have a different monitored resource type. A
   * metric can be used in at most one consumer destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BillingDestination> consumerDestinations;

  /**
   * Billing configurations for sending metrics to the consumer project. There can be multiple
   * consumer destinations per service, each one must have a different monitored resource type. A
   * metric can be used in at most one consumer destination.
   * @return value or {@code null} for none
   */
  public java.util.List<BillingDestination> getConsumerDestinations() {
    return consumerDestinations;
  }

  /**
   * Billing configurations for sending metrics to the consumer project. There can be multiple
   * consumer destinations per service, each one must have a different monitored resource type. A
   * metric can be used in at most one consumer destination.
   * @param consumerDestinations consumerDestinations or {@code null} for none
   */
  public Billing setConsumerDestinations(java.util.List<BillingDestination> consumerDestinations) {
    this.consumerDestinations = consumerDestinations;
    return this;
  }

  @Override
  public Billing set(String fieldName, Object value) {
    return (Billing) super.set(fieldName, value);
  }

  @Override
  public Billing clone() {
    return (Billing) super.clone();
  }

}
