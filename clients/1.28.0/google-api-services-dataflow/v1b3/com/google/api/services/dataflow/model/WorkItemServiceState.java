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

package com.google.api.services.dataflow.model;

/**
 * The Dataflow service's idea of the current state of a WorkItem being processed by a worker.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkItemServiceState extends com.google.api.client.json.GenericJson {

  /**
   * Other data returned by the service, specific to the particular worker harness.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> harnessData;

  /**
   * Time at which the current lease will expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String leaseExpireTime;

  /**
   * The short ids that workers should use in subsequent metric updates. Workers should strive to
   * use short ids whenever possible, but it is ok to request the short_id again if a worker lost
   * track of it (e.g. if the worker is recovering from a crash). NOTE: it is possible that the
   * response may have short ids for a subset of the metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricShortId> metricShortId;

  static {
    // hack to force ProGuard to consider MetricShortId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricShortId.class);
  }

  /**
   * The index value to use for the next report sent by the worker. Note: If the report call fails
   * for whatever reason, the worker should reuse this index for subsequent report attempts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long nextReportIndex;

  /**
   * New recommended reporting interval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String reportStatusInterval;

  /**
   * The progress point in the WorkItem where the Dataflow service suggests that the worker truncate
   * the task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApproximateSplitRequest splitRequest;

  /**
   * DEPRECATED in favor of split_request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApproximateProgress suggestedStopPoint;

  /**
   * Obsolete, always empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Position suggestedStopPosition;

  /**
   * Other data returned by the service, specific to the particular worker harness.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getHarnessData() {
    return harnessData;
  }

  /**
   * Other data returned by the service, specific to the particular worker harness.
   * @param harnessData harnessData or {@code null} for none
   */
  public WorkItemServiceState setHarnessData(java.util.Map<String, java.lang.Object> harnessData) {
    this.harnessData = harnessData;
    return this;
  }

  /**
   * Time at which the current lease will expire.
   * @return value or {@code null} for none
   */
  public String getLeaseExpireTime() {
    return leaseExpireTime;
  }

  /**
   * Time at which the current lease will expire.
   * @param leaseExpireTime leaseExpireTime or {@code null} for none
   */
  public WorkItemServiceState setLeaseExpireTime(String leaseExpireTime) {
    this.leaseExpireTime = leaseExpireTime;
    return this;
  }

  /**
   * The short ids that workers should use in subsequent metric updates. Workers should strive to
   * use short ids whenever possible, but it is ok to request the short_id again if a worker lost
   * track of it (e.g. if the worker is recovering from a crash). NOTE: it is possible that the
   * response may have short ids for a subset of the metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricShortId> getMetricShortId() {
    return metricShortId;
  }

  /**
   * The short ids that workers should use in subsequent metric updates. Workers should strive to
   * use short ids whenever possible, but it is ok to request the short_id again if a worker lost
   * track of it (e.g. if the worker is recovering from a crash). NOTE: it is possible that the
   * response may have short ids for a subset of the metrics.
   * @param metricShortId metricShortId or {@code null} for none
   */
  public WorkItemServiceState setMetricShortId(java.util.List<MetricShortId> metricShortId) {
    this.metricShortId = metricShortId;
    return this;
  }

  /**
   * The index value to use for the next report sent by the worker. Note: If the report call fails
   * for whatever reason, the worker should reuse this index for subsequent report attempts.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNextReportIndex() {
    return nextReportIndex;
  }

  /**
   * The index value to use for the next report sent by the worker. Note: If the report call fails
   * for whatever reason, the worker should reuse this index for subsequent report attempts.
   * @param nextReportIndex nextReportIndex or {@code null} for none
   */
  public WorkItemServiceState setNextReportIndex(java.lang.Long nextReportIndex) {
    this.nextReportIndex = nextReportIndex;
    return this;
  }

  /**
   * New recommended reporting interval.
   * @return value or {@code null} for none
   */
  public String getReportStatusInterval() {
    return reportStatusInterval;
  }

  /**
   * New recommended reporting interval.
   * @param reportStatusInterval reportStatusInterval or {@code null} for none
   */
  public WorkItemServiceState setReportStatusInterval(String reportStatusInterval) {
    this.reportStatusInterval = reportStatusInterval;
    return this;
  }

  /**
   * The progress point in the WorkItem where the Dataflow service suggests that the worker truncate
   * the task.
   * @return value or {@code null} for none
   */
  public ApproximateSplitRequest getSplitRequest() {
    return splitRequest;
  }

  /**
   * The progress point in the WorkItem where the Dataflow service suggests that the worker truncate
   * the task.
   * @param splitRequest splitRequest or {@code null} for none
   */
  public WorkItemServiceState setSplitRequest(ApproximateSplitRequest splitRequest) {
    this.splitRequest = splitRequest;
    return this;
  }

  /**
   * DEPRECATED in favor of split_request.
   * @return value or {@code null} for none
   */
  public ApproximateProgress getSuggestedStopPoint() {
    return suggestedStopPoint;
  }

  /**
   * DEPRECATED in favor of split_request.
   * @param suggestedStopPoint suggestedStopPoint or {@code null} for none
   */
  public WorkItemServiceState setSuggestedStopPoint(ApproximateProgress suggestedStopPoint) {
    this.suggestedStopPoint = suggestedStopPoint;
    return this;
  }

  /**
   * Obsolete, always empty.
   * @return value or {@code null} for none
   */
  public Position getSuggestedStopPosition() {
    return suggestedStopPosition;
  }

  /**
   * Obsolete, always empty.
   * @param suggestedStopPosition suggestedStopPosition or {@code null} for none
   */
  public WorkItemServiceState setSuggestedStopPosition(Position suggestedStopPosition) {
    this.suggestedStopPosition = suggestedStopPosition;
    return this;
  }

  @Override
  public WorkItemServiceState set(String fieldName, Object value) {
    return (WorkItemServiceState) super.set(fieldName, value);
  }

  @Override
  public WorkItemServiceState clone() {
    return (WorkItemServiceState) super.clone();
  }

}
