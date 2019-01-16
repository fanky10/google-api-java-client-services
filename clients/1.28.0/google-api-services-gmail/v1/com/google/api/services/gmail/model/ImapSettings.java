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

package com.google.api.services.gmail.model;

/**
 * IMAP settings for an account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Gmail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImapSettings extends com.google.api.client.json.GenericJson {

  /**
   * If this value is true, Gmail will immediately expunge a message when it is marked as deleted in
   * IMAP. Otherwise, Gmail will wait for an update from the client before expunging messages marked
   * as deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoExpunge;

  /**
   * Whether IMAP is enabled for the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * The action that will be executed on a message when it is marked as deleted and expunged from
   * the last visible IMAP folder.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expungeBehavior;

  /**
   * An optional limit on the number of messages that an IMAP folder may contain. Legal values are
   * 0, 1000, 2000, 5000 or 10000. A value of zero is interpreted to mean that there is no limit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxFolderSize;

  /**
   * If this value is true, Gmail will immediately expunge a message when it is marked as deleted in
   * IMAP. Otherwise, Gmail will wait for an update from the client before expunging messages marked
   * as deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoExpunge() {
    return autoExpunge;
  }

  /**
   * If this value is true, Gmail will immediately expunge a message when it is marked as deleted in
   * IMAP. Otherwise, Gmail will wait for an update from the client before expunging messages marked
   * as deleted.
   * @param autoExpunge autoExpunge or {@code null} for none
   */
  public ImapSettings setAutoExpunge(java.lang.Boolean autoExpunge) {
    this.autoExpunge = autoExpunge;
    return this;
  }

  /**
   * Whether IMAP is enabled for the account.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether IMAP is enabled for the account.
   * @param enabled enabled or {@code null} for none
   */
  public ImapSettings setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * The action that will be executed on a message when it is marked as deleted and expunged from
   * the last visible IMAP folder.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpungeBehavior() {
    return expungeBehavior;
  }

  /**
   * The action that will be executed on a message when it is marked as deleted and expunged from
   * the last visible IMAP folder.
   * @param expungeBehavior expungeBehavior or {@code null} for none
   */
  public ImapSettings setExpungeBehavior(java.lang.String expungeBehavior) {
    this.expungeBehavior = expungeBehavior;
    return this;
  }

  /**
   * An optional limit on the number of messages that an IMAP folder may contain. Legal values are
   * 0, 1000, 2000, 5000 or 10000. A value of zero is interpreted to mean that there is no limit.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxFolderSize() {
    return maxFolderSize;
  }

  /**
   * An optional limit on the number of messages that an IMAP folder may contain. Legal values are
   * 0, 1000, 2000, 5000 or 10000. A value of zero is interpreted to mean that there is no limit.
   * @param maxFolderSize maxFolderSize or {@code null} for none
   */
  public ImapSettings setMaxFolderSize(java.lang.Integer maxFolderSize) {
    this.maxFolderSize = maxFolderSize;
    return this;
  }

  @Override
  public ImapSettings set(String fieldName, Object value) {
    return (ImapSettings) super.set(fieldName, value);
  }

  @Override
  public ImapSettings clone() {
    return (ImapSettings) super.clone();
  }

}
