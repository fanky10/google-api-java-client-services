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
 * This is a JSON template for the Application resource.
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
public final class Application extends com.google.api.client.json.GenericJson {

  /**
   * The number of achievements visible to the currently authenticated player.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("achievement_count")
  private java.lang.Integer achievementCount;

  /**
   * The assets of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImageAsset> assets;

  /**
   * The author of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String author;

  /**
   * The category of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApplicationCategory category;

  /**
   * The description of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A list of features that have been enabled for the application. Possible values are:   -
   * "SNAPSHOTS" - Snapshots has been enabled
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> enabledFeatures;

  /**
   * The ID of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The instances of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Instance> instances;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The last updated timestamp of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastUpdatedTimestamp;

  /**
   * The number of leaderboards visible to the currently authenticated player.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("leaderboard_count")
  private java.lang.Integer leaderboardCount;

  /**
   * The name of the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A hint to the client UI for what color to use as an app-themed color. The color is given as an
   * RGB triplet (e.g. "E0E0E0").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String themeColor;

  /**
   * The number of achievements visible to the currently authenticated player.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAchievementCount() {
    return achievementCount;
  }

  /**
   * The number of achievements visible to the currently authenticated player.
   * @param achievementCount achievementCount or {@code null} for none
   */
  public Application setAchievementCount(java.lang.Integer achievementCount) {
    this.achievementCount = achievementCount;
    return this;
  }

  /**
   * The assets of the application.
   * @return value or {@code null} for none
   */
  public java.util.List<ImageAsset> getAssets() {
    return assets;
  }

  /**
   * The assets of the application.
   * @param assets assets or {@code null} for none
   */
  public Application setAssets(java.util.List<ImageAsset> assets) {
    this.assets = assets;
    return this;
  }

  /**
   * The author of the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthor() {
    return author;
  }

  /**
   * The author of the application.
   * @param author author or {@code null} for none
   */
  public Application setAuthor(java.lang.String author) {
    this.author = author;
    return this;
  }

  /**
   * The category of the application.
   * @return value or {@code null} for none
   */
  public ApplicationCategory getCategory() {
    return category;
  }

  /**
   * The category of the application.
   * @param category category or {@code null} for none
   */
  public Application setCategory(ApplicationCategory category) {
    this.category = category;
    return this;
  }

  /**
   * The description of the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of the application.
   * @param description description or {@code null} for none
   */
  public Application setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A list of features that have been enabled for the application. Possible values are:   -
   * "SNAPSHOTS" - Snapshots has been enabled
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnabledFeatures() {
    return enabledFeatures;
  }

  /**
   * A list of features that have been enabled for the application. Possible values are:   -
   * "SNAPSHOTS" - Snapshots has been enabled
   * @param enabledFeatures enabledFeatures or {@code null} for none
   */
  public Application setEnabledFeatures(java.util.List<java.lang.String> enabledFeatures) {
    this.enabledFeatures = enabledFeatures;
    return this;
  }

  /**
   * The ID of the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the application.
   * @param id id or {@code null} for none
   */
  public Application setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The instances of the application.
   * @return value or {@code null} for none
   */
  public java.util.List<Instance> getInstances() {
    return instances;
  }

  /**
   * The instances of the application.
   * @param instances instances or {@code null} for none
   */
  public Application setInstances(java.util.List<Instance> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#application.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#application.
   * @param kind kind or {@code null} for none
   */
  public Application setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The last updated timestamp of the application.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  /**
   * The last updated timestamp of the application.
   * @param lastUpdatedTimestamp lastUpdatedTimestamp or {@code null} for none
   */
  public Application setLastUpdatedTimestamp(java.lang.Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  /**
   * The number of leaderboards visible to the currently authenticated player.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLeaderboardCount() {
    return leaderboardCount;
  }

  /**
   * The number of leaderboards visible to the currently authenticated player.
   * @param leaderboardCount leaderboardCount or {@code null} for none
   */
  public Application setLeaderboardCount(java.lang.Integer leaderboardCount) {
    this.leaderboardCount = leaderboardCount;
    return this;
  }

  /**
   * The name of the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the application.
   * @param name name or {@code null} for none
   */
  public Application setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A hint to the client UI for what color to use as an app-themed color. The color is given as an
   * RGB triplet (e.g. "E0E0E0").
   * @return value or {@code null} for none
   */
  public java.lang.String getThemeColor() {
    return themeColor;
  }

  /**
   * A hint to the client UI for what color to use as an app-themed color. The color is given as an
   * RGB triplet (e.g. "E0E0E0").
   * @param themeColor themeColor or {@code null} for none
   */
  public Application setThemeColor(java.lang.String themeColor) {
    this.themeColor = themeColor;
    return this;
  }

  @Override
  public Application set(String fieldName, Object value) {
    return (Application) super.set(fieldName, value);
  }

  @Override
  public Application clone() {
    return (Application) super.clone();
  }

}
