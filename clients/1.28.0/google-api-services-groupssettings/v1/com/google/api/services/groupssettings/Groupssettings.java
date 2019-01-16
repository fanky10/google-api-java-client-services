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

package com.google.api.services.groupssettings;

/**
 * Service definition for Groupssettings (v1).
 *
 * <p>
 * Lets you manage permission levels and related settings of a group.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/google-apps/groups-settings/get_started" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link GroupssettingsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Groupssettings extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.28.0 of the Groups Settings API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "groups/v1/groups/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/groupssettings/v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Groupssettings(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Groupssettings(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Groups collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code Groupssettings groupssettings = new Groupssettings(...);}
   *   {@code Groupssettings.Groups.List request = groupssettings.groups().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Groups groups() {
    return new Groups();
  }

  /**
   * The "groups" collection of methods.
   */
  public class Groups {

    /**
     * Gets one resource by id.
     *
     * Create a request for the method "groups.get".
     *
     * This request holds the parameters needed by the groupssettings server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param groupUniqueId The resource ID
     * @return the request
     */
    public Get get(java.lang.String groupUniqueId) throws java.io.IOException {
      Get result = new Get(groupUniqueId);
      initialize(result);
      return result;
    }

    public class Get extends GroupssettingsRequest<com.google.api.services.groupssettings.model.Groups> {

      private static final String REST_PATH = "{groupUniqueId}";

      /**
       * Gets one resource by id.
       *
       * Create a request for the method "groups.get".
       *
       * This request holds the parameters needed by the the groupssettings server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param groupUniqueId The resource ID
       * @since 1.13
       */
      protected Get(java.lang.String groupUniqueId) {
        super(Groupssettings.this, "GET", REST_PATH, null, com.google.api.services.groupssettings.model.Groups.class);
        this.groupUniqueId = com.google.api.client.util.Preconditions.checkNotNull(groupUniqueId, "Required parameter groupUniqueId must be specified.");
        set("alt", "json");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /** The resource ID */
      @com.google.api.client.util.Key
      private java.lang.String groupUniqueId;

      /** The resource ID
       */
      public java.lang.String getGroupUniqueId() {
        return groupUniqueId;
      }

      /** The resource ID */
      public Get setGroupUniqueId(java.lang.String groupUniqueId) {
        this.groupUniqueId = groupUniqueId;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }
    /**
     * Updates an existing resource. This method supports patch semantics.
     *
     * Create a request for the method "groups.patch".
     *
     * This request holds the parameters needed by the groupssettings server.  After setting any
     * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
     *
     * @param groupUniqueId The resource ID
     * @param content the {@link com.google.api.services.groupssettings.model.Groups}
     * @return the request
     */
    public Patch patch(java.lang.String groupUniqueId, com.google.api.services.groupssettings.model.Groups content) throws java.io.IOException {
      Patch result = new Patch(groupUniqueId, content);
      initialize(result);
      return result;
    }

    public class Patch extends GroupssettingsRequest<com.google.api.services.groupssettings.model.Groups> {

      private static final String REST_PATH = "{groupUniqueId}";

      /**
       * Updates an existing resource. This method supports patch semantics.
       *
       * Create a request for the method "groups.patch".
       *
       * This request holds the parameters needed by the the groupssettings server.  After setting any
       * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
       * <p> {@link
       * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param groupUniqueId The resource ID
       * @param content the {@link com.google.api.services.groupssettings.model.Groups}
       * @since 1.13
       */
      protected Patch(java.lang.String groupUniqueId, com.google.api.services.groupssettings.model.Groups content) {
        super(Groupssettings.this, "PATCH", REST_PATH, content, com.google.api.services.groupssettings.model.Groups.class);
        this.groupUniqueId = com.google.api.client.util.Preconditions.checkNotNull(groupUniqueId, "Required parameter groupUniqueId must be specified.");
        set("alt", "json");
      }

      @Override
      public Patch setAlt(java.lang.String alt) {
        return (Patch) super.setAlt(alt);
      }

      @Override
      public Patch setFields(java.lang.String fields) {
        return (Patch) super.setFields(fields);
      }

      @Override
      public Patch setKey(java.lang.String key) {
        return (Patch) super.setKey(key);
      }

      @Override
      public Patch setOauthToken(java.lang.String oauthToken) {
        return (Patch) super.setOauthToken(oauthToken);
      }

      @Override
      public Patch setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Patch) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Patch setQuotaUser(java.lang.String quotaUser) {
        return (Patch) super.setQuotaUser(quotaUser);
      }

      @Override
      public Patch setUserIp(java.lang.String userIp) {
        return (Patch) super.setUserIp(userIp);
      }

      /** The resource ID */
      @com.google.api.client.util.Key
      private java.lang.String groupUniqueId;

      /** The resource ID
       */
      public java.lang.String getGroupUniqueId() {
        return groupUniqueId;
      }

      /** The resource ID */
      public Patch setGroupUniqueId(java.lang.String groupUniqueId) {
        this.groupUniqueId = groupUniqueId;
        return this;
      }

      @Override
      public Patch set(String parameterName, Object value) {
        return (Patch) super.set(parameterName, value);
      }
    }
    /**
     * Updates an existing resource.
     *
     * Create a request for the method "groups.update".
     *
     * This request holds the parameters needed by the groupssettings server.  After setting any
     * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
     *
     * @param groupUniqueId The resource ID
     * @param content the {@link com.google.api.services.groupssettings.model.Groups}
     * @return the request
     */
    public Update update(java.lang.String groupUniqueId, com.google.api.services.groupssettings.model.Groups content) throws java.io.IOException {
      Update result = new Update(groupUniqueId, content);
      initialize(result);
      return result;
    }

    public class Update extends GroupssettingsRequest<com.google.api.services.groupssettings.model.Groups> {

      private static final String REST_PATH = "{groupUniqueId}";

      /**
       * Updates an existing resource.
       *
       * Create a request for the method "groups.update".
       *
       * This request holds the parameters needed by the the groupssettings server.  After setting any
       * optional parameters, call the {@link Update#execute()} method to invoke the remote operation.
       * <p> {@link
       * Update#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param groupUniqueId The resource ID
       * @param content the {@link com.google.api.services.groupssettings.model.Groups}
       * @since 1.13
       */
      protected Update(java.lang.String groupUniqueId, com.google.api.services.groupssettings.model.Groups content) {
        super(Groupssettings.this, "PUT", REST_PATH, content, com.google.api.services.groupssettings.model.Groups.class);
        this.groupUniqueId = com.google.api.client.util.Preconditions.checkNotNull(groupUniqueId, "Required parameter groupUniqueId must be specified.");
        set("alt", "json");
      }

      @Override
      public Update setAlt(java.lang.String alt) {
        return (Update) super.setAlt(alt);
      }

      @Override
      public Update setFields(java.lang.String fields) {
        return (Update) super.setFields(fields);
      }

      @Override
      public Update setKey(java.lang.String key) {
        return (Update) super.setKey(key);
      }

      @Override
      public Update setOauthToken(java.lang.String oauthToken) {
        return (Update) super.setOauthToken(oauthToken);
      }

      @Override
      public Update setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Update) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Update setQuotaUser(java.lang.String quotaUser) {
        return (Update) super.setQuotaUser(quotaUser);
      }

      @Override
      public Update setUserIp(java.lang.String userIp) {
        return (Update) super.setUserIp(userIp);
      }

      /** The resource ID */
      @com.google.api.client.util.Key
      private java.lang.String groupUniqueId;

      /** The resource ID
       */
      public java.lang.String getGroupUniqueId() {
        return groupUniqueId;
      }

      /** The resource ID */
      public Update setGroupUniqueId(java.lang.String groupUniqueId) {
        this.groupUniqueId = groupUniqueId;
        return this;
      }

      @Override
      public Update set(String parameterName, Object value) {
        return (Update) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link Groupssettings}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link Groupssettings}. */
    @Override
    public Groupssettings build() {
      return new Groupssettings(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link GroupssettingsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setGroupssettingsRequestInitializer(
        GroupssettingsRequestInitializer groupssettingsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(groupssettingsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
