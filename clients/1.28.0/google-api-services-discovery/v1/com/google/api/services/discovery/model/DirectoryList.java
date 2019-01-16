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

package com.google.api.services.discovery.model;

/**
 * Model definition for DirectoryList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the APIs Discovery Service. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DirectoryList extends com.google.api.client.json.GenericJson {

  /**
   * Indicate the version of the Discovery API used to generate this doc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String discoveryVersion;

  /**
   * The individual directory entries. One entry per api/version pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Items> items;

  static {
    // hack to force ProGuard to consider Items used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Items.class);
  }

  /**
   * The kind for this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Indicate the version of the Discovery API used to generate this doc.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiscoveryVersion() {
    return discoveryVersion;
  }

  /**
   * Indicate the version of the Discovery API used to generate this doc.
   * @param discoveryVersion discoveryVersion or {@code null} for none
   */
  public DirectoryList setDiscoveryVersion(java.lang.String discoveryVersion) {
    this.discoveryVersion = discoveryVersion;
    return this;
  }

  /**
   * The individual directory entries. One entry per api/version pair.
   * @return value or {@code null} for none
   */
  public java.util.List<Items> getItems() {
    return items;
  }

  /**
   * The individual directory entries. One entry per api/version pair.
   * @param items items or {@code null} for none
   */
  public DirectoryList setItems(java.util.List<Items> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind for this response.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind for this response.
   * @param kind kind or {@code null} for none
   */
  public DirectoryList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public DirectoryList set(String fieldName, Object value) {
    return (DirectoryList) super.set(fieldName, value);
  }

  @Override
  public DirectoryList clone() {
    return (DirectoryList) super.clone();
  }

  /**
   * Model definition for DirectoryListItems.
   */
  public static final class Items extends com.google.api.client.json.GenericJson {

    /**
     * The description of this API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String description;

    /**
     * A link to the discovery document.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String discoveryLink;

    /**
     * The URL for the discovery REST document.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String discoveryRestUrl;

    /**
     * A link to human readable documentation for the API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String documentationLink;

    /**
     * Links to 16x16 and 32x32 icons representing the API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Icons icons;

    /**
     * The id of this API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The kind for this response.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String kind;

    /**
     * Labels for the status of this API, such as labs or deprecated.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> labels;

    /**
     * The name of the API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String name;

    /**
     * True if this version is the preferred version to use.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean preferred;

    /**
     * The title of this API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String title;

    /**
     * The version of the API.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String version;

    /**
     * The description of this API.
     * @return value or {@code null} for none
     */
    public java.lang.String getDescription() {
      return description;
    }

    /**
     * The description of this API.
     * @param description description or {@code null} for none
     */
    public Items setDescription(java.lang.String description) {
      this.description = description;
      return this;
    }

    /**
     * A link to the discovery document.
     * @return value or {@code null} for none
     */
    public java.lang.String getDiscoveryLink() {
      return discoveryLink;
    }

    /**
     * A link to the discovery document.
     * @param discoveryLink discoveryLink or {@code null} for none
     */
    public Items setDiscoveryLink(java.lang.String discoveryLink) {
      this.discoveryLink = discoveryLink;
      return this;
    }

    /**
     * The URL for the discovery REST document.
     * @return value or {@code null} for none
     */
    public java.lang.String getDiscoveryRestUrl() {
      return discoveryRestUrl;
    }

    /**
     * The URL for the discovery REST document.
     * @param discoveryRestUrl discoveryRestUrl or {@code null} for none
     */
    public Items setDiscoveryRestUrl(java.lang.String discoveryRestUrl) {
      this.discoveryRestUrl = discoveryRestUrl;
      return this;
    }

    /**
     * A link to human readable documentation for the API.
     * @return value or {@code null} for none
     */
    public java.lang.String getDocumentationLink() {
      return documentationLink;
    }

    /**
     * A link to human readable documentation for the API.
     * @param documentationLink documentationLink or {@code null} for none
     */
    public Items setDocumentationLink(java.lang.String documentationLink) {
      this.documentationLink = documentationLink;
      return this;
    }

    /**
     * Links to 16x16 and 32x32 icons representing the API.
     * @return value or {@code null} for none
     */
    public Icons getIcons() {
      return icons;
    }

    /**
     * Links to 16x16 and 32x32 icons representing the API.
     * @param icons icons or {@code null} for none
     */
    public Items setIcons(Icons icons) {
      this.icons = icons;
      return this;
    }

    /**
     * The id of this API.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The id of this API.
     * @param id id or {@code null} for none
     */
    public Items setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The kind for this response.
     * @return value or {@code null} for none
     */
    public java.lang.String getKind() {
      return kind;
    }

    /**
     * The kind for this response.
     * @param kind kind or {@code null} for none
     */
    public Items setKind(java.lang.String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * Labels for the status of this API, such as labs or deprecated.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getLabels() {
      return labels;
    }

    /**
     * Labels for the status of this API, such as labs or deprecated.
     * @param labels labels or {@code null} for none
     */
    public Items setLabels(java.util.List<java.lang.String> labels) {
      this.labels = labels;
      return this;
    }

    /**
     * The name of the API.
     * @return value or {@code null} for none
     */
    public java.lang.String getName() {
      return name;
    }

    /**
     * The name of the API.
     * @param name name or {@code null} for none
     */
    public Items setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    /**
     * True if this version is the preferred version to use.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getPreferred() {
      return preferred;
    }

    /**
     * True if this version is the preferred version to use.
     * @param preferred preferred or {@code null} for none
     */
    public Items setPreferred(java.lang.Boolean preferred) {
      this.preferred = preferred;
      return this;
    }

    /**
     * The title of this API.
     * @return value or {@code null} for none
     */
    public java.lang.String getTitle() {
      return title;
    }

    /**
     * The title of this API.
     * @param title title or {@code null} for none
     */
    public Items setTitle(java.lang.String title) {
      this.title = title;
      return this;
    }

    /**
     * The version of the API.
     * @return value or {@code null} for none
     */
    public java.lang.String getVersion() {
      return version;
    }

    /**
     * The version of the API.
     * @param version version or {@code null} for none
     */
    public Items setVersion(java.lang.String version) {
      this.version = version;
      return this;
    }

    @Override
    public Items set(String fieldName, Object value) {
      return (Items) super.set(fieldName, value);
    }

    @Override
    public Items clone() {
      return (Items) super.clone();
    }

    /**
     * Links to 16x16 and 32x32 icons representing the API.
     */
    public static final class Icons extends com.google.api.client.json.GenericJson {

      /**
       * The URL of the 16x16 icon.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String x16;

      /**
       * The URL of the 32x32 icon.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String x32;

      /**
       * The URL of the 16x16 icon.
       * @return value or {@code null} for none
       */
      public java.lang.String getX16() {
        return x16;
      }

      /**
       * The URL of the 16x16 icon.
       * @param x16 x16 or {@code null} for none
       */
      public Icons setX16(java.lang.String x16) {
        this.x16 = x16;
        return this;
      }

      /**
       * The URL of the 32x32 icon.
       * @return value or {@code null} for none
       */
      public java.lang.String getX32() {
        return x32;
      }

      /**
       * The URL of the 32x32 icon.
       * @param x32 x32 or {@code null} for none
       */
      public Icons setX32(java.lang.String x32) {
        this.x32 = x32;
        return this;
      }

      @Override
      public Icons set(String fieldName, Object value) {
        return (Icons) super.set(fieldName, value);
      }

      @Override
      public Icons clone() {
        return (Icons) super.clone();
      }

    }
  }

}
