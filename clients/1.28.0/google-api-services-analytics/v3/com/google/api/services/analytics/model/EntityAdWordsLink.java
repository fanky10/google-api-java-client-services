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

package com.google.api.services.analytics.model;

/**
 * JSON template for Analytics Entity Google Ads Link.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntityAdWordsLink extends com.google.api.client.json.GenericJson {

  /**
   * A list of Google Ads client accounts. These cannot be MCC accounts. This field is required when
   * creating a Google Ads link. It cannot be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AdWordsAccount> adWordsAccounts;

  static {
    // hack to force ProGuard to consider AdWordsAccount used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AdWordsAccount.class);
  }

  /**
   * Web property being linked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Entity entity;

  /**
   * Entity Google Ads link ID
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Resource type for entity Google Ads link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the link. This field is required when creating a Google Ads link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * IDs of linked Views (Profiles) represented as strings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> profileIds;

  /**
   * URL link for this Google Analytics - Google Ads link.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * A list of Google Ads client accounts. These cannot be MCC accounts. This field is required when
   * creating a Google Ads link. It cannot be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<AdWordsAccount> getAdWordsAccounts() {
    return adWordsAccounts;
  }

  /**
   * A list of Google Ads client accounts. These cannot be MCC accounts. This field is required when
   * creating a Google Ads link. It cannot be empty.
   * @param adWordsAccounts adWordsAccounts or {@code null} for none
   */
  public EntityAdWordsLink setAdWordsAccounts(java.util.List<AdWordsAccount> adWordsAccounts) {
    this.adWordsAccounts = adWordsAccounts;
    return this;
  }

  /**
   * Web property being linked.
   * @return value or {@code null} for none
   */
  public Entity getEntity() {
    return entity;
  }

  /**
   * Web property being linked.
   * @param entity entity or {@code null} for none
   */
  public EntityAdWordsLink setEntity(Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Entity Google Ads link ID
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Entity Google Ads link ID
   * @param id id or {@code null} for none
   */
  public EntityAdWordsLink setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource type for entity Google Ads link.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for entity Google Ads link.
   * @param kind kind or {@code null} for none
   */
  public EntityAdWordsLink setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the link. This field is required when creating a Google Ads link.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the link. This field is required when creating a Google Ads link.
   * @param name name or {@code null} for none
   */
  public EntityAdWordsLink setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * IDs of linked Views (Profiles) represented as strings.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProfileIds() {
    return profileIds;
  }

  /**
   * IDs of linked Views (Profiles) represented as strings.
   * @param profileIds profileIds or {@code null} for none
   */
  public EntityAdWordsLink setProfileIds(java.util.List<java.lang.String> profileIds) {
    this.profileIds = profileIds;
    return this;
  }

  /**
   * URL link for this Google Analytics - Google Ads link.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * URL link for this Google Analytics - Google Ads link.
   * @param selfLink selfLink or {@code null} for none
   */
  public EntityAdWordsLink setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public EntityAdWordsLink set(String fieldName, Object value) {
    return (EntityAdWordsLink) super.set(fieldName, value);
  }

  @Override
  public EntityAdWordsLink clone() {
    return (EntityAdWordsLink) super.clone();
  }

  /**
   * Web property being linked.
   */
  public static final class Entity extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private WebPropertyRef webPropertyRef;

    /**
     * @return value or {@code null} for none
     */
    public WebPropertyRef getWebPropertyRef() {
      return webPropertyRef;
    }

    /**
     * @param webPropertyRef webPropertyRef or {@code null} for none
     */
    public Entity setWebPropertyRef(WebPropertyRef webPropertyRef) {
      this.webPropertyRef = webPropertyRef;
      return this;
    }

    @Override
    public Entity set(String fieldName, Object value) {
      return (Entity) super.set(fieldName, value);
    }

    @Override
    public Entity clone() {
      return (Entity) super.clone();
    }

  }

}
