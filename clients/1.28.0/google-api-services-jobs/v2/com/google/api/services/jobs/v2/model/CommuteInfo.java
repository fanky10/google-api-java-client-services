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
 * Output only.
 *
 * Commute details related to this job.
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
public final class CommuteInfo extends com.google.api.client.json.GenericJson {

  /**
   * Location used as the destination in the commute calculation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobLocation jobLocation;

  /**
   * The number of seconds required to travel to the job location from the query location. A
   * duration of 0 seconds indicates that the job is not reachable within the requested duration,
   * but was returned as part of an expanded query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String travelDuration;

  /**
   * Location used as the destination in the commute calculation.
   * @return value or {@code null} for none
   */
  public JobLocation getJobLocation() {
    return jobLocation;
  }

  /**
   * Location used as the destination in the commute calculation.
   * @param jobLocation jobLocation or {@code null} for none
   */
  public CommuteInfo setJobLocation(JobLocation jobLocation) {
    this.jobLocation = jobLocation;
    return this;
  }

  /**
   * The number of seconds required to travel to the job location from the query location. A
   * duration of 0 seconds indicates that the job is not reachable within the requested duration,
   * but was returned as part of an expanded query.
   * @return value or {@code null} for none
   */
  public String getTravelDuration() {
    return travelDuration;
  }

  /**
   * The number of seconds required to travel to the job location from the query location. A
   * duration of 0 seconds indicates that the job is not reachable within the requested duration,
   * but was returned as part of an expanded query.
   * @param travelDuration travelDuration or {@code null} for none
   */
  public CommuteInfo setTravelDuration(String travelDuration) {
    this.travelDuration = travelDuration;
    return this;
  }

  @Override
  public CommuteInfo set(String fieldName, Object value) {
    return (CommuteInfo) super.set(fieldName, value);
  }

  @Override
  public CommuteInfo clone() {
    return (CommuteInfo) super.clone();
  }

}
