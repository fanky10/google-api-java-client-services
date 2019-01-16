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

package com.google.api.services.tagmanager.model;

/**
 * Represents a tag that fires after another tag in order to tear down dependencies.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TeardownTag extends com.google.api.client.json.GenericJson {

  /**
   * If true, fire the teardown tag if and only if the main tag fires successfully. If false, fire
   * the teardown tag regardless of main tag firing status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean stopTeardownOnFailure;

  /**
   * The name of the teardown tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagName;

  /**
   * If true, fire the teardown tag if and only if the main tag fires successfully. If false, fire
   * the teardown tag regardless of main tag firing status.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStopTeardownOnFailure() {
    return stopTeardownOnFailure;
  }

  /**
   * If true, fire the teardown tag if and only if the main tag fires successfully. If false, fire
   * the teardown tag regardless of main tag firing status.
   * @param stopTeardownOnFailure stopTeardownOnFailure or {@code null} for none
   */
  public TeardownTag setStopTeardownOnFailure(java.lang.Boolean stopTeardownOnFailure) {
    this.stopTeardownOnFailure = stopTeardownOnFailure;
    return this;
  }

  /**
   * The name of the teardown tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagName() {
    return tagName;
  }

  /**
   * The name of the teardown tag.
   * @param tagName tagName or {@code null} for none
   */
  public TeardownTag setTagName(java.lang.String tagName) {
    this.tagName = tagName;
    return this;
  }

  @Override
  public TeardownTag set(String fieldName, Object value) {
    return (TeardownTag) super.set(fieldName, value);
  }

  @Override
  public TeardownTag clone() {
    return (TeardownTag) super.clone();
  }

}
