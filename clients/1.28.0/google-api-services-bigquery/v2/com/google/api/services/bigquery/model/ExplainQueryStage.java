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

package com.google.api.services.bigquery.model;

/**
 * Model definition for ExplainQueryStage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExplainQueryStage extends com.google.api.client.json.GenericJson {

  /**
   * Number of parallel input segments completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long completedParallelInputs;

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long computeMsAvg;

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long computeMsMax;

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double computeRatioAvg;

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double computeRatioMax;

  /**
   * Stage end time represented as milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long endMs;

  /**
   * Unique ID for stage within plan.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * IDs for stages that are inputs to this stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> inputStages;

  /**
   * Human-readable name for stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Number of parallel input segments to be processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long parallelInputs;

  /**
   * Milliseconds the average shard spent reading input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long readMsAvg;

  /**
   * Milliseconds the slowest shard spent reading input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long readMsMax;

  /**
   * Relative amount of time the average shard spent reading input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double readRatioAvg;

  /**
   * Relative amount of time the slowest shard spent reading input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double readRatioMax;

  /**
   * Number of records read into the stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long recordsRead;

  /**
   * Number of records written by the stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long recordsWritten;

  /**
   * Total number of bytes written to shuffle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long shuffleOutputBytes;

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long shuffleOutputBytesSpilled;

  /**
   * Stage start time represented as milliseconds since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long startMs;

  /**
   * Current status for the stage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExplainQueryStep> steps;

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long waitMsAvg;

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long waitMsMax;

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double waitRatioAvg;

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double waitRatioMax;

  /**
   * Milliseconds the average shard spent on writing output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long writeMsAvg;

  /**
   * Milliseconds the slowest shard spent on writing output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long writeMsMax;

  /**
   * Relative amount of time the average shard spent on writing output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double writeRatioAvg;

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double writeRatioMax;

  /**
   * Number of parallel input segments completed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCompletedParallelInputs() {
    return completedParallelInputs;
  }

  /**
   * Number of parallel input segments completed.
   * @param completedParallelInputs completedParallelInputs or {@code null} for none
   */
  public ExplainQueryStage setCompletedParallelInputs(java.lang.Long completedParallelInputs) {
    this.completedParallelInputs = completedParallelInputs;
    return this;
  }

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Long getComputeMsAvg() {
    return computeMsAvg;
  }

  /**
   * Milliseconds the average shard spent on CPU-bound tasks.
   * @param computeMsAvg computeMsAvg or {@code null} for none
   */
  public ExplainQueryStage setComputeMsAvg(java.lang.Long computeMsAvg) {
    this.computeMsAvg = computeMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Long getComputeMsMax() {
    return computeMsMax;
  }

  /**
   * Milliseconds the slowest shard spent on CPU-bound tasks.
   * @param computeMsMax computeMsMax or {@code null} for none
   */
  public ExplainQueryStage setComputeMsMax(java.lang.Long computeMsMax) {
    this.computeMsMax = computeMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Double getComputeRatioAvg() {
    return computeRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent on CPU-bound tasks.
   * @param computeRatioAvg computeRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setComputeRatioAvg(java.lang.Double computeRatioAvg) {
    this.computeRatioAvg = computeRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * @return value or {@code null} for none
   */
  public java.lang.Double getComputeRatioMax() {
    return computeRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent on CPU-bound tasks.
   * @param computeRatioMax computeRatioMax or {@code null} for none
   */
  public ExplainQueryStage setComputeRatioMax(java.lang.Double computeRatioMax) {
    this.computeRatioMax = computeRatioMax;
    return this;
  }

  /**
   * Stage end time represented as milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getEndMs() {
    return endMs;
  }

  /**
   * Stage end time represented as milliseconds since epoch.
   * @param endMs endMs or {@code null} for none
   */
  public ExplainQueryStage setEndMs(java.lang.Long endMs) {
    this.endMs = endMs;
    return this;
  }

  /**
   * Unique ID for stage within plan.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * Unique ID for stage within plan.
   * @param id id or {@code null} for none
   */
  public ExplainQueryStage setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * IDs for stages that are inputs to this stage.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getInputStages() {
    return inputStages;
  }

  /**
   * IDs for stages that are inputs to this stage.
   * @param inputStages inputStages or {@code null} for none
   */
  public ExplainQueryStage setInputStages(java.util.List<java.lang.Long> inputStages) {
    this.inputStages = inputStages;
    return this;
  }

  /**
   * Human-readable name for stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Human-readable name for stage.
   * @param name name or {@code null} for none
   */
  public ExplainQueryStage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Number of parallel input segments to be processed.
   * @return value or {@code null} for none
   */
  public java.lang.Long getParallelInputs() {
    return parallelInputs;
  }

  /**
   * Number of parallel input segments to be processed.
   * @param parallelInputs parallelInputs or {@code null} for none
   */
  public ExplainQueryStage setParallelInputs(java.lang.Long parallelInputs) {
    this.parallelInputs = parallelInputs;
    return this;
  }

  /**
   * Milliseconds the average shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReadMsAvg() {
    return readMsAvg;
  }

  /**
   * Milliseconds the average shard spent reading input.
   * @param readMsAvg readMsAvg or {@code null} for none
   */
  public ExplainQueryStage setReadMsAvg(java.lang.Long readMsAvg) {
    this.readMsAvg = readMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Long getReadMsMax() {
    return readMsMax;
  }

  /**
   * Milliseconds the slowest shard spent reading input.
   * @param readMsMax readMsMax or {@code null} for none
   */
  public ExplainQueryStage setReadMsMax(java.lang.Long readMsMax) {
    this.readMsMax = readMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Double getReadRatioAvg() {
    return readRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent reading input.
   * @param readRatioAvg readRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setReadRatioAvg(java.lang.Double readRatioAvg) {
    this.readRatioAvg = readRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent reading input.
   * @return value or {@code null} for none
   */
  public java.lang.Double getReadRatioMax() {
    return readRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent reading input.
   * @param readRatioMax readRatioMax or {@code null} for none
   */
  public ExplainQueryStage setReadRatioMax(java.lang.Double readRatioMax) {
    this.readRatioMax = readRatioMax;
    return this;
  }

  /**
   * Number of records read into the stage.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecordsRead() {
    return recordsRead;
  }

  /**
   * Number of records read into the stage.
   * @param recordsRead recordsRead or {@code null} for none
   */
  public ExplainQueryStage setRecordsRead(java.lang.Long recordsRead) {
    this.recordsRead = recordsRead;
    return this;
  }

  /**
   * Number of records written by the stage.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRecordsWritten() {
    return recordsWritten;
  }

  /**
   * Number of records written by the stage.
   * @param recordsWritten recordsWritten or {@code null} for none
   */
  public ExplainQueryStage setRecordsWritten(java.lang.Long recordsWritten) {
    this.recordsWritten = recordsWritten;
    return this;
  }

  /**
   * Total number of bytes written to shuffle.
   * @return value or {@code null} for none
   */
  public java.lang.Long getShuffleOutputBytes() {
    return shuffleOutputBytes;
  }

  /**
   * Total number of bytes written to shuffle.
   * @param shuffleOutputBytes shuffleOutputBytes or {@code null} for none
   */
  public ExplainQueryStage setShuffleOutputBytes(java.lang.Long shuffleOutputBytes) {
    this.shuffleOutputBytes = shuffleOutputBytes;
    return this;
  }

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * @return value or {@code null} for none
   */
  public java.lang.Long getShuffleOutputBytesSpilled() {
    return shuffleOutputBytesSpilled;
  }

  /**
   * Total number of bytes written to shuffle and spilled to disk.
   * @param shuffleOutputBytesSpilled shuffleOutputBytesSpilled or {@code null} for none
   */
  public ExplainQueryStage setShuffleOutputBytesSpilled(java.lang.Long shuffleOutputBytesSpilled) {
    this.shuffleOutputBytesSpilled = shuffleOutputBytesSpilled;
    return this;
  }

  /**
   * Stage start time represented as milliseconds since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStartMs() {
    return startMs;
  }

  /**
   * Stage start time represented as milliseconds since epoch.
   * @param startMs startMs or {@code null} for none
   */
  public ExplainQueryStage setStartMs(java.lang.Long startMs) {
    this.startMs = startMs;
    return this;
  }

  /**
   * Current status for the stage.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Current status for the stage.
   * @param status status or {@code null} for none
   */
  public ExplainQueryStage setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * @return value or {@code null} for none
   */
  public java.util.List<ExplainQueryStep> getSteps() {
    return steps;
  }

  /**
   * List of operations within the stage in dependency order (approximately chronological).
   * @param steps steps or {@code null} for none
   */
  public ExplainQueryStage setSteps(java.util.List<ExplainQueryStep> steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWaitMsAvg() {
    return waitMsAvg;
  }

  /**
   * Milliseconds the average shard spent waiting to be scheduled.
   * @param waitMsAvg waitMsAvg or {@code null} for none
   */
  public ExplainQueryStage setWaitMsAvg(java.lang.Long waitMsAvg) {
    this.waitMsAvg = waitMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWaitMsMax() {
    return waitMsMax;
  }

  /**
   * Milliseconds the slowest shard spent waiting to be scheduled.
   * @param waitMsMax waitMsMax or {@code null} for none
   */
  public ExplainQueryStage setWaitMsMax(java.lang.Long waitMsMax) {
    this.waitMsMax = waitMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWaitRatioAvg() {
    return waitRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent waiting to be scheduled.
   * @param waitRatioAvg waitRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setWaitRatioAvg(java.lang.Double waitRatioAvg) {
    this.waitRatioAvg = waitRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWaitRatioMax() {
    return waitRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent waiting to be scheduled.
   * @param waitRatioMax waitRatioMax or {@code null} for none
   */
  public ExplainQueryStage setWaitRatioMax(java.lang.Double waitRatioMax) {
    this.waitRatioMax = waitRatioMax;
    return this;
  }

  /**
   * Milliseconds the average shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWriteMsAvg() {
    return writeMsAvg;
  }

  /**
   * Milliseconds the average shard spent on writing output.
   * @param writeMsAvg writeMsAvg or {@code null} for none
   */
  public ExplainQueryStage setWriteMsAvg(java.lang.Long writeMsAvg) {
    this.writeMsAvg = writeMsAvg;
    return this;
  }

  /**
   * Milliseconds the slowest shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWriteMsMax() {
    return writeMsMax;
  }

  /**
   * Milliseconds the slowest shard spent on writing output.
   * @param writeMsMax writeMsMax or {@code null} for none
   */
  public ExplainQueryStage setWriteMsMax(java.lang.Long writeMsMax) {
    this.writeMsMax = writeMsMax;
    return this;
  }

  /**
   * Relative amount of time the average shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWriteRatioAvg() {
    return writeRatioAvg;
  }

  /**
   * Relative amount of time the average shard spent on writing output.
   * @param writeRatioAvg writeRatioAvg or {@code null} for none
   */
  public ExplainQueryStage setWriteRatioAvg(java.lang.Double writeRatioAvg) {
    this.writeRatioAvg = writeRatioAvg;
    return this;
  }

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * @return value or {@code null} for none
   */
  public java.lang.Double getWriteRatioMax() {
    return writeRatioMax;
  }

  /**
   * Relative amount of time the slowest shard spent on writing output.
   * @param writeRatioMax writeRatioMax or {@code null} for none
   */
  public ExplainQueryStage setWriteRatioMax(java.lang.Double writeRatioMax) {
    this.writeRatioMax = writeRatioMax;
    return this;
  }

  @Override
  public ExplainQueryStage set(String fieldName, Object value) {
    return (ExplainQueryStage) super.set(fieldName, value);
  }

  @Override
  public ExplainQueryStage clone() {
    return (ExplainQueryStage) super.clone();
  }

}
