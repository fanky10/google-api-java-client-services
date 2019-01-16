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

package com.google.api.services.games.model;

/**
 * This is a JSON template for a player leaderboard score object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlayerLeaderboardScore extends com.google.api.client.json.GenericJson {

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerLeaderboardScore.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The ID of the leaderboard this score is in.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("leaderboard_id")
  private java.lang.String leaderboardId;

  /**
   * The public rank of the score in this leaderboard. This object will not be present if the user
   * is not sharing their scores publicly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LeaderboardScoreRank publicRank;

  /**
   * The formatted value of this score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scoreString;

  /**
   * Additional information about the score. Values must contain no more than 64 URI-safe characters
   * as defined by section 2.3 of RFC 3986.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scoreTag;

  /**
   * The numerical value of this score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scoreValue;

  /**
   * The social rank of the score in this leaderboard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LeaderboardScoreRank socialRank;

  /**
   * The time span of this score. Possible values are:   - "ALL_TIME" - The score is an all-time
   * score.  - "WEEKLY" - The score is a weekly score.  - "DAILY" - The score is a daily score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeSpan;

  /**
   * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long writeTimestamp;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerLeaderboardScore.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerLeaderboardScore.
   * @param kind kind or {@code null} for none
   */
  public PlayerLeaderboardScore setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The ID of the leaderboard this score is in.
   * @return value or {@code null} for none
   */
  public java.lang.String getLeaderboardId() {
    return leaderboardId;
  }

  /**
   * The ID of the leaderboard this score is in.
   * @param leaderboardId leaderboardId or {@code null} for none
   */
  public PlayerLeaderboardScore setLeaderboardId(java.lang.String leaderboardId) {
    this.leaderboardId = leaderboardId;
    return this;
  }

  /**
   * The public rank of the score in this leaderboard. This object will not be present if the user
   * is not sharing their scores publicly.
   * @return value or {@code null} for none
   */
  public LeaderboardScoreRank getPublicRank() {
    return publicRank;
  }

  /**
   * The public rank of the score in this leaderboard. This object will not be present if the user
   * is not sharing their scores publicly.
   * @param publicRank publicRank or {@code null} for none
   */
  public PlayerLeaderboardScore setPublicRank(LeaderboardScoreRank publicRank) {
    this.publicRank = publicRank;
    return this;
  }

  /**
   * The formatted value of this score.
   * @return value or {@code null} for none
   */
  public java.lang.String getScoreString() {
    return scoreString;
  }

  /**
   * The formatted value of this score.
   * @param scoreString scoreString or {@code null} for none
   */
  public PlayerLeaderboardScore setScoreString(java.lang.String scoreString) {
    this.scoreString = scoreString;
    return this;
  }

  /**
   * Additional information about the score. Values must contain no more than 64 URI-safe characters
   * as defined by section 2.3 of RFC 3986.
   * @return value or {@code null} for none
   */
  public java.lang.String getScoreTag() {
    return scoreTag;
  }

  /**
   * Additional information about the score. Values must contain no more than 64 URI-safe characters
   * as defined by section 2.3 of RFC 3986.
   * @param scoreTag scoreTag or {@code null} for none
   */
  public PlayerLeaderboardScore setScoreTag(java.lang.String scoreTag) {
    this.scoreTag = scoreTag;
    return this;
  }

  /**
   * The numerical value of this score.
   * @return value or {@code null} for none
   */
  public java.lang.Long getScoreValue() {
    return scoreValue;
  }

  /**
   * The numerical value of this score.
   * @param scoreValue scoreValue or {@code null} for none
   */
  public PlayerLeaderboardScore setScoreValue(java.lang.Long scoreValue) {
    this.scoreValue = scoreValue;
    return this;
  }

  /**
   * The social rank of the score in this leaderboard.
   * @return value or {@code null} for none
   */
  public LeaderboardScoreRank getSocialRank() {
    return socialRank;
  }

  /**
   * The social rank of the score in this leaderboard.
   * @param socialRank socialRank or {@code null} for none
   */
  public PlayerLeaderboardScore setSocialRank(LeaderboardScoreRank socialRank) {
    this.socialRank = socialRank;
    return this;
  }

  /**
   * The time span of this score. Possible values are:   - "ALL_TIME" - The score is an all-time
   * score.  - "WEEKLY" - The score is a weekly score.  - "DAILY" - The score is a daily score.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeSpan() {
    return timeSpan;
  }

  /**
   * The time span of this score. Possible values are:   - "ALL_TIME" - The score is an all-time
   * score.  - "WEEKLY" - The score is a weekly score.  - "DAILY" - The score is a daily score.
   * @param timeSpan timeSpan or {@code null} for none
   */
  public PlayerLeaderboardScore setTimeSpan(java.lang.String timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }

  /**
   * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWriteTimestamp() {
    return writeTimestamp;
  }

  /**
   * The timestamp at which this score was recorded, in milliseconds since the epoch in UTC.
   * @param writeTimestamp writeTimestamp or {@code null} for none
   */
  public PlayerLeaderboardScore setWriteTimestamp(java.lang.Long writeTimestamp) {
    this.writeTimestamp = writeTimestamp;
    return this;
  }

  @Override
  public PlayerLeaderboardScore set(String fieldName, Object value) {
    return (PlayerLeaderboardScore) super.set(fieldName, value);
  }

  @Override
  public PlayerLeaderboardScore clone() {
    return (PlayerLeaderboardScore) super.clone();
  }

}
